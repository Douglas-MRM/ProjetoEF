package view;

import com.placeholder.PlaceHolder;
import dao.CotacaoDao;
import funcoes.Mensagem;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import mapeamento.Cotacao;
import mapeamento.ItensCotacao;

/**
 *
 * @author Jerônimo
 */
public class ViewCotacao extends javax.swing.JDialog {

    Toolkit tk = Toolkit.getDefaultToolkit();
    Dimension d = tk.getScreenSize();
    PlaceHolder holder;

    public ViewCotacao(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        this.setPreferredSize(d);
        initComponents();
        preencharTabelaCOTA();

        BT_Atualizar_COT.setVisible(false);
        BT_Atualizar_DET.setVisible(false);
    }

    public void preencharTabelaCOTA() {
        CotacaoDao cotaDao = new CotacaoDao();
        List<Cotacao> listCota = cotaDao.listAll();
        DefaultTableModel tabela = (DefaultTableModel) TB_Cotacoes.getModel();
        tabela.setRowCount(0);
        for (Cotacao cota : listCota) {
            tabela.addRow(new Object[]{cota.getId_cotacao(), cota.getNome(), cota.getNome_fk_avaliacao()});
        }
    }

    public void preencharTabelaCOTA(String texto) {
        CotacaoDao cotaDao = new CotacaoDao();
        List<Cotacao> listCota = cotaDao.listAll(texto);
        DefaultTableModel tabela = (DefaultTableModel) TB_Cotacoes.getModel();
        tabela.setRowCount(0);
        for (Cotacao cota : listCota) {
            tabela.addRow(new Object[]{cota.getId_cotacao(), cota.getNome(), cota.getNome_fk_avaliacao()});
        }
    }

    public void preencherTabelaDetalhamento(int id) {
        CotacaoDao cotaDao = new CotacaoDao();
        List<ItensCotacao> listItenCota = cotaDao.listItens(id);
        DefaultTableModel tabela = (DefaultTableModel) TB_ItensCotacao.getModel();
        tabela.setRowCount(0);
        for (ItensCotacao ItenCota : listItenCota) {
            tabela.addRow(new Object[]{ItenCota.getId_itens_cotacao(), ItenCota.getProduto(), ItenCota.getFornecedor(), ItenCota.getCaracteristica(), ItenCota.getValor_avista(), ItenCota.getValor_aprazo()});
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        BT_Sair = new javax.swing.JButton();
        PainelGuias = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TB_Cotacoes = new javax.swing.JTable();
        BT_Novo_COT = new javax.swing.JButton();
        BT_Editar_COT = new javax.swing.JButton();
        BT_Excluir_COT = new javax.swing.JButton();
        jPanel16 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        edPesquisaCOT = new javax.swing.JTextField();
        BT_Enviar_COT = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        edNome = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        edCOD = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        edSituação = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        BT_Criar_COT = new javax.swing.JButton();
        BT_Atualizar_COT = new javax.swing.JButton();
        BT_Cancelar_COT = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TB_ItensCotacao = new javax.swing.JTable();
        BT_Excluir_DET = new javax.swing.JButton();
        BT_Editar_DET = new javax.swing.JButton();
        BT_Adicionar_DET = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        edPesquisaDET = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jTextField4 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        BT_Criar_DET = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jTextField5 = new javax.swing.JTextField();
        BT_Atualizar_DET = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        BT_Cancelar_DET = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jTextField6 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jTextField7 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel14 = new javax.swing.JPanel();
        jTextField8 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(57, 69, 81));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icon.png"))); // NOI18N

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Cotação dos Produtos");

        BT_Sair.setBackground(new java.awt.Color(255, 255, 255));
        BT_Sair.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        BT_Sair.setForeground(new java.awt.Color(0, 0, 0));
        BT_Sair.setText("X");
        BT_Sair.setBorder(null);
        BT_Sair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BT_SairMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BT_SairMouseExited(evt);
            }
        });
        BT_Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_SairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BT_Sair, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(BT_Sair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(57, 69, 81));

        TB_Cotacoes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "COD", "Nome", "Avaliação do Superior Direto"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TB_Cotacoes.getTableHeader().setReorderingAllowed(false);
        TB_Cotacoes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TB_CotacoesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TB_Cotacoes);
        if (TB_Cotacoes.getColumnModel().getColumnCount() > 0) {
            TB_Cotacoes.getColumnModel().getColumn(0).setMinWidth(50);
            TB_Cotacoes.getColumnModel().getColumn(0).setPreferredWidth(50);
            TB_Cotacoes.getColumnModel().getColumn(0).setMaxWidth(50);
            TB_Cotacoes.getColumnModel().getColumn(2).setMinWidth(180);
            TB_Cotacoes.getColumnModel().getColumn(2).setPreferredWidth(180);
            TB_Cotacoes.getColumnModel().getColumn(2).setMaxWidth(180);
        }

        BT_Novo_COT.setBackground(new java.awt.Color(30, 144, 255));
        BT_Novo_COT.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BT_Novo_COT.setForeground(new java.awt.Color(255, 255, 255));
        BT_Novo_COT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nova_lista.png"))); // NOI18N
        BT_Novo_COT.setText("NOVO");
        BT_Novo_COT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BT_Novo_COT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BT_Novo_COTMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BT_Novo_COTMouseExited(evt);
            }
        });
        BT_Novo_COT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_Novo_COTActionPerformed(evt);
            }
        });

        BT_Editar_COT.setBackground(new java.awt.Color(0, 204, 0));
        BT_Editar_COT.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BT_Editar_COT.setForeground(new java.awt.Color(255, 255, 255));
        BT_Editar_COT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/editar.png"))); // NOI18N
        BT_Editar_COT.setText("EDITAR");
        BT_Editar_COT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BT_Editar_COT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BT_Editar_COTMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BT_Editar_COTMouseExited(evt);
            }
        });
        BT_Editar_COT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_Editar_COTActionPerformed(evt);
            }
        });

        BT_Excluir_COT.setBackground(new java.awt.Color(205, 0, 0));
        BT_Excluir_COT.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BT_Excluir_COT.setForeground(new java.awt.Color(255, 255, 255));
        BT_Excluir_COT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/desativar.png"))); // NOI18N
        BT_Excluir_COT.setText("EXCLUIR");
        BT_Excluir_COT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BT_Excluir_COT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BT_Excluir_COTMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BT_Excluir_COTMouseExited(evt);
            }
        });
        BT_Excluir_COT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_Excluir_COTActionPerformed(evt);
            }
        });

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pesquisar.png"))); // NOI18N

        edPesquisaCOT.setBackground(new java.awt.Color(255, 255, 255));
        edPesquisaCOT.setBorder(null);
        edPesquisaCOT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                edPesquisaCOTKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edPesquisaCOT, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
            .addComponent(edPesquisaCOT)
        );

        BT_Enviar_COT.setBackground(new java.awt.Color(153, 153, 255));
        BT_Enviar_COT.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BT_Enviar_COT.setForeground(new java.awt.Color(255, 255, 255));
        BT_Enviar_COT.setText(" SUBMETER À AVALIAÇÃO");
        BT_Enviar_COT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BT_Enviar_COT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BT_Enviar_COTMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BT_Enviar_COTMouseExited(evt);
            }
        });
        BT_Enviar_COT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_Enviar_COTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(109, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 667, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(BT_Novo_COT, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BT_Editar_COT, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BT_Excluir_COT, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BT_Enviar_COT)))
                .addContainerGap(110, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(BT_Novo_COT, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BT_Editar_COT, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BT_Excluir_COT, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BT_Enviar_COT, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        PainelGuias.addTab("Cotações", jPanel3);

        jPanel6.setBackground(new java.awt.Color(57, 69, 81));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nome");

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        edNome.setBackground(new java.awt.Color(255, 255, 255));
        edNome.setForeground(new java.awt.Color(0, 0, 0));
        edNome.setBorder(null);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edNome, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(edNome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        jLabel4.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("COD");

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        edCOD.setEditable(false);
        edCOD.setBackground(new java.awt.Color(255, 255, 255));
        edCOD.setForeground(new java.awt.Color(0, 0, 0));
        edCOD.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        edCOD.setBorder(null);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(edCOD, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(edCOD, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        jLabel5.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Situação");

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));

        edSituação.setEditable(false);
        edSituação.setBackground(new java.awt.Color(255, 255, 255));
        edSituação.setForeground(new java.awt.Color(0, 0, 0));
        edSituação.setText("Pendente...");
        edSituação.setBorder(null);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edSituação))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(edSituação, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        BT_Criar_COT.setBackground(new java.awt.Color(30, 144, 255));
        BT_Criar_COT.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BT_Criar_COT.setForeground(new java.awt.Color(255, 255, 255));
        BT_Criar_COT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cadastrar.png"))); // NOI18N
        BT_Criar_COT.setText("CRIAR");
        BT_Criar_COT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BT_Criar_COT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BT_Criar_COTMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BT_Criar_COTMouseExited(evt);
            }
        });
        BT_Criar_COT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_Criar_COTActionPerformed(evt);
            }
        });

        BT_Atualizar_COT.setBackground(new java.awt.Color(0, 204, 0));
        BT_Atualizar_COT.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BT_Atualizar_COT.setForeground(new java.awt.Color(255, 255, 255));
        BT_Atualizar_COT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/atualizar.png"))); // NOI18N
        BT_Atualizar_COT.setText("ATUALIZAR");
        BT_Atualizar_COT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BT_Atualizar_COT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BT_Atualizar_COTMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BT_Atualizar_COTMouseExited(evt);
            }
        });
        BT_Atualizar_COT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_Atualizar_COTActionPerformed(evt);
            }
        });

        BT_Cancelar_COT.setBackground(new java.awt.Color(205, 0, 0));
        BT_Cancelar_COT.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BT_Cancelar_COT.setForeground(new java.awt.Color(255, 255, 255));
        BT_Cancelar_COT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cancelar.png"))); // NOI18N
        BT_Cancelar_COT.setText("CANCELAR");
        BT_Cancelar_COT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BT_Cancelar_COT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BT_Cancelar_COTMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BT_Cancelar_COTMouseExited(evt);
            }
        });
        BT_Cancelar_COT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_Cancelar_COTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(238, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel5)
                        .addComponent(jLabel3)
                        .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(BT_Criar_COT, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BT_Atualizar_COT, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BT_Cancelar_COT, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(207, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BT_Criar_COT, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BT_Atualizar_COT, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BT_Cancelar_COT, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(167, Short.MAX_VALUE))
        );

        PainelGuias.addTab("Novo/Editar", jPanel6);

        jPanel4.setBackground(new java.awt.Color(57, 69, 81));

        TB_ItensCotacao.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "COD", "Produto", "Fornecedor", "Característica", "Valor à vista", "Valor a prazo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TB_ItensCotacao.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(TB_ItensCotacao);
        if (TB_ItensCotacao.getColumnModel().getColumnCount() > 0) {
            TB_ItensCotacao.getColumnModel().getColumn(0).setMinWidth(50);
            TB_ItensCotacao.getColumnModel().getColumn(0).setPreferredWidth(50);
            TB_ItensCotacao.getColumnModel().getColumn(0).setMaxWidth(50);
        }

        BT_Excluir_DET.setBackground(new java.awt.Color(205, 0, 0));
        BT_Excluir_DET.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BT_Excluir_DET.setForeground(new java.awt.Color(255, 255, 255));
        BT_Excluir_DET.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/desativar.png"))); // NOI18N
        BT_Excluir_DET.setText("EXCLUIR");
        BT_Excluir_DET.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BT_Excluir_DET.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BT_Excluir_DETMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BT_Excluir_DETMouseExited(evt);
            }
        });
        BT_Excluir_DET.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_Excluir_DETActionPerformed(evt);
            }
        });

        BT_Editar_DET.setBackground(new java.awt.Color(0, 204, 0));
        BT_Editar_DET.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BT_Editar_DET.setForeground(new java.awt.Color(255, 255, 255));
        BT_Editar_DET.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/editar.png"))); // NOI18N
        BT_Editar_DET.setText("EDITAR");
        BT_Editar_DET.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BT_Editar_DET.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BT_Editar_DETMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BT_Editar_DETMouseExited(evt);
            }
        });
        BT_Editar_DET.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_Editar_DETActionPerformed(evt);
            }
        });

        BT_Adicionar_DET.setBackground(new java.awt.Color(30, 144, 255));
        BT_Adicionar_DET.setForeground(new java.awt.Color(255, 255, 255));
        BT_Adicionar_DET.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/adicionar.png"))); // NOI18N
        BT_Adicionar_DET.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BT_Adicionar_DET.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BT_Adicionar_DETMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BT_Adicionar_DETMouseExited(evt);
            }
        });
        BT_Adicionar_DET.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_Adicionar_DETActionPerformed(evt);
            }
        });

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pesquisar.png"))); // NOI18N

        edPesquisaDET.setBackground(new java.awt.Color(255, 255, 255));
        edPesquisaDET.setBorder(null);
        edPesquisaDET.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                edPesquisaDETKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edPesquisaDET, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
            .addComponent(edPesquisaDET)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 761, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BT_Adicionar_DET, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(BT_Editar_DET, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BT_Excluir_DET, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BT_Editar_DET, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BT_Excluir_DET, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BT_Adicionar_DET)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        PainelGuias.addTab("Detalhamento", jPanel4);

        jPanel5.setBackground(new java.awt.Color(57, 69, 81));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Produto");

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));

        jTextField4.setBackground(new java.awt.Color(255, 255, 255));
        jTextField4.setForeground(new java.awt.Color(0, 0, 0));
        jTextField4.setBorder(null);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField4, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTextField4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        jLabel10.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("COD");

        BT_Criar_DET.setBackground(new java.awt.Color(30, 144, 255));
        BT_Criar_DET.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BT_Criar_DET.setForeground(new java.awt.Color(255, 255, 255));
        BT_Criar_DET.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cadastrar.png"))); // NOI18N
        BT_Criar_DET.setText("CRIAR");
        BT_Criar_DET.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BT_Criar_DET.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BT_Criar_DETMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BT_Criar_DETMouseExited(evt);
            }
        });
        BT_Criar_DET.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_Criar_DETActionPerformed(evt);
            }
        });

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));

        jTextField5.setEditable(false);
        jTextField5.setBackground(new java.awt.Color(255, 255, 255));
        jTextField5.setForeground(new java.awt.Color(0, 0, 0));
        jTextField5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField5.setBorder(null);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField5, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        BT_Atualizar_DET.setBackground(new java.awt.Color(0, 204, 0));
        BT_Atualizar_DET.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BT_Atualizar_DET.setForeground(new java.awt.Color(255, 255, 255));
        BT_Atualizar_DET.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/atualizar.png"))); // NOI18N
        BT_Atualizar_DET.setText("ATUALIZAR");
        BT_Atualizar_DET.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BT_Atualizar_DET.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BT_Atualizar_DETMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BT_Atualizar_DETMouseExited(evt);
            }
        });
        BT_Atualizar_DET.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_Atualizar_DETActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Valor - A prazo");

        BT_Cancelar_DET.setBackground(new java.awt.Color(205, 0, 0));
        BT_Cancelar_DET.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BT_Cancelar_DET.setForeground(new java.awt.Color(255, 255, 255));
        BT_Cancelar_DET.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cancelar.png"))); // NOI18N
        BT_Cancelar_DET.setText("CANCELAR");
        BT_Cancelar_DET.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BT_Cancelar_DET.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BT_Cancelar_DETMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BT_Cancelar_DETMouseExited(evt);
            }
        });
        BT_Cancelar_DET.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_Cancelar_DETActionPerformed(evt);
            }
        });

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));

        jTextField6.setBackground(new java.awt.Color(255, 255, 255));
        jTextField6.setForeground(new java.awt.Color(0, 0, 0));
        jTextField6.setBorder(null);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField6, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTextField6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        jLabel13.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Valor - À vista");

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));

        jTextField7.setBackground(new java.awt.Color(255, 255, 255));
        jTextField7.setForeground(new java.awt.Color(0, 0, 0));
        jTextField7.setBorder(null);

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField7, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTextField7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        jLabel15.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Características");

        jTextArea1.setBackground(new java.awt.Color(255, 255, 255));
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane3.setViewportView(jTextArea1);

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));

        jTextField8.setBackground(new java.awt.Color(255, 255, 255));
        jTextField8.setForeground(new java.awt.Color(0, 0, 0));
        jTextField8.setBorder(null);

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField8, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTextField8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        jLabel17.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Fornecedor");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(141, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(BT_Criar_DET, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 100, 100)
                        .addComponent(BT_Atualizar_DET, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BT_Cancelar_DET, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel8)
                                .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel10)
                                .addComponent(jLabel15)
                                .addComponent(jScrollPane3))
                            .addComponent(jLabel17)
                            .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(60, 60, 60)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)
                            .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(141, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BT_Criar_DET, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BT_Atualizar_DET, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BT_Cancelar_DET, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(85, Short.MAX_VALUE))
        );

        PainelGuias.addTab("Novo/Editar", jPanel5);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PainelGuias)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PainelGuias)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BT_SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_SairActionPerformed
        this.dispose();
    }//GEN-LAST:event_BT_SairActionPerformed

    private void BT_SairMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_SairMouseEntered
        BT_Sair.setBackground(Color.RED);
        BT_Sair.setForeground(Color.WHITE);
    }//GEN-LAST:event_BT_SairMouseEntered

    private void BT_SairMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_SairMouseExited
        BT_Sair.setBackground(Color.WHITE);
        BT_Sair.setForeground(Color.BLACK);
    }//GEN-LAST:event_BT_SairMouseExited

    // PAINEL COTAÇÕES \\

    private void BT_Novo_COTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_Novo_COTActionPerformed
        PainelGuias.setSelectedIndex(1);
    }//GEN-LAST:event_BT_Novo_COTActionPerformed

    private void BT_Editar_COTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_Editar_COTActionPerformed
        int indice = TB_Cotacoes.getSelectedRow();
        if (indice >= 0) {

        } else {
            msg.Mensagem("Selecione uma linha da tabela!", "SistemaEF diz:", 1);
        }
    }//GEN-LAST:event_BT_Editar_COTActionPerformed

    private void BT_Excluir_COTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_Excluir_COTActionPerformed
        int indice = TB_Cotacoes.getSelectedRow();
        if (indice >= 0) {

        } else {
            msg.Mensagem("Selecione uma linha da tabela!", "SistemaEF diz:", 1);
        }
    }//GEN-LAST:event_BT_Excluir_COTActionPerformed

    private void edPesquisaCOTKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edPesquisaCOTKeyReleased
        preencharTabelaCOTA(edPesquisaCOT.getText());
    }//GEN-LAST:event_edPesquisaCOTKeyReleased

    private void TB_CotacoesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TB_CotacoesMouseClicked
        if (evt.getClickCount() == 2) {
            int indice = TB_Cotacoes.getSelectedRow();
            int id = Integer.parseInt(TB_Cotacoes.getValueAt(indice, 0).toString());
            preencherTabelaDetalhamento(id);
            PainelGuias.setSelectedIndex(2);
        }
    }//GEN-LAST:event_TB_CotacoesMouseClicked

    // PAINEL NOVO/EDITAR COTAÇÃO \\

    private void BT_Criar_COTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_Criar_COTActionPerformed
        if (edNome.getText().isEmpty() || edSituação.getText().isEmpty()) {
            msg.Mensagem("Preencha todos os campos!", "SistemaEF diz:", 1);

        } else {
            Cotacao cota = new Cotacao();
            cota.setNome(edNome.getText());

            CotacaoDao cotaDao = new CotacaoDao();
            cotaDao.insert(cota);
        }
    }//GEN-LAST:event_BT_Criar_COTActionPerformed

    private void BT_Atualizar_COTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_Atualizar_COTActionPerformed

    }//GEN-LAST:event_BT_Atualizar_COTActionPerformed

    private void BT_Cancelar_COTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_Cancelar_COTActionPerformed

    }//GEN-LAST:event_BT_Cancelar_COTActionPerformed

    // PAINEL DETALHAMENTO DA COTAÇÃO \\

    private void BT_Adicionar_DETActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_Adicionar_DETActionPerformed
        PainelGuias.setSelectedIndex(3);
    }//GEN-LAST:event_BT_Adicionar_DETActionPerformed

    private void BT_Editar_DETActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_Editar_DETActionPerformed
        int indice = TB_Cotacoes.getSelectedRow();
        if (indice >= 0) {

        } else {
            msg.Mensagem("Selecione uma linha da tabela!", "SistemaEF diz:", 1);
        }
    }//GEN-LAST:event_BT_Editar_DETActionPerformed

    private void BT_Excluir_DETActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_Excluir_DETActionPerformed
        int indice = TB_Cotacoes.getSelectedRow();
        if (indice >= 0) {

        } else {
            msg.Mensagem("Selecione uma linha da tabela!", "SistemaEF diz:", 1);
        }
    }//GEN-LAST:event_BT_Excluir_DETActionPerformed

    private void edPesquisaDETKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edPesquisaDETKeyReleased

    }//GEN-LAST:event_edPesquisaDETKeyReleased

    // PAINEL NOVO/EDITAR DETALHAMENTO DA COTAÇÃO \\

    private void BT_Criar_DETActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_Criar_DETActionPerformed

    }//GEN-LAST:event_BT_Criar_DETActionPerformed

    private void BT_Atualizar_DETActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_Atualizar_DETActionPerformed

    }//GEN-LAST:event_BT_Atualizar_DETActionPerformed

    private void BT_Cancelar_DETActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_Cancelar_DETActionPerformed

    }//GEN-LAST:event_BT_Cancelar_DETActionPerformed

    // EVENTOS BOTÕES \\

    private void BT_Novo_COTMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_Novo_COTMouseEntered
        BT_Novo_COT.setBackground(new Color(235, 235, 235));
        BT_Novo_COT.setForeground(Color.BLACK);
    }//GEN-LAST:event_BT_Novo_COTMouseEntered

    private void BT_Novo_COTMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_Novo_COTMouseExited
        BT_Novo_COT.setBackground(new Color(30, 144, 255));
        BT_Novo_COT.setForeground(Color.WHITE);
    }//GEN-LAST:event_BT_Novo_COTMouseExited

    private void BT_Editar_COTMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_Editar_COTMouseEntered
        BT_Editar_COT.setBackground(Color.WHITE);
        BT_Editar_COT.setForeground(Color.BLACK);
    }//GEN-LAST:event_BT_Editar_COTMouseEntered

    private void BT_Editar_COTMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_Editar_COTMouseExited
        BT_Editar_COT.setBackground(new Color(0, 204, 0));
        BT_Editar_COT.setForeground(Color.WHITE);
    }//GEN-LAST:event_BT_Editar_COTMouseExited

    private void BT_Excluir_COTMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_Excluir_COTMouseEntered
        BT_Excluir_COT.setBackground(Color.WHITE);
        BT_Excluir_COT.setForeground(Color.BLACK);

    }//GEN-LAST:event_BT_Excluir_COTMouseEntered

    private void BT_Excluir_COTMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_Excluir_COTMouseExited
        BT_Excluir_COT.setBackground(new Color(255, 0, 0));
        BT_Excluir_COT.setForeground(Color.WHITE);
    }//GEN-LAST:event_BT_Excluir_COTMouseExited

    private void BT_Criar_COTMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_Criar_COTMouseEntered
        BT_Criar_COT.setBackground(new Color(235, 235, 235));
        BT_Criar_COT.setForeground(Color.BLACK);
    }//GEN-LAST:event_BT_Criar_COTMouseEntered

    private void BT_Criar_COTMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_Criar_COTMouseExited
        BT_Criar_COT.setBackground(new Color(30, 144, 255));
        BT_Criar_COT.setForeground(Color.WHITE);
    }//GEN-LAST:event_BT_Criar_COTMouseExited

    private void BT_Atualizar_COTMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_Atualizar_COTMouseEntered
        BT_Atualizar_COT.setBackground(Color.WHITE);
        BT_Atualizar_COT.setForeground(Color.BLACK);
    }//GEN-LAST:event_BT_Atualizar_COTMouseEntered

    private void BT_Atualizar_COTMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_Atualizar_COTMouseExited
        BT_Atualizar_COT.setBackground(new Color(0, 204, 0));
        BT_Atualizar_COT.setForeground(Color.WHITE);
    }//GEN-LAST:event_BT_Atualizar_COTMouseExited

    private void BT_Cancelar_COTMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_Cancelar_COTMouseEntered
        BT_Cancelar_COT.setBackground(Color.WHITE);
        BT_Cancelar_COT.setForeground(Color.BLACK);

    }//GEN-LAST:event_BT_Cancelar_COTMouseEntered

    private void BT_Cancelar_COTMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_Cancelar_COTMouseExited
        BT_Cancelar_COT.setBackground(new Color(255, 0, 0));
        BT_Cancelar_COT.setForeground(Color.WHITE);
    }//GEN-LAST:event_BT_Cancelar_COTMouseExited

    private void BT_Adicionar_DETMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_Adicionar_DETMouseEntered
        BT_Adicionar_DET.setBackground(new Color(235, 235, 235));
        BT_Adicionar_DET.setForeground(Color.BLACK);
    }//GEN-LAST:event_BT_Adicionar_DETMouseEntered

    private void BT_Adicionar_DETMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_Adicionar_DETMouseExited
        BT_Adicionar_DET.setBackground(new Color(30, 144, 255));
        BT_Adicionar_DET.setForeground(Color.WHITE);
    }//GEN-LAST:event_BT_Adicionar_DETMouseExited

    private void BT_Editar_DETMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_Editar_DETMouseEntered
        BT_Editar_DET.setBackground(Color.WHITE);
        BT_Editar_DET.setForeground(Color.BLACK);
    }//GEN-LAST:event_BT_Editar_DETMouseEntered

    private void BT_Editar_DETMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_Editar_DETMouseExited
        BT_Editar_DET.setBackground(new Color(0, 204, 0));
        BT_Editar_DET.setForeground(Color.WHITE);
    }//GEN-LAST:event_BT_Editar_DETMouseExited

    private void BT_Excluir_DETMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_Excluir_DETMouseEntered
        BT_Excluir_DET.setBackground(Color.WHITE);
        BT_Excluir_DET.setForeground(Color.BLACK);

    }//GEN-LAST:event_BT_Excluir_DETMouseEntered

    private void BT_Excluir_DETMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_Excluir_DETMouseExited
        BT_Excluir_DET.setBackground(new Color(255, 0, 0));
        BT_Excluir_DET.setForeground(Color.WHITE);
    }//GEN-LAST:event_BT_Excluir_DETMouseExited

    private void BT_Criar_DETMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_Criar_DETMouseEntered
        BT_Criar_DET.setBackground(new Color(235, 235, 235));
        BT_Criar_DET.setForeground(Color.BLACK);
    }//GEN-LAST:event_BT_Criar_DETMouseEntered

    private void BT_Criar_DETMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_Criar_DETMouseExited
        BT_Criar_DET.setBackground(new Color(30, 144, 255));
        BT_Criar_DET.setForeground(Color.WHITE);
    }//GEN-LAST:event_BT_Criar_DETMouseExited

    private void BT_Atualizar_DETMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_Atualizar_DETMouseEntered
        BT_Atualizar_DET.setBackground(Color.WHITE);
        BT_Atualizar_DET.setForeground(Color.BLACK);
    }//GEN-LAST:event_BT_Atualizar_DETMouseEntered

    private void BT_Atualizar_DETMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_Atualizar_DETMouseExited
        BT_Atualizar_DET.setBackground(new Color(0, 204, 0));
        BT_Atualizar_DET.setForeground(Color.WHITE);
    }//GEN-LAST:event_BT_Atualizar_DETMouseExited

    private void BT_Cancelar_DETMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_Cancelar_DETMouseEntered
        BT_Cancelar_DET.setBackground(Color.WHITE);
        BT_Cancelar_DET.setForeground(Color.BLACK);

    }//GEN-LAST:event_BT_Cancelar_DETMouseEntered

    private void BT_Cancelar_DETMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_Cancelar_DETMouseExited
        BT_Cancelar_DET.setBackground(new Color(255, 0, 0));
        BT_Cancelar_DET.setForeground(Color.WHITE);
    }//GEN-LAST:event_BT_Cancelar_DETMouseExited

    private void BT_Enviar_COTMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_Enviar_COTMouseEntered

    }//GEN-LAST:event_BT_Enviar_COTMouseEntered

    private void BT_Enviar_COTMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_Enviar_COTMouseExited

    }//GEN-LAST:event_BT_Enviar_COTMouseExited

    private void BT_Enviar_COTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_Enviar_COTActionPerformed
        int indice = TB_Cotacoes.getSelectedRow();
        if (indice >= 0) {
            Cotacao cota = new Cotacao();
            cota.setId_cotacao(Integer.parseInt(TB_Cotacoes.getValueAt(indice, 0).toString()));

            CotacaoDao cotaDao = new CotacaoDao();
            cotaDao.submitAvaliacao(cota);
            preencharTabelaCOTA();

        } else {
            msg.Mensagem("Selecione uma linha da tabela!", "SistemaEF diz:", 1);
        }
    }//GEN-LAST:event_BT_Enviar_COTActionPerformed

    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ViewCotacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewCotacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewCotacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewCotacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ViewCotacao dialog = new ViewCotacao(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BT_Adicionar_DET;
    private javax.swing.JButton BT_Atualizar_COT;
    private javax.swing.JButton BT_Atualizar_DET;
    private javax.swing.JButton BT_Cancelar_COT;
    private javax.swing.JButton BT_Cancelar_DET;
    private javax.swing.JButton BT_Criar_COT;
    private javax.swing.JButton BT_Criar_DET;
    private javax.swing.JButton BT_Editar_COT;
    private javax.swing.JButton BT_Editar_DET;
    private javax.swing.JButton BT_Enviar_COT;
    private javax.swing.JButton BT_Excluir_COT;
    private javax.swing.JButton BT_Excluir_DET;
    private javax.swing.JButton BT_Novo_COT;
    private javax.swing.JButton BT_Sair;
    private javax.swing.JTabbedPane PainelGuias;
    private javax.swing.JTable TB_Cotacoes;
    private javax.swing.JTable TB_ItensCotacao;
    private javax.swing.JTextField edCOD;
    private javax.swing.JTextField edNome;
    private javax.swing.JTextField edPesquisaCOT;
    private javax.swing.JTextField edPesquisaDET;
    private javax.swing.JTextField edSituação;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables
    Mensagem msg = new Mensagem();
}
