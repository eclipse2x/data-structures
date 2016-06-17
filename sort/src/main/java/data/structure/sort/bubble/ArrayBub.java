package data.structure.sort.bubble;

import org.apache.commons.lang3.StringUtils;

/**
 * 冒泡排序
 * @author Administrator
 *
 */
public class ArrayBub {
	// 数据
	private int[] datas;
	
	// 大小
	private int size;
	
	public ArrayBub(int maxCapicity) {
		datas = new int[maxCapicity];
		size = 0;
	}
	
	public void insert(int data) {
		if (size >= datas.length) {
			throw new RuntimeException("超过大小，不能插入");
		}
		
		datas[size++] = data;
	}
	
	@Override
	public String toString() {
		return StringUtils.join(datas, ',', 0, size);
	}
	
	public void sort() {
		// 分段，从大排到小
		for (int point=size; point>0; point--) {
			bubLargest(datas, point);
		}
	}
	
	// 将  max 范围内的最大数排到最后
	private void bubLargest(int[] target, int max) {
		for (int i=0; i<max - 1; i++) {
			if (target[i] > target[i+1]) {
				swap(target, i, i+1);
			}
		}
	}
	
	// 交换i和j位的数据
	private void swap(int[] target, int i, int j) {
		int source = target[i];
		target[i] = target[j];
		target[j] = source;
	}
}
