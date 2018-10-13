/* 
 * Execute esta classe para testar a sobrecarga do metodo inicializaConta da classe
 * Conta 
 *
 */
public class TestaSobrecarga {

    public static void main(String[] args) {
        // 1. Instanciar uma Conta c1
    	Conta3 c1 = new Conta3 ();
    	
        // 2. Chame o metodo inicializaConta informando o saldo
    	c1.inicializaConta(500, "10785", "Daniela", "1770", 341);
    	
        // 3. Imprima os dados da Conta, usando o metodo imprimeDados
    	c1.imprimeDados();
    	
        // 4. Instanciar uma Conta c2
        Conta3 c2 = new Conta3 ();
    	
    	// 5. Chame o metodo inicializaConta informando sem informar o saldo
        c2.inicializaConta("10785", "Daniela", "1770", 341);
        
        // 6. Imprima os dados da Conta c2, usando o metodo imprimeDados
        c2.imprimeDados();
    }
}
