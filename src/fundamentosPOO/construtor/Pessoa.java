package FundamentosPOO.construtor;

public class Pessoa {
    private String nome;
    private String cpf;
    private String endereco;

    public String getNome() {
        return nome;
    }
    public String getCpf() {
        return cpf;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    //ESSES SÃO OS ATRIBUTOS RELEVANTES PARA CRIAR UM OBJETO
    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }
}

