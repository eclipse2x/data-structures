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
			int temp = datas[outer];
			int inner = outer;
			// 优化算法，从右算起就够了
			while (inner > 0 && datas[inner - 1] > temp) {
				datas[inner] = datas[inner - 1];
				inner --;
			}
			datas[inner] = temp;
		}
	}
}
