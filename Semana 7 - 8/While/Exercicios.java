package exercicios_fixacao5;

public class Exercicios {
	
	public void contador(int x) {
		while(x <= 300) {
			System.out.println(x);
			x++;
		}
	}

	public void imprimePares(int x) {
		int count = 0;
		int par = 0;
		while (count < x) {
			System.out.println(par += 2);
			count++;
		}
	}
	
	/*
	 * verificaPrimo: recebe por parâmetro um inteiro X e retorna verdadeiro caso X seja primo e false caso não seja.
	 */

	public boolean verificaPrimo(int x) {
	    int divisor = 2;
	    int qtdDivisores = 0;
	    
	    if (x < 2)
	        return false;
	    
	    while (divisor < x) {
	        if (x % divisor == 0) {
	            qtdDivisores += 1;
	            break; // Se encontrou um divisor, não é primo
	        }
	        divisor += 1;
	    }
	    
	    if (qtdDivisores == 0)
	        return true;
	    else
	        return false;    
	}

}
