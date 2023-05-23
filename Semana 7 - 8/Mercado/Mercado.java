package exercicios_fixacao3;

public class Mercado {
	//Atributos;
	private Prateleira prateleira1;
	private Prateleira prateleira2;
	
	//Construtor
	public Mercado(Prateleira prateleira1, Prateleira prateleira2) {
		this.prateleira1 = prateleira1;
		this.prateleira2 = prateleira2;
	}
	
	//Métodos
	public double mediaValorProdutos() {
		int qtdProdutos = 0;
		double somaValores = 0;
		
		if(prateleira1.getProd1() != null) {
            qtdProdutos++;
            somaValores += prateleira1.getProd1().getPreco();
		}
		
		if(prateleira1.getProd2() != null) {
            qtdProdutos++;
            somaValores += prateleira1.getProd2().getPreco();
		}
		
		if(prateleira1.getProd3() != null) {
            qtdProdutos++;
            somaValores += prateleira1.getProd3().getPreco();
		}
		
		if(prateleira2.getProd1() != null) {
            qtdProdutos++;
            somaValores += prateleira2.getProd1().getPreco();
		}
		
		if(prateleira2.getProd2() != null) {
            qtdProdutos++;
            somaValores += prateleira2.getProd2().getPreco();
		}
		
		if(prateleira2.getProd3() != null) {
            qtdProdutos++;
            somaValores += prateleira2.getProd3().getPreco();
		}

		return somaValores / qtdProdutos;
	}
	
	//Getters and Setters
	public Prateleira getPrateleira1() {
		return prateleira1;
	}

	public void setPrateleira1(Prateleira prateleira1) {
		this.prateleira1 = prateleira1;
	}

	public Prateleira getPrateleira2() {
		return prateleira2;
	}

	public void setPrateleira2(Prateleira prateleira2) {
		this.prateleira2 = prateleira2;
	}
}
