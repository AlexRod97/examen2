package gt.edu.url.examen2.problema3;

public class Main {

	public static void main(String[] args) {
		
		LinkedPositionalList<String> poList = new LinkedPositionalList<>(); 
		Position<String> p0, p1,p2,p3,p4; 	
		
		p0 = poList.addFirst("Alex"); 
		p1 = poList.addAfter(p0, "Diego"); 
		p2 = poList.addAfter(p1, "Luis"); 
		p3 = poList.addAfter(p2, "Mario"); 
		p4 = poList.addAfter(p3, "Antonio"); 		
		poList.addAfter(p4, "Pablo"); 	
		
		System.out.println("---------------------Punteros a intercambiar---------------------");	
		System.out.println(p1.getElement());		
		System.out.println(p2.getElement());
		System.out.println("-----------------------------------------------------------------");	
		poList.swap(p1, p2);
		
		String recorrer = null;
		System.out.println("---------------------Listada intercambiada---------------------");	
		 do{
	            try{
	                Position<String> tempPosition = poList.first();
	                recorrer = poList.remove(tempPosition);
	                System.out.println(recorrer);
	            }
	            catch(Exception e){
	                System.out.println("Terminó lista después de cambiar");
	                recorrer =null;
	                break;
	            }
	        }
		 while(recorrer != null);  
	}
}
