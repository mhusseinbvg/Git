package com.bayviewglen.gitpracticetests;

import static org.junit.Assert.*;

import java.util.Iterator;

import org.junit.Test;

import com.bayviewglen.gitpractice.Lister;
import com.bayviewglen.gitpractice.Node;

@SuppressWarnings("rawtypes")
public class ListerTest extends Lister {

	private Node list;
	Lister thisTest = new Lister(list);
	@SuppressWarnings("unchecked")
	public ListerTest(Node head) {
		super(head);
	}

	@Test
	public void testHasNext() {
		assertTrue("This means it actually has a value in its list thing", true);
	}

	@Test
	public void testNext() {
		assertSame("Not yet implemented", null	, ((Iterator) list).next()  ); // not sure how to get the next value in a list
	}

}
