
public class TestaConta2 {

    public static void main(String[] args) {
        // Criar um objeto do tipo Conta
    	Conta2 cc = new Conta2 ();
    	
        // Usar o metodo inicializaConta para fazer a inicializacao do objeto criado
    	cc.inicializaConta(200, "18501", "Daniela", 1770, 341);
    	
        // executar um deposito
    	cc.deposito(100);
    	
        // Imprimir o saldo apos o deposito
    	cc.imprimeDados();
    	
        // executar um saque cujo valor seja menor que o saldo
    	cc.saque(10);
    	
        // Imprimir o saldo apos o deposito
    	cc.imprimeDados();
    	
        // executar uma retirada cujo valor seja maior que o saldo
    	cc.saque(1000);
    	
    	// Imprimir o saldo apos o deposito
    	cc.imprimeDados();
    }
}

