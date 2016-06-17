package data.structure.sort.base;

import data.structure.sort.base.AbstractSortBase;
import data.structure.sort.base.BubSort;
import data.structure.sort.base.InsertSort;
import data.structure.sort.base.SelectSort;
import junit.framework.Assert;
import junit.framework.TestCase;

public class SortTest extends TestCase {
	
	/**
	 * 测试冒泡排序
	 */
	public void testBubSort() {
		BubSort bub = new BubSort(30);
		doCompare(bub);
	}
	
	/**
	 * 测试选择排序
	 */
	public void testSelectSort() {
		SelectSort sort = new SelectSort(30);
		doCompare(sort);
	}
	
	/**
	 * 测试插入排序
	 */
	public void testInsertSort() {
		InsertSort sort = new InsertSort(30);
		doCompare(sort);
	}
	
	private void doCompare(AbstractSortBase target) {
		target.insert(10);
		target.insert(30);
		target.insert(20);
		target.insert(1);
		target.insert(5);
		target.insert(3);
		target.insert(100);
		target.insert(73);
		target.insert(32);
		target.insert(2);
		target.insert(28);
		target.insert(90);
		Assert.assertEquals("10,30,20,1,5,3,100,73,32,2,28,90", target.toString());
	
		target.sort();
		Assert.assertEquals("1,2,3,5,10,20,28,30,32,73,90,100", target.toString());
	}
}
