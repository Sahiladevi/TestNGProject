package selenium_testng;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertNull;
import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertMethodInTestNG {
	@Test
	public void assertEqualsConcept()
	{
		String s1 = "Ram";
		String s2 = "SreeRam";
		Assert.assertEquals(s1, s2);		
	}
	@Test
	public void assertNotEqualsConcept()
	{
		String s1 = "Ram";
		String s2 = "SreeRam";
		Assert.assertNotEquals(s1, s2);		
	}
	@Test
	public void assertTrueConcept()
	{
		boolean b = true;
		assertTrue(b);
	}
	@Test
	public void assertFalseConcept()
	{
		boolean b = false;
		assertFalse(b);
	}
	@Test
	public void assertNullConcept()
	{
		String name = null;
		assertNull(name);
	}
	@Test
	public void assertNotNullConcept()
	{
		String name ="Devi";
		assertNotNull(name);
	}
	
}
