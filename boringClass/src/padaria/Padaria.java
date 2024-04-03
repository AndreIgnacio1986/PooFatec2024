package padaria;

public class Padaria {
    private String nome;
    private String endereco;
    private String telefone;
    private String horarioFuncionamento;

    // Construtor da classe Padaria
    public Padaria(String nome, String endereco, String telefone, String horarioFuncionamento) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.horarioFuncionamento = horarioFuncionamento;
    }

    // Métodos get para retornar os valores dos atributos
    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getHorarioFuncionamento() {
        return horarioFuncionamento;
    }

    // Métodos set para inserir os valores dos atributos
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    // Não é necessário um método set para horarioFuncionamento, pois ele é inicializado no construtor
}
