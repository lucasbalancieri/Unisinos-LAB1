public class Livro{
    private String titulo;
    private String autor;
    private String dataPubli;
    private double preco;
    private int qtdPagina;
    
    //construtor
    public Livro(String titulo,String autor, String dataPubli, double preco, int qtdPagina){
        this.titulo = titulo;
        this.autor = autor;
        this.dataPubli = dataPubli;
        this.preco = preco;
        this.qtdPagina = qtdPagina;
    }
    
    //métodos
    public double calcularPrecoPorPagina(){
        return this.preco/this.qtdPagina;
    }
    
    public String toString(){
        return "Título: " +this.titulo+
                "\nAutor: "+this.autor+
                "\nData de Publicação: "+this.dataPubli+
                "\nPreço: R$ "+this.preco+
                "\nPáginas: "+this.qtdPagina+
                "\n";
    }
    //getters and setters
    public String getTitulo(){
        return this.titulo;
    }
    
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    
    public String getAutor(){
        return this.autor;
    }
    
    public void setAutor(String autor){
        this.autor = autor;
    }
    
    public String getDataPubli(){
        return this.dataPubli;
    }
    
    public void setDataPubli(String dataPubli){
        this.dataPubli = dataPubli;
    }
    
    public double getPreco(){
        return this.preco;
    }
    
    public void setPreco(double preco){
        this.preco = preco;
    }
    
    public int getQtdPagina(){
        return this.qtdPagina;
    }
    
    public void setQtdPagina(int qtdPagina){
        this.qtdPagina = qtdPagina;        
    }
    
}