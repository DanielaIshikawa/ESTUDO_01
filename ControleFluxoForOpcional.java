/**
 * Classe com o objetivo de praticar a utilização de controladores de fluxo.
 * 
 * @author Globalcode
 */
class ControleFluxoForOpcional {
  /**
   * Método para que esta classe possa ser executada com o utilitário java.
   * 
   * @param args
   *          - argumentos para o método main
   */
  public static void main(String[] args) {
	  
	  int resto2 = 0;
	  int resto3 = 0;
	  	  
	  for (int i = 100; i <= 200; i++) {
		  
		  resto2 = i%2;
		  resto3 = i%3;
		  
		  if (resto2 == 0 && resto3 ==0) {
			  System.out.println(i + " divis�vel por 2 e 3 e portanto divisivel por 6");
		  }
		  else if (resto2 == 0) {
			  System.out.println(i + " divis�vel por 2");
		  }
		  
		  else if (resto3 ==0) {
			  System.out.println(i + " divis�vel por 3");
		  }
		  
		 
	}
  }
}
