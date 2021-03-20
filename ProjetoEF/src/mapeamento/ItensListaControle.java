package mapeamento;

/**
 *
 * @author Jerônimo
 */
public class ItensListaControle {

    private int id_itens_listControl;
    private String razao_social;
    private String cnpj;
    private String vencimento_boleto;
    private float valor;
    private String fk_id_situacao;
    private int fk_id_listControl;

    public int getId_itens_listControl() {
        return id_itens_listControl;
    }

    public void setId_itens_listControl(int id_itens_listControl) {
        this.id_itens_listControl = id_itens_listControl;
    }

    public String getRazao_social() {
        return razao_social;
    }

    public void setRazao_social(String razao_social) {
        this.razao_social = razao_social;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getVencimento_boleto() {
        return vencimento_boleto;
    }

    public void setVencimento_boleto(String vencimento_boleto) {
        this.vencimento_boleto = vencimento_boleto;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getFk_id_situacao() {
        return fk_id_situacao;
    }

    public void setFk_id_situacao(String fk_id_situacao) {
        this.fk_id_situacao = fk_id_situacao;
    }

    public int getFk_id_listControl() {
        return fk_id_listControl;
    }

    public void setFk_id_listControl(int fk_id_listControl) {
        this.fk_id_listControl = fk_id_listControl;
    }

    public void getFk_id_listControl(int aInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
