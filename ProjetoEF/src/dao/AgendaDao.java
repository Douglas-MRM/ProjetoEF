package dao;

import conexao.ConexaoMySql;
import funcoes.Mensagem;
import java.sql.Connection;
import java.sql.PreparedStatement;
import mapeamento.Agenda;

/**
 *
 * @author Jerônimo
 */
public class AgendaDao {
    
    public void insert(Agenda agen) {
        Connection con = ConexaoMySql.getConexao();
        String sql = "INSERT INTO lista (nome_list, data_inicial_list, data_final_list, ativacao_list) VALUES (?, ?, ?, ?)";
        try (PreparedStatement stm = con.prepareStatement(sql)) {
            stm.setString(1, agen.getNome_evento());
            stm.setString(2, agen.getData_inicial());
            stm.setString(3, agen.getData_final());
            stm.setInt(4, agen.getAtivacao());
            stm.executeUpdate();
            stm.close();
            con.close();

            msg.Mensagem("Lista criada com sucesso!", "SistemaEF diz:", 1);
        } catch (Exception e) {
            msg.Mensagem("Não foi possível criar a lista!", "SistemaEF diz:", 0);
        }
    }
    
    Mensagem msg = new Mensagem();
}
