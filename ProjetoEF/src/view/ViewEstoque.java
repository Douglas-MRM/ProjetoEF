package view;

import com.placeholder.PlaceHolder;
import dao.EstoqueDao;
import dao.ProdutoDao;
import funcoes.Mensagem;
import funcoes.Test;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import mapeamento.Estoque;
import mapeamento.Produto;

/**
 *
 * @author Jerônimo
 */
public class ViewEstoque extends javax.swing.JDialog {

    Toolkit tk = Toolkit.getDefaultToolkit();
    Dimension d = tk.getScreenSize();
    PlaceHolder holder;

    public ViewEstoque(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        this.setPreferredSize(d);
        initComponents();
        preencherTabelaProdutos();
        preencherTabelaEstoque();

        LB_ID.setVisible(false);
        edID.setVisible(false);
        BT_Atualizar.setVisible(false);

        holder = new PlaceHolder(edPesquisaEstoque, Color.GRAY, new Color(24, 14, 14), "Digite o nome do produto...", isUndecorated(), "Segoe UI", 14);
        holder = new PlaceHolder(edPesquisaItens, Color.GRAY, new Color(24, 14, 14), "Digite o nome do produto...", isUndecorated(), "Segoe UI", 14);
    }

    public void preencherTabelaProdutos() {
        ProdutoDao proDao = new ProdutoDao();
        List<Produto> listaProduto = proDao.listAll();
        DefaultTableModel tabela = (DefaultTableModel) TB_Produtos.getModel();
        tabela.setRowCount(0);
        for (Produto prod : listaProduto) {
            tabela.addRow(new Object[]{prod.getId_produto(), prod.getNome(), prod.getMarca(), prod.getCategoria(), prod.getObservacao()});
        }

    }

    public void preencherTabelaEstoque() {
        EstoqueDao estoDao = new EstoqueDao();
        List<Estoque> listEstoque = estoDao.listAll();
        DefaultTableModel tabela = (DefaultTableModel) TB_Estoque.getModel();
        tabela.setRowCount(0);
        for (Estoque esto : listEstoque) {
            tabela.addRow(new Object[]{esto.getId_estoque(), esto.getProduto().getNome(), esto.getQuantidade()});
        }
    }

    public void preencherTabelaEstoque(String texto) {
        EstoqueDao estoDao = new EstoqueDao();
        List<Estoque> listEstoque = estoDao.listAll(texto);
        DefaultTableModel tabela = (DefaultTableModel) TB_Estoque.getModel();
        tabela.setRowCount(0);
        for (Estoque esto : listEstoque) {
            tabela.addRow(new Object[]{esto.getId_estoque(), esto.getProduto().getNome(), esto.getQuantidade()});
        }
    }

    public void limparCampos() {
        edNome.setText(null);
        edMarca.setText(null);
        CB_Categoria.setSelectedIndex(-1);
        edObservacao.setText(null);

        BT_Atualizar.setVisible(false);
        BT_Cadastrar.setVisible(true);
        LB_ID.setVisible(false);
        edID.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelBack = new javax.swing.JPanel();
        PainelTop = new javax.swing.JPanel();
        LB_Titulo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Painel_Sair = new javax.swing.JPanel();
        LB_Sair = new javax.swing.JLabel();
        PainelGuias = new javax.swing.JTabbedPane();
        Estoque = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TB_Estoque = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        edPesquisaEstoque = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        edQuantidade = new javax.swing.JLabel();
        BT_Historico = new javax.swing.JButton();
        Produtos = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TB_Produtos = new javax.swing.JTable();
        BT_Novo = new javax.swing.JButton();
        BT_Editar = new javax.swing.JButton();
        BT_Excluir = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        edPesquisaItens = new javax.swing.JTextField();
        Novo = new javax.swing.JPanel();
        LB_Nome = new javax.swing.JLabel();
        PainelNome = new javax.swing.JPanel();
        edNome = new javax.swing.JTextField();
        LB_Marca = new javax.swing.JLabel();
        PainelMarca = new javax.swing.JPanel();
        edMarca = new javax.swing.JTextField();
        LB_Categoria = new javax.swing.JLabel();
        CB_Categoria = new javax.swing.JComboBox<>();
        LB_Observacao = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        edObservacao = new javax.swing.JTextArea();
        BT_Cadastrar = new javax.swing.JButton();
        BT_Atualizar = new javax.swing.JButton();
        BT_Cancelar = new javax.swing.JButton();
        edID = new javax.swing.JTextField();
        LB_ID = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        PainelBack.setBackground(new java.awt.Color(57, 69, 81));

        PainelTop.setBackground(new java.awt.Color(255, 255, 255));

        LB_Titulo.setText("Estoque");

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icon.png"))); // NOI18N

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

        javax.swing.GroupLayout PainelTopLayout = new javax.swing.GroupLayout(PainelTop);
        PainelTop.setLayout(PainelTopLayout);
        PainelTopLayout.setHorizontalGroup(
            PainelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelTopLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LB_Titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Painel_Sair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        PainelTopLayout.setVerticalGroup(
            PainelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelTopLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(PainelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Painel_Sair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LB_Titulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        Estoque.setBackground(new java.awt.Color(57, 69, 81));

        TB_Estoque.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "COD", "Nome do produto", "Quantidade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TB_Estoque.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(TB_Estoque);
        if (TB_Estoque.getColumnModel().getColumnCount() > 0) {
            TB_Estoque.getColumnModel().getColumn(0).setMinWidth(50);
            TB_Estoque.getColumnModel().getColumn(0).setPreferredWidth(50);
            TB_Estoque.getColumnModel().getColumn(0).setMaxWidth(50);
            TB_Estoque.getColumnModel().getColumn(2).setMinWidth(110);
            TB_Estoque.getColumnModel().getColumn(2).setPreferredWidth(110);
            TB_Estoque.getColumnModel().getColumn(2).setMaxWidth(110);
        }

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pesquisar.png"))); // NOI18N

        edPesquisaEstoque.setBackground(new java.awt.Color(255, 255, 255));
        edPesquisaEstoque.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        edPesquisaEstoque.setBorder(null);
        edPesquisaEstoque.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                edPesquisaEstoqueKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edPesquisaEstoque, javax.swing.GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(edPesquisaEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/down_estoque.png"))); // NOI18N
        jButton1.setText("DOWN ESTOQUE");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(30, 144, 255));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/up_estoque.png"))); // NOI18N
        jButton2.setText("UP ESTOQUE");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        BT_Historico.setBackground(new java.awt.Color(0, 204, 0));
        BT_Historico.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BT_Historico.setForeground(new java.awt.Color(255, 255, 255));
        BT_Historico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/historico.png"))); // NOI18N
        BT_Historico.setText("HISTÓRICO");
        BT_Historico.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BT_Historico.setIconTextGap(8);
        BT_Historico.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        BT_Historico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BT_HistoricoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BT_HistoricoMouseExited(evt);
            }
        });
        BT_Historico.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                BT_HistoricoComponentResized(evt);
            }
        });
        BT_Historico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_HistoricoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout EstoqueLayout = new javax.swing.GroupLayout(Estoque);
        Estoque.setLayout(EstoqueLayout);
        EstoqueLayout.setHorizontalGroup(
            EstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EstoqueLayout.createSequentialGroup()
                .addContainerGap(154, Short.MAX_VALUE)
                .addGroup(EstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(EstoqueLayout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jButton1))
                    .addGroup(EstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, EstoqueLayout.createSequentialGroup()
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BT_Historico))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(154, Short.MAX_VALUE))
            .addComponent(edQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        EstoqueLayout.setVerticalGroup(
            EstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EstoqueLayout.createSequentialGroup()
                .addComponent(edQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(EstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(EstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BT_Historico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(145, Short.MAX_VALUE))
        );

        PainelGuias.addTab("Estoque", Estoque);

        Produtos.setBackground(new java.awt.Color(57, 69, 81));

        TB_Produtos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "COD", "Nome", "Marca", "Categoria", "Observação"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TB_Produtos.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(TB_Produtos);
        if (TB_Produtos.getColumnModel().getColumnCount() > 0) {
            TB_Produtos.getColumnModel().getColumn(0).setMinWidth(50);
            TB_Produtos.getColumnModel().getColumn(0).setPreferredWidth(50);
            TB_Produtos.getColumnModel().getColumn(0).setMaxWidth(50);
            TB_Produtos.getColumnModel().getColumn(2).setMinWidth(140);
            TB_Produtos.getColumnModel().getColumn(2).setPreferredWidth(140);
            TB_Produtos.getColumnModel().getColumn(2).setMaxWidth(140);
            TB_Produtos.getColumnModel().getColumn(3).setMinWidth(140);
            TB_Produtos.getColumnModel().getColumn(3).setPreferredWidth(140);
            TB_Produtos.getColumnModel().getColumn(3).setMaxWidth(140);
        }

        BT_Novo.setBackground(new java.awt.Color(30, 144, 255));
        BT_Novo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BT_Novo.setForeground(new java.awt.Color(255, 255, 255));
        BT_Novo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nova_lista.png"))); // NOI18N
        BT_Novo.setText("NOVO");
        BT_Novo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BT_Novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_NovoActionPerformed(evt);
            }
        });

        BT_Editar.setBackground(new java.awt.Color(0, 204, 0));
        BT_Editar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BT_Editar.setForeground(new java.awt.Color(255, 255, 255));
        BT_Editar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/editar.png"))); // NOI18N
        BT_Editar.setText("EDITAR");
        BT_Editar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BT_Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_EditarActionPerformed(evt);
            }
        });

        BT_Excluir.setBackground(new java.awt.Color(255, 0, 0));
        BT_Excluir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BT_Excluir.setForeground(new java.awt.Color(255, 255, 255));
        BT_Excluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/desativar.png"))); // NOI18N
        BT_Excluir.setText("EXCLUIR");
        BT_Excluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BT_Excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_ExcluirActionPerformed(evt);
            }
        });

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pesquisar.png"))); // NOI18N

        edPesquisaItens.setBackground(new java.awt.Color(255, 255, 255));
        edPesquisaItens.setBorder(null);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edPesquisaItens, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
            .addComponent(edPesquisaItens, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        javax.swing.GroupLayout ProdutosLayout = new javax.swing.GroupLayout(Produtos);
        Produtos.setLayout(ProdutosLayout);
        ProdutosLayout.setHorizontalGroup(
            ProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProdutosLayout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(ProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ProdutosLayout.createSequentialGroup()
                        .addComponent(BT_Novo, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BT_Editar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BT_Excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 828, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        ProdutosLayout.setVerticalGroup(
            ProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ProdutosLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(ProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BT_Editar, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(BT_Excluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BT_Novo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(55, 55, 55)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );

        PainelGuias.addTab("Produtos no estoque", Produtos);

        Novo.setBackground(new java.awt.Color(57, 69, 81));

        LB_Nome.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        LB_Nome.setForeground(new java.awt.Color(255, 255, 255));
        LB_Nome.setText("Nome");

        PainelNome.setBackground(new java.awt.Color(255, 255, 255));

        edNome.setBackground(new java.awt.Color(255, 255, 255));
        edNome.setBorder(null);

        javax.swing.GroupLayout PainelNomeLayout = new javax.swing.GroupLayout(PainelNome);
        PainelNome.setLayout(PainelNomeLayout);
        PainelNomeLayout.setHorizontalGroup(
            PainelNomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelNomeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(edNome))
        );
        PainelNomeLayout.setVerticalGroup(
            PainelNomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(edNome, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        LB_Marca.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        LB_Marca.setForeground(new java.awt.Color(255, 255, 255));
        LB_Marca.setText("Marca");

        PainelMarca.setBackground(new java.awt.Color(255, 255, 255));

        edMarca.setBackground(new java.awt.Color(255, 255, 255));
        edMarca.setBorder(null);

        javax.swing.GroupLayout PainelMarcaLayout = new javax.swing.GroupLayout(PainelMarca);
        PainelMarca.setLayout(PainelMarcaLayout);
        PainelMarcaLayout.setHorizontalGroup(
            PainelMarcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelMarcaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(edMarca, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE))
        );
        PainelMarcaLayout.setVerticalGroup(
            PainelMarcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(edMarca)
        );

        LB_Categoria.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        LB_Categoria.setForeground(new java.awt.Color(255, 255, 255));
        LB_Categoria.setText("Categoria do produto");

        CB_Categoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Produto básico", "Produto não corriqueiro" }));
        CB_Categoria.setSelectedIndex(-1);

        LB_Observacao.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        LB_Observacao.setForeground(new java.awt.Color(255, 255, 255));
        LB_Observacao.setText("Observação");

        edObservacao.setBackground(new java.awt.Color(255, 255, 255));
        edObservacao.setColumns(20);
        edObservacao.setRows(5);
        jScrollPane3.setViewportView(edObservacao);

        BT_Cadastrar.setBackground(new java.awt.Color(30, 144, 255));
        BT_Cadastrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BT_Cadastrar.setForeground(new java.awt.Color(255, 255, 255));
        BT_Cadastrar.setText("CADASTRAR");
        BT_Cadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BT_Cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_CadastrarActionPerformed(evt);
            }
        });

        BT_Atualizar.setBackground(new java.awt.Color(255, 0, 0));
        BT_Atualizar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BT_Atualizar.setForeground(new java.awt.Color(255, 255, 255));
        BT_Atualizar.setText("ATUALIZAR");
        BT_Atualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BT_Atualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_AtualizarActionPerformed(evt);
            }
        });

        BT_Cancelar.setBackground(new java.awt.Color(255, 0, 0));
        BT_Cancelar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BT_Cancelar.setForeground(new java.awt.Color(255, 255, 255));
        BT_Cancelar.setText("CANCELAR");
        BT_Cancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BT_Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_CancelarActionPerformed(evt);
            }
        });

        edID.setEditable(false);
        edID.setBackground(new java.awt.Color(255, 255, 255));
        edID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        edID.setBorder(null);

        LB_ID.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        LB_ID.setForeground(new java.awt.Color(255, 255, 255));
        LB_ID.setText("ID");

        javax.swing.GroupLayout NovoLayout = new javax.swing.GroupLayout(Novo);
        Novo.setLayout(NovoLayout);
        NovoLayout.setHorizontalGroup(
            NovoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NovoLayout.createSequentialGroup()
                .addContainerGap(248, Short.MAX_VALUE)
                .addGroup(NovoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LB_ID)
                    .addGroup(NovoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(LB_Observacao)
                        .addComponent(LB_Categoria)
                        .addGroup(NovoLayout.createSequentialGroup()
                            .addGroup(NovoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(CB_Categoria, javax.swing.GroupLayout.Alignment.LEADING, 0, 200, Short.MAX_VALUE)
                                .addComponent(LB_Nome, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(PainelNome, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(43, 43, 43)
                            .addGroup(NovoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(PainelMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(LB_Marca)))
                        .addComponent(jScrollPane3)
                        .addGroup(NovoLayout.createSequentialGroup()
                            .addComponent(BT_Cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(20, 20, 20)
                            .addComponent(BT_Atualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, Short.MAX_VALUE)
                            .addComponent(BT_Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(edID, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(237, Short.MAX_VALUE))
        );
        NovoLayout.setVerticalGroup(
            NovoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NovoLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(LB_ID)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edID, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(NovoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LB_Nome)
                    .addComponent(LB_Marca))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(NovoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PainelNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PainelMarca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(32, 32, 32)
                .addComponent(LB_Categoria)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CB_Categoria, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(LB_Observacao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addGroup(NovoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BT_Cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BT_Atualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BT_Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );

        PainelGuias.addTab("Novo/Editar", Novo);

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
    }// </editor-fold>//GEN-END:initComponents

    private void edPesquisaEstoqueKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edPesquisaEstoqueKeyReleased
        preencherTabelaEstoque(edPesquisaEstoque.getText());
    }//GEN-LAST:event_edPesquisaEstoqueKeyReleased

    private void BT_NovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_NovoActionPerformed
        PainelGuias.setSelectedIndex(2);
    }//GEN-LAST:event_BT_NovoActionPerformed

    private void BT_EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_EditarActionPerformed
        int indice = TB_Produtos.getSelectedRow();
        if (indice >= 0) {
            edID.setText(TB_Produtos.getValueAt(indice, 0).toString());
            edNome.setText(TB_Produtos.getValueAt(indice, 1).toString());
            edMarca.setText(TB_Produtos.getValueAt(indice, 2).toString());
            CB_Categoria.setSelectedItem(TB_Produtos.getValueAt(indice, 3).toString());
            edObservacao.setText(TB_Produtos.getValueAt(indice, 4).toString());

            BT_Atualizar.setVisible(true);
            BT_Cadastrar.setVisible(false);
            LB_ID.setVisible(true);
            edID.setVisible(true);
            PainelGuias.setSelectedIndex(2);

        } else {
            msg.Mensagem("Selecione uma linha da tabela!", "SistemaEF diz:", 1);
        }
    }//GEN-LAST:event_BT_EditarActionPerformed

    private void BT_ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_ExcluirActionPerformed
        int indice = TB_Produtos.getSelectedRow();

        if (indice >= 0) {
            Produto prod = new Produto();
            prod.setId_produto(Integer.parseInt(TB_Produtos.getValueAt(indice, 0).toString()));

            ProdutoDao prodDao = new ProdutoDao();
            prodDao.delete(prod);
            preencherTabelaProdutos();
            preencherTabelaEstoque();

        } else {
            msg.Mensagem("Selecione uma linha na tabela!", "SistemaEF diz:", 2);
        }
    }//GEN-LAST:event_BT_ExcluirActionPerformed

    private void BT_CadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_CadastrarActionPerformed
        int ind = CB_Categoria.getSelectedIndex();
        if (ind == -1 || edNome.getText().isEmpty() || edMarca.getText().isEmpty() || edObservacao.getText().isEmpty()) {
            msg.Mensagem("Preencha todos os campos!", "SistemaEF diz:", 1);

        } else {
            Produto prod = new Produto();
            prod.setNome(edNome.getText());
            prod.setMarca(edMarca.getText());
            prod.setCategoria(CB_Categoria.getSelectedItem().toString());
            prod.setObservacao(edObservacao.getText());

            ProdutoDao prodDao = new ProdutoDao();
            prodDao.insert(prod);

            preencherTabelaProdutos();
            preencherTabelaEstoque();
            limparCampos();
            PainelGuias.setSelectedIndex(0);
        }

    }//GEN-LAST:event_BT_CadastrarActionPerformed

    private void BT_AtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_AtualizarActionPerformed
        int indice = CB_Categoria.getSelectedIndex();
        if (indice == -1 || edNome.getText().isEmpty() || edMarca.getText().isEmpty() || edObservacao.getText().isEmpty()) {
            msg.Mensagem("Preencha todos os campos!", "SistemaEF diz:", 1);

        } else {
            Produto prod = new Produto();
            prod.setId_produto(Integer.parseInt(edID.getText()));
            prod.setNome(edNome.getText());
            prod.setMarca(edMarca.getText());
            prod.setCategoria(CB_Categoria.getSelectedItem().toString());
            prod.setObservacao(edObservacao.getText());

            ProdutoDao prodDao = new ProdutoDao();
            prodDao.update(prod);

            preencherTabelaProdutos();
            limparCampos();
            PainelGuias.setSelectedIndex(0);

        }
    }//GEN-LAST:event_BT_AtualizarActionPerformed

    private void BT_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_CancelarActionPerformed
        limparCampos();
    }//GEN-LAST:event_BT_CancelarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int indice = TB_Estoque.getSelectedRow();

        if (indice >= 0) {
            Estoque esto = new Estoque();
            esto.setId_estoque(Integer.parseInt(TB_Estoque.getValueAt(indice, 0).toString()));
            esto.setQuantidade(Integer.parseInt(TB_Estoque.getValueAt(indice, 2).toString()));
            Produto prod = new Produto();
            prod.setNome(TB_Estoque.getValueAt(indice, 1).toString());
            esto.setProduto(prod);

            ViewUpEstoque vue = new ViewUpEstoque(null, rootPaneCheckingEnabled, esto);
            vue.setVisible(true);
            preencherTabelaEstoque();

        } else {
            msg.Mensagem("Selecione uma linha na tabela!", "SistemaEF diz:", 1);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int indice = TB_Estoque.getSelectedRow();

        if (indice >= 0) {
            Estoque esto = new Estoque();
            esto.setId_estoque(Integer.parseInt(TB_Estoque.getValueAt(indice, 0).toString()));
            esto.setQuantidade(Integer.parseInt(TB_Estoque.getValueAt(indice, 2).toString()));
            Produto prod = new Produto();
            prod.setNome(TB_Estoque.getValueAt(indice, 1).toString());
            esto.setProduto(prod);

            ViewDownEstoque vde = new ViewDownEstoque(null, rootPaneCheckingEnabled, esto);
            vde.setVisible(true);
            preencherTabelaEstoque();

        } else {
            msg.Mensagem("Selecione uma linha na tabela!", "SistemaEF diz:", 1);
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void BT_HistoricoComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_BT_HistoricoComponentResized

    }//GEN-LAST:event_BT_HistoricoComponentResized

    private void BT_HistoricoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_HistoricoMouseEntered
        BT_Historico.setBackground(Color.WHITE);
        BT_Historico.setForeground(Color.BLACK);
    }//GEN-LAST:event_BT_HistoricoMouseEntered

    private void BT_HistoricoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_HistoricoMouseExited
        BT_Historico.setBackground(new Color(0, 204, 0));
        BT_Historico.setForeground(Color.WHITE);
    }//GEN-LAST:event_BT_HistoricoMouseExited

    private void BT_HistoricoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_HistoricoActionPerformed
        ViewHistoricoEstoque vhe = new ViewHistoricoEstoque(null, rootPaneCheckingEnabled);
        vhe.setVisible(true);
    }//GEN-LAST:event_BT_HistoricoActionPerformed

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
            java.util.logging.Logger.getLogger(ViewEstoque.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewEstoque.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewEstoque.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewEstoque.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ViewEstoque dialog = new ViewEstoque(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton BT_Atualizar;
    private javax.swing.JButton BT_Cadastrar;
    private javax.swing.JButton BT_Cancelar;
    private javax.swing.JButton BT_Editar;
    private javax.swing.JButton BT_Excluir;
    private javax.swing.JButton BT_Historico;
    private javax.swing.JButton BT_Novo;
    private javax.swing.JComboBox<String> CB_Categoria;
    private javax.swing.JPanel Estoque;
    private javax.swing.JLabel LB_Categoria;
    private javax.swing.JLabel LB_ID;
    private javax.swing.JLabel LB_Marca;
    private javax.swing.JLabel LB_Nome;
    private javax.swing.JLabel LB_Observacao;
    private javax.swing.JLabel LB_Sair;
    private javax.swing.JLabel LB_Titulo;
    private javax.swing.JPanel Novo;
    private javax.swing.JPanel PainelBack;
    private javax.swing.JTabbedPane PainelGuias;
    private javax.swing.JPanel PainelMarca;
    private javax.swing.JPanel PainelNome;
    private javax.swing.JPanel PainelTop;
    private javax.swing.JPanel Painel_Sair;
    private javax.swing.JPanel Produtos;
    private javax.swing.JTable TB_Estoque;
    private javax.swing.JTable TB_Produtos;
    private javax.swing.JTextField edID;
    private javax.swing.JTextField edMarca;
    private javax.swing.JTextField edNome;
    private javax.swing.JTextArea edObservacao;
    private javax.swing.JTextField edPesquisaEstoque;
    private javax.swing.JTextField edPesquisaItens;
    private javax.swing.JLabel edQuantidade;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
    Mensagem msg = new Mensagem();
}
