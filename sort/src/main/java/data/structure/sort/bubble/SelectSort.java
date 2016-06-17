package data.structure.sort.bubble;

/**
 * 选择排序, 比较次数为 n^2, 交换次数为 n
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
			int smallest = datas[point];
			for (int inner=outer + 1; inner<size; inner ++) {
				if (datas[inner] < smallest) {
					smallest = datas[inner];
					point = inner;
				}
			}
			// 最后才执行交换
			swap(datas, outer, point);
		}
	}
	
}
