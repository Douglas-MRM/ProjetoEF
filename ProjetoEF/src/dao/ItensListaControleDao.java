package dao;

import conexao.ConexaoMySql;
import funcoes.Mensagem;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import mapeamento.ItensListaControle;

/**
 *
 * @author Jerônimo
 */
public class ItensListaControleDao {

    //TESTE
    public List<ItensListaControle> listAll(int id) {
        Connection con = ConexaoMySql.getConexao();
        String sql = "SELECT * FROM itens_listControl WHERE fk_id_listControl = ?";
        List<ItensListaControle> itensList = new ArrayList();
        
        try (PreparedStatement stm = con.prepareStatement(sql)) {
            stm.setInt(1, id);
            ResultSet re = stm.executeQuery();
            
            while (re.next()) {                
                ItensListaControle ilc = new ItensListaControle();
                ilc.setId_itens_listControl(re.getInt("itens_listControl.id_itens_listControl"));                
                ilc.setRazao_social(re.getString("itens_listControl.razao_social_itens_listControl"));
                ilc.setCnpj(re.getString("itens_listControl.cnpj_itens_listControl"));
                ilc.setVencimento_boleto(re.getString("itens_listControl.vencimento_boleto_itens_listControl"));
                ilc.setValor(re.getDouble("itens_listControl.valor_itens_listControl"));
                ilc.setFk_id_situacao(re.getString("itens_listControl.situacao_itens_listControl"));
                ilc.setFk_id_listControl(re.getInt("itens_listControl.fk_id_listControl"));
                itensList.add(ilc);
                
            }
        } catch (Exception e) {
            msg.Mensagem("Falha ao buscar os registros!", "SisBike diz: " + e, 2);
        }
        return itensList;
    }

    Mensagem msg = new Mensagem();

}
