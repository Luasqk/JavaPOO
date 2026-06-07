package EX18;

public class ProdutoFisico extends Produto implements Vendavel  {
    @Override
    public void vender() {
        System.out.println("Vendendo " + nome);
    }

    public ProdutoFisico(String nome, double preco) throws ValorException{
        super(nome, preco);
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\nPreco: " + preco;
     }

}
