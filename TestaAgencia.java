/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 */
class TestaAgencia {

    public static void main(String[] args) {
        // Criacao da agencia
    	Agencia ag = new Agencia ();
    	
    	// Inicializacao da agencia
    	ag.banco = 1;
    	ag.numero = "234";
    	
        // Impressao dos dados da agencia
    	System.out.println("BANCO: " + ag.banco);
    	System.out.println("AGENCIA: " + ag.numero);
    
    }
}
