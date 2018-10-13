
public class Arrays {

	
	 public static void main(String args[]) {
			
		String [] array = new String [3];  	
		int cont = 1; 
					
			for (int i = 0; i < array.length; i++) {
				
				array[i] = ("Cliente " + cont + " email: cliente" + cont + "@cliente.com.br"); 
				cont++; 
			}
			
						
			for (int j = 0; j < array.length; j++) {
				System.out.println(array[j]);
			}
	 }
}
