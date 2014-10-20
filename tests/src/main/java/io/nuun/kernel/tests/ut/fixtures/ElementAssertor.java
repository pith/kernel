/**
 * Copyright (C) 2014 Kametic <epo.jemba@kametic.com>
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
package io.nuun.kernel.tests.ut.fixtures;

import com.google.inject.spi.Element;

/**
 *
 * 
 * @author epo.jemba@kametic.com
 *
 */
public abstract class ElementAssertor
{
    
    private String behaviourDescription;

    public ElementAssertor(String behaviourDescription)
    {
        this.behaviourDescription = behaviourDescription;
    }
    
    /**
     * 
     * @return behaviour of the assertion.
     */
    String behaviourDescription()
    {
        return behaviourDescription;
    }

    /**
     * 
     * @param input
     * @return true if the candidate element complies the assertion.
     */
    abstract boolean asserts(Element candidate);

    /**
     * 
     * 
     * @return the number of time an element should comply with this assertions.
     */
    abstract int expectedTimes();

    @Override
    public String toString()
    {
        return "ElementAssertor [behaviourDescription=" + behaviourDescription + "]";
    }
    
    

}
