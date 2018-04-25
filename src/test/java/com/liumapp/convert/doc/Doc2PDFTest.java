package com.liumapp.convert.doc;

import junit.framework.TestCase;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 * @author liumapp
 * @file Doc2PDFTest.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 4/25/18
 */

public class Doc2PDFTest extends TestCase {

    @Test
    public void testConvert () throws FileNotFoundException {
        InputStream in = Doc2PDF.class.getClassLoader().getResourceAsStream("license.xml");
        System.out.println("hello");
    }

}
