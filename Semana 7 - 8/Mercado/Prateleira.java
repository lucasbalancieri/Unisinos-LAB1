package exercicios_fixacao3;

public class Prateleira {
	//Atributos
	private Produto prod1;
	private Produto prod2;
	private Produto prod3;
	
	//Construtor
	public Prateleira() {
		
	}
	
	public Prateleira(Produto prod1, Produto prod2, Produto prod3) {
		this.prod1 = prod1;
		this.prod2 = prod2;
		this.prod3 = prod3;
	}
	
	//Métodos
	public Produto produtoMaisCaro() {
		if((this.prod1.getPreco() > this.prod2.getPreco()) && (this.prod1.getPreco() > this.prod3.getPreco())) {
			return this.prod1;
		}else if((this.prod2.getPreco() > this.prod1.getPreco()) && (this.prod2.getPreco() > this.prod3.getPreco())){
			return this.prod2;
		}else if ((this.prod3.getPreco() > this.prod1.getPreco()) && (this.prod3.getPreco() > this.prod2.getPreco())) {
			return prod3;
		}else {
			return prod1;
		}
	}
	
	public String toString() {
		return "Produto: " +this.prod1.getNome()+ "\tR$: " +this.prod1.getPreco()+
			   "\nProduto: " +this.prod2.getNome()+ "\tR$: " +this.prod2.getPreco()+
			   "\nProduto: " +this.prod3.getNome()+ "\tR$: " +this.prod3.getPreco();
	}
	
	//Getters and Setters;
	public Produto getProd1() {
		return prod1;
	}

	public void setProd1(Produto prod1) {
		this.prod1 = prod1;
	}

	public Produto getProd2() {
		return prod2;
	}

	public void setProd2(Produto prod2) {
		this.prod2 = prod2;
	}

	public Produto getProd3() {
		return prod3;
	}

	public void setProd3(Produto prod3) {
		this.prod3 = prod3;
	}
}
