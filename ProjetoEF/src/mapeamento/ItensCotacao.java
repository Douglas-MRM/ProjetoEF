package mapeamento;

/**
 *
 * @author Jerônimo
 */
public class ItensCotacao {

    private int id_itens_cotacao;
    private String produto;
    private String fornecedor;
    private String caracteristica;
    private float valor_avista;
    private float valor_aprazo;
    private int id_cotacao;
    private int avaliacao_sd;
    private boolean ativacao;
    private boolean status;

    public int getId_itens_cotacao() {
        return id_itens_cotacao;
    }

    public void setId_itens_cotacao(int id_itens_cotacao) {
        this.id_itens_cotacao = id_itens_cotacao;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    public String getCaracteristica() {
        return caracteristica;
    }

    public void setCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }

    public float getValor_avista() {
        return valor_avista;
    }

    public void setValor_avista(float valor_avista) {
        this.valor_avista = valor_avista;
    }

    public float getValor_aprazo() {
        return valor_aprazo;
    }

    public void setValor_aprazo(float valor_aprazo) {
        this.valor_aprazo = valor_aprazo;
    }

    public int getId_cotacao() {
        return id_cotacao;
    }

    public void setId_cotacao(int id_cotacao) {
        this.id_cotacao = id_cotacao;
    }

    public int getAvaliacao_sd() {
        return avaliacao_sd;
    }

    public void setAvaliacao_sd(int avaliacao_sd) {
        this.avaliacao_sd = avaliacao_sd;
    }

    public boolean isAtivacao() {
        return ativacao;
    }

    public void setAtivacao(boolean ativacao) {
        this.ativacao = ativacao;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

}
