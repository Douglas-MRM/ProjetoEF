package dao;

import conexao.ConexaoMySql;
import funcoes.Mensagem;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import mapeamento.Lista;

/**
 *
 * @author Jerônimo
 */
public class ListaDao {

    public void insert(Lista list) {
        Connection con = ConexaoMySql.getConexao();
        String sql = "INSERT INTO lista (nome_list, data_inicial_list, data_final_list, ativacao_list) VALUES (?, ?, ?, ?)";
        try (PreparedStatement stm = con.prepareStatement(sql)) {
            stm.setString(1, list.getNome());
            stm.setString(2, list.getData_inicial());
            stm.setString(3, list.getData_final());
            stm.setInt(4, list.getAtivacao());
            stm.executeUpdate();
            stm.close();
            con.close();

            msg.Mensagem("Lista criada com sucesso!", "SistemaEF diz:", 0);
        } catch (Exception e) {
            msg.Mensagem("Não foi possível criar a lista!", "SistemaEF diz:", 0);
        }
    }

    public void update(Lista list) {
        Connection con = ConexaoMySql.getConexao();
        String sql = "UPDATE lista SET nome_list = ?, data_inicial_list = ?, data_final_list = ? WHERE id_list = ?";
        try (PreparedStatement stm = con.prepareStatement(sql)) {
            stm.setString(1, list.getNome());
            stm.setString(2, list.getData_inicial());
            stm.setString(3, list.getData_final());
            stm.setInt(4, list.getId_list());

            stm.executeUpdate();
            stm.close();
            con.close();
        } catch (Exception e) {
            msg.Mensagem("Não foi possível fazer a atualização!" + e, "SistemaEF diz:", 0);
        }
    }

    public void deactivate(Lista list) {
        Connection con = ConexaoMySql.getConexao();
        String sql = "UPDATE lista SET ativacao_list = 0 WHERE id_list = ?";
        int opcao = JOptionPane.showConfirmDialog(null, "Realmente deseja desativar esta Lista?", "SisBike diz:", JOptionPane.YES_NO_OPTION);

        if (opcao == JOptionPane.YES_OPTION) {
            try (PreparedStatement stm = con.prepareStatement(sql)) {
                stm.setInt(1, list.getId_list());

                stm.executeUpdate();
                stm.close();
                con.close();

                msg.Mensagem("Lista desativada com sucesso!", "SistemaEF diz:", 1);

            } catch (Exception e) {
                msg.Mensagem("Falha ao desativar Lista!", "SistemaEF diz:", 0);
            }
        }
    }

    public List<Lista> listAll() {
        Connection con = ConexaoMySql.getConexao();
        String sql = "SELECT * FROM lista WHERE ativacao_list = ? ORDER BY id_list";
        List<Lista> listList = new ArrayList();

        try (PreparedStatement stm = con.prepareStatement(sql)) {
            stm.setInt(1, 1);
            ResultSet re = stm.executeQuery();
            while (re.next()) {
                Lista list = new Lista();
                list.setId_list(re.getInt("lista.id_list"));
                list.setNome(re.getString("lista.nome_list"));
                list.setData_inicial(re.getString("lista.data_inicial_list"));
                list.setData_final(re.getString("lista.data_final_list"));
                list.setAtivacao(re.getInt("lista.ativacao_list"));

                listList.add(list);
            }
        } catch (Exception e) {
            msg.Mensagem("Falha ao buscar os registros!", "SistemaEF diz:" + e, 0);
        }
        return listList;
    }

    Mensagem msg = new Mensagem();
}
