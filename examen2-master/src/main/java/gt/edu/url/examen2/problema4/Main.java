package gt.edu.url.examen2.problema4;

public class Main {

	public static void main(String[] args) {
		
	LinkedPositionalList<String> poList = new LinkedPositionalList<>(); 
	poList.addFirst("Alex");
	poList.addLast("Pablo");
	poList.addLast("Andrés");
	poList.addLast("Antonio");
	poList.addLast("Pedro");
	System.out.println(poList.positionAtIndex(2).getElement());
	}

}
