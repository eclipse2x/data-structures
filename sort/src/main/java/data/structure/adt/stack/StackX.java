package data.structure.adt.stack;

/**
 * 栈的抽象接口
 * @author eclipse
 *
 */
public class StackX {
	private int[] datas;
	
	private int top;
	
	private int maxSize;
	
	public StackX(int maxSize) {
		this.maxSize = maxSize;
		datas = new int[maxSize];
		top = -1;
	}
	
	public void push(int item) {
		datas[++top] = item;
	}
	
	public int pop() {
		return datas[top --];
	}
	
	public int peek() {
		return datas[top];
	}
	
	public boolean isEmpty() {
		return top == -1;
	}
	
	public boolean isFull() {
		return top == maxSize - 1;
	}
}
