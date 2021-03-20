package mapeamento;

/**
 *
 * @author Jerônimo
 */
public class Agenda {

    private int id_agenda;
    private String nome_evento;
    private String data_inicial;
    private String data_final;
    private String horario;
    private int ativacao;

    public int getId_agenda() {
        return id_agenda;
    }

    public void setId_agenda(int id_agenda) {
        this.id_agenda = id_agenda;
    }

    public String getNome_evento() {
        return nome_evento;
    }

    public void setNome_evento(String nome_evento) {
        this.nome_evento = nome_evento;
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

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public int getAtivacao() {
        return ativacao;
    }

    public void setAtivacao(int ativacao) {
        this.ativacao = ativacao;
    }

}
