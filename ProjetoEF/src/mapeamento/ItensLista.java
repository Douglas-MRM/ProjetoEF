package mapeamento;

/**
 *
 * @author Jerônimo
 */
public class ItensLista {

    private int id_iten_list;
    private String nome;
    private int quantidade;
    private String fornecedor;
    private float valor;
    private String categoria;
    private int ativacao;
    private int avaliacao_sd;
    private int fk_id_lista;

    public int getId_iten_list() {
        return id_iten_list;
    }

    public void setId_iten_list(int id_iten_list) {
        this.id_iten_list = id_iten_list;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public int getFk_id_lista() {
        return fk_id_lista;
    }

    public void setFk_id_lista(int fk_id_lista) {
        this.fk_id_lista = fk_id_lista;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getAvaliacao_sd() {
        return avaliacao_sd;
    }

    public void setAvaliacao_sd(int avaliacao_sd) {
        this.avaliacao_sd = avaliacao_sd;
    }

    public int getAtivacao() {
        return ativacao;
    }

    public void setAtivacao(int ativacao) {
        this.ativacao = ativacao;
    }

}
