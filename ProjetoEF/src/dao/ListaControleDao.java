package dao;

import conexao.ConexaoMySql;
import funcoes.Mensagem;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import mapeamento.ListaControle;

/**
 *
 * @author Jerônimo
 */
public class ListaControleDao {

    public void insert(ListaControle listControl) {
        Connection con = ConexaoMySql.getConexao();
        String sql = "INSERT INTO listControl (nome_listControl, data_inicial_listControl, data_final_listControl, ativacao_listControl) VALUES (?, ?, ?, ?)";
        try (PreparedStatement stm = con.prepareStatement(sql)) {
            stm.setString(1, listControl.getNome());
            stm.setString(2, listControl.getData_inicial());
            stm.setString(3, listControl.getData_final());
            stm.setInt(4, listControl.getAtivacao());
            stm.executeUpdate();
            stm.close();
            con.close();

            msg.Mensagem("Lista criada com sucesso!", "SistemaEF diz:", 0);
        } catch (Exception e) {
            msg.Mensagem("Não foi possível criar a lista!", "SistemaEF diz:", 0);
        }
    }

    public void deactivate(ListaControle listControl) {
        Connection con = ConexaoMySql.getConexao();
        String sql = "UPDATE listControl SET ativacao_listControl = 0 WHERE id_listControl = ?";
        int opcao = JOptionPane.showConfirmDialog(null, "Realmente deseja desativar esta Lista?", "SisBike diz:", JOptionPane.YES_NO_OPTION);

        if (opcao == JOptionPane.YES_OPTION) {
            try (PreparedStatement stm = con.prepareStatement(sql)) {
                stm.setInt(1, listControl.getId_listControl());

                stm.executeUpdate();
                stm.close();
                con.close();

                msg.Mensagem("Lista desativada com sucesso!", "SistemaEF diz:", 1);

            } catch (Exception e) {
                msg.Mensagem("Falha ao desativar Lista!", "SistemaEF diz:", 0);
            }
        }
    }

    public List<ListaControle> listAll() {
        Connection con = ConexaoMySql.getConexao();
        String sql = "SELECT * FROM listControl WHERE ativacao_listControl = ? ORDER BY id_listControl";
        List<ListaControle> listList = new ArrayList();

        try (PreparedStatement stm = con.prepareStatement(sql)) {
            stm.setInt(1, 1);
            ResultSet re = stm.executeQuery();
            while (re.next()) {
                ListaControle list = new ListaControle();
                list.setId_listControl(re.getInt("listControl.id_listControl"));
                list.setNome(re.getString("listControl.nome_listControl"));
                list.setData_inicial(re.getString("listControl.data_inicial_listControl"));
                list.setData_final(re.getString("listControl.data_final_listControl"));
                list.setAtivacao(re.getInt("listControl.ativacao_listControl"));

                listList.add(list);
            }
        } catch (Exception e) {
            msg.Mensagem("Falha ao buscar os registros!", "SistemaEF diz:" + e, 0);
        }
        return listList;
    }

    Mensagem msg = new Mensagem();

}
