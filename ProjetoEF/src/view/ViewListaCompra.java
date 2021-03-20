package view;

import com.placeholder.PlaceHolder;
import dao.ItensListaDao;
import dao.ListaDao;
import funcoes.Mensagem;
import funcoes.Numbers;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import mapeamento.ItensLista;
import mapeamento.Lista;

/**
 *
 * @author Jerônimo
 */
public class ViewListaCompra extends javax.swing.JDialog {

    Toolkit tk = Toolkit.getDefaultToolkit();
    Dimension d = tk.getScreenSize();
    PlaceHolder holder;
    int Id_lista = 0;

    public ViewListaCompra(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        this.setPreferredSize(d);
        initComponents();
        preencherTabela();
        dataAutomatica();

        lbID.setVisible(false);
        edID.setVisible(false);
        BT_Atualizar.setVisible(false);
        BT_Sair.setBorderPainted(false);

        holder = new PlaceHolder(edPesquisa, Color.GRAY, new Color(24, 14, 14), "Digite o nome da lista...", isUndecorated(), "Segoe UI", 14);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icone.png")));

        edQuatidadeDetalhamento.setDocument(new Numbers());
        edValorDetalhamento.setDocument(new Numbers());
        LB_COD.setVisible(false);
        edCODetalhamento.setVisible(false);
        BT_AtualizarDetalhamento.setVisible(false);
    }

    public void dataAutomatica() {
        Date data = new Date();
        DateFormat dformdata = DateFormat.getDateInstance();
        edDataInicio.setText(dformdata.format(data));

        DateFormat dformhora = DateFormat.getTimeInstance(DateFormat.SHORT);
        edDataInicio.setText(dformhora.format(data));
    }

    public void preencherTabela() {
        ListaDao ldao = new ListaDao();
        List<Lista> listaLista = ldao.listAll();
        DefaultTableModel tabela = (DefaultTableModel) TB_Listas.getModel();
        tabela.setRowCount(0);
        for (Lista l : listaLista) {
            tabela.addRow(new Object[]{l.getId_list(), l.getNome(), l.getData_inicial(), l.getData_final()});
        }
    }

    public void preencherTabela(String texto) {
        ListaDao ldao = new ListaDao();
        List<Lista> listaLista = ldao.listAll(texto);
        DefaultTableModel tabela = (DefaultTableModel) TB_Listas.getModel();
        tabela.setRowCount(0);
        for (Lista l : listaLista) {
            tabela.addRow(new Object[]{l.getId_list(), l.getNome(), l.getData_inicial(), l.getData_final()});
        }
    }

    public void preencherTabelaDetalhamento(int id) {
        ItensListaDao ldao = new ItensListaDao();
        List<ItensLista> itensLista = ldao.listAll(id);
        DefaultTableModel tabela = (DefaultTableModel) TB_Detalhamento.getModel();
        tabela.setRowCount(0);
        for (ItensLista ild : itensLista) {

            tabela.addRow(new Object[]{ild.getId_iten_list(), ild.getNome(), ild.getQuantidade(), ild.getFornecedor(), ild.getValor()});
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
        dataAutomatica();
    }

    public void limparCamposAdicionar() {
        edNomeDetalhamento.setText(null);
        edFornecedorDetalhamento.setText(null);
        edQuatidadeDetalhamento.setText(null);
        edValorDetalhamento.setText(null);

        LB_COD.setVisible(false);
        edCODetalhamento.setVisible(false);
        BT_Cadastrar.setVisible(true);
        BT_AtualizarDetalhamento.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        PainelBack = new javax.swing.JPanel();
        PainelGuias = new javax.swing.JTabbedPane();
        Listas = new javax.swing.JPanel();
        BT_NovaLista = new javax.swing.JButton();
        BT_EditarLista = new javax.swing.JButton();
        BT_DesativarLista = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TB_Listas = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        edPesquisa = new javax.swing.JTextField();
        Novo = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
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
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        edNome = new javax.swing.JTextField();
        BT_Criar = new javax.swing.JButton();
        BT_Atualizar = new javax.swing.JButton();
        BT_Cancelar = new javax.swing.JButton();
        Detalhamento = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TB_Detalhamento = new javax.swing.JTable();
        BT_EditarItem = new javax.swing.JButton();
        BT_DesativarItem = new javax.swing.JButton();
        BT_AdicionarItem = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        LB_COD = new javax.swing.JLabel();
        edCODetalhamento = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        BT_AtualizarDetalhamento = new javax.swing.JButton();
        BT_Cadastrar = new javax.swing.JButton();
        BT_CancelarDetalhamento = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        edQuatidadeDetalhamento = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        edValorDetalhamento = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        edFornecedorDetalhamento = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        edNomeDetalhamento = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        CB_Categoria = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        BT_Sair = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Listas de Compra");
        setUndecorated(true);

        PainelBack.setBackground(new java.awt.Color(57, 69, 81));

        Listas.setBackground(new java.awt.Color(57, 69, 81));

        BT_NovaLista.setBackground(new java.awt.Color(30, 144, 255));
        BT_NovaLista.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BT_NovaLista.setForeground(new java.awt.Color(255, 255, 255));
        BT_NovaLista.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nova_lista.png"))); // NOI18N
        BT_NovaLista.setText("NOVA");
        BT_NovaLista.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BT_NovaLista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BT_NovaListaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BT_NovaListaMouseExited(evt);
            }
        });
        BT_NovaLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_NovaListaActionPerformed(evt);
            }
        });

        BT_EditarLista.setBackground(new java.awt.Color(0, 204, 0));
        BT_EditarLista.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BT_EditarLista.setForeground(new java.awt.Color(255, 255, 255));
        BT_EditarLista.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/editar.png"))); // NOI18N
        BT_EditarLista.setText("EDITAR");
        BT_EditarLista.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BT_EditarLista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BT_EditarListaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BT_EditarListaMouseExited(evt);
            }
        });
        BT_EditarLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_EditarListaActionPerformed(evt);
            }
        });

        BT_DesativarLista.setBackground(new java.awt.Color(255, 0, 0));
        BT_DesativarLista.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BT_DesativarLista.setForeground(new java.awt.Color(255, 255, 255));
        BT_DesativarLista.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/desativar.png"))); // NOI18N
        BT_DesativarLista.setText("EXCLUIR");
        BT_DesativarLista.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BT_DesativarLista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BT_DesativarListaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BT_DesativarListaMouseExited(evt);
            }
        });
        BT_DesativarLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_DesativarListaActionPerformed(evt);
            }
        });

        TB_Listas.setModel(new javax.swing.table.DefaultTableModel(
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
        TB_Listas.getTableHeader().setReorderingAllowed(false);
        TB_Listas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TB_ListasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TB_Listas);
        if (TB_Listas.getColumnModel().getColumnCount() > 0) {
            TB_Listas.getColumnModel().getColumn(0).setMinWidth(50);
            TB_Listas.getColumnModel().getColumn(0).setPreferredWidth(50);
            TB_Listas.getColumnModel().getColumn(0).setMaxWidth(50);
            TB_Listas.getColumnModel().getColumn(2).setMinWidth(100);
            TB_Listas.getColumnModel().getColumn(2).setPreferredWidth(100);
            TB_Listas.getColumnModel().getColumn(2).setMaxWidth(100);
            TB_Listas.getColumnModel().getColumn(3).setMinWidth(100);
            TB_Listas.getColumnModel().getColumn(3).setPreferredWidth(100);
            TB_Listas.getColumnModel().getColumn(3).setMaxWidth(100);
        }

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pesquisar.png"))); // NOI18N

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

        javax.swing.GroupLayout ListasLayout = new javax.swing.GroupLayout(Listas);
        Listas.setLayout(ListasLayout);
        ListasLayout.setHorizontalGroup(
            ListasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ListasLayout.createSequentialGroup()
                .addContainerGap(125, Short.MAX_VALUE)
                .addGroup(ListasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ListasLayout.createSequentialGroup()
                        .addComponent(BT_NovaLista, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BT_EditarLista, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BT_DesativarLista, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(126, Short.MAX_VALUE))
        );
        ListasLayout.setVerticalGroup(
            ListasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ListasLayout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addGroup(ListasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BT_NovaLista, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BT_EditarLista, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BT_DesativarLista, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PainelGuias.addTab("Listas de compra", Listas);

        Novo.setBackground(new java.awt.Color(57, 69, 81));

        jPanel4.setBackground(new java.awt.Color(57, 69, 81));

        jLabel15.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Data Final");

        jLabel16.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Data de Início");

        jLabel11.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Nome");

        edID.setEditable(false);
        edID.setBackground(new java.awt.Color(255, 255, 255));

        lbID.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        lbID.setForeground(new java.awt.Color(255, 255, 255));
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
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(edDataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        PainelDataFinal.setBackground(new java.awt.Color(255, 255, 255));

        edDataFinal.setBackground(new java.awt.Color(255, 255, 255));
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

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nome.png"))); // NOI18N

        edNome.setBackground(new java.awt.Color(255, 255, 255));
        edNome.setBorder(null);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edNome, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
            .addComponent(edNome)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PainelDataFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16)
                    .addComponent(jLabel11)
                    .addComponent(lbID)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edID, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(91, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbID)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edID, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PainelDataFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

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

        javax.swing.GroupLayout NovoLayout = new javax.swing.GroupLayout(Novo);
        Novo.setLayout(NovoLayout);
        NovoLayout.setHorizontalGroup(
            NovoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NovoLayout.createSequentialGroup()
                .addContainerGap(224, Short.MAX_VALUE)
                .addGroup(NovoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(NovoLayout.createSequentialGroup()
                        .addComponent(BT_Criar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BT_Atualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BT_Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(186, Short.MAX_VALUE))
        );
        NovoLayout.setVerticalGroup(
            NovoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NovoLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addGroup(NovoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BT_Atualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BT_Criar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BT_Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(73, Short.MAX_VALUE))
        );

        PainelGuias.addTab("Novo/Editar", Novo);

        Detalhamento.setBackground(new java.awt.Color(57, 69, 81));

        TB_Detalhamento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "COD", "Nome do Item", "Quantidade", "Fornecedor", "Valor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
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
            TB_Detalhamento.getColumnModel().getColumn(2).setMinWidth(80);
            TB_Detalhamento.getColumnModel().getColumn(2).setPreferredWidth(80);
            TB_Detalhamento.getColumnModel().getColumn(2).setMaxWidth(80);
            TB_Detalhamento.getColumnModel().getColumn(4).setMinWidth(50);
            TB_Detalhamento.getColumnModel().getColumn(4).setPreferredWidth(50);
            TB_Detalhamento.getColumnModel().getColumn(4).setMaxWidth(50);
        }

        BT_EditarItem.setBackground(new java.awt.Color(0, 204, 0));
        BT_EditarItem.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BT_EditarItem.setForeground(new java.awt.Color(255, 255, 255));
        BT_EditarItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/editar.png"))); // NOI18N
        BT_EditarItem.setText("EDITAR");
        BT_EditarItem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BT_EditarItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BT_EditarItemMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BT_EditarItemMouseExited(evt);
            }
        });
        BT_EditarItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_EditarItemActionPerformed(evt);
            }
        });

        BT_DesativarItem.setBackground(new java.awt.Color(255, 0, 0));
        BT_DesativarItem.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BT_DesativarItem.setForeground(new java.awt.Color(255, 255, 255));
        BT_DesativarItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/desativar.png"))); // NOI18N
        BT_DesativarItem.setText("EXCLUIR");
        BT_DesativarItem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BT_DesativarItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BT_DesativarItemMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BT_DesativarItemMouseExited(evt);
            }
        });
        BT_DesativarItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_DesativarItemActionPerformed(evt);
            }
        });

        BT_AdicionarItem.setBackground(new java.awt.Color(30, 144, 255));
        BT_AdicionarItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/adicionar.png"))); // NOI18N
        BT_AdicionarItem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BT_AdicionarItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BT_AdicionarItemMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BT_AdicionarItemMouseExited(evt);
            }
        });
        BT_AdicionarItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_AdicionarItemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DetalhamentoLayout = new javax.swing.GroupLayout(Detalhamento);
        Detalhamento.setLayout(DetalhamentoLayout);
        DetalhamentoLayout.setHorizontalGroup(
            DetalhamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DetalhamentoLayout.createSequentialGroup()
                .addContainerGap(106, Short.MAX_VALUE)
                .addGroup(DetalhamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DetalhamentoLayout.createSequentialGroup()
                        .addComponent(BT_EditarItem, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BT_DesativarItem, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(DetalhamentoLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 635, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BT_AdicionarItem, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        DetalhamentoLayout.setVerticalGroup(
            DetalhamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DetalhamentoLayout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addGroup(DetalhamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BT_DesativarItem, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BT_EditarItem, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(DetalhamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BT_AdicionarItem))
                .addContainerGap(103, Short.MAX_VALUE))
        );

        PainelGuias.addTab("Detalhamento da lista", Detalhamento);

        jPanel6.setBackground(new java.awt.Color(57, 69, 81));

        LB_COD.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        LB_COD.setForeground(new java.awt.Color(255, 255, 255));
        LB_COD.setText("COD");

        edCODetalhamento.setEditable(false);
        edCODetalhamento.setBackground(new java.awt.Color(255, 255, 255));
        edCODetalhamento.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        edCODetalhamento.setBorder(null);

        jLabel8.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Nome do Item");

        jLabel9.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Quantidade");

        jLabel10.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Fornecedor");

        jLabel12.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Valor");

        BT_AtualizarDetalhamento.setBackground(new java.awt.Color(0, 204, 0));
        BT_AtualizarDetalhamento.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BT_AtualizarDetalhamento.setForeground(new java.awt.Color(255, 255, 255));
        BT_AtualizarDetalhamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/atualizar.png"))); // NOI18N
        BT_AtualizarDetalhamento.setText("ATUALIZAR");
        BT_AtualizarDetalhamento.setBorder(null);
        BT_AtualizarDetalhamento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BT_AtualizarDetalhamento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BT_AtualizarDetalhamentoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BT_AtualizarDetalhamentoMouseExited(evt);
            }
        });
        BT_AtualizarDetalhamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_AtualizarDetalhamentoActionPerformed(evt);
            }
        });

        BT_Cadastrar.setBackground(new java.awt.Color(30, 144, 255));
        BT_Cadastrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BT_Cadastrar.setForeground(new java.awt.Color(255, 255, 255));
        BT_Cadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cadastrar.png"))); // NOI18N
        BT_Cadastrar.setText("CADASTRAR");
        BT_Cadastrar.setBorder(null);
        BT_Cadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BT_Cadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BT_CadastrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BT_CadastrarMouseExited(evt);
            }
        });
        BT_Cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_CadastrarActionPerformed(evt);
            }
        });

        BT_CancelarDetalhamento.setBackground(new java.awt.Color(255, 0, 0));
        BT_CancelarDetalhamento.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BT_CancelarDetalhamento.setForeground(new java.awt.Color(255, 255, 255));
        BT_CancelarDetalhamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cancelar.png"))); // NOI18N
        BT_CancelarDetalhamento.setText("CANCELAR");
        BT_CancelarDetalhamento.setBorder(null);
        BT_CancelarDetalhamento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BT_CancelarDetalhamento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BT_CancelarDetalhamentoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BT_CancelarDetalhamentoMouseExited(evt);
            }
        });
        BT_CancelarDetalhamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_CancelarDetalhamentoActionPerformed(evt);
            }
        });

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        edQuatidadeDetalhamento.setBackground(new java.awt.Color(255, 255, 255));
        edQuatidadeDetalhamento.setBorder(null);

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pacote.png"))); // NOI18N

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edQuatidadeDetalhamento, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(edQuatidadeDetalhamento, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        edValorDetalhamento.setBackground(new java.awt.Color(255, 255, 255));
        edValorDetalhamento.setBorder(null);

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reais.png"))); // NOI18N

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edValorDetalhamento, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(edValorDetalhamento, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));

        edFornecedorDetalhamento.setBackground(new java.awt.Color(255, 255, 255));
        edFornecedorDetalhamento.setBorder(null);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edFornecedorDetalhamento, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(edFornecedorDetalhamento, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));

        edNomeDetalhamento.setBackground(new java.awt.Color(255, 255, 255));
        edNomeDetalhamento.setBorder(null);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edNomeDetalhamento, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(edNomeDetalhamento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)))
        );

        jLabel19.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Categoria do produto");

        CB_Categoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Produto básico", "Produto não corriqueiro" }));
        CB_Categoria.setSelectedIndex(-1);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8)
                            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LB_COD)
                            .addComponent(edCODetalhamento, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(BT_Cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BT_AtualizarDetalhamento, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(60, 60, 60)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel10)
                                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(BT_CancelarDetalhamento, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CB_Categoria, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 54, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(LB_COD)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edCODetalhamento, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CB_Categoria, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(95, 95, 95)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BT_AtualizarDetalhamento, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BT_Cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BT_CancelarDetalhamento, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(80, 80, 80))
        );

        PainelGuias.addTab("Adicionar item", jPanel6);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

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

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icon.png"))); // NOI18N

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Lista de Compra");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BT_Sair, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(BT_Sair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout PainelBackLayout = new javax.swing.GroupLayout(PainelBack);
        PainelBack.setLayout(PainelBackLayout);
        PainelBackLayout.setHorizontalGroup(
            PainelBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(PainelBackLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PainelGuias)
                .addContainerGap())
        );
        PainelBackLayout.setVerticalGroup(
            PainelBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelBackLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PainelGuias)
                .addContainerGap())
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
    }// </editor-fold>//GEN-END:initComponents

    private void BT_NovaListaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_NovaListaMouseEntered
        BT_NovaLista.setBackground(new Color(235, 235, 235));
        BT_NovaLista.setForeground(Color.BLACK);
        
    }//GEN-LAST:event_BT_NovaListaMouseEntered

    private void BT_NovaListaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_NovaListaMouseExited
        BT_NovaLista.setBackground(new Color(30, 144, 255));
        BT_NovaLista.setForeground(Color.WHITE);
    }//GEN-LAST:event_BT_NovaListaMouseExited

    private void BT_NovaListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_NovaListaActionPerformed
        PainelGuias.setSelectedIndex(1);
    }//GEN-LAST:event_BT_NovaListaActionPerformed

    private void BT_EditarListaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_EditarListaMouseEntered
        BT_EditarLista.setBackground(Color.WHITE);
        BT_EditarLista.setForeground(Color.BLACK);
    }//GEN-LAST:event_BT_EditarListaMouseEntered

    private void BT_EditarListaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_EditarListaMouseExited
        BT_EditarLista.setBackground(new Color(0, 204, 0));
        BT_EditarLista.setForeground(Color.WHITE);
    }//GEN-LAST:event_BT_EditarListaMouseExited

    private void BT_EditarListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_EditarListaActionPerformed
        int indice = TB_Listas.getSelectedRow();
        if (indice >= 0) {
            edID.setText(TB_Listas.getValueAt(indice, 0).toString());
            edNome.setText(TB_Listas.getValueAt(indice, 1).toString());
            edDataInicio.setText(TB_Listas.getValueAt(indice, 2).toString());
            edDataFinal.setText(TB_Listas.getValueAt(indice, 3).toString());

            PainelGuias.setSelectedIndex(1);
            BT_Atualizar.setVisible(true);
            BT_Criar.setVisible(false);
            lbID.setVisible(true);
            edID.setVisible(true);

        } else {
            msg.Mensagem("Selecione uma linha da tabela!", "SistemaEF diz:", 1);
        }
    }//GEN-LAST:event_BT_EditarListaActionPerformed

    private void BT_DesativarListaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_DesativarListaMouseEntered
        BT_DesativarLista.setBackground(Color.WHITE);
        BT_DesativarLista.setForeground(Color.BLACK);
    }//GEN-LAST:event_BT_DesativarListaMouseEntered

    private void BT_DesativarListaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_DesativarListaMouseExited
        BT_DesativarLista.setBackground(new Color(255, 0, 0));
        BT_DesativarLista.setForeground(Color.WHITE);
    }//GEN-LAST:event_BT_DesativarListaMouseExited

    private void BT_DesativarListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_DesativarListaActionPerformed
        int indice = TB_Listas.getSelectedRow();
        if (indice >= 0) {
            Lista list = new Lista();
            list.setId_list(Integer.parseInt(TB_Listas.getValueAt(indice, 0).toString()));
            list.setNome(TB_Listas.getValueAt(indice, 1).toString());
            list.setData_inicial(TB_Listas.getValueAt(indice, 2).toString());
            list.setData_final(TB_Listas.getValueAt(indice, 3).toString());

            ListaDao ldao = new ListaDao();
            ldao.deactivate(list);
            preencherTabela();

        } else {
            msg.Mensagem("Selecione uma linha da tabela!", "SistemaEF diz:", 1);
        }
    }//GEN-LAST:event_BT_DesativarListaActionPerformed

    private void TB_ListasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TB_ListasMouseClicked
        if (evt.getClickCount() == 2) {
            int indice = TB_Listas.getSelectedRow();
            int id = Integer.parseInt(TB_Listas.getValueAt(indice, 0).toString());
            preencherTabelaDetalhamento(id);
            PainelGuias.setSelectedIndex(2);
            Id_lista = id;
        }

    }//GEN-LAST:event_TB_ListasMouseClicked

    private void edPesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edPesquisaKeyReleased
        preencherTabela(edPesquisa.getText());
    }//GEN-LAST:event_edPesquisaKeyReleased

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
            Lista l = new Lista();
            l.setNome(edNome.getText());
            l.setData_inicial(edDataInicio.getText());
            l.setData_final(edDataFinal.getText());
            l.setAtivacao(true);

            ListaDao ld = new ListaDao();
            ld.insert(l);

            limparCampos();
            preencherTabela();

            PainelGuias.setSelectedIndex(0);
        }
    }//GEN-LAST:event_BT_CriarActionPerformed

    private void BT_AtualizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_AtualizarMouseEntered
        BT_Atualizar.setBackground(Color.WHITE);
        BT_Atualizar.setForeground(Color.BLACK);
    }//GEN-LAST:event_BT_AtualizarMouseEntered

    private void BT_AtualizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_AtualizarMouseExited
        BT_Atualizar.setBackground(new Color(0, 204, 0));
        BT_Atualizar.setForeground(Color.WHITE);
    }//GEN-LAST:event_BT_AtualizarMouseExited

    private void BT_AtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_AtualizarActionPerformed
        Lista l = new Lista();
        l.setId_list(Integer.parseInt(edID.getText()));
        l.setNome(edNome.getText());
        l.setData_inicial(edDataInicio.getText());
        l.setData_final(edDataFinal.getText());

        ListaDao ld = new ListaDao();
        ld.update(l);

        limparCampos();
        preencherTabela();

        lbID.setVisible(false);
        edID.setVisible(false);
        BT_Criar.setVisible(true);
        BT_Atualizar.setVisible(false);
        PainelGuias.setSelectedIndex(0);
    }//GEN-LAST:event_BT_AtualizarActionPerformed

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

    private void BT_EditarItemMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_EditarItemMouseEntered
        BT_EditarItem.setBackground(Color.WHITE);
        BT_EditarItem.setForeground(new Color(0, 204, 0));
    }//GEN-LAST:event_BT_EditarItemMouseEntered

    private void BT_EditarItemMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_EditarItemMouseExited
        BT_EditarItem.setBackground(new Color(0, 204, 0));
        BT_EditarItem.setForeground(Color.WHITE);
    }//GEN-LAST:event_BT_EditarItemMouseExited

    private void BT_EditarItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_EditarItemActionPerformed
        int indice = TB_Detalhamento.getSelectedRow();
        if (indice >= 0) {
            edCODetalhamento.setText(TB_Detalhamento.getValueAt(indice, 0).toString());
            edNomeDetalhamento.setText(TB_Detalhamento.getValueAt(indice, 1).toString());
            edQuatidadeDetalhamento.setText(TB_Detalhamento.getValueAt(indice, 2).toString());
            edFornecedorDetalhamento.setText(TB_Detalhamento.getValueAt(indice, 3).toString());
            edValorDetalhamento.setText(TB_Detalhamento.getValueAt(indice, 4).toString());

            LB_COD.setVisible(true);
            edCODetalhamento.setVisible(true);
            BT_AtualizarDetalhamento.setVisible(true);
            BT_Cadastrar.setVisible(false);
            PainelGuias.setSelectedIndex(3);

        } else {
            msg.Mensagem("Selecione uma linha da tabela!", "SistemaEF diz:", 1);
        }
    }//GEN-LAST:event_BT_EditarItemActionPerformed

    private void BT_DesativarItemMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_DesativarItemMouseEntered
        BT_DesativarItem.setBackground(Color.WHITE);
        BT_DesativarItem.setForeground(new Color(255, 0, 0));
    }//GEN-LAST:event_BT_DesativarItemMouseEntered

    private void BT_DesativarItemMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_DesativarItemMouseExited
        BT_DesativarItem.setBackground(new Color(255, 0, 0));
        BT_DesativarItem.setForeground(Color.WHITE);
    }//GEN-LAST:event_BT_DesativarItemMouseExited

    private void BT_DesativarItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_DesativarItemActionPerformed
        int indice = TB_Detalhamento.getSelectedRow();
        if (indice >= 0) {
            ItensLista itenList = new ItensLista();
            itenList.setId_iten_list(Integer.parseInt(TB_Detalhamento.getValueAt(indice, 0).toString()));
            itenList.setNome(TB_Detalhamento.getValueAt(indice, 1).toString());

            ItensListaDao itenListDao = new ItensListaDao();
            itenListDao.deactivate(itenList);
            preencherTabelaDetalhamento(Id_lista);

        } else {
            msg.Mensagem("Selecione uma linha da tabela!", "SistemaEF diz:", 1);
        }
    }//GEN-LAST:event_BT_DesativarItemActionPerformed

    private void BT_AdicionarItemMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_AdicionarItemMouseEntered
        BT_AdicionarItem.setBackground(new Color(235, 235, 235));
    }//GEN-LAST:event_BT_AdicionarItemMouseEntered

    private void BT_AdicionarItemMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_AdicionarItemMouseExited
        BT_AdicionarItem.setBackground(new Color(30, 144, 255));
    }//GEN-LAST:event_BT_AdicionarItemMouseExited

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

    private void BT_AdicionarItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_AdicionarItemActionPerformed
        PainelGuias.setSelectedIndex(3);
    }//GEN-LAST:event_BT_AdicionarItemActionPerformed

    private void BT_CadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_CadastrarActionPerformed
        if (edNomeDetalhamento.getText().isEmpty() || edQuatidadeDetalhamento.getText().isEmpty() || CB_Categoria.getSelectedIndex() == -1) {
            msg.Mensagem("Os seguintes campos são obrigatórios: Nome do Item, Quantidade e Categoria do produto. Por favor, os preencha!", "SistemaEF diz:", 1);

        } else {
            ItensLista il = new ItensLista();
            il.setNome(edNomeDetalhamento.getText());
            il.setFornecedor(edFornecedorDetalhamento.getText());
            il.setQuantidade(Integer.parseInt(edQuatidadeDetalhamento.getText()));
            il.setValor(Float.parseFloat(edValorDetalhamento.getText()));
            il.setCategoria(CB_Categoria.getSelectedItem().toString());
            il.setAtivacao(1);
            int indice = CB_Categoria.getSelectedIndex();
            if (indice == 0) {
                il.setAvaliacao_sd(0);
            } else {
                if (indice == 1) {
                    il.setAvaliacao_sd(1);
                }
            }

            il.setFk_id_lista(Id_lista);
            ItensListaDao ild = new ItensListaDao();
            ild.insert(il);

            preencherTabelaDetalhamento(Id_lista);
            limparCamposAdicionar();
            PainelGuias.setSelectedIndex(2);

        }
    }//GEN-LAST:event_BT_CadastrarActionPerformed

    private void BT_CancelarDetalhamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_CancelarDetalhamentoActionPerformed
        limparCamposAdicionar();
    }//GEN-LAST:event_BT_CancelarDetalhamentoActionPerformed

    private void BT_CadastrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_CadastrarMouseEntered
        BT_Cadastrar.setBackground(Color.WHITE);
        BT_Cadastrar.setForeground(new Color(30, 144, 255));
    }//GEN-LAST:event_BT_CadastrarMouseEntered

    private void BT_CadastrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_CadastrarMouseExited
        BT_Cadastrar.setBackground(new Color(30, 144, 255));
        BT_Cadastrar.setForeground(Color.WHITE);
    }//GEN-LAST:event_BT_CadastrarMouseExited

    private void BT_AtualizarDetalhamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_AtualizarDetalhamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BT_AtualizarDetalhamentoActionPerformed

    private void BT_AtualizarDetalhamentoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_AtualizarDetalhamentoMouseEntered
        BT_EditarItem.setBackground(Color.WHITE);
        BT_EditarItem.setForeground(new Color(0, 204, 0));
    }//GEN-LAST:event_BT_AtualizarDetalhamentoMouseEntered

    private void BT_AtualizarDetalhamentoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_AtualizarDetalhamentoMouseExited
        BT_EditarItem.setBackground(new Color(0, 204, 0));
        BT_EditarItem.setForeground(Color.WHITE);

    }//GEN-LAST:event_BT_AtualizarDetalhamentoMouseExited

    private void BT_CancelarDetalhamentoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_CancelarDetalhamentoMouseEntered
        BT_CancelarDetalhamento.setBackground(Color.WHITE);
        BT_CancelarDetalhamento.setForeground(new Color(255, 0, 0));
    }//GEN-LAST:event_BT_CancelarDetalhamentoMouseEntered

    private void BT_CancelarDetalhamentoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_CancelarDetalhamentoMouseExited
        BT_CancelarDetalhamento.setBackground(new Color(255, 0, 0));
        BT_CancelarDetalhamento.setForeground(Color.WHITE);
    }//GEN-LAST:event_BT_CancelarDetalhamentoMouseExited

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
            java.util.logging.Logger.getLogger(ViewListaCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewListaCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewListaCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewListaCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ViewListaCompra dialog = new ViewListaCompra(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton BT_AdicionarItem;
    private javax.swing.JButton BT_Atualizar;
    private javax.swing.JButton BT_AtualizarDetalhamento;
    private javax.swing.JButton BT_Cadastrar;
    private javax.swing.JButton BT_Cancelar;
    private javax.swing.JButton BT_CancelarDetalhamento;
    private javax.swing.JButton BT_Criar;
    private javax.swing.JButton BT_DesativarItem;
    private javax.swing.JButton BT_DesativarLista;
    private javax.swing.JButton BT_EditarItem;
    private javax.swing.JButton BT_EditarLista;
    private javax.swing.JButton BT_NovaLista;
    private javax.swing.JButton BT_Sair;
    private javax.swing.JComboBox<String> CB_Categoria;
    private javax.swing.JPanel Detalhamento;
    private javax.swing.JLabel LB_COD;
    private javax.swing.JPanel Listas;
    private javax.swing.JPanel Novo;
    private javax.swing.JPanel PainelBack;
    private javax.swing.JPanel PainelDataFinal;
    private javax.swing.JTabbedPane PainelGuias;
    private javax.swing.JTable TB_Detalhamento;
    private javax.swing.JTable TB_Listas;
    private javax.swing.JTextField edCODetalhamento;
    private javax.swing.JFormattedTextField edDataFinal;
    private javax.swing.JFormattedTextField edDataInicio;
    private javax.swing.JTextField edFornecedorDetalhamento;
    private javax.swing.JTextField edID;
    private javax.swing.JTextField edNome;
    private javax.swing.JTextField edNomeDetalhamento;
    private javax.swing.JTextField edPesquisa;
    private javax.swing.JTextField edQuatidadeDetalhamento;
    private javax.swing.JTextField edValorDetalhamento;
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
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
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
    private javax.swing.JLabel lbID;
    // End of variables declaration//GEN-END:variables
    Mensagem msg = new Mensagem();
}
