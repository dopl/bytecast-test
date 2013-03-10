/*
 * This file is part of Bytecast.
 *
 * Bytecast is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Bytecast is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Bytecast.  If not, see <http://www.gnu.org/licenses/>.
 *
 */

package edu.syr.bytecast.test.amd64;
import edu.syr.bytecast.test.ITestCase;
import edu.syr.bytecast.util.Paths;

public class Amd64BasicTest implements ITestCase {
    
    @Override
    public boolean test() {

       return true;
    }

    @Override
    public String getMessage() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    public static void main(String args[])
    {
        edu.syr.bytecast.test.amd64.Amd64BasicTest test = new edu.syr.bytecast.test.amd64.Amd64BasicTest();
        Paths.v().setRoot("/home/shawn/code/bytecast");
        if(test.test())
        {
            System.out.println("Test case passed.");
        }
        else
        {
           System.out.println("Test case failed.");
        }
        
    }
}
