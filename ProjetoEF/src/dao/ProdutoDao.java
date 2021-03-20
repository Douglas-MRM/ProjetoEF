package dao;

import conexao.ConexaoMySql;
import funcoes.Mensagem;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import mapeamento.Produto;

/**
 *
 * @author Jerônimo
 */
public class ProdutoDao {

    public void insert(Produto prod) {
        Connection con = ConexaoMySql.getConexao();
        String sql = "INSERT INTO produto (nome_prod, marca_prod, categoria_prod, observacao_prod) VALUES (?, ?, ?, ?)";
        try (PreparedStatement stm = con.prepareStatement(sql)) {
            stm.setString(1, prod.getNome());
            stm.setString(2, prod.getMarca());
            stm.setString(3, prod.getCategoria());
            stm.setString(4, prod.getObservacao());
            stm.executeUpdate();
            stm.close();
            con.close();

            msg.Mensagem("Lista criada com sucesso!", "SistemaEF diz:", 1);
        } catch (Exception e) {
            msg.Mensagem("Não foi possível criar a lista!", "SistemaEF diz:", 0);
        }
    }

    public void update(Produto prod) {
        Connection con = ConexaoMySql.getConexao();
        String sql = "UPDATE produto SET nome_prod = ?, marca_prod = ?, categoria_prod = ?, observacao_prod = ? WHERE id_prod = ?";

        try (PreparedStatement stm = con.prepareStatement(sql)) {
            stm.setString(1, prod.getNome());
            stm.setString(2, prod.getMarca());
            stm.setString(3, prod.getCategoria());
            stm.setString(4, prod.getObservacao());
            stm.setInt(5, prod.getId_produto());

            stm.executeUpdate();
            System.out.println("Aqui");
            stm.close();
            con.close();
            msg.Mensagem("Produto atualizada com sucesso!", "SistemaEF diz:", 1);

        } catch (Exception e) {
            msg.Mensagem("Não foi possível fazer a atualização!", "SistemaEF diz:", 0);
        }
    }

    public void delete(Produto prod) {
        Connection con = ConexaoMySql.getConexao();
        String sql = "UPDATE produto, estoque SET produto.fk_ativacao = ? , estoque.fk_ativacao = ? WHERE produto.id_prod = ? AND estoque.fk_id_prod = ?;";
        int opcao = JOptionPane.showConfirmDialog(null, "Realmente deseja desativar esta Lista?", "SistemaEF diz:", JOptionPane.YES_NO_OPTION);

        if (opcao == JOptionPane.YES_OPTION) {
            try (PreparedStatement stm = con.prepareStatement(sql)) {
                stm.setBoolean(1, false);
                stm.setBoolean(2, false);
                stm.setInt(3, prod.getId_produto());
                stm.setInt(4, prod.getId_produto());
                stm.executeUpdate();

                stm.close();
                con.close();

                msg.Mensagem("Produto excluido com sucesso!", "SistemaEF diz:", 1);

            } catch (Exception e) {
                msg.Mensagem("Falha ao excluir produto!", "SistemaEF diz:", 0);
            }
        }

    }

    public List<Produto> listAll() {
        Connection con = ConexaoMySql.getConexao();
        String sql = "SELECT * FROM produto WHERE fk_ativacao = ?";
        List<Produto> listList = new ArrayList();

        try (PreparedStatement stm = con.prepareStatement(sql)) {
            stm.setBoolean(1, true);
            ResultSet re = stm.executeQuery();
            while (re.next()) {
                Produto prod = new Produto();
                prod.setId_produto(re.getInt("produto.id_prod"));
                prod.setNome(re.getString("produto.nome_prod"));
                prod.setMarca(re.getString("produto.marca_prod"));
                prod.setCategoria(re.getString("produto.categoria_prod"));
                prod.setObservacao(re.getString("produto.observacao_prod"));

                listList.add(prod);
            }
        } catch (Exception e) {
            msg.Mensagem("Falha ao buscar os registros!", "SistemaEF diz:" + e, 0);
        }
        return listList;
    }

    Mensagem msg = new Mensagem();
}
