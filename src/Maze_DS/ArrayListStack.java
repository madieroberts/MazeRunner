/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Maze_DS;

import DataStructures.EmptyCollectionException;
import DataStructures.StackADT;
import java.util.ArrayList;
/**
 *
 * @author madis
 * @param <T>
 */
public class ArrayListStack<T> implements StackADT<T>{
    
    private ArrayList<T> aStack;
    private int numElements;
    
    public ArrayListStack(){
        aStack = new ArrayList<T>();
        numElements = 0;
    }

/**
 * Adds an element to the top of the stack.
 *
 * This adds the given element to the top of the stack, and makes it the new
 * top element. The size is increased by one.
 *
 * @param element The element to be added to the stack.
 */
    @Override
    public void push(T element) {
        aStack.add(element);
        numElements++;
    }

 /**
 * Removes and returns the top element from the stack.
 *
 * This removes the top element from the stack and returns it. 
 * If the stack is empty, it throws an EmptyCollectionException.
 * @return The top element of the stack.
 * @throws EmptyCollectionException if the stack is empty.
 */
    @Override
    public T pop() throws EmptyCollectionException {
        if (isEmpty()) {
            throw new EmptyCollectionException("The stack is empty.");
        }

        T topElement = aStack.remove(numElements - 1); 
        numElements--; 
        return topElement;
    }

/**
 * Returns the top element of the stack but doesn't remove it.
 *
 * This method returns the top element from the stack like pop()
 * without removing it. If the stack is empty, it throws an EmptyCollectionException.
 *
 * @return The top element of the stack.
 * @throws EmptyCollectionException if the stack is empty.
 */
    @Override
    public T peek() throws EmptyCollectionException {
        if (isEmpty()) {
            throw new EmptyCollectionException("The stack is empty.");
        }

        return aStack.get(numElements - 1);
    }
/**
 * Returns whether the stack is empty or not.
 *
 * Counts the number of elements and if it is 0 returns true
 * that it is empty
 * @return if stack is empty or not(true/false).
 */
    @Override
    public boolean isEmpty() {
        if (numElements == 0) {
            return true;
        }
        return false;
    }

/**
 * Returns whether size of stack.
 *
 * Counts the number of elements and returns that number
 * @return number of elements in a stack.
 */
    @Override
    public int size() {
        return numElements;
    }

    @Override
    public String toString() {
        return "ArrayListStack{" + "aStack=" + aStack + ", numElements=" + numElements + '}';
    }
     
}
