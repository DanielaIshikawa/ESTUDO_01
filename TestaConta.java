/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 */
class TestaConta {

    public static void main(String[] args) {
        // Criacao da conta
    	Conta cc = new Conta();
    	
        // Inicializacao da conta
        cc.inicializaConta(1000 , "1", "Daniela", 1, 234);
        
    	// Impressao dos dados da conta
        cc.imprimeDados();
        
        // Saque da conta
        cc.saque(600);
        
        // Impressao dos dados da conta
        cc.imprimeDados();

        // Deposito em conta
        cc.deposito(200);
        
        // Impressao dos dados da conta
        cc.imprimeDados();
    }
}
