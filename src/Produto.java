public class Produto {

    private int codigo;
    private String nome;
    private double preco;

    //getters e setters
    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    //construtor
    public Produto (int codigo, String nome, double preco){
        this.preco = preco;
        this.nome = nome;
        this.codigo = codigo;
    }

    //toString

    @Override
    public String toString() {
        return "Nome: " + this.nome + " - Codigo: " + this.codigo +  " - Preco: R$" + this.preco;
    }
}
