/*
 * 1) Criar um objeto da classe Cliente 
 * 2) Inicializar todos os atributos deste objeto
 * 3) Imprimir os valores dos atributos da classe Cliente 
 */
class TestaCliente {

    public static void main(String[] args) {
    	
    	Cliente cl = new Cliente ();
    	cl.nome = "Daniela";
    	cl.cpf = "123.456.789-10";
    	
    	System.out.println("------------------------------------");
    	System.out.println("NOME: " + cl.nome + "\t CPF: " + cl.cpf);
    	System.out.println("------------------------------------");
    	    	
    }
}
