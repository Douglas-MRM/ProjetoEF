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
    private double preco;
    private double valor;
    private Lista lista;

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

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Lista getLista() {
        return lista;
    }

    public void setLista(Lista lista) {
        this.lista = lista;
    }

}
