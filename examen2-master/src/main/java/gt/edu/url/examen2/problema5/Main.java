package gt.edu.url.examen2.problema5;

public class Main {

	public static void main(String[] args) {
		DynamicStack<String> Stack = new DynamicStack(); 
		Stack.push("Alex");
		Stack.push("Pablo"); 
		Stack.push("Mariano"); 
		Stack.push("Hugo"); 
		Stack.push("Carlos"); 
		Stack.push("Pedro");
		
		System.out.println(Stack.top());
		
	}
}
