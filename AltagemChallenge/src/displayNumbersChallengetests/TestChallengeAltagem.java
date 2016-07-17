package displayNumbersChallengetests;


import displayNumbersChallenge.ClassDisplayMagicalNumb;
import displayNumbersChallenge.EmptyException;
import displayNumbersChallenge.MaxEqualsMinException;
import displayNumbersChallenge.MaxNumInfMinNumException;
import displayNumbersChallenge.MaxNumberNullException;
import junit.framework.TestCase;

public class TestChallengeAltagem extends TestCase {
	
	
	public void testIsMultipleOf()
	{
		ClassDisplayMagicalNumb testclass=new ClassDisplayMagicalNumb();
		boolean tBresult=testclass.IsMultipleOf(5, 25);
		assertTrue("devrait etre vrai",tBresult);
	}
	public void testDisplayMagicalNumber() throws EmptyException
	{
		ClassDisplayMagicalNumb testclass=new ClassDisplayMagicalNumb();
		boolean tBresult=testclass.DisplayMagicalNumber(2,13);
		assertTrue("devrait etre vrai",tBresult);
	}
	
	public void testNbrMaxNull() throws EmptyException
	{
		ClassDisplayMagicalNumb testclass=new ClassDisplayMagicalNumb();
		try {
			boolean tBres=testclass.DisplayMagicalNumber(11, 0);
			fail("Le test devrait lever une exception");
			
		} catch (MaxNumberNullException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
	}
	public void testNbrMaxInfNbrMin() throws EmptyException
	{
		ClassDisplayMagicalNumb testclass=new ClassDisplayMagicalNumb();
		try {
			boolean tBresult=testclass.DisplayMagicalNumber(11, 2);
			fail("Le test devrait lever une exception");
			
		} catch (MaxNumInfMinNumException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
	}
	public void testNbrMaxequalsNbrMin() throws EmptyException
	{
		ClassDisplayMagicalNumb testclass=new ClassDisplayMagicalNumb();
		try {
			boolean tBresult=testclass.DisplayMagicalNumber(11, 11);
			fail("Le test devrait lever une exception");
			
		} catch (MaxEqualsMinException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
	}

}
