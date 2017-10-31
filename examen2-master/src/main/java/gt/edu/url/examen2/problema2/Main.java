package gt.edu.url.examen2.problema2;
import gt.edu.url.examen2.problema2.DemostracionLista; 

public class Main {

	public static void main(String[] args) {
		DemostracionLista demo = new DemostracionLista(); 		
		
		for(int i =0; i<8; i++) {
			System.out.println(demo.crearDemoLista().remove(i));
		}
	}

}
