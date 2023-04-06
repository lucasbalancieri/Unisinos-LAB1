public class Aluno{
    private String nome;
    private String matricula;
    private double notaGrauA;
    private double notaGrauB;
    
    //construtor
    public Aluno(String nome, String matricula, double notaGrauA, double notaGrauB){
        this.nome = nome;
        this.matricula = matricula;
        this.notaGrauA = notaGrauA;
        this.notaGrauB = notaGrauB;
    }
    
    //métodos
    public double calculaMediaFinal(){
        return (this.notaGrauA * 0.33) + (this.notaGrauB * 0.67);
    }
    
    public String imprimeInfo(){
        return "Nome: "+this.nome+
               "\nMatricula: "+this.matricula+
               "\nNota Grau A: "+this.notaGrauA+
               "\nNota Grau B: "+this.notaGrauB+
               "\nMédia Final: "+this.calculaMediaFinal()+
               "\n";
    }
    //getters and setters
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getMatricula(){
        return this.matricula;
    }
    
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }
    
    public double getNotaGrauA(){
        return this.notaGrauA;
    }
    
    public void setNotaGrauA(double notaGrauA){
        this.notaGrauA = notaGrauA;
    }
    
    public double getNotaGrauB(){
        return this.notaGrauB;
    }
    
    public void setNotaGrauB(double notaGrauB){
        this.notaGrauB = notaGrauB;
    }
    
}