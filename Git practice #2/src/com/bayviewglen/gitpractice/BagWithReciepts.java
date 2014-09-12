
package com.bayviewglen.gitpractice;

public class BagWithReciepts {
	public class BagWithReceipts implements Cloneable
	{
	   // The student's private instance variables are declared here:
		//jia says hi

	   /**
	   * Initialize an empty <CODE>BagWithReceipts</CODE>.
	   * @param - none
	   * <dt><b>Postcondition:</b><dd>
	   *   This bag is empty.
	   **/   
	   public BagWithReceipts( )
	   {
	      // Student implementation.
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
	      // Student implementation.
	      return 0;
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
	      return null;
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
	      // Student implementation.
	      return 0;
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
	      return null;
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
	      // Student implementation.
	      return true;
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
	      // Student implementation.
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
	      // Student implementation.
	      return null;
	   }

	   
	   /**
	   * Determine the number of elements in this bag.
	   * @param - none
	   * @return
	   *   the number of elements in this bag
	   **/ 
	   public int size( )
	   {
	      // Student implementation.
	      return 0;
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
	      // Student implementation.
	      return true;
	   }

	      
	}
	
}