//Livro String titulo,String autor, String dataPubli, double preco, int qtdPagina
//Cliente: String nome, int idade, String sexo, String email, String senha
public class Main{
    public static void main(String[] args){
        //Instanciar objetos da classe Livro
        System.out.println(".:Dados 1º Livro:.");
        Livro livro1 = new Livro(Teclado.leString("Titulo: "), Teclado.leString("Autor: "), Teclado.leString("Data de Publicação: "), Teclado.leDouble("Preço: "), Teclado.leInt("Quantidade de Páginas: "));
        System.out.println(".:Dados 2º Livro:.");
        Livro livro2 = new Livro(Teclado.leString("Titulo: "), Teclado.leString("Autor: "), Teclado.leString("Data de Publicação: "), Teclado.leDouble("Preço: "), Teclado.leInt("Quantidade de Páginas: "));
        System.out.println(".:Dados 3º Livro:.");
        Livro livro3 = new Livro(Teclado.leString("Titulo: "), Teclado.leString("Autor: "), Teclado.leString("Data de Publicação: "), Teclado.leDouble("Preço: "), Teclado.leInt("Quantidade de Páginas: "));
        
        //Instanciar objetos da classe Cliente
        System.out.println(".:Dados 1º Cliente:.");
        Cliente cliente1 = new Cliente(Teclado.leString("Nome: "), Teclado.leInt("Idade: "), Teclado.leString("Sexo: "), Teclado.leString("Email: "), Teclado.leString("Senha: "));
        System.out.println(".:Dados 2º Cliente:.");
        Cliente cliente2 = new Cliente(Teclado.leString("Nome: "), Teclado.leInt("Idade: "), Teclado.leString("Sexo: "), Teclado.leString("Email: "), Teclado.leString("Senha: "));
        System.out.println(".:Dados 3º Cliente:.");
        Cliente cliente3 = new Cliente(Teclado.leString("Nome: "), Teclado.leInt("Idade: "), Teclado.leString("Sexo: "), Teclado.leString("Email: "), Teclado.leString("Senha: "));
        
        //Preço por página.
        System.out.println(".:Preço por Página:.");
        System.out.println("Livro: "+livro1.getTitulo()+" | Preço por Página: R$ "+livro1.calcularPrecoPorPagina());
        System.out.println("Livro: "+livro2.getTitulo()+" | Preço por Página: R$ "+livro2.calcularPrecoPorPagina());
        System.out.println("Livro: "+livro3.getTitulo()+" | Preço por Página: R$ "+livro3.calcularPrecoPorPagina()+"\n");
        
        System.out.println(".:Livros:.");
        System.out.println(livro1.toString());
        System.out.println(livro2.toString());
        System.out.println(livro3.toString());
        
        System.out.println(".:Clientes:.");
        System.out.println(cliente1.imprimeInformacoes());
        System.out.println(cliente2.imprimeInformacoes());
        System.out.println(cliente3.imprimeInformacoes());
    }
}