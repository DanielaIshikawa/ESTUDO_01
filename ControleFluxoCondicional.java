/**
 * Classe com o objetivo de praticar a utilização de controladores de fluxo.
 * 
 * @author Globalcode
 */
class ControleFluxoCondicional {
	/**
	 * Método para que esta classe possa ser executada com o utilitário java.
	 * 
	 * @param args - argumentos para o método main
	 */
	public static void main(String[] args) {
		String nome = "Carolina Pereira";
		int idade = 20;
		String rg = "34.654.789-9";
		char sexo = 'F';
		double salario = 1500.0;
		int anoAtual = 2009;
		double aliquota = 0.20;
		int anoNascimento = anoAtual - idade;
//		String sexoPorExtenso = sexo == 'M' ? "masculino" : "feminino";
		String sexoPorExtenso = "";
		double impostoDevido = salario * aliquota;

		if (sexo == 'M') {
			sexoPorExtenso = "masculino";
		} else {
			sexoPorExtenso = "feminino";
		}

		switch (sexo) {
		case 'F':
			System.out.println("A senhora " + nome + " de " + idade + " anos, portadora do RG de n�mero " + rg
					+ ", do sexo " + sexo + ", est� registrada com o sal�rio de R$" + salario);
			break;
		case 'M':
			System.out.println("O senhor " + nome + " de " + idade + " anos, portador do RG de n�mero " + rg
					+ ", do sexo " + sexo + ", est� registrado com o sal�rio de R$" + salario);
		default:
			String textNome = "O(a) Senhor(a) " + nome;
			String textNasc = ", nascido(a) no ano de " + anoNascimento;
			String textRg = " portador(a)do rg de numero " + rg + ", \n";
			String textSexo = " do sexo " + sexoPorExtenso;
			String textTrabalho = ", est� registrado(a) com o sal�rio de R$ " + salario;
			String textImposto = " e pagar� R$ " + impostoDevido + " de imposto.";
			System.out.println(textNome + textRg + textNasc + textSexo + textTrabalho + textImposto);
			break;
		}

	}
}
