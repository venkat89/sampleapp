package sampletest;

import org.junit.Test;
import static junit.framework.Assert.*;
import sample.*;

public class MyConcatenatorTest2 {

	@Test
	public void testConcatenate2() {
		String concatenated = MyConcatenator.concatenate("one", "two", "three",
				"four");

		assertEquals("onetwo,three,four", concatenated);
	}
}