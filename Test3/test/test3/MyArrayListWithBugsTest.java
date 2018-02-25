/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test3;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Og180
 */
public class MyArrayListWithBugsTest {
    
    public MyArrayListWithBugsTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of add method, of class MyArrayListWithBugs.
     */
    @Test
    public void testAdd_Object() {
        System.out.println("add");
        Object o = null;
        MyArrayListWithBugs instance = new MyArrayListWithBugs();
        instance.add(o);
    }

    /**
     * Test of size method, of class MyArrayListWithBugs.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        MyArrayListWithBugs instance = new MyArrayListWithBugs();
        int expResult = 1;
        Object o = null;
        instance.add(o);
        int result = instance.size();
        assertEquals(expResult, result);
    }

    /**
     * Test of get method, of class MyArrayListWithBugs.
     */
    @Test
    public void testGet() {
        System.out.println("get");
        int index = 0;
        MyArrayListWithBugs instance = new MyArrayListWithBugs();
        Object expResult = null;
        instance.add(expResult);
        Object result = instance.get(index);
        assertEquals(expResult, result);
    }

    /**
     * Test of add method, of class MyArrayListWithBugs.
     */
    @Test
    public void testAdd_int_Object() {
        System.out.println("add");
        int index = 0;
        Object o = null;
        MyArrayListWithBugs instance = new MyArrayListWithBugs();
        instance.add(index, o);
    }

    /**
     * Test of remove method, of class MyArrayListWithBugs.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");
        int index = 0;
        MyArrayListWithBugs instance = new MyArrayListWithBugs();
        Object expResult = null;
        instance.add(expResult);
        Object result = instance.remove(index);
        assertEquals(expResult, result);
    }
    
    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetOutOfBounds() {
        System.out.println("remove");
        int index = 0;
        MyArrayListWithBugs instance = new MyArrayListWithBugs();
        Object expResult = null;
        instance.add(expResult);
        Object result = instance.remove(index);
        result = instance.get(index);
        assertEquals(expResult, result);
    }
    
    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveOnEmptyList() {
        System.out.println("remove");
        int index = 0;
        MyArrayListWithBugs instance = new MyArrayListWithBugs();
        Object expResult = null;
        Object result = instance.remove(index);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testAddingManyObjects() {
        System.out.println("remove");
        int index = 0;
        MyArrayListWithBugs instance = new MyArrayListWithBugs();
        Object expResult = null;
        instance.add(expResult);
        instance.add(expResult);
        instance.add(expResult);
        instance.add(expResult);
        instance.add(expResult);
    }
    
    @Test(expected = IndexOutOfBoundsException.class)
    public void testAddingAtOutOfBoundsIndex() {
        System.out.println("remove");
        int index = 20;
        MyArrayListWithBugs instance = new MyArrayListWithBugs();
        Object expResult = null;
        instance.add(index, expResult);
    }
    
    @Test
    public void testAddingManyObjectsAndRemovingAgain() {
        System.out.println("remove");
        int index = 0;
        MyArrayListWithBugs instance = new MyArrayListWithBugs();
        Object expResult = null;
        instance.add(expResult);
        instance.add(expResult);
        instance.add(expResult);
        instance.add(expResult);
        instance.add(expResult);
        instance.remove(index + 4);
        instance.remove(index + 3);
        instance.remove(index + 2);
        instance.remove(index + 1);
        instance.remove(index);
    }
    
}
