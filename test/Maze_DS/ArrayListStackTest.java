/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Maze_DS;

import DataStructures.EmptyCollectionException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author madis
 */
public class ArrayListStackTest {
    
    public ArrayListStackTest() {
    }

    /**
     * Test of push method, of class ArrayListStack.
     */
    @Test
    public void testPush() {
        System.out.println("push");
        ArrayListStack<Integer> instance = new ArrayListStack<>();

        instance.push(42);

        assertEquals(1, instance.size());
    }

    /**
     * Test of pop method, of class ArrayListStack.
     */
    @Test
    public void testPop() {
        System.out.println("pop");
        ArrayListStack<Integer> instance = new ArrayListStack<>();

        instance.push(1);
        instance.push(2);
        instance.push(3);

        int poppedElement = 0;
        try {
            poppedElement = instance.pop();
        } catch (EmptyCollectionException e) {
            fail("Unexpected EmptyCollectionsException");
        }
 
        assertEquals(3, poppedElement);

        assertEquals(2, instance.size());
    }

    /**
     * Test of peek method, of class ArrayListStack.
     */
    @Test
    public void testPeek() {
        System.out.println("peek");
        ArrayListStack<Integer> instance = new ArrayListStack<>();
        
        instance.push(1);
        instance.push(2);
        instance.push(3);

        try {
            int peekedElement = instance.peek();
            assertEquals(3, peekedElement); // Check if peek returns the top element
        } catch (EmptyCollectionException e) {
            fail("Unexpected EmptyCollectionsException");
        }

        assertEquals(3, instance.size()); 
    }

    /**
     * Test of isEmpty method, of class ArrayListStack.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        ArrayListStack<Integer> instance = new ArrayListStack();

        assertTrue(instance.isEmpty());

        instance.push(1);

        assertFalse(instance.isEmpty());
    }

    /**
     * Test of size method, of class ArrayListStack.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        ArrayListStack<Integer> instance = new ArrayListStack();

        assertEquals(0, instance.size());

        instance.push(1);
        instance.push(2);
        instance.push(3);

        assertEquals(3, instance.size());

        
        try {
            instance.pop();
        } catch (EmptyCollectionException e) {
            fail("Unexpected EmptyCollectionsException");
        }

        assertEquals(2, instance.size());
    }

    /**
     * Test of toString method, of class ArrayListStack.
     */
    /*
    @Test
    public void testToString() {
        System.out.println("toString");
        ArrayListStack instance = new ArrayListStack();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    */
}
