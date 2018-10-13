/*
 * 1) Criar um objeto da classe Conta 
 * 2) Inicializar todos os atributos deste objeto 
 * 3) Imprimir os valores dos atributos da classe Conta
 * 
 */
class TestaConta {

    public static void main(String[] args) {
    	
    	Conta cc = new Conta ();
    	cc.agencia = 1;
    	cc.numero = "1777"; 
    	cc.banco = 234; 
    	cc.titular = "Daniela";
    	cc.saldo = 150.67;
    	
    	System.out.println("-----------------------------");
    	System.out.println("AGENCIA: " + cc.agencia + "\t BANCO: " + cc.banco);
    	System.out.println("NUMERO : " + cc.numero );
    	System.out.println("TITULAR: " + cc.titular);
    	System.out.println("SALDO  : " + cc.saldo);
    	System.out.println("-----------------------------");
    	
    }
}
