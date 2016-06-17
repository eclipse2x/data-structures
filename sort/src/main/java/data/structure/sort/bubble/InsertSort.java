package data.structure.sort.bubble;

/**
 * 
 * 插入排序, 局部有序的排序
 * 
 * @author eclipse
 *
 */
public class InsertSort extends AbstractArrayBase {

	public InsertSort(int maxCapicity) {
		super(maxCapicity);
	}

	@Override
	public void sort() {
		for (int outer = 1; outer < size; outer++) {
			for (int i = 0; i < outer; i++) {
				if (datas[i] > datas[outer]) {
					int toMove = datas[outer];
					for (int j = outer; j > i; j--) {
						datas[j] = datas[j - 1];
					}
					datas[i] = toMove;
					break;
				}
			}
		}
	}
}
