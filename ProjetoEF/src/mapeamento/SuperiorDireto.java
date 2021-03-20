package mapeamento;

/**
 *
 * @author Jerônimo
 */
public class SuperiorDireto {
    
    private int id_superior_direto;
    private String nome_lista;
    private String nome_produto;
    private int quantidade;
    
//    private Produto produto;
//    private Lista lista;

    public int getId_superior_direto() {
        return id_superior_direto;
    }

    public void setId_superior_direto(int id_superior_direto) {
        this.id_superior_direto = id_superior_direto;
    }

    public String getNome_lista() {
        return nome_lista;
    }

    public void setNome_lista(String nome_lista) {
        this.nome_lista = nome_lista;
    }

    public String getNome_produto() {
        return nome_produto;
    }

    public void setNome_produto(String nome_produto) {
        this.nome_produto = nome_produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
}
