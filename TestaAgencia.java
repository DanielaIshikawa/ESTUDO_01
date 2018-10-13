/*
 * 1) Criar um objeto da classe Agencia
 * 2) Inicializar todos os atributos deste objeto
 * 3) Imprimir os valores dos atributos da classe Agencia  
 */

class TestaAgencia {

    public static void main(String[] args) {
    	
    	Agencia ag = new Agencia ();
    	
    	ag.banco = 234;
    	ag.numero = "1";
    	
    	System.out.println("-----------------------------"); 
    	System.out.println("AGENCIA: " + ag.numero + "\t BANCO: " + ag.banco );
    	System.out.println("-----------------------------");
    }
}
