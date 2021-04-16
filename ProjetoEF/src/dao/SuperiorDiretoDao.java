package dao;

import conexao.ConexaoMySql;
import funcoes.Mensagem;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import mapeamento.Lista;
import mapeamento.SuperiorDireto;

/**
 *
 * @author Jerônimo
 */
public class SuperiorDiretoDao {

    public void update(Lista list) {
        Connection con = ConexaoMySql.getConexao();
        String sql = "UPDATE itens_lista SET fk_avaliacao_sd = ? WHERE id_iten_list = ?";
        try (PreparedStatement stm = con.prepareStatement(sql)) {
            stm.setInt(1, 2);
            stm.setInt(2, list.getId_list());

            stm.executeUpdate();
            stm.close();
            con.close();
            msg.Mensagem("Produto autorizado e inserido na lista de compra!", "SistemaEF diz:", 1);

        } catch (Exception e) {
            msg.Mensagem("Não foi possível fazer a atualização!" + e, "SistemaEF diz:", 0);
        }
    }
    
    public void AttSituacao(Lista list) {
        Connection con = ConexaoMySql.getConexao();
        String sql = "UPDATE itens_lista SET fk_avaliacao_sd = ? WHERE id_iten_list = ?";
        try (PreparedStatement stm = con.prepareStatement(sql)) {
            stm.setInt(1, 3);
            stm.setInt(2, list.getId_list());

            stm.executeUpdate();
            stm.close();
            con.close();
            msg.Mensagem("Produto autorizado e inserido na lista de compra!", "SistemaEF diz:", 1);

        } catch (Exception e) {
            msg.Mensagem("Não foi possível fazer a atualização!" + e, "SistemaEF diz:", 0);
        }
    }

    public void recuse(Lista list) {
        Connection con = ConexaoMySql.getConexao();
        String sql = "UPDATE itens_lista SET fk_ativacao = ? WHERE id_iten_list = ?";
        try (PreparedStatement stm = con.prepareStatement(sql)) {
            stm.setBoolean(1, false);
            stm.setInt(2, list.getId_list());

            stm.executeUpdate();
            stm.close();
            con.close();
            msg.Mensagem("O produto foi descartado com sucesso!", "SistemaEF diz:", 1);

        } catch (Exception e) {
            msg.Mensagem("Não foi possível descartar o produto!" + e, "SistemaEF diz:", 0);
        }
    }

    public List<SuperiorDireto> listAll() {
        Connection con = ConexaoMySql.getConexao();
        String sql = "SELECT * FROM itens_lista INNER JOIN lista ON lista.id_list = itens_lista.fk_id_list AND itens_lista.fk_avaliacao_sd = ? AND itens_lista.fk_ativacao = ? ORDER BY id_list ASC";
        List<SuperiorDireto> listSuperiorDireto = new ArrayList();

        try (PreparedStatement stm = con.prepareStatement(sql)) {
            stm.setInt(1, 1);
            stm.setBoolean(2, true);
            ResultSet re = stm.executeQuery();
            while (re.next()) {
                SuperiorDireto sd = new SuperiorDireto();
                sd.setId_superior_direto(re.getInt("id_iten_list"));
                sd.setNome_lista(re.getString("nome_list"));
                sd.setNome_produto(re.getString("nome_iten_list"));
                sd.setQuantidade(re.getInt("quantidade_iten_list"));

                listSuperiorDireto.add(sd);
            }
        } catch (Exception e) {
            msg.Mensagem("Falha ao buscar os registros!", "SistemaEF diz:" + e, 0);
        }
        return listSuperiorDireto;
    }

    public List<SuperiorDireto> listAll(String texto) {
        Connection con = ConexaoMySql.getConexao();
        String sql = "SELECT * FROM itens_lista INNER JOIN lista ON lista.id_list = itens_lista.fk_id_list AND itens_lista.fk_avaliacao_sd = ? AND itens_lista.fk_ativacao = ? AND nome_list LIKE ? ORDER BY id_list DESC";
        List<SuperiorDireto> listSuperiorDireto = new ArrayList();

        try (PreparedStatement stm = con.prepareStatement(sql)) {
            stm.setInt(1, 1);
            stm.setBoolean(2, true);
            stm.setString(3, "%" + texto + "%");
            ResultSet re = stm.executeQuery();
            while (re.next()) {
                SuperiorDireto sd = new SuperiorDireto();
                sd.setId_superior_direto(re.getInt("id_iten_list"));
                sd.setNome_lista(re.getString("nome_list"));
                sd.setNome_produto(re.getString("nome_iten_list"));
                sd.setQuantidade(re.getInt("quantidade_iten_list"));

                listSuperiorDireto.add(sd);
            }
        } catch (Exception e) {
            msg.Mensagem("Falha ao buscar os registros!", "SistemaEF diz:" + e, 0);
        }
        return listSuperiorDireto;
    }
    

    Mensagem msg = new Mensagem();
}
