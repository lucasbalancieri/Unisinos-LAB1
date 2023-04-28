package exercicios_fixacao2;

public class Teste {

	public static void main(String[] args) {
		/*
		 * Neste método, crie um objeto do tipo FuncionarioCaixa, chamado funcionario.
		 * Tudo que for necessário para criar este objeto, deve ser solicitado pelo Teclado.
		 */
		
		FuncionarioCaixa funcionario = new FuncionarioCaixa(Teclado.leString("Nome: "), 
															Teclado.leString("Endereço: "), 
															Teclado.leChar("Sexo: "), 
															new Calculadora(Teclado.leString("Cor da Calculadora")));
		System.out.println(funcionario.imprimeInfo());
		System.out.println("---");
		
		/*
		 * Imprima o resultado das operações: 2+2, 5-4, 2x3, 6/3, 72, 83. 
		 * As operações devem ser feitas através da calculadora do objeto funcionário criado.
		 */

		System.out.println("Soma: " +funcionario.getCalculadora().soma(2, 2));
		System.out.println("Subtração: " +funcionario.getCalculadora().subtrai(5, 4));
		System.out.println("Multiplicação: " +funcionario.getCalculadora().multiplica(2, 3));
		System.out.println("Divisão: " +funcionario.getCalculadora().divide(6, 3));
		System.out.println("n ao quadrado: " +funcionario.getCalculadora().elevaAoQuadrado(72));
		System.out.println("n ao cubo: " +funcionario.getCalculadora().elevaAoCubo(83));
		
		/*
		 * Neste método, crie um objeto do tipo Empresa chamado empresa1, 
		 * com nome solicitado pelo usuário via Teclado, com o funcionário criado 
		 * anteriormente e um novo funcionário que deve ser criado. 
		 * Tudo que for necessário para criar esta empresa (que já não tenha sido criado) 
		 * deve ser solicitado pelo Teclado.
		 * Imprima as informações desta empresa.
		 */
		
		Empresa empresa1 = new Empresa(Teclado.leString("Nome da Empresa: "), funcionario,
				new FuncionarioCaixa(Teclado.leString("Nome: "), 
									 Teclado.leString("Endereço: "), 
									 Teclado.leChar("Sexo: "), 
									 new Calculadora(Teclado.leString("Cor da Calculadora"))));
		
		System.out.println(empresa1.imprimeInfo());
	}
}
