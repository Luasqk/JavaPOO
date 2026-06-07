package EX18;

abstract class Produto {
    String nome;
    double preco;

    public Produto(String nome, double preco) throws ValorException{
        nomeInvalido(nome);
        precoValido(preco);

        this.preco = preco;
        this.nome = nome;
    }
    void precoValido(double preco) throws ValorException {
        if (preco <= 0 || preco > 1000000 ) {
            throw new ValorException("Preco invalido.");
        }
    }

    void nomeInvalido(String nome) throws ValorException{
        if (nome == null || nome.trim().isEmpty()){
            throw new ValorException("Nome invalido.");
        }
    }
}
