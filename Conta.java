/*
 * O metodo inicializaConta e util para evitar a necessidade de inicializar
 * atributo por atributo, desta forma podemos chamar um unico metodo e passar
 * todos os parametros em uma unica chamada.
 * 
 */
class Conta {

	double saldo;
	String numero;
	String titular;
	int agencia;
	int banco;

	/**
	 * @param saldoInicial Saldo Inicial da conta
	 * @param num          Numero da conta
	 * @param tit          Titular da conta
	 * @param ag           Agencia a qual a conta pertence
	 * @param bc           Banco a qual a agencia pertence
	 */
	void inicializaConta(double saldoInicial, String num, String tit, int ag, int bc) {
		System.out.println("Inicializando uma conta com os seguintes dados:");
		saldo = saldoInicial;
		numero = num;
		titular = tit;
		agencia = ag;
		banco = bc;
	}

	/**
	 * @param valor: valor a ser sacado da conta
	 */
	/*
	 * 1. Verificar se o valor do saque e positivo. 2. Verificar se ha saldo
	 * suficiente para efetuar o saque 2.1. Se o saldo for suficiente, efetuar o
	 * saque 2.2. Se o saldo for insuficiente imprimir na tela que o saldo e
	 * insuficiente
	 */
	void saque(double valor) {
		
		System.out.println(
				"Realizando saque no valor de R$" + valor + " da conta " + numero + " do titular " + titular);
		if (valor < 0 ) {
			System.out.println("valor do saque deve ser positivo");
		}
		
		if (valor > 0) {
			
			if (saldo >= valor) {
				saldo -= valor;
				System.out.println("Saque de R$" + valor + " efetuado.");
			}
			else {
				System.out.println("saldo insuficiente");
			}
		}
		
	}

	/**
	 * @param valor Valor a ser depositado da conta
	 */
	/*
	 * 1. Verificar se o valor do deposito e positivo, se for efetue o deposito
	 */
	void deposito(double valor) {
		
		System.out.println(
				"Realizando depósito no valor de R$" + valor + " da conta " + numero + " do titular " + titular);
		if (valor < 0 ) {
			System.out.println("valor do saque deve ser positivo");
		}
		
		if (valor > 0) {
			
				saldo += valor;
				System.out.println("Depositoe de R$" + valor + " efetuado.");
			
		}
		
		
	}

	/**
	 * Metodo para impressao de todos os dados da classe
	 */
	void imprimeDados() {
		System.out.println("\n----------------------------");
		System.out.println("AGENCIA:\t" + agencia + "\t BANCO:\t" + banco);
		System.out.println("NUMERO: \t" + numero);
		System.out.println("TITULAR: \t" + titular);
		System.out.println("SALDO: \t" + saldo);
		System.out.println("-----------------------------\n");
	}

	/**
	 * @return saldo da conta
	 */
	double getSaldo() {
		return saldo;
	}
}
