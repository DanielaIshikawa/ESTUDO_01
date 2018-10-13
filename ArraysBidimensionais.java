/**
 * Classe com o objetivo de praticar a utilização de controladores de fluxo.
 * 
 * @author Globalcode
 */
class ArraysBidimensionais {
  /**
   * Método para que esta classe possa ser executada com o utilitário java.
   * 
   * @param args
   *          - argumentos para o método main
   */
  public static void main(String args[]) {
	int array[][] = { { 1, 6, 7 }, { 2, 5, 1, 0 }, { 2, 4, 1, 2, 1 } };
	
	
	for (int[] valor1 : array) {
		for (int valor2 : valor1) {
			System.out.print(valor2);
	}
		System.out.println();
	}
	
		
	
  }
}
