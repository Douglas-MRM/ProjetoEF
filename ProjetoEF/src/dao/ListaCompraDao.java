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
public class ListaCompraDao {

    public void insert(Lista list) {
        Connection con = ConexaoMySql.getConexao();
        String sql = "INSERT INTO lista (nome_list, data_inicial_list, data_final_list, fk_ativacao) VALUES (?, ?, ?, ?)";
        try (PreparedStatement stm = con.prepareStatement(sql)) {
            stm.setString(1, list.getNome());
            stm.setString(2, list.getData_inicial());//ATIVAÇÃO BOOLEAN
            stm.setString(3, list.getData_final());
            stm.setBoolean(4, list.isAtivacao());
            stm.executeUpdate();
            stm.close();
            con.close();

            msg.Mensagem("Lista criada com sucesso!", "SistemaEF diz:", 1);
            msg.Mensagem("Cotação criada para esta Lista: " + list.getNome() + "!", "SistemaEF diz:", 1);
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
            msg.Mensagem("Lista atualizada com sucesso!", "SistemaEF diz:", 1);

        } catch (Exception e) {
            msg.Mensagem("Não foi possível fazer a atualização!" + e, "SistemaEF diz:", 0);
        }
    }

    public void deactivate(Lista list) {
        Connection con = ConexaoMySql.getConexao();
        String sql = "UPDATE lista SET fk_ativacao = ? WHERE id_list = ?";
        int opcao = JOptionPane.showConfirmDialog(null, "Realmente deseja desativar esta Lista?", "SistemaEF diz:", JOptionPane.YES_NO_OPTION);

        if (opcao == JOptionPane.YES_OPTION) {
            try (PreparedStatement stm = con.prepareStatement(sql)) {
                stm.setBoolean(1, false);
                stm.setInt(2, list.getId_list());

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
        String sql = "SELECT * FROM lista WHERE fk_ativacao = ? ORDER BY id_list";
        List<Lista> listList = new ArrayList();

        try (PreparedStatement stm = con.prepareStatement(sql)) {
            stm.setBoolean(1, true);
            ResultSet re = stm.executeQuery();
            while (re.next()) {
                Lista list = new Lista();
                list.setId_list(re.getInt("lista.id_list"));
                list.setNome(re.getString("lista.nome_list"));
                list.setData_inicial(re.getString("lista.data_inicial_list"));
                list.setData_final(re.getString("lista.data_final_list"));
                list.setAtivacao(re.getBoolean("lista.fk_ativacao"));

                listList.add(list);
            }
        } catch (Exception e) {
            msg.Mensagem("Falha ao buscar os registros!", "SistemaEF diz:" + e, 0);
        }
        return listList;
    }

    public List<Lista> listAll(String texto) {
        Connection con = ConexaoMySql.getConexao();
        String sql = "SELECT * FROM lista WHERE fk_ativacao = ? AND nome_list LIKE ? ORDER BY id_list";
        List<Lista> listList = new ArrayList();

        try (PreparedStatement stm = con.prepareStatement(sql)) {
            stm.setBoolean(1, true);
            stm.setString(2, "%" + texto + "%");
            ResultSet re = stm.executeQuery();
            while (re.next()) {
                Lista list = new Lista();
                list.setId_list(re.getInt("lista.id_list"));
                list.setNome(re.getString("lista.nome_list"));
                list.setData_inicial(re.getString("lista.data_inicial_list"));
                list.setData_final(re.getString("lista.data_final_list"));
                list.setAtivacao(re.getBoolean("lista.fk_ativacao"));

                listList.add(list);
            }
        } catch (Exception e) {
            msg.Mensagem("Falha ao buscar os registros!", "SistemaEF diz:" + e, 0);
        }
        return listList;
    }

    public List<Lista> listAllDate(String data) {
        Connection con = ConexaoMySql.getConexao();
        String sql = "SELECT * FROM lista WHERE fk_ativacao = ? AND data_inicial_list LIKE ? ORDER BY id_list";
        List<Lista> listList = new ArrayList();

        try (PreparedStatement stm = con.prepareStatement(sql)) {
            stm.setBoolean(1, true);
            stm.setString(2, "%" + data + "%");
            ResultSet re = stm.executeQuery();
            while (re.next()) {
                Lista list = new Lista();
                list.setId_list(re.getInt("lista.id_list"));
                list.setNome(re.getString("lista.nome_list"));
                list.setData_inicial(re.getString("lista.data_inicial_list"));
                list.setData_final(re.getString("lista.data_final_list"));
                list.setAtivacao(re.getBoolean("lista.fk_ativacao"));

                listList.add(list);
            }
        } catch (Exception e) {
            msg.Mensagem("Falha ao buscar os registros!", "SistemaEF diz:" + e, 0);
        }
        return listList;
    }

    public List<Lista> listTeste(String texto, String data) {
        Connection con = ConexaoMySql.getConexao();
        String sql = "SELECT * FROM lista WHERE fk_ativacao = ? AND nome_list LIKE ? AND data_inicial_list LIKE ? ORDER BY id_list";
        List<Lista> listList = new ArrayList();

        try (PreparedStatement stm = con.prepareStatement(sql)) {
            stm.setBoolean(1, true);
            stm.setString(2, "%" + texto + "%");
            stm.setString(3, "%" + data + "%");
            ResultSet re = stm.executeQuery();
            while (re.next()) {
                Lista list = new Lista();
                list.setId_list(re.getInt("lista.id_list"));
                list.setNome(re.getString("lista.nome_list"));
                list.setData_inicial(re.getString("lista.data_inicial_list"));
                list.setData_final(re.getString("lista.data_final_list"));
                list.setAtivacao(re.getBoolean("lista.fk_ativacao"));

                listList.add(list);
            }
        } catch (Exception e) {
            msg.Mensagem("Falha ao buscar os registros!", "SistemaEF diz:" + e, 0);
        }
        return listList;
    }

    Mensagem msg = new Mensagem();
}
