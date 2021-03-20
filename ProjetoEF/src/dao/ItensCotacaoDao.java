package dao;

import conexao.ConexaoMySql;
import funcoes.Mensagem;
import java.sql.Connection;
import java.sql.PreparedStatement;
import mapeamento.ItensCotacao;

/**
 *
 * @author Jerônimo
 */
public class ItensCotacaoDao {

    public void insert() {

    }

    public void update(ItensCotacao intenCota) {
        Connection con = ConexaoMySql.getConexao();
        String sql = "UPDATE itens_cotacao SET fk_avaliacao_sd_cota = ? WHERE id_cota = ?";
        try (PreparedStatement stm = con.prepareStatement(sql)) {
            stm.setInt(1, 2);
            stm.setInt(2, intenCota.getId_cotacao());
            stm.executeUpdate();

            stm.close();
            con.close();

        } catch (Exception e) {
            msg.Mensagem("Não foi possível submeter à avaliação!", "SistemaEF diz:", 0);
        }

    }

    Mensagem msg = new Mensagem();

}
