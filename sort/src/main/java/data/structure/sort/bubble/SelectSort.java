package data.structure.sort.bubble;

/**
 * 选择排序, 比较复杂度为O(n^2), 交换复杂度为O(n)
 * @author eclipse
 *
 */
public class SelectSort extends AbstractArrayBase {

	public SelectSort(int maxCapicity) {
		super(maxCapicity);
	}

	@Override
	public void sort() {
		// 从左开始，对比最小的数，放在左边
		for (int outer=0; outer < size; outer++) {
			int point = outer;
			for (int inner=outer + 1; inner<size; inner ++) {
				if (datas[inner] < datas[point]) {
					point = inner;
				}
			}
			// 最后才执行交换
			swap(datas, outer, point);
		}
	}
	
}
