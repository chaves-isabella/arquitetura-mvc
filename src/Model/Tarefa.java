package Model;

public class Tarefa {

    private int id;
    private Pessoa responsavel;
    private String nome;
    private String descricao;

    public Tarefa (){}

    public Tarefa(int id, String nome, String descricao, Pessoa responsavel) {
        this.id = id;
        this.responsavel = responsavel;
        this.nome = nome;
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "id=" + id +
                ", responsavel=" + responsavel +
                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                '}' + "\n";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Pessoa getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Pessoa responsavel) {
        this.responsavel = responsavel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
