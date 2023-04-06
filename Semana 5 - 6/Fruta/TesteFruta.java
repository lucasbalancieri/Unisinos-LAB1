/*
Considere a classe Fruta.
crie uma classe chamada TesteFruta, e nela coloque o método main. 
No main, crie instâncias de Fruta e acesse suas informações utilizando os métodos de acesso. 
*/

public class TesteFruta{
    public static void main(String[] args){
        double imposto = 0.2;
        
        Fruta fruta1 = new Fruta("Maça", 1.20);
        Fruta fruta2 = new Fruta("Banana", 1.70);
        Fruta fruta3 = new Fruta("Laranja", 2.10);
        Fruta fruta4 = new Fruta("Melancia", 9.70);
        
        System.out.println("Fruta: "+fruta1.getNome()+"\nPreço s/ imposto: R$ "+fruta1.getPreco()+"\nPreço final: R$ "+fruta1.calculaPreco(imposto)+"\n");
        System.out.println("Fruta: "+fruta2.getNome()+"\nPreço s/ imposto: R$ "+fruta2.getPreco()+"\nPreço final: R$ "+fruta2.calculaPreco(imposto)+"\n");
        System.out.println("Fruta: "+fruta3.getNome()+"\nPreço s/ imposto: R$ "+fruta3.getPreco()+"\nPreço final: R$ "+fruta3.calculaPreco(imposto)+"\n");
        System.out.println("Fruta: "+fruta4.getNome()+"\nPreço s/ imposto: R$ "+fruta4.getPreco()+"\nPreço final: R$ "+fruta4.calculaPreco(imposto)+"\n");

    }
}