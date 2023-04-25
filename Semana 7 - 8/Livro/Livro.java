package exercicios_fixacao;

public class Livro {
	
	//Atributos
	private String titulo;
	private String autor;
	private String data_publi;
	private double preco;
	private int qtd_paginas;
	
	//Construtores
	public Livro() {
	
	}
	
	public Livro(String titulo, String autor, String data_publi, double preco, int qtd_paginas ) {
		this.titulo = titulo;
		this.autor = autor;
		this.data_publi = data_publi;
		this.preco = preco;
		this.qtd_paginas = qtd_paginas;
	}
	
	//Métodos
	public double calcularPrecoPorPagina() {
		return this.preco / this.qtd_paginas;
	}
	
	@Override
	public String toString() {
		return "\nTitulo: " +this.titulo+
			   "\nAutor: " +this.autor+
			   "\nData de Publicação: "+this.data_publi+
			   "\nPreço: R$ " +this.preco+
			   "\nQuantidade de Páginas: " +this.qtd_paginas+
			   "\nPreço por Pagina: R$ "+this.calcularPrecoPorPagina();			   
	}
	
	//Getters and Setters
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getData_publi() {
		return data_publi;
	}

	public void setData_publi(String data_publi) {
		this.data_publi = data_publi;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQtd_paginas() {
		return qtd_paginas;
	}

	public void setQtd_paginas(int qtd_paginas) {
		this.qtd_paginas = qtd_paginas;
	}
}
