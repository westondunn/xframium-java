/*******************************************************************************
 * xFramium
 *
 * Copyright 2016 by Moreland Labs, Ltd. (http://www.morelandlabs.com)
 *
 * Some open source application is free software: you can redistribute 
 * it and/or modify it under the terms of the GNU General Public 
 * License as published by the Free Software Foundation, either 
 * version 3 of the License, or (at your option) any later version.
 *  
 * Some open source application is distributed in the hope that it will 
 * be useful, but WITHOUT ANY WARRANTY; without even the implied warranty 
 * of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *  
 * You should have received a copy of the GNU General Public License
 * along with xFramium.  If not, see <http://www.gnu.org/licenses/>.
 *
 * @license GPL-3.0+ <http://spdx.org/licenses/GPL-3.0+>
 *******************************************************************************/
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.xframium.page.factory;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import org.xframium.device.factory.DeviceWebDriver;
import org.xframium.page.AbstractPage;
import org.xframium.page.ElementDescriptor;
import org.xframium.page.Page;
import org.xframium.page.PageManager;
import org.xframium.page.element.Element;



// TODO: Auto-generated Javadoc
/**
 * The local page factory is used to create the local instance using the interface name and 
 * a derived implementation name using a predefined structure.  The FQGN of the interface name 
 * appending .spi to the package name and Impl to the class name
 * @author ageary
 */
public class LocalPageFactory extends AbstractPageFactory
{

    /** The Constant DOT. */
    private static final char DOT = '.';
    
    /** The Constant SPI. */
    private static final String SPI = ".spi";
    
    /** The Constant IMPL. */
    private static final String IMPL = "Impl";
    
    /** The Constant GET. */
    private static final String GET = "get";
    
    /**
     * Instantiates a new local page factory.
     */
    public LocalPageFactory()
    {
    	
    }

    
    /* (non-Javadoc)
     * @see com.perfectoMobile.page.factory.AbstractPageFactory#_createPage(java.lang.Class, java.lang.Object)
     */
    @Override
    protected Page _createPage(Class<Page> pageInterface, Object webDriver )
    {
    	this.webDriver = webDriver;
        String serviceName = pageInterface.getPackage().getName() + SPI + DOT + pageInterface.getSimpleName() + IMPL; 
        
        if ( log.isInfoEnabled() )
    		log.info( "Creating page implementation as " + serviceName );
        
        try
        {
        	Page currentPage = (Page) Class.forName( serviceName ).newInstance();
        	currentPage.initializePage();
        	currentPage.setDriver( webDriver );

        	
        	Method[] methodArray = currentPage.getClass().getInterfaces()[0].getMethods();
        	
        	for ( Method currentMethod : methodArray )
            {
        		if ( currentMethod.getAnnotation( Page.ElementDefinition.class ) != null )
            	{
            		if ( log.isDebugEnabled() )
                		log.debug( " Analyzing Method " + currentMethod.getName() );

            		//
            		// Strip off a 'get' if it exists for the elementName
            		//
            		String elementName = currentMethod.getName();
            		if ( elementName.startsWith( GET ) )
            			elementName = elementName.substring( 3 );

            		try
            		{
            			ElementDescriptor elementDescriptor = new ElementDescriptor( PageManager.instance( ( (DeviceWebDriver) webDriver).getxFID() ).getSiteName(), currentPage.getClass().getInterfaces()[0].getSimpleName(), elementName );
                		Element currentElement = PageManager.instance( ( (DeviceWebDriver) webDriver).getxFID() ).getElementProvider().getElement( elementDescriptor );
            			( (AbstractPage) currentPage ).registerElement( elementDescriptor, currentElement );
            		}
            		catch( Exception e )
            		{
            			e.printStackTrace();
            		}
            	}
            }
        	
        	Field[] fieldArray = currentPage.getClass().getFields();
        	for ( Field currentField : fieldArray )
            {
        		if ( currentField.getAnnotation( Page.ElementDefinition.class ) != null )
            	{
            		if ( log.isDebugEnabled() )
                		log.debug( " Analyzing Field " + currentField.getName() );
 
            		String fieldValue = currentField.get( currentPage ) + "";
            		
            		try
            		{
            			ElementDescriptor elementDescriptor = new ElementDescriptor( PageManager.instance( ( (DeviceWebDriver) webDriver).getxFID() ).getSiteName(), currentPage.getClass().getInterfaces()[0].getSimpleName(), fieldValue );
                		Element currentElement = PageManager.instance( ( (DeviceWebDriver) webDriver).getxFID() ).getElementProvider().getElement( elementDescriptor );
                		
                		currentElement.setTimed(  currentField.getAnnotation( Page.TimeMethod.class ) != null );
                		
            			( (AbstractPage) currentPage ).registerElement( elementDescriptor, currentElement );
            		}
            		catch( Exception e )
            		{
            			e.printStackTrace();
            		}
            	}
            }

        	
        	return currentPage;
        }
        catch( Exception e )
        {
            log.error( "Could not create a service for " + serviceName, e );
            return null;
        }
    }

    /**
     * Page created.
     *
     * @param serviceImpl the service impl
     */
    protected void pageCreated( Page serviceImpl )
    {
        serviceImpl.initializePage();
    }

}
