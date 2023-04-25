package exercicios_fixacao;

public class Cliente {
	
	//Atributos
	private String nome;
	private int idade;
	private char sexo;
	private String email;
	private String senha;
	private Livro livro;
	
	//Construtores
	public Cliente() {
		
	}
	
	public Cliente(String nome, int idade, char sexo, String email, String senha) {
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		this.email = email;
		this.senha = senha;
	}
	
	public Cliente(String nome, int idade, char sexo, String email, String senha, Livro livro) {
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		this.email = email;
		this.senha = senha;
		this.livro = livro;
	}
	
	//Métodos
	public String imprimeInformacoes() {
		return "Nome: " +this.nome+
				"\nIdade: " +this.idade+
				"\nSexo: " +this.sexo+
				"\nEmail: " +this.email+
				"\nSenha: " +this.senha+
				"\n"+this.livro;			
	}
	
	@Override
	public String toString() {
		return this.imprimeInformacoes();
	}
	
	//Getters and Setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public Livro getLivro() {
		return livro;
	}
	public void setLivro(Livro livro) {
		this.livro = livro;
	}	
}
