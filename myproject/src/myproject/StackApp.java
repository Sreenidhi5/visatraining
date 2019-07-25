package myproject;

public class StackApp {
public static void main(String[] args) {
	StackUser a =new StackUser();
	FixedArrayStack f =new FixedArrayStack(10);
	a.fill(f);
	a.empty(f);
	
}
}
