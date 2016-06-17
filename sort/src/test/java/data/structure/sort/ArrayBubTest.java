package data.structure.sort;

import data.structure.sort.bubble.ArrayBub;
import junit.framework.Assert;
import junit.framework.TestCase;

public class ArrayBubTest extends TestCase {
	
	public void testBub() {
		ArrayBub bub = new ArrayBub(30);
		bub.insert(10);
		bub.insert(30);
		bub.insert(20);
		bub.insert(1);
		bub.insert(5);
		bub.insert(3);
		bub.insert(100);
		bub.insert(73);
		bub.insert(32);
		bub.insert(2);
		bub.insert(28);
		bub.insert(90);
		
		Assert.assertEquals("10,30,20,1,5,3,100,73,32,2,28,90", bub.toString());
	
		bub.sort();
		Assert.assertEquals("1,2,3,5,10,20,28,30,32,73,90,100", bub.toString());
	}
}
