package view;

import dao.AgendaDao;
import funcoes.Mensagem;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.text.DateFormat;
import java.util.Date;
import mapeamento.Agenda;

/**
 *
 * @author Jerônimo
 */
public class ViewAgenda extends javax.swing.JDialog {

    Toolkit tk = Toolkit.getDefaultToolkit();
    Dimension d = tk.getScreenSize();

    public ViewAgenda(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        this.setPreferredSize(d);
        initComponents();
        dataAutomatica();
    }

    public void dataAutomatica() {
        Date data = new Date();
        DateFormat dformdata = DateFormat.getDateInstance();
        edDataInicio.setText(dformdata.format(data));

        DateFormat dformhora = DateFormat.getTimeInstance(DateFormat.SHORT);
        edDataInicio.setText(dformhora.format(data));
    }

    public void limparCampos() {
        edDataFinal.setText(null);
        edHorario.setText(null);
        edNome.setText(null);

        dataAutomatica();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelBack = new javax.swing.JPanel();
        PainelTop = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        BT_Sair = new javax.swing.JButton();
        PainelGuias = new javax.swing.JTabbedPane();
        Agendamento = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TB_Agendamentos = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        edPesquisa = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        Novo = new javax.swing.JPanel();
        BT_Cancelar = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        edNome = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        edHorario = new javax.swing.JFormattedTextField();
        jPanel8 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        edDataInicio = new javax.swing.JFormattedTextField();
        jPanel9 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        edDataFinal = new javax.swing.JFormattedTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        BT_Criar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        PainelBack.setBackground(new java.awt.Color(57, 69, 81));

        PainelTop.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icon.png"))); // NOI18N

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Agenda");

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

        javax.swing.GroupLayout PainelTopLayout = new javax.swing.GroupLayout(PainelTop);
        PainelTop.setLayout(PainelTopLayout);
        PainelTopLayout.setHorizontalGroup(
            PainelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelTopLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BT_Sair, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        PainelTopLayout.setVerticalGroup(
            PainelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(BT_Sair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Agendamento.setBackground(new java.awt.Color(57, 69, 81));

        TB_Agendamentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "COD", "Nome", "Data de Inicio", "Data Final"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TB_Agendamentos.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(TB_Agendamentos);
        if (TB_Agendamentos.getColumnModel().getColumnCount() > 0) {
            TB_Agendamentos.getColumnModel().getColumn(0).setMinWidth(50);
            TB_Agendamentos.getColumnModel().getColumn(0).setPreferredWidth(50);
            TB_Agendamentos.getColumnModel().getColumn(0).setMaxWidth(50);
            TB_Agendamentos.getColumnModel().getColumn(2).setMinWidth(120);
            TB_Agendamentos.getColumnModel().getColumn(2).setPreferredWidth(120);
            TB_Agendamentos.getColumnModel().getColumn(2).setMaxWidth(120);
            TB_Agendamentos.getColumnModel().getColumn(3).setMinWidth(120);
            TB_Agendamentos.getColumnModel().getColumn(3).setPreferredWidth(120);
            TB_Agendamentos.getColumnModel().getColumn(3).setMaxWidth(120);
        }

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        edPesquisa.setBackground(new java.awt.Color(255, 255, 255));
        edPesquisa.setBorder(null);

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pesquisar.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edPesquisa, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(edPesquisa)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout AgendamentoLayout = new javax.swing.GroupLayout(Agendamento);
        Agendamento.setLayout(AgendamentoLayout);
        AgendamentoLayout.setHorizontalGroup(
            AgendamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AgendamentoLayout.createSequentialGroup()
                .addContainerGap(100, Short.MAX_VALUE)
                .addGroup(AgendamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 698, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(100, Short.MAX_VALUE))
        );
        AgendamentoLayout.setVerticalGroup(
            AgendamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AgendamentoLayout.createSequentialGroup()
                .addContainerGap(122, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        PainelGuias.addTab("Agendamentos", Agendamento);

        Novo.setBackground(new java.awt.Color(57, 69, 81));

        BT_Cancelar.setBackground(new java.awt.Color(255, 0, 0));
        BT_Cancelar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BT_Cancelar.setForeground(new java.awt.Color(255, 255, 255));
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

        jPanel5.setBackground(new java.awt.Color(57, 69, 81));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nome do Evento");

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nome.png"))); // NOI18N

        edNome.setBackground(new java.awt.Color(255, 255, 255));
        edNome.setBorder(null);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edNome, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
            .addComponent(edNome)
        );

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Horario");

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/relogio.png"))); // NOI18N

        edHorario.setBackground(new java.awt.Color(255, 255, 255));
        edHorario.setBorder(null);
        try {
            edHorario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edHorario, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(edHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/calendario.png"))); // NOI18N

        edDataInicio.setEditable(false);
        edDataInicio.setBackground(new java.awt.Color(255, 255, 255));
        edDataInicio.setBorder(null);
        try {
            edDataInicio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edDataInicio, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(edDataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/calendario.png"))); // NOI18N

        edDataFinal.setBackground(new java.awt.Color(255, 255, 255));
        edDataFinal.setBorder(null);
        try {
            edDataFinal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edDataFinal, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(edDataFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Data Final");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Data de Início");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        BT_Criar.setBackground(new java.awt.Color(30, 144, 255));
        BT_Criar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BT_Criar.setForeground(new java.awt.Color(255, 255, 255));
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

        javax.swing.GroupLayout NovoLayout = new javax.swing.GroupLayout(Novo);
        Novo.setLayout(NovoLayout);
        NovoLayout.setHorizontalGroup(
            NovoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NovoLayout.createSequentialGroup()
                .addContainerGap(188, Short.MAX_VALUE)
                .addGroup(NovoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(NovoLayout.createSequentialGroup()
                        .addComponent(BT_Criar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(227, 227, 227)
                        .addComponent(BT_Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(189, Short.MAX_VALUE))
        );
        NovoLayout.setVerticalGroup(
            NovoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NovoLayout.createSequentialGroup()
                .addContainerGap(112, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(NovoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(NovoLayout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(BT_Criar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(NovoLayout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(BT_Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(118, Short.MAX_VALUE))
        );

        PainelGuias.addTab("Novo", Novo);

        javax.swing.GroupLayout PainelBackLayout = new javax.swing.GroupLayout(PainelBack);
        PainelBack.setLayout(PainelBackLayout);
        PainelBackLayout.setHorizontalGroup(
            PainelBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelTop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(PainelGuias)
        );
        PainelBackLayout.setVerticalGroup(
            PainelBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelBackLayout.createSequentialGroup()
                .addComponent(PainelTop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
    }//GEN-LAST:event_BT_CancelarActionPerformed

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
            Agenda agen = new Agenda();
            agen.setNome_evento(edNome.getText());
            agen.setData_inicial(edDataInicio.getText());
            agen.setData_final(edDataFinal.getText());
            agen.setHorario(edHorario.getText());

            AgendaDao agenDao = new AgendaDao();
            agenDao.insert(agen);

            PainelGuias.setSelectedIndex(0);
            limparCampos();
        }
    }//GEN-LAST:event_BT_CriarActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ViewAgenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewAgenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewAgenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewAgenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ViewAgenda dialog = new ViewAgenda(new javax.swing.JFrame(), true);
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
    private javax.swing.JPanel Agendamento;
    private javax.swing.JButton BT_Cancelar;
    private javax.swing.JButton BT_Criar;
    private javax.swing.JButton BT_Sair;
    private javax.swing.JPanel Novo;
    private javax.swing.JPanel PainelBack;
    private javax.swing.JTabbedPane PainelGuias;
    private javax.swing.JPanel PainelTop;
    private javax.swing.JTable TB_Agendamentos;
    private javax.swing.JFormattedTextField edDataFinal;
    private javax.swing.JFormattedTextField edDataInicio;
    private javax.swing.JFormattedTextField edHorario;
    private javax.swing.JTextField edNome;
    private javax.swing.JTextField edPesquisa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
    Mensagem msg = new Mensagem();
}
