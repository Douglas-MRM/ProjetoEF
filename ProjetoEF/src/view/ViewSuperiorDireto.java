package view;

import com.placeholder.PlaceHolder;
import dao.CotacaoDao;
import dao.ItensCotacaoDao;
import dao.SuperiorDiretoDao;
import funcoes.Mensagem;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import mapeamento.Cotacao;
import mapeamento.ItensCotacao;
import mapeamento.Lista;
import mapeamento.SuperiorDireto;

/**
 *
 * @author Jerônimo
 */
public class ViewSuperiorDireto extends javax.swing.JDialog {

    Toolkit tk = Toolkit.getDefaultToolkit();
    Dimension d = tk.getScreenSize();
    PlaceHolder holder;
    int id;

    public ViewSuperiorDireto(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        this.setPreferredSize(d);
        initComponents();
        preencherTabela();
        preencherTabelaCotacao();

        holder = new PlaceHolder(edPesquisarProdutos, Color.GRAY, new Color(24, 14, 14), "Digite o nome da lista...", isUndecorated(), "Segoe UI", 14);
    }

    public void preencherTabela() {
        SuperiorDiretoDao ldao = new SuperiorDiretoDao();
        List<SuperiorDireto> listaLista = ldao.listAll();
        DefaultTableModel tabela = (DefaultTableModel) TB_Aprovacao.getModel();
        tabela.setRowCount(0);
        for (SuperiorDireto sd : listaLista) {
            tabela.addRow(new Object[]{sd.getId_superior_direto(), sd.getNome_lista(), sd.getNome_produto(), sd.getQuantidade()});

        }
    }

    public void preencherTabela(String texto) {
        SuperiorDiretoDao ldao = new SuperiorDiretoDao();
        List<SuperiorDireto> listaLista = ldao.listAll(texto);
        DefaultTableModel tabela = (DefaultTableModel) TB_Aprovacao.getModel();
        tabela.setRowCount(0);
        for (SuperiorDireto sd : listaLista) {
            tabela.addRow(new Object[]{sd.getId_superior_direto(), sd.getNome_lista(), sd.getNome_produto(), sd.getQuantidade()});

        }
    }

    public void preencherTabelaCotacao() {
        CotacaoDao cotaDao = new CotacaoDao();
        List<Cotacao> listaCotacoes = cotaDao.listarCotacoes();
        DefaultTableModel tabela = (DefaultTableModel) TB_Cotacoes.getModel();
        tabela.setRowCount(0);
        for (Cotacao cota : listaCotacoes) {
            tabela.addRow(new Object[]{cota.getId_cotacao(), cota.getNome(), cota.getNome_fk_avaliacao()});

        }
    }

    public void preencherTabelaDetalhamento(int id) {
        CotacaoDao cotaDao = new CotacaoDao();
        List<ItensCotacao> listItenCota = cotaDao.listItensSD(id);
        DefaultTableModel tabela = (DefaultTableModel) TB_DetalhamentoCotacao.getModel();
        tabela.setRowCount(0);
        for (ItensCotacao ItenCota : listItenCota) {
            tabela.addRow(new Object[]{ItenCota.getId_itens_cotacao(), ItenCota.getProduto(), ItenCota.getFornecedor(), ItenCota.getCaracteristica(), ItenCota.getValor_avista(), ItenCota.getValor_aprazo(), ItenCota.isStatus()});
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Painel_Sair = new javax.swing.JPanel();
        LB_Sair = new javax.swing.JLabel();
        PainelGuias = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TB_Aprovacao = new javax.swing.JTable();
        BT_Recusar = new javax.swing.JButton();
        BT_Validar = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        edPesquisarProdutos = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TB_Cotacoes = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TB_DetalhamentoCotacao = new javax.swing.JTable();
        BT_Validar_Cotacao = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(57, 69, 81));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icon.png"))); // NOI18N

        jLabel2.setText("Superior Direto");

        Painel_Sair.setBackground(new java.awt.Color(255, 255, 255));

        LB_Sair.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        LB_Sair.setForeground(new java.awt.Color(0, 0, 0));
        LB_Sair.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LB_Sair.setText("X");
        LB_Sair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LB_SairMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LB_SairMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LB_SairMouseExited(evt);
            }
        });

        javax.swing.GroupLayout Painel_SairLayout = new javax.swing.GroupLayout(Painel_Sair);
        Painel_Sair.setLayout(Painel_SairLayout);
        Painel_SairLayout.setHorizontalGroup(
            Painel_SairLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LB_Sair, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );
        Painel_SairLayout.setVerticalGroup(
            Painel_SairLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LB_Sair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Painel_Sair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(Painel_Sair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(57, 69, 81));

        TB_Aprovacao.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "COD", "Nome da Lista", "Nome do Item", "Quantidade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TB_Aprovacao.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(TB_Aprovacao);
        if (TB_Aprovacao.getColumnModel().getColumnCount() > 0) {
            TB_Aprovacao.getColumnModel().getColumn(0).setMinWidth(50);
            TB_Aprovacao.getColumnModel().getColumn(0).setPreferredWidth(50);
            TB_Aprovacao.getColumnModel().getColumn(0).setMaxWidth(50);
        }

        BT_Recusar.setBackground(new java.awt.Color(255, 0, 0));
        BT_Recusar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BT_Recusar.setForeground(new java.awt.Color(255, 255, 255));
        BT_Recusar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/recusar.png"))); // NOI18N
        BT_Recusar.setText("RECUSAR");
        BT_Recusar.setBorder(null);
        BT_Recusar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BT_Recusar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BT_RecusarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BT_RecusarMouseExited(evt);
            }
        });
        BT_Recusar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_RecusarActionPerformed(evt);
            }
        });

        BT_Validar.setBackground(new java.awt.Color(30, 144, 255));
        BT_Validar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BT_Validar.setForeground(new java.awt.Color(255, 255, 255));
        BT_Validar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/validar.png"))); // NOI18N
        BT_Validar.setText("VALIDAR");
        BT_Validar.setBorder(null);
        BT_Validar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BT_Validar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BT_ValidarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BT_ValidarMouseExited(evt);
            }
        });
        BT_Validar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_ValidarActionPerformed(evt);
            }
        });

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pesquisar.png"))); // NOI18N

        edPesquisarProdutos.setBackground(new java.awt.Color(255, 255, 255));
        edPesquisarProdutos.setBorder(null);
        edPesquisarProdutos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                edPesquisarProdutosKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edPesquisarProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
            .addComponent(edPesquisarProdutos)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(90, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 718, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(BT_Validar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(BT_Recusar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(368, 368, 368)))
                .addContainerGap(90, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BT_Recusar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BT_Validar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );

        PainelGuias.addTab("Produtos para avaliação", jPanel3);

        jPanel4.setBackground(new java.awt.Color(57, 69, 81));

        TB_Cotacoes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "COD", "Nome", "Situação"
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
        jScrollPane2.setViewportView(TB_Cotacoes);
        if (TB_Cotacoes.getColumnModel().getColumnCount() > 0) {
            TB_Cotacoes.getColumnModel().getColumn(0).setMinWidth(50);
            TB_Cotacoes.getColumnModel().getColumn(0).setPreferredWidth(50);
            TB_Cotacoes.getColumnModel().getColumn(0).setMaxWidth(50);
        }

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(102, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 694, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(102, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(125, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(134, Short.MAX_VALUE))
        );

        PainelGuias.addTab("Cotações para avaliação", jPanel4);

        jPanel5.setBackground(new java.awt.Color(57, 69, 81));

        TB_DetalhamentoCotacao.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "COD", "Produto", "Fornecedor", "Característica", "Valor à vista", "Valor a prazo", "Status avaliação"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TB_DetalhamentoCotacao.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(TB_DetalhamentoCotacao);
        if (TB_DetalhamentoCotacao.getColumnModel().getColumnCount() > 0) {
            TB_DetalhamentoCotacao.getColumnModel().getColumn(0).setMinWidth(50);
            TB_DetalhamentoCotacao.getColumnModel().getColumn(0).setPreferredWidth(50);
            TB_DetalhamentoCotacao.getColumnModel().getColumn(0).setMaxWidth(50);
        }

        BT_Validar_Cotacao.setBackground(new java.awt.Color(30, 144, 255));
        BT_Validar_Cotacao.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BT_Validar_Cotacao.setForeground(new java.awt.Color(255, 255, 255));
        BT_Validar_Cotacao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/validar.png"))); // NOI18N
        BT_Validar_Cotacao.setText("VALIDAR");
        BT_Validar_Cotacao.setBorder(null);
        BT_Validar_Cotacao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BT_Validar_Cotacao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BT_Validar_CotacaoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BT_Validar_CotacaoMouseExited(evt);
            }
        });
        BT_Validar_Cotacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_Validar_CotacaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(80, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BT_Validar_Cotacao, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 738, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(BT_Validar_Cotacao, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
        );

        PainelGuias.addTab("Detalhamento Cotação", jPanel5);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(PainelGuias)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(PainelGuias))
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

    private void BT_ValidarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_ValidarActionPerformed
        int indice = TB_Aprovacao.getSelectedRow();
        if (indice >= 0) {
            Lista list = new Lista();
            list.setId_list(Integer.parseInt(TB_Aprovacao.getValueAt(indice, 0).toString()));

            SuperiorDiretoDao sd = new SuperiorDiretoDao();
            sd.update(list);
            preencherTabela();

        } else {
            msg.Mensagem("Selecione uma linha da tabela!", "SistemaEF diz:", 1);
        }
    }//GEN-LAST:event_BT_ValidarActionPerformed

    private void BT_RecusarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_RecusarActionPerformed
        int indice = TB_Aprovacao.getSelectedRow();
        if (indice >= 0) {
            Lista list = new Lista();
            list.setId_list(Integer.parseInt(TB_Aprovacao.getValueAt(indice, 0).toString()));

            SuperiorDiretoDao sd = new SuperiorDiretoDao();
            sd.recuse(list);
            preencherTabela();

        } else {
            msg.Mensagem("Selecione uma linha da tabela!", "SistemaEF diz:", 1);
        }
    }//GEN-LAST:event_BT_RecusarActionPerformed

    private void BT_ValidarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_ValidarMouseEntered
        BT_Validar.setBackground(new Color(235, 235, 235));
        BT_Validar.setForeground(new Color(30, 144, 255));
    }//GEN-LAST:event_BT_ValidarMouseEntered

    private void BT_ValidarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_ValidarMouseExited
        BT_Validar.setBackground(new Color(30, 144, 255));
        BT_Validar.setForeground(Color.WHITE);
    }//GEN-LAST:event_BT_ValidarMouseExited

    private void BT_RecusarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_RecusarMouseEntered
        BT_Recusar.setBackground(Color.WHITE);
        BT_Recusar.setForeground(new Color(255, 0, 0));
    }//GEN-LAST:event_BT_RecusarMouseEntered

    private void BT_RecusarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_RecusarMouseExited
        BT_Recusar.setBackground(new Color(255, 0, 0));
        BT_Recusar.setForeground(Color.WHITE);
    }//GEN-LAST:event_BT_RecusarMouseExited

    private void edPesquisarProdutosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edPesquisarProdutosKeyReleased
        preencherTabela(edPesquisarProdutos.getText());
    }//GEN-LAST:event_edPesquisarProdutosKeyReleased

    private void BT_Validar_CotacaoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_Validar_CotacaoMouseEntered
        BT_Validar_Cotacao.setBackground(new Color(235, 235, 235));
        BT_Validar_Cotacao.setForeground(new Color(30, 144, 255));
    }//GEN-LAST:event_BT_Validar_CotacaoMouseEntered

    private void BT_Validar_CotacaoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_Validar_CotacaoMouseExited
        BT_Validar_Cotacao.setBackground(new Color(30, 144, 255));
        BT_Validar_Cotacao.setForeground(Color.WHITE);
    }//GEN-LAST:event_BT_Validar_CotacaoMouseExited

    private void BT_Validar_CotacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_Validar_CotacaoActionPerformed
        int indice = TB_DetalhamentoCotacao.getSelectedRow();
        if (indice >= 0) {
            ItensCotacao itenCota = new ItensCotacao();
            itenCota.setId_itens_cotacao(Integer.parseInt(TB_DetalhamentoCotacao.getValueAt(indice, 0).toString()));

            ItensCotacaoDao itenCotaDao = new ItensCotacaoDao();
            itenCotaDao.validarIten(itenCota);
            preencherTabelaDetalhamento(id);

        } else {
            msg.Mensagem("Selecione uma linha da tabela!", "SistemaEF diz:", 1);
        }

    }//GEN-LAST:event_BT_Validar_CotacaoActionPerformed

    private void TB_CotacoesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TB_CotacoesMouseClicked
        if (evt.getClickCount() == 2) {
            int indice = TB_Cotacoes.getSelectedRow();
            id = Integer.parseInt(TB_Cotacoes.getValueAt(indice, 0).toString());
            preencherTabelaDetalhamento(id);
            PainelGuias.setSelectedIndex(2);
        }
    }//GEN-LAST:event_TB_CotacoesMouseClicked

    private void LB_SairMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LB_SairMouseEntered
        Painel_Sair.setBackground(Color.RED);
        LB_Sair.setForeground(Color.WHITE);
    }//GEN-LAST:event_LB_SairMouseEntered

    private void LB_SairMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LB_SairMouseExited
        Painel_Sair.setBackground(Color.WHITE);
        LB_Sair.setForeground(Color.BLACK);
    }//GEN-LAST:event_LB_SairMouseExited

    private void LB_SairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LB_SairMouseClicked
        this.dispose();
    }//GEN-LAST:event_LB_SairMouseClicked

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
            java.util.logging.Logger.getLogger(ViewSuperiorDireto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewSuperiorDireto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewSuperiorDireto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewSuperiorDireto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ViewSuperiorDireto dialog = new ViewSuperiorDireto(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton BT_Recusar;
    private javax.swing.JButton BT_Validar;
    private javax.swing.JButton BT_Validar_Cotacao;
    private javax.swing.JLabel LB_Sair;
    private javax.swing.JTabbedPane PainelGuias;
    private javax.swing.JPanel Painel_Sair;
    private javax.swing.JTable TB_Aprovacao;
    private javax.swing.JTable TB_Cotacoes;
    private javax.swing.JTable TB_DetalhamentoCotacao;
    private javax.swing.JTextField edPesquisarProdutos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
    Mensagem msg = new Mensagem();
}
