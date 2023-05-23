package exercicios_fixacao4;

public class Pessoa {
	//Atributos
	private String nome;
	private char sexo;
	private int idade;
	private double altura;
	private int qtdIrmaos;
	private String endereco;
	
	//Construtor
	public Pessoa(String nome, char sexo, int idade, double altura, int qtdIrmaos, String endereco) {
		this.nome = nome;
		this.sexo = sexo;
		this.idade = idade;
		this.altura = altura;
		this.qtdIrmaos = qtdIrmaos;
		this.endereco = endereco;
	}
	
	//Métodos
	public boolean isFilhoUnico() {
		return this.qtdIrmaos <= 0;
	}
	@Override
	public String toString() {
		return "Nome: " + this.nome +
			   "\nSexo: " + this.sexo +
			   "\nIdade: " + this.idade +
			   "\nAltura: " + this.altura +
			   "\nQuantidade de Irmãos: " + this.qtdIrmaos +
			   "\nEndereço: " + this.endereco + "\n";
	}
	
	
	//Getters and Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public int getQtdIrmaos() {
		return qtdIrmaos;
	}

	public void setQtdIrmaos(int qtdIrmaos) {
		this.qtdIrmaos = qtdIrmaos;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}	
}
