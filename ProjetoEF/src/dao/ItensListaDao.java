package dao;

import conexao.ConexaoMySql;
import funcoes.Mensagem;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import mapeamento.ItensLista;

/**
 *
 * @author Jerônimo
 */
public class ItensListaDao {

    public void insert(ItensLista itenList) {
        Connection con = ConexaoMySql.getConexao();
        String sql = "INSERT INTO itens_lista (nome_iten_list, quantidade_iten_list, fornecedor_iten_list, valor_iten_list, categoria_iten_list, fk_ativacao, fk_avaliacao_sd, fk_id_list) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement stm = con.prepareStatement(sql)) {
            stm.setString(1, itenList.getNome());
            stm.setInt(2, itenList.getQuantidade());
            stm.setString(3, itenList.getFornecedor());
            stm.setFloat(4, itenList.getValor());
            stm.setString(5, itenList.getCategoria());
            stm.setInt(6, itenList.getAtivacao());
            stm.setInt(7, itenList.getAvaliacao_sd());
            stm.setInt(8, itenList.getFk_id_lista());
            stm.executeUpdate();

            stm.close();
            con.close();

            msg.Mensagem("Item cadastrado com sucesso!", "SistemaEF diz:", 1);

        } catch (Exception e) {
            msg.Mensagem("Falha ao cadastrar Item!", "SistemaEF alerta:", 0);
        }

    }

    public void update() {

    }

    public void deactivate(ItensLista itenList) {
        Connection con = ConexaoMySql.getConexao();
        String sql = "UPDATE itens_lista SET fk_ativacao = ? WHERE id_iten_list = ?";
        int opcao = JOptionPane.showConfirmDialog(null, "Realmente deseja excluir o Item: " + itenList.getNome() + ", desta lista de compra?", "SistemaEF diz:", JOptionPane.YES_NO_OPTION);
        if (opcao == JOptionPane.YES_OPTION) {
            try (PreparedStatement stm = con.prepareStatement(sql)) {
                stm.setBoolean(1, false);
                stm.setInt(2, itenList.getId_iten_list());
                stm.executeUpdate();

                stm.close();
                con.close();

                msg.Mensagem("Item excluido com sucesso!", "SistemaEF diz:", 1);

            } catch (Exception e) {
                msg.Mensagem("Falha na exclusão do item!", "SistemaEF diz:", 1);
            }
        }
    }

    public List<ItensLista> listAll(int id) {
        Connection con = ConexaoMySql.getConexao();
        String sql = "SELECT * FROM itens_lista WHERE (fk_id_list = ? AND fk_ativacao = ?) AND (fk_avaliacao_sd is null OR fk_avaliacao_sd = ?)";
        
        List<ItensLista> itensLista = new ArrayList();

        try (PreparedStatement stm = con.prepareStatement(sql)) {
            stm.setInt(1, id);
            stm.setBoolean(2, true);
            stm.setInt(3, 2);
            ResultSet re = stm.executeQuery();

            while (re.next()) {
                ItensLista il = new ItensLista();
                il.setId_iten_list(re.getInt("itens_lista.id_iten_list"));
                il.setNome(re.getString("itens_lista.nome_iten_list"));
                il.setQuantidade(re.getInt("itens_lista.quantidade_iten_list"));
                il.setFornecedor(re.getString("itens_lista.fornecedor_iten_list"));
                il.setValor(re.getFloat("itens_lista.valor_iten_list"));
                il.setFk_id_lista(re.getInt("itens_lista.fk_id_list"));

                itensLista.add(il);

            }
        } catch (Exception e) {
            msg.Mensagem("Falha ao buscar os registros!", "SistemaEF diz: " + e, 0);
        }
        return itensLista;
    }

    Mensagem msg = new Mensagem();
}
