package data.structure.sort.base;

/**
 * 快速排序
 * @author eclipse
 *
 */
public class QuickSort extends AbstractSortBase {

	public QuickSort(int maxCapicity) {
		super(maxCapicity);
	}

	@Override
	public void sort() {
		sortPartition(0, size - 1);
	}

	/**
	 * 双哨兵，左右哨兵如果未相遇则交换，然后再交换基数和哨兵相遇的数，
	 * 最后在相遇点分成两段递归使用算法
	 * @param start
	 * @param end
	 */
	private void sortPartition(int start, int end) {
		if (start >= end) {
			return;
		}
		
		int base = datas[start];
		int left = start, right = end;
		
		while (left != right) {
			while (datas[right] >= base && right > left) {
				right --;
			}
			
			while (datas[left] <= base && left < right) {
				left ++;
			}
			
			if (left < right) {
				int temp = datas[left];
				datas[left] = datas[right];
				datas[right] = temp;
			}
		}
		datas[start] = datas[right];
		datas[right] = base;
		
		sortPartition(start, right - 1);
		sortPartition(right + 1, end);
	}
}
