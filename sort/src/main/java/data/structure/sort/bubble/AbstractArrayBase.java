package data.structure.sort.bubble;

import org.apache.commons.lang3.StringUtils;

/**
 * 排序公用基础类，封装了数组以及一些基本操作
 * 
 * @author eclipse
 */
public abstract class AbstractArrayBase {
	// 数据
	protected int[] datas;

	// 大小
	protected int size;

	public AbstractArrayBase(int maxCapicity) {
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

	// 交换i和j位的数据
	protected void swap(int[] target, int i, int j) {
		int source = target[i];
		target[i] = target[j];
		target[j] = source;
	}
	
	/**
	 * 公用方法，排序
	 */
	public abstract void sort();
}
