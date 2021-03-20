package dao;

import conexao.ConexaoMySql;
import funcoes.Mensagem;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import mapeamento.Cotacao;
import mapeamento.ItensCotacao;

/**
 *
 * @author Jerônimo
 */
public class CotacaoDao {

    public void insert(Cotacao cota) {
        Connection con = ConexaoMySql.getConexao();
        String sql = "INSERT INTO cotacao (nome_cota, fk_avaliacao_sd_cota, fk_ativacao) VALUES (?, ?, ?)";
        try (PreparedStatement stm = con.prepareStatement(sql)) {
            stm.setString(1, cota.getNome());
            stm.setInt(2, 1);
            stm.setBoolean(3, true);
            stm.executeUpdate();

            stm.close();
            con.close();

            msg.Mensagem("Lista de cotação criada com sucesso!", "SistemaEF diz:", 1);

        } catch (Exception e) {
            msg.Mensagem("Não foi possível criar a lista!", "SistemaEF diz:", 0);
        }
    }

    public void update() {

    }

    public void delete() {

    }

    public void submitAvaliacao(Cotacao cota) {
        Connection con = ConexaoMySql.getConexao();
        String sql = "UPDATE cotacao SET fk_avaliacao_sd_cota = ? WHERE id_cota = ?";
        try (PreparedStatement stm = con.prepareStatement(sql)) {
            stm.setInt(1, 2);
            stm.setInt(2, cota.getId_cotacao());
            stm.executeUpdate();

            stm.close();
            con.close();

        } catch (Exception e) {
            msg.Mensagem("Não foi possível submeter à avaliação!", "SistemaEF diz:", 0);
        }
    }

    public List<Cotacao> listAll() {
        Connection con = ConexaoMySql.getConexao();
        String sql = "SELECT * FROM cotacao INNER JOIN avaliacao_sd_cota ON avaliacao_sd_cota.id_aval_sd_cota = cotacao.fk_avaliacao_sd_cota AND cotacao.fk_ativacao = ?";
        List<Cotacao> listCota = new ArrayList();
        try (PreparedStatement stm = con.prepareStatement(sql)) {
            stm.setBoolean(1, true);
            ResultSet re = stm.executeQuery();
            while (re.next()) {
                Cotacao cota = new Cotacao();
                cota.setId_cotacao(re.getInt("cotacao.id_cota"));
                cota.setNome(re.getString("cotacao.nome_cota"));
                cota.setNome_fk_avaliacao(re.getString("avaliacao_sd_cota.nome_aval_sd_cota"));
                cota.setFk_avaliacao(re.getInt("cotacao.fk_avaliacao_sd_cota"));
                cota.setFk_ativacao(re.getBoolean("cotacao.fk_ativacao"));

                listCota.add(cota);
            }

        } catch (Exception e) {
            msg.Mensagem("Falha ao buscar os registros!", "SistemaEF diz:" + e, 0);
        }

        return listCota;
    }

    public List<Cotacao> listAll(String texto) {
        Connection con = ConexaoMySql.getConexao();
        String sql = "SELECT * FROM cotacao WHERE fk_ativacao = ? AND nome_cota LIKE ?";
        List<Cotacao> listCota = new ArrayList();
        try (PreparedStatement stm = con.prepareStatement(sql)) {
            stm.setBoolean(1, true);
            stm.setString(2, "%" + texto + "%");
            ResultSet re = stm.executeQuery();
            while (re.next()) {
                Cotacao cota = new Cotacao();
                cota.setId_cotacao(re.getInt("cotacao.id_cota"));
                cota.setNome(re.getString("cotacao.nome_cota"));
                //cota.setSituacao(re.getString("cotacao.situacao_cota"));
                cota.setFk_ativacao(re.getBoolean("cotacao.fk_ativacao"));

                listCota.add(cota);
            }

        } catch (Exception e) {
            msg.Mensagem("Falha ao buscar os registros!", "SistemaEF diz:" + e, 0);
        }

        return listCota;
    }

    public List<ItensCotacao> listItens(int id) {
        Connection con = ConexaoMySql.getConexao();
        String sql = "SELECT * FROM itens_cotacao INNER JOIN cotacao ON cotacao.id_cota = ? AND itens_cotacao.fk_ativacao = ?";
        List<ItensCotacao> listItenCota = new ArrayList();
        try (PreparedStatement stm = con.prepareStatement(sql)) {
            stm.setInt(1, id);
            stm.setBoolean(2, true);
            ResultSet re = stm.executeQuery();
            while (re.next()) {
                ItensCotacao itenCota = new ItensCotacao();
                itenCota.setId_itens_cotacao(re.getInt("id_itens_cota"));
                itenCota.setProduto(re.getString("produto_itens_cota"));
                itenCota.setFornecedor(re.getString("fornecedor_itens_cota"));
                itenCota.setCaracteristica(re.getString("caracteristica_itens_cota"));
                itenCota.setValor_avista(re.getFloat("form_pag_avista_itens_cota"));
                itenCota.setValor_aprazo(re.getFloat("form_pag_aprazo_itens_cota"));
                itenCota.setId_cotacao(re.getInt("fk_id_cota"));
                itenCota.setAvaliacao_sd(re.getInt("fk_avaliacao_sd"));
                itenCota.setAtivacao(re.getBoolean("fk_ativacao"));
                itenCota.setStatus(re.getBoolean("fk_status_aval_sd"));

                listItenCota.add(itenCota);
            }

        } catch (Exception e) {
            msg.Mensagem("Falha ao buscar os registros!", "SistemaEF diz:" + e, 0);
        }

        return listItenCota;
    }

    public List<Cotacao> listarCotacoes() {
        Connection con = ConexaoMySql.getConexao();
        String sql = "SELECT * FROM cotacao INNER JOIN avaliacao_sd_cota ON cotacao.fk_avaliacao_sd_cota = ? WHERE avaliacao_sd_cota.id_aval_sd_cota = ?";
        //String sql = "SELECT * FROM cotacao INNER JOIN avaliacao_sd_cota ON (cotacao.fk_avaliacao_sd_cota AND avaliacao_sd_cota.id_aval_sd_cota = ?)";
        //SELECT * FROM itens_cotacao INNER JOIN cotacao ON cotacao.id_cota = 1 AND itens_cotacao.fk_ativacao = true INNER JOIN status_aval_sd ON  itens_cotacao.fk_status_aval_sd AND status_aval_sd.id_status_aval_sd = 1
        List<Cotacao> listCotacao = new ArrayList();

        try (PreparedStatement stm = con.prepareStatement(sql)) {
            stm.setInt(1, 2);
            stm.setInt(2, 2);
            ResultSet re = stm.executeQuery();
            while (re.next()) {
                Cotacao cota = new Cotacao();
                cota.setId_cotacao(re.getInt("id_cota"));
                cota.setNome(re.getString("nome_cota"));
                cota.setNome_fk_avaliacao(re.getString("nome_aval_sd_cota"));

                listCotacao.add(cota);
            }
        } catch (Exception e) {
            msg.Mensagem("Falha ao buscar os registros!", "SistemaEF diz:" + e, 0);
        }
        return listCotacao;
    }

    public List<Cotacao> listarCotacoesSuperiorDireto(int id) {
        Connection con = ConexaoMySql.getConexao();
        String sql = "SELECT * FROM itens_cotacao INNER JOIN cotacao ON cotacao.id_cota = ? AND itens_cotacao.fk_ativacao = ? INNER JOIN status_avaliacao_sd ON itens_cotacao.fk_status_avaliacao_sd = status_avaliacao_sd.id_status_avaliacao_sd WHERE itens_cotacao.fk_status_avaliacao_sd = ? or ? or ?";
        //String sql = "SELECT * FROM cotacao INNER JOIN avaliacao_sd_cota ON (cotacao.fk_avaliacao_sd_cota AND avaliacao_sd_cota.id_aval_sd_cota = ?)";
        List<Cotacao> listItenCota = new ArrayList();

        try (PreparedStatement stm = con.prepareStatement(sql)) {
            stm.setInt(1, id);
            stm.setBoolean(2, true);
            stm.setInt(3, 1);
            stm.setInt(4, 2);
            stm.setInt(5, 3);
            ResultSet re = stm.executeQuery();
            while (re.next()) {
                ItensCotacao itenCota = new ItensCotacao();
                itenCota.setId_itens_cotacao(re.getInt("id_itens_cota"));
                itenCota.setProduto(re.getString("produto_itens_cota"));
                itenCota.setFornecedor(re.getString("fornecedor_itens_cota"));
                itenCota.setCaracteristica(re.getString("caracteristica_itens_cota"));
                itenCota.setValor_avista(re.getFloat("form_pag_avista_itens_cota"));
                itenCota.setValor_aprazo(re.getFloat("form_pag_aprazo_itens_cota"));
                itenCota.setId_cotacao(re.getInt("fk_id_cota"));
                itenCota.setAvaliacao_sd(re.getInt("fk_avaliacao_sd"));
                itenCota.setAtivacao(re.getBoolean("fk_ativacao"));
                itenCota.setStatus(re.getBoolean("nome_status_avaliacao_sd"));

                //listItenCota.add(itenCota);
            }
        } catch (Exception e) {
            msg.Mensagem("Falha ao buscar os registros!", "SistemaEF diz:" + e, 0);
        }
        return listItenCota;
    }

    Mensagem msg = new Mensagem();

}
