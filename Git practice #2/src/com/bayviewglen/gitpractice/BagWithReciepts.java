package com.bayviewglen.gitpractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.bayviewglen.gitpractice.Lister;


/******************************************************************************
 * This class is a homework assignment;
 * A <CODE>BagWithReceipts</CODE> is a collection of references to Objects.
 * Each time an Object is placed in the bag, an integer receipt is provided.
 * The receipt can later be used to retrieve the Object.
 *
 * <dl><dt><b>Limitations:</b> <dd>
 *   (1) Beyond <CODE>Int.MAX_VALUE</CODE> elements, this bag no longer works
 *   because of arithmetic overflow.
 *   <dd>
 *   (2) Because of the slow linear algorithms of this class, large bags will have
 *   poor performance.
 *
 * <dt><b>Note:</b><dd>
 *   This file contains only blank implementations ("stubs")
 *   because this is a Programming Project for my students.
 *   My students implement this by storing the elements on a linked list and
 *   using receipts 1, 2, 3...
 *
 * <dt><b>Outline of Java Source Code for this class:</b><dd>
 *   <A HREF="../../../../edu/colorado/collections/BagWithReceipts.java">
 *   http://www.cs.colorado.edu/~main/edu/colorado/collections/BagWithReceipts.java
 *   </A>
 *   </dl>
 *
 * @version
 *   Jan 24, 1999
 ******************************************************************************/
public class BagWithReciepts implements Cloneable
{
	// The student's private instance variables are declared here:
	private int objectNumbers; 
	List<Object> bag = new ArrayList<>(objectNumbers);





	/**
	 * Initialize an empty <CODE>BagWithReceipts</CODE>.
	 * @param - none
	 * <dt><b>Postcondition:</b><dd>
	 *   This bag is empty.
	 **/   
	public BagWithReciepts( )
	{
		objectNumbers = 0; 
		List<Object> bag = new ArrayList<>(objectNumbers);

		
	}


	/**
	 * Put a reference to an object into this bag. The new element may be the
	 * null reference.
	 * @param <CODE>element</CODE>
	 *   the element to be added to this bag 
	 * @return
	 *   The element has been added to this bag and the return value is an
	 *   integer called the "receipt." The receipt can later be used to retrieve
	 *   the element.
	 * @exception OutOfMemoryError
	 *   Indicates insufficient memory for adding a new element.
	 **/
	public int add(Object element)
	{
		objectNumbers++; 
		bag.add(element);
		return objectNumbers; 
				}


	/**
	 * Generate a copy of this <CODE>BagWithReceipts</CODE>.
	 * @param - none
	 * @return
	 *   The return value is a copy of this <CODE>BagWithReceipts</CODE>. 
	 *   Subsequent changes to the copy will not affect
	 *   the original, nor vice versa. Note that the return value must be
	 *   type cast to an <CODE>BagWithReceipts</CODE> before it can be used.
	 * @exception OutOfMemoryError
	 *   Indicates insufficient memory for creating the clone.
	 **/ 
	public Object clone( )
	{  // Clone a BagWithReceipts object.
		// Student implementation.
		BagWithReciepts bagClone= new BagWithReciepts(); 
		for(int i = 0; i<bag.size();i++){
			bagClone.add(bag.get(i));
			
		}

		return bagClone;
	}


	/**
	 * Accessor method to count the number of occurrences of a particular element
	 * in this <CODE>BagWithReceipts</CODE>.
	 * @param <CODE>target</CODE>
	 *   an element to be counted
	 * @return
	 *   The return value is the number of times that <CODE>target</CODE> occurs
	 *   in this bag. If <CODE>target</CODE> is non-null, then the occurrences
	 *   are found using the <CODE>target.equals</CODE> method.
	 **/
	public int countOccurrences(Object target)
	{
		int occurance = 0; 
		for (int i = 0; i<bag.size();i++){
			if(bag.get(i).equals(target));{
				occurance++;
			}
		}
		return occurance;
	}


	/**
	 * Create an <CODE>Iterator</CODE> containing the elements of this bag.
	 * @param - none
	 * @return
	 *   an <CODE>Iterator</CODE> containing the elements of
	 *   this bag.
	 * <dt><b>Note:</b><dd>
	 *   If changes are made to this bag before the <CODE>Iterator</CODE>
	 *   returns all of its elements, then the subsequent behavior of the
	 *   <CODE>Iterator</CODE> is unspecified.
	 **/
	public Lister iterator( )
	{
		
		return null;
	}


	/**
	 * Create an array containing all the receipts of elements of this bag.
	 * @param - none
	 * @return
	 *   an array containing all the receipts elements of
	 *   this bag.
	 **/
	public int[] receipts( )
	{
		int[] receipts = new int[bag.size()];
		for (int i = 0; i<bag.size();i++){
			receipts[i] = i; 
		}
		return receipts; 
	}   


	/**
	 * Remove one copy of a specified element from this <CODE>BagWithReceipts</CODE>.
	 * @param <CODE>target</CODE>
	 *   an element to remove from this <CODE>BagWithReceipts</CODE> 
	 * <dt><b>Postcondition:</b><dd>
	 *   If <CODE>target</CODE> was found in this <CODE>BagWithReceipts</CODE>, 
	 *   then one copy of
	 *   <CODE>target</CODE> has been removed and the method returns true. 
	 *   Otherwise this <CODE>BagWithReceipts</CODE> remains unchanged 
	 *   and the method returns false. 
	 *   Note that if <CODE>target</CODE> is non-null, then 
	 *   <CODE>target.equals</CODE> is used to find 
	 *   <CODE>target</CODE> in the bag.
	 **/
	public boolean remove(Object target)
	{
		int index = 0; 
		while(index <= bag.size()&&!target.equals(bag.get(index))){
	            index++;
		}
		if (index == bag.size()){
			return false; 
		}
		else{
			objectNumbers--; 
			bag.set(index,null); 
			return true;
			
		}
	}


	/**
	 * Remove an element with a specified receipt.
	 * @param <CODE>receipt</CODE>
	 *   the receipt of
	 *   an element to remove from this <CODE>BagWithReceipts</CODE> 
	 * <dt><b>Postcondition:</b><dd>
	 *   If an element was found with the given <CODE>receipt</CODE> 
	 *   then that element has been removed and the method returns true. 
	 *   Otherwise this <CODE>BagWithReceipts</CODE> remains unchanged 
	 *   and the method returns false. 
	 **/
	public boolean remove_by_receipt(int receipt)
	{
		if(receipt<=bag.size()){
			bag.set(receipt, null);

		}
		return true;

	}

	/**
	 * Get a copy of the element with the specified receipt.
	 * @param <CODE>receipt</CODE>
	 *   the receipt of an element
	 * <dt><b>Precondition:</b><dd>
	 *   <CODE>using_receipt(receipt)</CODE> 
	 * @return
	 *   the element with the specified key
	 **/
	public Object retrieve(int receipt)
	{
		return bag.get(receipt);
	}


	/**
	 * Determine the number of elements in this bag.
	 * @param - none
	 * @return
	 *   the number of elements in this bag
	 **/ 
	public int size( )
	{
		
		return bag.size();
	}

	/**
	 * Determine whether a specified receipt is being used.
	 * @param <CODE>receipt</CODE>
	 *   a possible receipt of an element 
	 * @return
	 *   If an element was found with the given <CODE>receipt</CODE> 
	 *   then the method returns true. Otherwise the method returns false.
	 **/
	public boolean using_receipt(int receipt)
	{
		if(receipt<=bag.size()){	
		}
		return true;
	}
}