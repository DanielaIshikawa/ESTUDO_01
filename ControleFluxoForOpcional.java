/**
 * Classe com o objetivo de praticar a utiliza√ß√£o de controladores de fluxo.
 * 
 * @author Globalcode
 */
class ControleFluxoForOpcional {
  /**
   * M√©todo para que esta classe possa ser executada com o utilit√°rio java.
   * 
   * @param args
   *          - argumentos para o m√©todo main
   */
  public static void main(String[] args) {
	  
	  int resto2 = 0;
	  int resto3 = 0;
	  	  
	  for (int i = 100; i <= 200; i++) {
		  
		  resto2 = i%2;
		  resto3 = i%3;
		  
		  if (resto2 == 0 && resto3 ==0) {
			  System.out.println(i + " divisÌvel por 2 e 3 e portanto divisivel por 6");
		  }
		  else if (resto2 == 0) {
			  System.out.println(i + " divisÌvel por 2");
		  }
		  
		  else if (resto3 ==0) {
			  System.out.println(i + " divisÌvel por 3");
		  }
		  
		 
	}
  }
}
