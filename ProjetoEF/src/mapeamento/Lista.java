package mapeamento;

/**
 *
 * @author Jerônimo
 */
public class Lista {

    private int id_list;
    private String nome;
    private String data_inicial;
    private String data_final;
    private boolean ativacao;

    public int getId_list() {
        return id_list;
    }

    public void setId_list(int id_list) {
        this.id_list = id_list;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData_inicial() {
        return data_inicial;
    }

    public void setData_inicial(String data_inicial) {
        this.data_inicial = data_inicial;
    }

    public String getData_final() {
        return data_final;
    }

    public void setData_final(String data_final) {
        this.data_final = data_final;
    }

    public boolean isAtivacao() {
        return ativacao;
    }

    public void setAtivacao(boolean ativacao) {
        this.ativacao = ativacao;
    }


}
