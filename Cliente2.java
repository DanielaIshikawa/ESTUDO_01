/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 * 
 * 1) Encapsule os atributos da classe Cliente
 * 
 */
public class Cliente2 {

    private String nome;
    private String cpf;

    /**
     * @param nomeCliente
     *            nome do cliente
     * @param cpfCliente
     *            cpf do cliente
     */
    public void inicializaCliente(String nomeCliente, String cpfCliente) {
        this.cpf = cpfCliente;
        this.nome = nomeCliente;
    }

    String getNome () {
    	return nome;
    }
    
    void setNome (String novoNome) {
    	nome = novoNome;
    }
    
    String getCpf() {
    	return cpf;
    }
    
    void setCpf (String novoCpf) {
    	cpf = novoCpf;
    }
    
    /**
     * Metodo para impressao de todos os dados da classe
     */
    void imprimeDados() {
        System.out.println("----------------------");
        System.out.println("Nome do cliente :" + this.nome);
        System.out.println("CPF:" + this.cpf);
        System.out.println("----------------------");
    }
}
