package exercicios_fixacao3;

public class Principal {

	public static void main(String[] args) {
		Produto produto1 = new Produto("amaciante", 10.00, new Data(10, 04, 2014));
		Produto produto2 = new Produto("creme dental", 11.00, new Data(05, 05, 2015));
		Produto produto3 = new Produto("leite condensado", 12.00, new Data(04, 12, 2012));
		Prateleira prateleira1 = new Prateleira(produto1, produto2, produto3);
		
		Prateleira prateleira2 = new Prateleira();
		prateleira2.setProd1(new Produto ("cortina", 163.96, new Data(13, 10, 2025)));
		
		//Criar mercado
		Mercado mercado = new Mercado(prateleira1, prateleira2);
		
		//Vencimentos
		Data data = new Data(25, 04, 2023);
		
		//Prateleira 1
		System.out.println("Produtos Vencidos: ");
		if (mercado.getPrateleira1().getProd1() != null)
			if(mercado.getPrateleira1().getProd1().verificaProdutoVencido(data))
				System.out.println("O produto " + mercado.getPrateleira1().getProd1().getNome() + " está vencido");
		
		if (mercado.getPrateleira1().getProd2() != null)
			if(mercado.getPrateleira1().getProd2().verificaProdutoVencido(data))
				System.out.println("O produto " + mercado.getPrateleira1().getProd2().getNome() + " está vencido");
		
		if (mercado.getPrateleira1().getProd3() != null)
			if(mercado.getPrateleira1().getProd3().verificaProdutoVencido(data))
				System.out.println("O produto " + mercado.getPrateleira1().getProd3().getNome() + " está vencido");
		
		//Prateleira 2
		if (mercado.getPrateleira2().getProd1() != null)
			if(mercado.getPrateleira2().getProd1().verificaProdutoVencido(data))
				System.out.println("O produto " + mercado.getPrateleira2().getProd1().getNome() + " está vencido");
		
		if (mercado.getPrateleira2().getProd2() != null)
			if(mercado.getPrateleira2().getProd2().verificaProdutoVencido(data))
				System.out.println("O produto " + mercado.getPrateleira2().getProd2().getNome() + " está vencido");
		
		if (mercado.getPrateleira2().getProd3() != null)
			if(mercado.getPrateleira2().getProd3().verificaProdutoVencido(data))
				System.out.println("O produto " + mercado.getPrateleira2().getProd3().getNome() + " está vencido");
		
		//Mais caro;
		System.out.println("\nProduto mais caro: ");
        if ((mercado.getPrateleira1()).produtoMaisCaro() != null) 
        {
            if (((mercado.getPrateleira1()).produtoMaisCaro()).getPreco() > ((mercado.getPrateleira2()).getProd1()).getPreco())
                System.out.printf("%s R$ %.2f", ((mercado.getPrateleira1()).produtoMaisCaro()).getNome(),((mercado.getPrateleira1()).produtoMaisCaro()).getPreco());
            else if (((mercado.getPrateleira2()).getProd1()).getPreco() > ((mercado.getPrateleira1()).produtoMaisCaro()).getPreco())
                System.out.printf("%s R$ %.2f", ((mercado.getPrateleira2()).getProd1()).getNome(),((mercado.getPrateleira2()).getProd1()).getPreco());
            else{
                System.out.print("Preços iguais: ");
                System.out.printf("%s R$ %.2f", ((mercado.getPrateleira1()).produtoMaisCaro()).getNome(),((mercado.getPrateleira1()).produtoMaisCaro()).getPreco());
                System.out.printf("%s R$ %.2f", ((mercado.getPrateleira2()).getProd1()).getNome(),((mercado.getPrateleira2()).getProd1()).getPreco());
            }
        }
        
        //Média
        System.out.printf("\n\nMédia de preço: R$ %.2f", mercado.mediaValorProdutos());
	}
}
