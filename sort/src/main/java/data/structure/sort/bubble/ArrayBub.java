package data.structure.sort.bubble;

/**
 * 冒泡排序, 比较复杂度为O(n^2), 交换复杂度为 O(n^2)
 * @author eclipse
 *
 */
public class ArrayBub extends AbstractArrayBase {
	
	public ArrayBub(int maxCapicity) {
		super(maxCapicity);
	}

	@Override
	public void sort() {
		// 分段，从大排到小
		for (int point=size; point>1; point--) {
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
}
