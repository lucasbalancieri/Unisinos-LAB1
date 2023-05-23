package exercicios_fixacao3;

public class Produto {
	//Atributos
	private String nome;
	private double preco;
	private Data data_validade;
	
	//Construtor
	public Produto(String nome, double preco, Data data_validade) {
		this.nome = nome;
		this.preco = preco;
		this.data_validade = data_validade;
	}

	//Métodos
	public boolean verificaProdutoVencido(Data data) {	
		return (this.data_validade.getAno() < data.getAno()) 
				|| ((this.data_validade.getAno() == data.getAno()) && (this.data_validade.getMes() < data.getMes()))
				|| ((this.data_validade.getAno() == data.getAno()) && (this.data_validade.getMes() == data.getMes())
						&& (this.data_validade.getDia() < data.getDia()));

	}
	
	@Override
	public String toString() {
		return "Produto: " +this.nome+
				"\nPreço: R$ "+this.preco+
				"\nData de validade: " +this.data_validade;
	}
	
	//Getters and Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public Data getData_validade() {
		return data_validade;
	}

	public void setData_validade(Data data_validade) {
		this.data_validade = data_validade;
	}
}
