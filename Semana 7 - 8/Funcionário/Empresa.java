package exercicios_fixacao2;

public class Empresa {
	//Atributos
	private String nome;
	private FuncionarioCaixa func1, func2;
	
	//Construtores
	public Empresa(){
		this.nome = "Empresa Teste";
		this.func1 = null;
		this.func2 = null;
	}
	
	public Empresa(String nome, FuncionarioCaixa func1, FuncionarioCaixa func2) {
		this.nome = nome;
		this.func1 = func1;
		this.func2 = func2;
	}
	
	public Empresa(String nome) {
		this.nome = nome;
		this.func1 = null;
		this.func2 = null;
	}
	
	//Métodos
	public String imprimeInfo() {
		return "Nome da Empresa: " +this.nome+
			   "\nFuncionário 1: " +this.func1.imprimeInfo()+
			   "\nFuncionário 2: " +this.func2.imprimeInfo();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public FuncionarioCaixa getFunc1() {
		return func1;
	}

	public void setFunc1(FuncionarioCaixa func1) {
		this.func1 = func1;
	}

	public FuncionarioCaixa getFunc2() {
		return func2;
	}

	public void setFunc2(FuncionarioCaixa func2) {
		this.func2 = func2;
	}	
}
