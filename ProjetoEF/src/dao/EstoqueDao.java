package dao;

import conexao.ConexaoMySql;
import funcoes.Mensagem;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import mapeamento.Estoque;
import mapeamento.Produto;

/**
 *
 * @author Jerônimo
 */
public class EstoqueDao {

    public void upEstoque(Estoque esto) {
        Connection con = ConexaoMySql.getConexao();
        String sql = "UPDATE estoque SET quantidade_esto = ? WHERE id_esto = ?";
        try (PreparedStatement stm = con.prepareStatement(sql)) {
            stm.setInt(1, esto.getQuantidade());
            stm.setInt(2, esto.getId_estoque());
            stm.executeUpdate();

            stm.close();
            con.close();

            msg.Mensagem("Estoque do produto " + esto.getProduto().getNome() + " atualizado!", "SistemaEF diz:", 1);

        } catch (Exception e) {
            msg.Mensagem("Falha ao atualizar estoque!" + e, "SistemaEF diz:", 0);
        }
    }

    public void downEstoque(Estoque esto) {
        Connection con = ConexaoMySql.getConexao();
        String sql = "UPDATE estoque SET quantidade_esto = ? WHERE id_esto = ?";
        try (PreparedStatement stm = con.prepareStatement(sql)) {
            stm.setInt(1, esto.getQuantidade());
            stm.setInt(2, esto.getId_estoque());
            stm.executeUpdate();

            stm.close();
            con.close();

            msg.Mensagem("Estoque do produto " + esto.getProduto().getNome() + " atualizado!", "SistemaEF diz:", 1);

        } catch (Exception e) {
            msg.Mensagem("Falha ao atualizar estoque!" + e, "SistemaEF diz:", 0);
        }
    }

    public List<Estoque> listAll() {
        Connection con = ConexaoMySql.getConexao();
        String sql = "SELECT * FROM estoque INNER JOIN produto ON produto.id_prod = estoque.fk_id_prod AND estoque.fk_ativacao = ?";
        List<Estoque> listEsto = new ArrayList();

        try (PreparedStatement stm = con.prepareStatement(sql)) {
            stm.setBoolean(1, true);
            ResultSet re = stm.executeQuery();
            while (re.next()) {
                Estoque esto = new Estoque();
                esto.setId_estoque(re.getInt("estoque.id_esto"));
                esto.setQuantidade(re.getInt("estoque.quantidade_esto"));

                Produto prod = new Produto();
                prod.setId_produto(re.getInt("produto.id_prod"));
                prod.setNome(re.getString("produto.nome_prod"));
                esto.setProduto(prod);

                listEsto.add(esto);
            }
        } catch (Exception e) {
            msg.Mensagem("Falha ao buscar os registros!", "SistemaEF diz:" + e, 0);
        }
        return listEsto;
    }

    public List<Estoque> listAll(String text) {
        Connection con = ConexaoMySql.getConexao();
        String sql = "SELECT * FROM estoque INNER JOIN produto ON produto.id_prod = estoque.fk_id_prod AND estoque.fk_ativacao = ? AND nome_prod LIKE ?";
        List<Estoque> listEsto = new ArrayList();

        try (PreparedStatement stm = con.prepareStatement(sql)) {
            stm.setBoolean(1, true);
            stm.setString(2, "%" + text + "%");
            ResultSet re = stm.executeQuery();
            while (re.next()) {
                Estoque esto = new Estoque();
                esto.setId_estoque(re.getInt("estoque.id_esto"));
                esto.setQuantidade(re.getInt("estoque.quantidade_esto"));

                Produto prod = new Produto();
                prod.setId_produto(re.getInt("produto.id_prod"));
                prod.setNome(re.getString("produto.nome_prod"));
                esto.setProduto(prod);

                listEsto.add(esto);
            }
        } catch (Exception e) {
            msg.Mensagem("Falha ao buscar os registros!", "SistemaEF diz:" + e, 0);
        }
        return listEsto;
    }

    Mensagem msg = new Mensagem();
}
