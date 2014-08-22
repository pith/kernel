/**
 * Copyright (C) 2013 Kametic <epo.jemba@kametic.com>
 *
 * Licensed under the GNU LESSER GENERAL PUBLIC LICENSE, Version 3, 29 June 2007;
 * or any later version
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.gnu.org/licenses/lgpl-3.0.txt
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.nuun.kernel.core;


/**
 * @author Epo Jemba
 *
 */
public class KernelException extends RuntimeException
{

    public KernelException()
    {
    }

    public KernelException(String message , Object... params)
    {
        super( String.format(message, params) );
    }

    public KernelException(String message ,  Throwable cause)
    {
        super(message , cause);
    }

    public KernelException(String message ,  Throwable cause, Object... params)
    {
        super(String.format(message, params), cause);
    }
    
    
    
    private static final long serialVersionUID = -5031708737156896850L;
}
