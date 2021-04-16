package dao;

import conexao.ConexaoMySql;
import funcoes.Mensagem;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import mapeamento.ItensCotacao;

/**
 *
 * @author Jerônimo
 */
public class ItensCotacaoDao {

    public void insert() {

    }

    public void validarIten(ItensCotacao intenCota) {
        Connection con = ConexaoMySql.getConexao();
        String sql = "UPDATE itens_cotacao SET fk_status_avaliacao_sd = ? WHERE id_itens_cota = ?";
        try (PreparedStatement stm = con.prepareStatement(sql)) {
            stm.setInt(1, 2);
            stm.setInt(2, intenCota.getId_itens_cotacao());
            stm.executeUpdate();

            stm.close();
            con.close();
            msg.Mensagem("Produto valido com sucesso!", "SistemaEF diz:", 1);

        } catch (Exception e) {
            msg.Mensagem("Não foi possível submeter à avaliação!", "SistemaEF diz:", 0);
        }

    }

    public void recusarIten(ItensCotacao intenCota) {
        Connection con = ConexaoMySql.getConexao();
        String sql = "UPDATE itens_cotacao SET fk_status_avaliacao_sd = ? WHERE id_itens_cota = ?";
        try (PreparedStatement stm = con.prepareStatement(sql)) {
            stm.close();
            con.close();
            msg.Mensagem("Produto recusado com sucesso!", "SistemaEF diz:", 1);

        } catch (Exception e) {
            msg.Mensagem("Não foi possível submeter à avaliação!", "SistemaEF diz:", 0);
        }
    }

    public List<ItensCotacao> listItens() {
        Connection con = ConexaoMySql.getConexao();
        String sql = "SELECT * FROM itens_cotacao WHERE fk_status_avaliacao_sd = ? AND fk_ativacao = ?";
        List<ItensCotacao> itenList = new ArrayList();
        
        try (PreparedStatement stm = con.prepareStatement(sql)) {
            stm.setInt(1, 2);
            stm.setBoolean(2, true);
            ResultSet re = stm.executeQuery();
            while (re.next()) {
                ItensCotacao itenCota = new ItensCotacao();
                itenCota.setId_itens_cotacao(re.getInt("id_itens_cota"));
                itenCota.setProduto(re.getString("produto_itens_cota"));
                
                itenList.add(itenCota);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possível buscar os registros!" + e);
        }

        return itenList;
    }

    Mensagem msg = new Mensagem();

}
