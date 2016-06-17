package data.structure.sort.base;

/**
 * 冒泡排序, 比较复杂度为O(n^2), 交换复杂度为 O(n^2)
 * @author eclipse
 *
 */
public class BubSort extends AbstractSortBase {
	
	public BubSort(int maxCapicity) {
		super(maxCapicity);
	}

	@Override
	public void sort() {
		// 分段，从大排到小
		for (int outer=size; outer>1; outer--) {
			for (int i=0; i<outer - 1; i++) {
				if (datas[i] > datas[i+1]) {
					swap(datas, i, i+1);
				}
			}
		}
	}
}
