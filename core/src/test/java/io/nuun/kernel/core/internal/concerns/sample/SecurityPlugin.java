/**
 * This file is part of Nuun IO Kernel Core.
 *
 * Nuun IO Kernel Core is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Nuun IO Kernel Core is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with Nuun IO Kernel Core.  If not, see <http://www.gnu.org/licenses/>.
 */
package io.nuun.kernel.core.internal.concerns.sample;

import io.nuun.kernel.core.AbstractPlugin;

import java.util.List;

import org.aopalliance.intercept.MethodInterceptor;

import com.google.inject.AbstractModule;
import com.google.inject.matcher.Matchers;

public class SecurityPlugin extends AbstractPlugin
{

    
    private List<String> list;

    public SecurityPlugin(List<String> list)
    {
        this.list = list;
    }
    
    @Override
    public String name()
    {
        return "security";
    }
    
    @SecurityConcern
    public static class Module extends AbstractModule
    {
    	private List<String> list;
		private String name;
    	
		public Module(String name , List<String> list) {
			this.name = name;
			this.list = list;
		}
        @Override
        protected void configure()
        {
            MethodInterceptor interceptor = new ConcernInterceptor( list , name);
            bindInterceptor(Matchers.any(), Matchers.any(), interceptor );
        }
    }
    
    @Override
    public Object nativeUnitModule()
    {
        return new Module(name() , list);
    }

}
