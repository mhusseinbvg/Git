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

		
		
	}

	@Test
	public void testReceipts() {
		fail("Not yet implemented");
	}

	@Test
	public void testRemove() {
		fail("Not yet implemented");
	}

	@Test
	public void testRemove_by_receipt() {
		fail("Not yet implemented");
	}

	@Test
	public void testRetrieve() {
		fail("Not yet implemented");
	}

	@Test
	public void testSize() {
		fail("Not yet implemented");
	}

	@Test
	public void testUsing_receipt() {
		fail("Not yet implemented");
	}

}
