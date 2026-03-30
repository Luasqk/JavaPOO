package EX00;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return this.preco;
    }

    public void setPreco(Double preco) {
        if (preco <= (double)0.0F) {
            System.out.println("digite um valor válido.");
        } else {
            this.preco = preco;
        }

    }

    public int getQuantidade() {
        return this.quantidade;
    }

    public void setQuantidade(int quantidade) {
        if (quantidade <= 0) {
            System.out.println("digite um valor válido.");
        } else {
            this.quantidade = quantidade;
        }

    }

    public String toString() {
        String var10000 = this.getNome();
        return "EX00.Produto: " + var10000 + "\nPreço: R$" + this.getPreco() + "\nQuantidade: " + this.quantidade;
    }
}