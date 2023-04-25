package exercicios_fixacao;

public class Principal {

	public static void main(String[] args) {
		
		Livro livro1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", "1954", 49.90, 1000);
		Livro livro2 = new Livro("Harry Potter e a Pedra Filosofal", "J.K. Rowling", "1997", 29.90, 300);
		Livro livro3 = new Livro("O Pequeno Príncipe", "Antoine de Saint-Exupéry", "1943", 19.90, 200);

		Cliente cliente1 = new Cliente(
				Teclado.leString("Nome: "), 
				Teclado.leInt("Idade: "), 
				Teclado.leChar("Sexo: "), 
				Teclado.leString("Email: "), 
				Teclado.leString("Senha: "), 
				livro1);

		Cliente cliente2 = new Cliente(
				Teclado.leString("Nome: "), 
				Teclado.leInt("Idade: "), 
				Teclado.leChar("Sexo: "), 
				Teclado.leString("Email: "), 
				Teclado.leString("Senha: "), 
				livro2);
		
		Cliente cliente3 = new Cliente(
				Teclado.leString("Nome: "), 
				Teclado.leInt("Idade: "), 
				Teclado.leChar("Sexo: "), 
				Teclado.leString("Email: "), 
				Teclado.leString("Senha: "), 
				livro3);
				
		System.out.println("O cliente "+ cliente1.getNome() +" está com o livro "+livro1.getTitulo()+", e o preço por página deste livro é R$"+livro1.calcularPrecoPorPagina());
		System.out.println("O cliente "+ cliente2.getNome() +" está com o livro "+livro2.getTitulo()+", e o preço por página deste livro é R$"+livro2.calcularPrecoPorPagina());
		System.out.println("O cliente "+ cliente3.getNome() +" está com o livro "+livro3.getTitulo()+", e o preço por página deste livro é R$"+livro3.calcularPrecoPorPagina());
	}

}
