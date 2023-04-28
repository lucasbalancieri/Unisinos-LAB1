package exercicios_fixacao2;

public class FuncionarioCaixa {
	//Atributos
	private String nome;
	private String endereco;
	private char sexo;
	private Calculadora calculadora;
	
	//Construtores
	public FuncionarioCaixa() {
		this.nome = "Funcionario Teste";
		this.endereco = "Endereço Teste";
		this.sexo = 'T';
		this.calculadora = new Calculadora("Calculadora Teste");
	}
	
	public FuncionarioCaixa(String nome, String endereco, char sexo, Calculadora calculadora) {
		this.nome = nome;
		this.endereco = endereco;
		this.sexo = sexo;
		this.calculadora = calculadora;
	}
	
	//Métodos
	public double soma(double n1, double n2) {
		return this.calculadora.soma(n1, n2);
	}
	
	public double subtrai(double n1, double n2) {
		return this.calculadora.subtrai(n1, n2);
	}
	
	public double multiplica(double n1, double n2) {
		return this.calculadora.multiplica(n1, n2);
	}
	
	public double divide(double n1, double n2) {
		return this.calculadora.divide(n1, n2);
	}
	
	public int elevaAoQuadrado(int n1) {
		return this.calculadora.elevaAoQuadrado(n1);
	}
	
	public int elevaAoCubo(int n1) {
		return this.calculadora.elevaAoCubo(n1);
	}
	
	public String imprimeInfo() {
		return "Nome: "+this.nome+
			   "\nEndereço: "+this.endereco+
			   "\nSexo: "+this.sexo+
			   "\nCalculadora: "+this.calculadora.imprimeInfo();
	}

	//Getters and Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public Calculadora getCalculadora() {
		return calculadora;
	}

	public void setCalculadora(Calculadora calculadora) {
		this.calculadora = calculadora;
	}
}
