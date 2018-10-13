/**
 * Classe com o objetivo de praticar a utilizaÃ§Ã£o de controladores de fluxo.
 * 
 * @author Globalcode
 */
class ControleFluxoCondicional {
	/**
	 * MÃ©todo para que esta classe possa ser executada com o utilitÃ¡rio java.
	 * 
	 * @param args - argumentos para o mÃ©todo main
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
			System.out.println("A senhora " + nome + " de " + idade + " anos, portadora do RG de número " + rg
					+ ", do sexo " + sexo + ", está registrada com o salário de R$" + salario);
			break;
		case 'M':
			System.out.println("O senhor " + nome + " de " + idade + " anos, portador do RG de número " + rg
					+ ", do sexo " + sexo + ", está registrado com o salário de R$" + salario);
		default:
			String textNome = "O(a) Senhor(a) " + nome;
			String textNasc = ", nascido(a) no ano de " + anoNascimento;
			String textRg = " portador(a)do rg de numero " + rg + ", \n";
			String textSexo = " do sexo " + sexoPorExtenso;
			String textTrabalho = ", está registrado(a) com o salário de R$ " + salario;
			String textImposto = " e pagará R$ " + impostoDevido + " de imposto.";
			System.out.println(textNome + textRg + textNasc + textSexo + textTrabalho + textImposto);
			break;
		}

	}
}
