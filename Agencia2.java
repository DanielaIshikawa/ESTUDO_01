/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 * 
 * 1) Encapsule os atributos da classe Agencia = tornar os atributos privados e criar getters e setters
 * 
 */
public class Agencia2 {

    private String numero;
    private int banco;

    /**
     * @param num
     *            Numero da agencia
     * @param bc
     *            banco ao qual a agencia pertence
     */    
    
    String getNum () {
    	return numero;
    }
    
    void setNum (String novoNum) {
    	numero = novoNum;
    }
    
    int getBanco () {
    	return banco;
    }
    
    void setBanco (int novoBanco) {
    	banco = novoBanco;
    }
    
    public void inicializaAgencia(String num, int bc) {
        numero = num;
        banco = bc;
    }
    
    /**
     * Metodo para impressao de todos os dados da classe
     */
    public void imprimeDados() {
        System.out.println("----------------------");
        System.out.println("Agencia no. " + numero);
        System.out.println("Banco no." + banco);
        System.out.println("----------------------");
    }
}
