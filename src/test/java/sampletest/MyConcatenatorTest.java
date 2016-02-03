package sampletest;

import org.junit.Test;
import static junit.framework.Assert.*;
import sample.*;

public class MyConcatenatorTest {

	@Test
	public void testConcatenate() {
		String concatenated = MyConcatenator.concatenate("one", "two", "three",
				"four");

		assertEquals("one,two,three,four", concatenated);
	}
	@Test
	public void testConcatenate2() {
		String concatenated = MyConcatenator.concatenate("one", "two", "three",
				"four");

		assertNotSame("onetwo,three,four", concatenated);
	}
}