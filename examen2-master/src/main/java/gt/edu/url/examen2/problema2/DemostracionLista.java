package gt.edu.url.examen2.problema2;
import gt.edu.url.examen2.problema2.ArrayList; 

public class DemostracionLista implements DemoList{

	ArrayList<Integer> array = new ArrayList<Integer> (); 
	
	@Override
	public List<Integer> crearDemoLista() {
	array.add(0, 4);
	array.add(0, 3);
	array.add(0, 2);
	array.add(2, 1);
	array.add(1, 5);
	array.add(1, 6);
	array.add(3, 7);
	array.add(0, 8);
	
		return array;
	}
}
