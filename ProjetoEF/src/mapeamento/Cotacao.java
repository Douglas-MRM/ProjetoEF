package mapeamento;

/**
 *
 * @author Jerônimo
 */
public class Cotacao {

    private int id_cotacao;
    private String nome;
    private int fk_avaliacao;
    private String nome_fk_avaliacao;
    private boolean fk_ativacao;

    public int getId_cotacao() {
        return id_cotacao;
    }

    public void setId_cotacao(int id_cotacao) {
        this.id_cotacao = id_cotacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isFk_ativacao() {
        return fk_ativacao;
    }

    public void setFk_ativacao(boolean fk_ativacao) {
        this.fk_ativacao = fk_ativacao;
    }

    public String getNome_fk_avaliacao() {
        return nome_fk_avaliacao;
    }

    public void setNome_fk_avaliacao(String nome_fk_avaliacao) {
        this.nome_fk_avaliacao = nome_fk_avaliacao;
    }

    public int getFk_avaliacao() {
        return fk_avaliacao;
    }

    public void setFk_avaliacao(int fk_avaliacao) {
        this.fk_avaliacao = fk_avaliacao;
    }

}
