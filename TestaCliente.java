/*
 * Imprimir dados do cliente
 */
class TestaCliente {

    public static void main(String[] args) {
       
    	// Criacao do cliente
    	Cliente cl = new Cliente ();
    	
        // Inicializacao do cliente
        cl.cpf = "123.456.789-10";
        cl.nome = "Daniela";
    	
    	// Impressao dos dados do cliente
        System.out.println("NOME: " + cl.nome);
        System.out.println("CPF: " + cl.cpf);
        
    }
}
