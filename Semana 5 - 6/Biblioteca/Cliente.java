public class Cliente{
    private String nome;
    private int idade;
    private String sexo;
    private String email;
    private String senha;
    
    //construtor
    public Cliente(String nome, int idade, String sexo, String email, String senha){
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.email = email;
        this.senha = senha; 
    }
    
    //métodos
    public String imprimeInformacoes(){
        return "Nome: "+this.nome+
               "\nIdade: "+this.idade+
               "\nSexo: "+this.sexo+
               "\nEmail: "+this.email+
               "\nSenha: "+this.senha+
               "\n";
    }
    
    //getters and setters
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public int getIdade(){
        return this.idade;
    }
    
    public void setIdade(int idade){
        this.idade = idade;
    }
    
    public String getSexo(){
        return this.sexo;
    }
    
    public void setSexo(String sexo){
        this.sexo = sexo;
    }
    
    public String getEmail(){
        return this.email;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    public String getSenha(){
        return this.senha;
    }
    
    public void setSenha(){
        this.senha = senha;
    }
}
