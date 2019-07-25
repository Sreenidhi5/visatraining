package myproject;

public class FixedArrayStack implements Stack{
public Object[] ary;
public int top=-1;

	public FixedArrayStack(int capacity) {
  Object ary =new Object[capacity];
	}

	@Override
	public void push(Object element) {
		ary[++top]=element;
	}

	@Override
	public Object pop() {
		
		return ary[top--];
	}

}
