package exercicios_fixacao2;

public class Calculadora {
	//Atributos;
	private int memoria;
	private String cor;
	
	//Construtor
	public Calculadora(String cor) {
		this.memoria = 0;
		this.cor = cor;
	}
	
	//Métodos
	public double soma(double n1, double n2) {
		return n1 + n2;
	}
	
	public double subtrai(double n1, double n2) {
		return n1 - n2;
	}
	
	public double multiplica(double n1, double n2) {
		return n1 * n2;
	}
	
	public double divide(double n1, double n2) {
		return n1/n2;
	}
	
	public int elevaAoQuadrado(int n1) {
		return (int) Math.pow(n1, 2);
	}
	
	public int elevaAoCubo(int n1) {
		return (int) Math.pow(n1, 3);
	}
	
	public String imprimeInfo() {
		return "Cor: "+this.cor+
			   "\nMemória: "+this.memoria;
	}

	//Getters and Setters
	public String getCor() {
		return cor;
	}


	public void setCor(String cor) {
		this.cor = cor;
	}
	
	
}
