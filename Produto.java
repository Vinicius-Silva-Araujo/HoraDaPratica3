public class Produto {
    private String nome;
    private double preco;
    private double descontoRecebido;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    double aplicaDesconto (){
        descontoRecebido = preco/10;
        return preco-descontoRecebido;
    }
}
