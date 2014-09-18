package com.bayviewglen.gitpracticetests;
import com.bayviewglen.gitpractice.BagWithReciepts;


import static org.junit.Assert.*;

import org.junit.Test;

import com.bayviewglen.gitpractice.BagWithReciepts;

public class BagWithRecieptsTest extends BagWithReciepts {

	@Test
	public void testBagWithReciepts() {
		fail("Not yet implemented");
	}

	@Test
	public void testAdd() {
		fail("Not yet implemented");
	}

	@Test
	public void testClone() {
		fail("Not yet implemented");
	}

	@Test
	public void testCountOccurrences() {
		BagWithReciepts bag = new BagWithReciepts();
		bag.add("Jia");
		bag.add("Hi");
		bag.add("Jia");
		assertEquals("Occurences test for string:", 2, bag.countOccurrences("Jia"));

		
		bag.add(1);
		bag.add("Hi");
		bag.add(1);
		assertEquals("Occurences test for int:", 2, bag.countOccurrences(1));
		
		bag.add("Jia");
		bag.add("Hi");
		bag.add("Jia");
		assertEquals("Occurences test for string:", 2, bag.countOccurrences(null));
		
		bag.add("Jia");
		bag.add("Hi");
		bag.add("Jia");
		assertEquals("Occurences test for nothing:", 0, bag.countOccurrences("1"));
		


	}

	@Test
	public void testReceipts() {
		BagWithReciepts bag = new BagWithReciepts();
		bag.add("Jia");
		bag.add("Hi");
		bag.add("Jia");
		assertEquals("Receipts test with no removing:", new int[]{1,2,3}, bag.receipts());
		
		bag.add("Jia");
		bag.add("Jia");
		bag.add("Hi");
		bag.add("Jia");
		bag.remove("Jia"); 
		assertEquals("Receipts test with no removing:", new int[]{2,3,4}, bag.receipts());
		
		bag.add("Jia");
		bag.add("Jia");
		bag.add("Hi");
		bag.add("Jia");
	


	}

	@Test
	public void testRemove() {
		BagWithReciepts bag = new BagWithReciepts();
		bag.add("Jia");
		bag.add("Hi");
		bag.add("Jia");
		bag.add("Jia");
		bag.remove("Jia");

		assertEquals("Remove test:", 3 , bag.size());
		
		
		bag.add(1);
		bag.add(2);
		bag.add(3);
		bag.add(4);
		bag.remove(3);

		assertEquals("Remove test:", 3 , bag.size());


	}

	@Test
	public void testRemove_by_receipt() {
		BagWithReciepts bag = new BagWithReciepts();
		bag.add("Jia");
		bag.add("Hi");
		bag.add("Jia");
		bag.add("Jia");
		bag.remove_by_receipt(1);

		assertEquals("Remove test:", 3 , bag.size());
		assertEquals(" removing:", new int[]{2,3,4}, bag.receipts());

		
		bag.add(1);
		bag.add(2);
		bag.add(3);
		bag.add(4);
		bag.remove(3);
		bag.remove_by_receipt(1);

		

		assertEquals("Remove test:", 3 , bag.size());
		assertEquals(" removing:", new int[]{2,3,4}, bag.receipts());

	}

	@Test
	public void testRetrieve() {
		fail("Not yet implemented");
	}

	@Test
	public void testSize() {
		BagWithReciepts bag = new BagWithReciepts();

		bag.add("Jia");
		bag.add("Hi");
		bag.add("Jia");
		assertEquals("size test for string:", 3, bag.size());
		
		bag.add(1);
		bag.add(1);
		bag.add(2);
		assertEquals("size test for int:", 3, bag.size());
		
		bag.add(null);
		bag.add(null);
		bag.add(null);
		assertEquals("size test for null:", 0, bag.size());

		

		
		
	}

	@Test
	public void testUsing_receipt() {
		fail("Not yet implemented");
	}

}
