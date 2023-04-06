public class PrincipalAluno{
    public static void main(String[] args){
        //Instanciar objetos da classe Aluno
        Aluno aluno1 = new Aluno("Brandamente Brasil", "1585258", 5, 9);
        Aluno aluno2 = new Aluno("Radigunda Cercená", "2254879", 8, 2);
        Aluno aluno3 = new Aluno("Vitimado José Araújo", "0085994", 7, 1);
        
        //Informações dos objetos;
        System.out.println(aluno1.imprimeInfo());
        System.out.println(aluno2.imprimeInfo());
        System.out.println(aluno3.imprimeInfo());
        
        aluno2.setNotaGrauA(9);
        
        System.out.println("Média Final de Radigunda: "+aluno2.calculaMediaFinal());
        System.out.println("Matricula de Vitimado: "+aluno3.getMatricula());
        
        aluno1.setMatricula("1585228");
        
        aluno2.setNotaGrauB(Teclado.leDouble("Nova nota do Grau B"));
        
        //Informações dos objetos;
        System.out.println("Informações Atualizadas");
        System.out.println(aluno1.imprimeInfo());
        System.out.println(aluno2.imprimeInfo());
        System.out.println(aluno3.imprimeInfo());
    }
}