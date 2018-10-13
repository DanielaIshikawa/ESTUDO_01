
public class TestaCliente2 {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		// Criacao do cliente
		Cliente2 cl = new Cliente2();

		// Inicializacao do cliente usando o metodo inicializaCliente
		cl.inicializaCliente("Daniela", "280.000.333.10");

		// Impressao dos dados do cliente
		cl.imprimeDados();

	}
}
