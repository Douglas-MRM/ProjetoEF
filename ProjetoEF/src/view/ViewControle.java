package view;

import dao.ItensListaControleDao;
import dao.ListaControleDao;
import funcoes.Mensagem;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import mapeamento.ItensListaControle;
import mapeamento.ListaControle;

/**
 *
 * @author Jerônimo
 */
public class ViewControle extends javax.swing.JDialog {

    Toolkit tk = Toolkit.getDefaultToolkit();
    Dimension d = tk.getScreenSize();

    public ViewControle(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        this.setPreferredSize(d);
        initComponents();
        preencherTabela();

        lbID.setVisible(false);
        edID.setVisible(false);
        BT_Atualizar.setVisible(false);

    }

    public void preencherTabela() {
        ListaControleDao lcdao = new ListaControleDao();
        List<ListaControle> listaListaControles = lcdao.listAll();
        DefaultTableModel tabela = (DefaultTableModel) TB_Controle.getModel();
        tabela.setRowCount(0);
        for (ListaControle lc : listaListaControles) {
            tabela.addRow(new Object[]{lc.getId_listControl(), lc.getNome(), lc.getData_inicial(), lc.getData_final(),});
        }
    }

    public void preencherTabelaDetalhamento(int id) {
        ItensListaControleDao ldao = new ItensListaControleDao();
        List<ItensListaControle> itensList = ldao.listAll(id);
        DefaultTableModel tabela = (DefaultTableModel) TB_Detalhamento.getModel();
        tabela.setRowCount(0);
        for (ItensListaControle ilc : itensList) {

            tabela.addRow(new Object[]{ilc.getId_itens_listControl(), ilc.getRazao_social(), ilc.getCnpj(), ilc.getVencimento_boleto(), ilc.getValor(), ilc.getFk_id_situacao()});
        }
    }

    public void limparCampos() {
        edNome.setText(null);
        edDataInicio.setText(null);
        edDataFinal.setText(null);

        lbID.setVisible(false);
        edID.setVisible(false);
        BT_Atualizar.setVisible(false);
        BT_Criar.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelGuias = new javax.swing.JTabbedPane();
        Agenda = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TB_Controle = new javax.swing.JTable();
        BT_Novo = new javax.swing.JButton();
        BT_Desativar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        edPesquisa = new javax.swing.JTextField();
        BT_Editar = new javax.swing.JButton();
        Agendamento = new javax.swing.JPanel();
        lbID = new javax.swing.JLabel();
        edID = new javax.swing.JTextField();
        BT_Criar = new javax.swing.JButton();
        BT_Cancelar = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        edDataInicio = new javax.swing.JFormattedTextField();
        edDataFinal = new javax.swing.JFormattedTextField();
        BT_Atualizar = new javax.swing.JButton();
        edNome = new javax.swing.JTextField();
        Detalhamento = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TB_Detalhamento = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        PainelGuias.setBackground(new java.awt.Color(0, 0, 255));
        PainelGuias.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        Agenda.setBackground(new java.awt.Color(153, 153, 153));
        Agenda.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        TB_Controle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Data Inicial", "Data Final"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TB_Controle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TB_ControleMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TB_Controle);
        if (TB_Controle.getColumnModel().getColumnCount() > 0) {
            TB_Controle.getColumnModel().getColumn(0).setMinWidth(50);
            TB_Controle.getColumnModel().getColumn(0).setPreferredWidth(50);
            TB_Controle.getColumnModel().getColumn(0).setMaxWidth(50);
        }

        BT_Novo.setBackground(new java.awt.Color(255, 255, 255));
        BT_Novo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BT_Novo.setText("NOVO");
        BT_Novo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BT_Novo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BT_NovoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BT_NovoMouseExited(evt);
            }
        });
        BT_Novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_NovoActionPerformed(evt);
            }
        });

        BT_Desativar.setBackground(new java.awt.Color(255, 255, 255));
        BT_Desativar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BT_Desativar.setText("DESATIVAR");
        BT_Desativar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BT_Desativar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BT_DesativarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BT_DesativarMouseExited(evt);
            }
        });
        BT_Desativar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_DesativarActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        edPesquisa.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        edPesquisa.setBorder(null);
        edPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                edPesquisaKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edPesquisa, javax.swing.GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(edPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        BT_Editar.setBackground(new java.awt.Color(255, 255, 255));
        BT_Editar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BT_Editar.setText("EDITAR");
        BT_Editar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BT_Editar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BT_EditarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BT_EditarMouseExited(evt);
            }
        });
        BT_Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_EditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AgendaLayout = new javax.swing.GroupLayout(Agenda);
        Agenda.setLayout(AgendaLayout);
        AgendaLayout.setHorizontalGroup(
            AgendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AgendaLayout.createSequentialGroup()
                .addContainerGap(67, Short.MAX_VALUE)
                .addGroup(AgendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(AgendaLayout.createSequentialGroup()
                        .addComponent(BT_Novo, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BT_Editar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BT_Desativar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        AgendaLayout.setVerticalGroup(
            AgendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AgendaLayout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addGroup(AgendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BT_Novo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BT_Desativar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BT_Editar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PainelGuias.addTab("Agenda", Agenda);

        Agendamento.setBackground(new java.awt.Color(153, 153, 153));
        Agendamento.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lbID.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        lbID.setText("ID");

        edID.setEditable(false);
        edID.setBackground(new java.awt.Color(153, 255, 255));

        BT_Criar.setBackground(new java.awt.Color(255, 255, 255));
        BT_Criar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BT_Criar.setText("CRIAR");
        BT_Criar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BT_Criar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BT_CriarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BT_CriarMouseExited(evt);
            }
        });
        BT_Criar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_CriarActionPerformed(evt);
            }
        });

        BT_Cancelar.setBackground(new java.awt.Color(255, 255, 255));
        BT_Cancelar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BT_Cancelar.setText("CANCELAR");
        BT_Cancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BT_Cancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BT_CancelarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BT_CancelarMouseExited(evt);
            }
        });
        BT_Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_CancelarActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel15.setText("Data Final");

        jLabel16.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel16.setText("Data de Início");

        jLabel11.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel11.setText("Nome");

        try {
            edDataInicio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            edDataFinal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        BT_Atualizar.setBackground(new java.awt.Color(255, 255, 255));
        BT_Atualizar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BT_Atualizar.setText("ATUALIZAR");
        BT_Atualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BT_Atualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BT_AtualizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BT_AtualizarMouseExited(evt);
            }
        });
        BT_Atualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_AtualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AgendamentoLayout = new javax.swing.GroupLayout(Agendamento);
        Agendamento.setLayout(AgendamentoLayout);
        AgendamentoLayout.setHorizontalGroup(
            AgendamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AgendamentoLayout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addGroup(AgendamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(AgendamentoLayout.createSequentialGroup()
                        .addGroup(AgendamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbID)
                            .addComponent(edID, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(434, 434, 434))
                    .addGroup(AgendamentoLayout.createSequentialGroup()
                        .addGroup(AgendamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(AgendamentoLayout.createSequentialGroup()
                                .addComponent(BT_Criar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BT_Atualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(59, 59, 59))
                            .addGroup(AgendamentoLayout.createSequentialGroup()
                                .addGroup(AgendamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(edNome, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(99, 99, 99)))
                        .addGroup(AgendamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel15)
                            .addComponent(BT_Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16)
                            .addComponent(edDataInicio, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                            .addComponent(edDataFinal))))
                .addContainerGap(149, Short.MAX_VALUE))
        );
        AgendamentoLayout.setVerticalGroup(
            AgendamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AgendamentoLayout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(lbID)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edID, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(AgendamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AgendamentoLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edNome, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(AgendamentoLayout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edDataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edDataFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(112, 112, 112)
                .addGroup(AgendamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BT_Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BT_Atualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BT_Criar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(164, Short.MAX_VALUE))
        );

        PainelGuias.addTab("Agendamento", Agendamento);

        Detalhamento.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        TB_Detalhamento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Razão Social", "CNPJ", "Vencimento do Produto", "Valor", "Situação"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(TB_Detalhamento);
        if (TB_Detalhamento.getColumnModel().getColumnCount() > 0) {
            TB_Detalhamento.getColumnModel().getColumn(0).setMinWidth(50);
            TB_Detalhamento.getColumnModel().getColumn(0).setPreferredWidth(50);
            TB_Detalhamento.getColumnModel().getColumn(0).setMaxWidth(50);
        }

        javax.swing.GroupLayout DetalhamentoLayout = new javax.swing.GroupLayout(Detalhamento);
        Detalhamento.setLayout(DetalhamentoLayout);
        DetalhamentoLayout.setHorizontalGroup(
            DetalhamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DetalhamentoLayout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 685, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        DetalhamentoLayout.setVerticalGroup(
            DetalhamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DetalhamentoLayout.createSequentialGroup()
                .addContainerGap(88, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(224, 224, 224))
        );

        PainelGuias.addTab("Detalhamento", Detalhamento);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelGuias)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelGuias)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BT_NovoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_NovoMouseEntered
        BT_Novo.setBackground(new Color(30, 144, 255));
        BT_Novo.setForeground(Color.WHITE);
    }//GEN-LAST:event_BT_NovoMouseEntered

    private void BT_NovoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_NovoMouseExited
        BT_Novo.setBackground(new Color(235, 235, 235));
        BT_Novo.setForeground(Color.BLACK);
    }//GEN-LAST:event_BT_NovoMouseExited

    private void BT_NovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_NovoActionPerformed
        PainelGuias.setSelectedIndex(1);
        edDataInicio.setText(null);
        edDataFinal.setText(null);
        edID.setText(null);
    }//GEN-LAST:event_BT_NovoActionPerformed

    private void BT_DesativarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_DesativarMouseEntered
        BT_Desativar.setBackground(Color.RED);
        BT_Desativar.setForeground(Color.WHITE);
    }//GEN-LAST:event_BT_DesativarMouseEntered

    private void BT_DesativarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_DesativarMouseExited
        BT_Desativar.setBackground(Color.WHITE);
        BT_Desativar.setForeground(Color.BLACK);
    }//GEN-LAST:event_BT_DesativarMouseExited

    private void BT_DesativarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_DesativarActionPerformed

        int indice = TB_Controle.getSelectedRow();
        if (indice >= 0) {
            ListaControle lc = new ListaControle();
            lc.setId_listControl(Integer.parseInt(TB_Controle.getValueAt(indice, 0).toString()));
            lc.setNome(TB_Controle.getValueAt(indice, 1).toString());
            lc.setData_inicial(TB_Controle.getValueAt(indice, 2).toString());
            lc.setData_final(TB_Controle.getValueAt(indice, 3).toString());

            ListaControleDao lcd = new ListaControleDao();
            lcd.deactivate(lc);

            preencherTabela();

        } else {
            msg.Mensagem("Selecione uma linha da tabela!", "SistemaEF diz:", 1);
        }
    }//GEN-LAST:event_BT_DesativarActionPerformed

    private void edPesquisaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edPesquisaKeyPressed
        //preencherTabela(edPesquisa.getText());
    }//GEN-LAST:event_edPesquisaKeyPressed

    private void BT_EditarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_EditarMouseEntered
        BT_Editar.setBackground(Color.GREEN);
        BT_Editar.setForeground(Color.WHITE);
    }//GEN-LAST:event_BT_EditarMouseEntered

    private void BT_EditarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_EditarMouseExited
        BT_Editar.setBackground(Color.WHITE);
        BT_Editar.setForeground(Color.BLACK);
    }//GEN-LAST:event_BT_EditarMouseExited

    private void BT_EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_EditarActionPerformed
        int indice = TB_Controle.getSelectedRow();

        if (indice >= 0) {
            edID.setText(TB_Controle.getValueAt(indice, 0).toString());
            edNome.setText(TB_Controle.getValueAt(indice, 1).toString());
            edDataInicio.setText(TB_Controle.getValueAt(indice, 2).toString());
            edDataFinal.setText(TB_Controle.getValueAt(indice, 3).toString());

            PainelGuias.setSelectedIndex(1);
            BT_Atualizar.setVisible(true);
            BT_Criar.setVisible(false);
            lbID.setVisible(true);
            edID.setVisible(true);

        } else {
            msg.Mensagem("Selecione uma linha da tabela!", "SistemaEF diz:", 1);
        }
    }//GEN-LAST:event_BT_EditarActionPerformed

    private void BT_CriarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_CriarMouseEntered
        BT_Criar.setBackground(new Color(30, 144, 255));
        BT_Criar.setForeground(Color.WHITE);
    }//GEN-LAST:event_BT_CriarMouseEntered

    private void BT_CriarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_CriarMouseExited
        BT_Criar.setBackground(new Color(235, 235, 235));
        BT_Criar.setForeground(Color.BLACK);
    }//GEN-LAST:event_BT_CriarMouseExited

    private void BT_CriarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_CriarActionPerformed

        if (edDataInicio.getText().isEmpty() || edDataFinal.getText().isEmpty()) {
            msg.Mensagem("Preencha todos os campos!", "SistemaEF diz:", 2);

        } else {
            ListaControle lc = new ListaControle();
            lc.setNome(edNome.getText());
            lc.setData_inicial(edDataInicio.getText());
            lc.setData_final(edDataFinal.getText());
            lc.setAtivacao(1);

            ListaControleDao lcd = new ListaControleDao();
            lcd.insert(lc);

            preencherTabela();
            //            Agenda a = new Agenda();
            //            a.setDate(dataYMD(edData.getText()));
            //            a.setTimetable(edHora.getText());
            //
            //            Cliente c = new Cliente();
            //            c = (Cliente) cbCliente.getSelectedItem();
            //            a.setCliente(c);
            //
            //            Servico s = new Servico();
            //            s = (Servico) cbServico.getSelectedItem();
            //            a.setServico(s);
            //
            //            AgendaDao adao = new AgendaDao();
            //            adao.insert(a);
            //            limparCampos();
            //
            //            Email_agendamento enviar = new Email_agendamento();
            //            enviar.notificarEmail(a);
            //
            //            preencherTabela();
            PainelGuias.setSelectedIndex(0);

        }
    }//GEN-LAST:event_BT_CriarActionPerformed

    private void BT_CancelarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_CancelarMouseEntered
        BT_Cancelar.setBackground(Color.RED);
        BT_Cancelar.setForeground(Color.WHITE);
    }//GEN-LAST:event_BT_CancelarMouseEntered

    private void BT_CancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_CancelarMouseExited
        BT_Cancelar.setBackground(Color.WHITE);
        BT_Cancelar.setForeground(Color.BLACK);
    }//GEN-LAST:event_BT_CancelarMouseExited

    private void BT_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_CancelarActionPerformed
        limparCampos();
    }//GEN-LAST:event_BT_CancelarActionPerformed

    private void BT_AtualizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_AtualizarMouseEntered
        BT_Atualizar.setBackground(Color.GREEN);
        BT_Atualizar.setForeground(Color.WHITE);
    }//GEN-LAST:event_BT_AtualizarMouseEntered

    private void BT_AtualizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_AtualizarMouseExited
        BT_Atualizar.setBackground(Color.WHITE);
        BT_Atualizar.setForeground(Color.BLACK);
    }//GEN-LAST:event_BT_AtualizarMouseExited

    private void BT_AtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_AtualizarActionPerformed
        //        Agenda a = new Agenda();
        //        a.setDate(dataYMD(edData.getText()));
        //        a.setTimetable(edHora.getText());
        //
        //        Cliente c = new Cliente();
        //        c = (Cliente) cbCliente.getSelectedItem();
        //        a.setCliente(c);
        //
        //        Servico s = new Servico();
        //        s = (Servico) cbServico.getSelectedItem();
        //        a.setServico(s);
        //
        //        AgendaDao agenDao = new AgendaDao();
        //        agenDao.update(a);
        //        limparCampos();
        //        preencherTabela();

        lbID.setVisible(false);
        edID.setVisible(false);
        BT_Criar.setVisible(true);
        BT_Atualizar.setVisible(false);
    }//GEN-LAST:event_BT_AtualizarActionPerformed

    private void TB_ControleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TB_ControleMouseClicked
        if (evt.getClickCount() == 2) {
            int indice = TB_Controle.getSelectedRow();
            int id = Integer.parseInt(TB_Controle.getValueAt(indice, 0).toString());
            preencherTabelaDetalhamento(id);
            PainelGuias.setSelectedIndex(2);
        }
    }//GEN-LAST:event_TB_ControleMouseClicked

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(ViewControle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewControle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewControle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewControle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ViewControle dialog = new ViewControle(new javax.swing.JFrame(), true);
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

    Mensagem msg = new Mensagem();

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Agenda;
    private javax.swing.JPanel Agendamento;
    private javax.swing.JButton BT_Atualizar;
    private javax.swing.JButton BT_Cancelar;
    private javax.swing.JButton BT_Criar;
    private javax.swing.JButton BT_Desativar;
    private javax.swing.JButton BT_Editar;
    private javax.swing.JButton BT_Novo;
    private javax.swing.JPanel Detalhamento;
    private javax.swing.JTabbedPane PainelGuias;
    private javax.swing.JTable TB_Controle;
    private javax.swing.JTable TB_Detalhamento;
    private javax.swing.JFormattedTextField edDataFinal;
    private javax.swing.JFormattedTextField edDataInicio;
    private javax.swing.JTextField edID;
    private javax.swing.JTextField edNome;
    private javax.swing.JTextField edPesquisa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbID;
    // End of variables declaration//GEN-END:variables
}
