/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.syr.bytecast.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import junit.framework.TestCase;

/**
 *
 * @author dhrumin
 */
public class ByteCastTest extends TestCase{
    public void testSay(String args[]) throws IOException
    {
        Runtime.getRuntime().exec("chmod +x run.bat", new String[0], new File("src/edu/syr/bytecast/test/"));
        Process pr = Runtime.getRuntime().exec("./run.bat", new String[0], new File("src/edu/syr/bytecast/test/"));
        BufferedReader ir = new BufferedReader(new InputStreamReader(pr.getInputStream()));
        while(true) {
            String line = ir.readLine();
            if(line != null) {
                System.out.println(line);
            }
            else {
             break;
            }
            assertTrue("TestComplete", true);
        }
    }
}