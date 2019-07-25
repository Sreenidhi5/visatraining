package myproject;

public class StackUser {
	public void fill(Stack s) {
		for(int i=0;i<10;i++) {
		s.push(i);
		System.out.println("pushed --->" +i);
		}
	}
	
	public void empty(Stack s) {
		for(int i=0;i<10;i++) {
			
		Object elements = s.pop();
		System.out.println("popped" +elements);
		}

	}
	
}
