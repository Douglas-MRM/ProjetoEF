package view;

import com.placeholder.PlaceHolder;
import dao.ItensListaControleDao;
import dao.ListaControleDao;
import funcoes.Mensagem;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import mapeamento.ItensListaControle;
import mapeamento.ListaControle;

/**
 *
 * @author Jerônimo
 */
public class ViewListaControle extends javax.swing.JDialog {

    Toolkit tk = Toolkit.getDefaultToolkit();
    Dimension d = tk.getScreenSize();
    PlaceHolder holder;

    public ViewListaControle(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        this.setPreferredSize(d);
        initComponents();
        preencherTabela();
        dataAutomatica();

        lbID.setVisible(false);
        edID.setVisible(false);
        BT_Atualizar.setVisible(false);
        BT_Atualizar_DET.setVisible(false);

        holder = new PlaceHolder(edPesquisa, Color.GRAY, new Color(24, 14, 14), "Digite o nome da lista...", isUndecorated(), "Segoe UI", 14);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icone.png")));
    }

    public void dataAutomatica() {
        Date data = new Date();
        DateFormat dformdata = DateFormat.getDateInstance();
        edDataInicio.setText(dformdata.format(data));

        DateFormat dformhora = DateFormat.getTimeInstance(DateFormat.SHORT);
        edDataInicio.setText(dformhora.format(data));
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

    public void preencherTabela(String texto) {
        ListaControleDao lcdao = new ListaControleDao();
        List<ListaControle> listaListaControles = lcdao.listAll(texto);
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

        PainelBack = new javax.swing.JPanel();
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
        BT_Criar = new javax.swing.JButton();
        BT_Cancelar = new javax.swing.JButton();
        BT_Atualizar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        edID = new javax.swing.JTextField();
        lbID = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        edDataInicio = new javax.swing.JFormattedTextField();
        PainelDataFinal = new javax.swing.JPanel();
        edDataFinal = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        edNome = new javax.swing.JTextField();
        Detalhamento = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TB_Detalhamento = new javax.swing.JTable();
        BT_AdicionarDetalhamento = new javax.swing.JButton();
        BT_EditarDetalhamento = new javax.swing.JButton();
        BT_DesativarDetalhamento = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jTextField2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jFormattedTextField2 = new javax.swing.JFormattedTextField();
        jLabel9 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jLabel10 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jTextField5 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        BT_Adicionar_DET = new javax.swing.JButton();
        BT_Atualizar_DET = new javax.swing.JButton();
        BT_Cancelar_DET = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        BT_Sair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Listas de Controle");
        setUndecorated(true);

        PainelBack.setBackground(new java.awt.Color(57, 69, 81));

        PainelGuias.setBackground(new java.awt.Color(0, 0, 255));
        PainelGuias.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        Agenda.setBackground(new java.awt.Color(57, 69, 81));
        Agenda.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        TB_Controle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "COD", "Nome", "Data de Início", "Data Final"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TB_Controle.getTableHeader().setReorderingAllowed(false);
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
            TB_Controle.getColumnModel().getColumn(2).setMinWidth(100);
            TB_Controle.getColumnModel().getColumn(2).setPreferredWidth(100);
            TB_Controle.getColumnModel().getColumn(2).setMaxWidth(100);
            TB_Controle.getColumnModel().getColumn(3).setMinWidth(100);
            TB_Controle.getColumnModel().getColumn(3).setPreferredWidth(100);
            TB_Controle.getColumnModel().getColumn(3).setMaxWidth(100);
        }

        BT_Novo.setBackground(new java.awt.Color(30, 144, 255));
        BT_Novo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BT_Novo.setForeground(new java.awt.Color(255, 255, 255));
        BT_Novo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nova_lista.png"))); // NOI18N
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

        BT_Desativar.setBackground(new java.awt.Color(255, 0, 0));
        BT_Desativar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BT_Desativar.setForeground(new java.awt.Color(255, 255, 255));
        BT_Desativar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/desativar.png"))); // NOI18N
        BT_Desativar.setText("EXCLUIR");
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
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pesquisar.png"))); // NOI18N

        edPesquisa.setBackground(new java.awt.Color(255, 255, 255));
        edPesquisa.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        edPesquisa.setBorder(null);
        edPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                edPesquisaKeyReleased(evt);
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

        BT_Editar.setBackground(new java.awt.Color(0, 204, 0));
        BT_Editar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BT_Editar.setForeground(new java.awt.Color(255, 255, 255));
        BT_Editar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/editar.png"))); // NOI18N
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
                .addContainerGap(147, Short.MAX_VALUE)
                .addGroup(AgendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(AgendaLayout.createSequentialGroup()
                        .addComponent(BT_Novo, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BT_Editar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BT_Desativar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 601, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(147, Short.MAX_VALUE))
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PainelGuias.addTab("Listas de controle", Agenda);

        Agendamento.setBackground(new java.awt.Color(57, 69, 81));
        Agendamento.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        BT_Criar.setBackground(new java.awt.Color(30, 144, 255));
        BT_Criar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BT_Criar.setForeground(new java.awt.Color(255, 255, 255));
        BT_Criar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cadastrar.png"))); // NOI18N
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

        BT_Cancelar.setBackground(new java.awt.Color(255, 0, 0));
        BT_Cancelar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BT_Cancelar.setForeground(new java.awt.Color(255, 255, 255));
        BT_Cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cancelar.png"))); // NOI18N
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

        BT_Atualizar.setBackground(new java.awt.Color(0, 204, 0));
        BT_Atualizar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BT_Atualizar.setForeground(new java.awt.Color(255, 255, 255));
        BT_Atualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/atualizar.png"))); // NOI18N
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

        jPanel1.setBackground(new java.awt.Color(57, 69, 81));

        jLabel15.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel15.setText("Data Final");

        jLabel16.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel16.setText("Data de Início");

        jLabel11.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel11.setText("Nome");

        edID.setEditable(false);
        edID.setBackground(new java.awt.Color(153, 255, 255));

        lbID.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        lbID.setText("ID");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/calendario.png"))); // NOI18N

        edDataInicio.setEditable(false);
        edDataInicio.setBackground(new java.awt.Color(255, 255, 255));
        edDataInicio.setBorder(null);
        try {
            edDataInicio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edDataInicio, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
            .addComponent(edDataInicio, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        PainelDataFinal.setBackground(new java.awt.Color(255, 255, 255));

        edDataFinal.setBorder(null);
        try {
            edDataFinal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/calendario.png"))); // NOI18N

        javax.swing.GroupLayout PainelDataFinalLayout = new javax.swing.GroupLayout(PainelDataFinal);
        PainelDataFinal.setLayout(PainelDataFinalLayout);
        PainelDataFinalLayout.setHorizontalGroup(
            PainelDataFinalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelDataFinalLayout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edDataFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PainelDataFinalLayout.setVerticalGroup(
            PainelDataFinalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(edDataFinal)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nome.png"))); // NOI18N

        edNome.setBorder(null);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edNome, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(edNome, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PainelDataFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16)
                    .addComponent(jLabel11)
                    .addComponent(lbID)
                    .addComponent(edID, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(113, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbID)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edID, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PainelDataFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout AgendamentoLayout = new javax.swing.GroupLayout(Agendamento);
        Agendamento.setLayout(AgendamentoLayout);
        AgendamentoLayout.setHorizontalGroup(
            AgendamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AgendamentoLayout.createSequentialGroup()
                .addContainerGap(237, Short.MAX_VALUE)
                .addGroup(AgendamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AgendamentoLayout.createSequentialGroup()
                        .addComponent(BT_Criar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BT_Atualizar)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(BT_Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(219, Short.MAX_VALUE))
        );
        AgendamentoLayout.setVerticalGroup(
            AgendamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AgendamentoLayout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addGroup(AgendamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BT_Atualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BT_Criar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BT_Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PainelGuias.addTab("Novo/Editar", Agendamento);

        Detalhamento.setBackground(new java.awt.Color(57, 69, 81));
        Detalhamento.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        TB_Detalhamento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "COD", "Razão Social", "CNPJ", "Vencimento do Boleto", "Valor", "Situação"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TB_Detalhamento.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(TB_Detalhamento);
        if (TB_Detalhamento.getColumnModel().getColumnCount() > 0) {
            TB_Detalhamento.getColumnModel().getColumn(0).setMinWidth(50);
            TB_Detalhamento.getColumnModel().getColumn(0).setPreferredWidth(50);
            TB_Detalhamento.getColumnModel().getColumn(0).setMaxWidth(50);
            TB_Detalhamento.getColumnModel().getColumn(2).setMinWidth(140);
            TB_Detalhamento.getColumnModel().getColumn(2).setPreferredWidth(140);
            TB_Detalhamento.getColumnModel().getColumn(2).setMaxWidth(140);
            TB_Detalhamento.getColumnModel().getColumn(3).setMinWidth(140);
            TB_Detalhamento.getColumnModel().getColumn(3).setPreferredWidth(140);
            TB_Detalhamento.getColumnModel().getColumn(3).setMaxWidth(140);
            TB_Detalhamento.getColumnModel().getColumn(4).setMinWidth(80);
            TB_Detalhamento.getColumnModel().getColumn(4).setPreferredWidth(80);
            TB_Detalhamento.getColumnModel().getColumn(4).setMaxWidth(80);
            TB_Detalhamento.getColumnModel().getColumn(5).setMinWidth(100);
            TB_Detalhamento.getColumnModel().getColumn(5).setPreferredWidth(100);
            TB_Detalhamento.getColumnModel().getColumn(5).setMaxWidth(100);
        }

        BT_AdicionarDetalhamento.setBackground(new java.awt.Color(30, 144, 255));
        BT_AdicionarDetalhamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/adicionar.png"))); // NOI18N
        BT_AdicionarDetalhamento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BT_AdicionarDetalhamento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BT_AdicionarDetalhamentoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BT_AdicionarDetalhamentoMouseExited(evt);
            }
        });
        BT_AdicionarDetalhamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_AdicionarDetalhamentoActionPerformed(evt);
            }
        });

        BT_EditarDetalhamento.setBackground(new java.awt.Color(0, 204, 0));
        BT_EditarDetalhamento.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BT_EditarDetalhamento.setForeground(new java.awt.Color(255, 255, 255));
        BT_EditarDetalhamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/editar.png"))); // NOI18N
        BT_EditarDetalhamento.setText("EDITAR");
        BT_EditarDetalhamento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BT_EditarDetalhamento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BT_EditarDetalhamentoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BT_EditarDetalhamentoMouseExited(evt);
            }
        });
        BT_EditarDetalhamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_EditarDetalhamentoActionPerformed(evt);
            }
        });

        BT_DesativarDetalhamento.setBackground(new java.awt.Color(255, 0, 0));
        BT_DesativarDetalhamento.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BT_DesativarDetalhamento.setForeground(new java.awt.Color(255, 255, 255));
        BT_DesativarDetalhamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/desativar.png"))); // NOI18N
        BT_DesativarDetalhamento.setText("EXCLUIR");
        BT_DesativarDetalhamento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BT_DesativarDetalhamento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BT_DesativarDetalhamentoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BT_DesativarDetalhamentoMouseExited(evt);
            }
        });
        BT_DesativarDetalhamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_DesativarDetalhamentoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DetalhamentoLayout = new javax.swing.GroupLayout(Detalhamento);
        Detalhamento.setLayout(DetalhamentoLayout);
        DetalhamentoLayout.setHorizontalGroup(
            DetalhamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DetalhamentoLayout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addGroup(DetalhamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DetalhamentoLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 795, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BT_AdicionarDetalhamento, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(DetalhamentoLayout.createSequentialGroup()
                        .addComponent(BT_EditarDetalhamento, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BT_DesativarDetalhamento, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(8, Short.MAX_VALUE))
        );
        DetalhamentoLayout.setVerticalGroup(
            DetalhamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DetalhamentoLayout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addGroup(DetalhamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BT_DesativarDetalhamento, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BT_EditarDetalhamento, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(DetalhamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BT_AdicionarDetalhamento))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PainelGuias.addTab("Detalhamento da lista", Detalhamento);

        jPanel6.setBackground(new java.awt.Color(57, 69, 81));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel7.setText("COD");

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        jTextField1.setBackground(new java.awt.Color(255, 255, 255));
        jTextField1.setForeground(new java.awt.Color(0, 0, 0));
        jTextField1.setBorder(null);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(0, 30, Short.MAX_VALUE)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        jTextField2.setBackground(new java.awt.Color(255, 255, 255));
        jTextField2.setForeground(new java.awt.Color(0, 0, 0));
        jTextField2.setBorder(null);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(0, 30, Short.MAX_VALUE)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        jLabel8.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel8.setText("Razão Social");

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));

        jFormattedTextField2.setBackground(new java.awt.Color(255, 255, 255));
        jFormattedTextField2.setBorder(null);
        jFormattedTextField2.setForeground(new java.awt.Color(0, 0, 0));
        try {
            jFormattedTextField2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGap(0, 30, Short.MAX_VALUE)
                .addComponent(jFormattedTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jFormattedTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        jLabel9.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel9.setText("CNPJ");

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));

        jFormattedTextField1.setBackground(new java.awt.Color(255, 255, 255));
        jFormattedTextField1.setBorder(null);
        jFormattedTextField1.setForeground(new java.awt.Color(0, 0, 0));
        try {
            jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jFormattedTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        jLabel10.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel10.setText("Vencimento do Boleto");

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));

        jTextField5.setBackground(new java.awt.Color(255, 255, 255));
        jTextField5.setForeground(new java.awt.Color(0, 0, 0));
        jTextField5.setBorder(null);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        jLabel12.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel12.setText("Valor");

        BT_Adicionar_DET.setBackground(new java.awt.Color(30, 144, 255));
        BT_Adicionar_DET.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BT_Adicionar_DET.setForeground(new java.awt.Color(255, 255, 255));
        BT_Adicionar_DET.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cadastrar.png"))); // NOI18N
        BT_Adicionar_DET.setText("CRIAR");
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

        BT_Atualizar_DET.setBackground(new java.awt.Color(0, 204, 0));
        BT_Atualizar_DET.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
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

        BT_Cancelar_DET.setBackground(new java.awt.Color(255, 0, 0));
        BT_Cancelar_DET.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
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

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(180, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(BT_Adicionar_DET, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BT_Atualizar_DET)
                                .addGap(66, 66, 66)
                                .addComponent(BT_Cancelar_DET, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9)
                                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel10)
                                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addContainerGap(181, Short.MAX_VALUE))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(58, 58, 58)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BT_Atualizar_DET, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BT_Adicionar_DET, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BT_Cancelar_DET, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(147, Short.MAX_VALUE))
        );

        PainelGuias.addTab("Adicionar", jPanel6);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icon.png"))); // NOI18N

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Lista de Controle");

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

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BT_Sair, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(BT_Sair, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout PainelBackLayout = new javax.swing.GroupLayout(PainelBack);
        PainelBack.setLayout(PainelBackLayout);
        PainelBackLayout.setHorizontalGroup(
            PainelBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelGuias)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PainelBackLayout.setVerticalGroup(
            PainelBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelBackLayout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(PainelGuias))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BT_NovoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_NovoMouseEntered
        BT_Novo.setBackground(new Color(235, 235, 235));
        BT_Novo.setForeground(Color.BLACK);
    }//GEN-LAST:event_BT_NovoMouseEntered

    private void BT_NovoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_NovoMouseExited
        BT_Novo.setBackground(new Color(30, 144, 255));
        BT_Novo.setForeground(Color.WHITE);
    }//GEN-LAST:event_BT_NovoMouseExited

    private void BT_NovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_NovoActionPerformed
        PainelGuias.setSelectedIndex(1);
        edDataFinal.setText(null);
        edID.setText(null);
    }//GEN-LAST:event_BT_NovoActionPerformed

    private void BT_DesativarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_DesativarMouseEntered
        BT_Desativar.setBackground(Color.WHITE);
        BT_Desativar.setForeground(Color.BLACK);
    }//GEN-LAST:event_BT_DesativarMouseEntered

    private void BT_DesativarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_DesativarMouseExited
        BT_Desativar.setBackground(new Color(255, 0, 0));
        BT_Desativar.setForeground(Color.WHITE);
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

    private void BT_EditarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_EditarMouseEntered
        BT_Editar.setBackground(Color.WHITE);
        BT_Editar.setForeground(Color.BLACK);
    }//GEN-LAST:event_BT_EditarMouseEntered

    private void BT_EditarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_EditarMouseExited
        BT_Editar.setBackground(new Color(0, 204, 0));
        BT_Editar.setForeground(Color.WHITE);
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
        BT_Criar.setBackground(new Color(235, 235, 235));
        BT_Criar.setForeground(Color.BLACK);
    }//GEN-LAST:event_BT_CriarMouseEntered

    private void BT_CriarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_CriarMouseExited
        BT_Criar.setBackground(new Color(30, 144, 255));
        BT_Criar.setForeground(Color.WHITE);
    }//GEN-LAST:event_BT_CriarMouseExited

    private void BT_CriarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_CriarActionPerformed

        if (edNome.getText().isEmpty() || edDataInicio.getText().trim().replace(" ", "").length() <= 6 || edDataFinal.getText().trim().replace(" ", "").length() <= 6) {
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
            PainelGuias.setSelectedIndex(0);

        }
    }//GEN-LAST:event_BT_CriarActionPerformed

    private void BT_CancelarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_CancelarMouseEntered
        BT_Cancelar.setBackground(Color.WHITE);
        BT_Cancelar.setForeground(Color.BLACK);
    }//GEN-LAST:event_BT_CancelarMouseEntered

    private void BT_CancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_CancelarMouseExited
        BT_Cancelar.setBackground(new Color(255, 0, 0));
        BT_Cancelar.setForeground(Color.WHITE);
    }//GEN-LAST:event_BT_CancelarMouseExited

    private void BT_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_CancelarActionPerformed
        limparCampos();
        dataAutomatica();
    }//GEN-LAST:event_BT_CancelarActionPerformed

    private void BT_AtualizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_AtualizarMouseEntered
        BT_Atualizar.setBackground(Color.WHITE);
        BT_Atualizar.setForeground(Color.BLACK);
    }//GEN-LAST:event_BT_AtualizarMouseEntered

    private void BT_AtualizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_AtualizarMouseExited
        BT_Atualizar.setBackground(new Color(0, 204, 0));
        BT_Atualizar.setForeground(Color.WHITE);
    }//GEN-LAST:event_BT_AtualizarMouseExited

    private void BT_AtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_AtualizarActionPerformed

        ListaControle lc = new ListaControle();
        lc.setId_listControl(Integer.parseInt(edID.getText()));
        lc.setNome(edNome.getText());
        lc.setData_inicial(edDataInicio.getText());
        lc.setData_final(edDataFinal.getText());

        ListaControleDao lcd = new ListaControleDao();

        limparCampos();
        preencherTabela();

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

    private void edPesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edPesquisaKeyReleased
        preencherTabela(edPesquisa.getText());
    }//GEN-LAST:event_edPesquisaKeyReleased

    private void BT_AdicionarDetalhamentoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_AdicionarDetalhamentoMouseEntered
        BT_AdicionarDetalhamento.setBackground(new Color(235, 235, 235));
    }//GEN-LAST:event_BT_AdicionarDetalhamentoMouseEntered

    private void BT_AdicionarDetalhamentoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_AdicionarDetalhamentoMouseExited
        BT_AdicionarDetalhamento.setBackground(new Color(30, 144, 255));
    }//GEN-LAST:event_BT_AdicionarDetalhamentoMouseExited

    private void BT_EditarDetalhamentoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_EditarDetalhamentoMouseEntered
        BT_EditarDetalhamento.setBackground(Color.WHITE);
        BT_EditarDetalhamento.setForeground(new Color(0, 204, 0));
    }//GEN-LAST:event_BT_EditarDetalhamentoMouseEntered

    private void BT_EditarDetalhamentoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_EditarDetalhamentoMouseExited
        BT_EditarDetalhamento.setBackground(new Color(0, 204, 0));
        BT_EditarDetalhamento.setForeground(Color.WHITE);
    }//GEN-LAST:event_BT_EditarDetalhamentoMouseExited

    private void BT_EditarDetalhamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_EditarDetalhamentoActionPerformed

    }//GEN-LAST:event_BT_EditarDetalhamentoActionPerformed

    private void BT_DesativarDetalhamentoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_DesativarDetalhamentoMouseEntered
        BT_DesativarDetalhamento.setBackground(Color.WHITE);
        BT_DesativarDetalhamento.setForeground(new Color(255, 0, 0));
    }//GEN-LAST:event_BT_DesativarDetalhamentoMouseEntered

    private void BT_DesativarDetalhamentoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_DesativarDetalhamentoMouseExited
        BT_DesativarDetalhamento.setBackground(new Color(255, 0, 0));
        BT_DesativarDetalhamento.setForeground(Color.WHITE);
    }//GEN-LAST:event_BT_DesativarDetalhamentoMouseExited

    private void BT_DesativarDetalhamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_DesativarDetalhamentoActionPerformed

    }//GEN-LAST:event_BT_DesativarDetalhamentoActionPerformed

    private void BT_SairMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_SairMouseEntered
        BT_Sair.setBackground(Color.RED);
        BT_Sair.setForeground(Color.WHITE);
    }//GEN-LAST:event_BT_SairMouseEntered

    private void BT_SairMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_SairMouseExited
        BT_Sair.setBackground(Color.WHITE);
        BT_Sair.setForeground(Color.BLACK);
    }//GEN-LAST:event_BT_SairMouseExited

    private void BT_SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_SairActionPerformed
        this.dispose();
    }//GEN-LAST:event_BT_SairActionPerformed

    private void BT_Adicionar_DETMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_Adicionar_DETMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_BT_Adicionar_DETMouseEntered

    private void BT_Adicionar_DETMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_Adicionar_DETMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_BT_Adicionar_DETMouseExited

    private void BT_Adicionar_DETActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_Adicionar_DETActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BT_Adicionar_DETActionPerformed

    private void BT_Atualizar_DETMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_Atualizar_DETMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_BT_Atualizar_DETMouseEntered

    private void BT_Atualizar_DETMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_Atualizar_DETMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_BT_Atualizar_DETMouseExited

    private void BT_Atualizar_DETActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_Atualizar_DETActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BT_Atualizar_DETActionPerformed

    private void BT_Cancelar_DETMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_Cancelar_DETMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_BT_Cancelar_DETMouseEntered

    private void BT_Cancelar_DETMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_Cancelar_DETMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_BT_Cancelar_DETMouseExited

    private void BT_Cancelar_DETActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_Cancelar_DETActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BT_Cancelar_DETActionPerformed

    private void BT_AdicionarDetalhamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_AdicionarDetalhamentoActionPerformed
        PainelGuias.setSelectedIndex(3);
    }//GEN-LAST:event_BT_AdicionarDetalhamentoActionPerformed

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
            java.util.logging.Logger.getLogger(ViewListaControle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewListaControle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewListaControle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewListaControle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ViewListaControle dialog = new ViewListaControle(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton BT_AdicionarDetalhamento;
    private javax.swing.JButton BT_Adicionar_DET;
    private javax.swing.JButton BT_Atualizar;
    private javax.swing.JButton BT_Atualizar_DET;
    private javax.swing.JButton BT_Cancelar;
    private javax.swing.JButton BT_Cancelar_DET;
    private javax.swing.JButton BT_Criar;
    private javax.swing.JButton BT_Desativar;
    private javax.swing.JButton BT_DesativarDetalhamento;
    private javax.swing.JButton BT_Editar;
    private javax.swing.JButton BT_EditarDetalhamento;
    private javax.swing.JButton BT_Novo;
    private javax.swing.JButton BT_Sair;
    private javax.swing.JPanel Detalhamento;
    private javax.swing.JPanel PainelBack;
    private javax.swing.JPanel PainelDataFinal;
    private javax.swing.JTabbedPane PainelGuias;
    private javax.swing.JTable TB_Controle;
    private javax.swing.JTable TB_Detalhamento;
    private javax.swing.JFormattedTextField edDataFinal;
    private javax.swing.JFormattedTextField edDataInicio;
    private javax.swing.JTextField edID;
    private javax.swing.JTextField edNome;
    private javax.swing.JTextField edPesquisa;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JFormattedTextField jFormattedTextField2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
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
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JLabel lbID;
    // End of variables declaration//GEN-END:variables
}
