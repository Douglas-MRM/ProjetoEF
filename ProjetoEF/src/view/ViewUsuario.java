package view;

import dao.UsuarioDao;
import funcoes.Mensagem;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import mapeamento.Usuario;

/**
 *
 * @author Jerônimo
 */
public class ViewUsuario extends javax.swing.JDialog {

    Toolkit tk = Toolkit.getDefaultToolkit();
    Dimension d = tk.getScreenSize();

    public ViewUsuario(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        this.setPreferredSize(d);
        initComponents();
    }

    public void limparCampos() {
        edNome.setText(null);
        edCPF.setText(null);
        CB_Type.setSelectedIndex(-1);
        edEmail.setText(null);
        edSenha.setText(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelBack = new javax.swing.JPanel();
        PainelTop = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        BT_Sair = new javax.swing.JButton();
        PanelGuias = new javax.swing.JTabbedPane();
        Cadastro = new javax.swing.JPanel();
        LB_Senha = new javax.swing.JLabel();
        PainelEmail = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        edEmail = new javax.swing.JTextField();
        LB_Type = new javax.swing.JLabel();
        LB_CPF = new javax.swing.JLabel();
        LB_Title = new javax.swing.JLabel();
        PainelCPF = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        edCPF = new javax.swing.JFormattedTextField();
        LB_Icone = new javax.swing.JLabel();
        PainelNome = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        edNome = new javax.swing.JTextField();
        LB_Email = new javax.swing.JLabel();
        LB_Nome = new javax.swing.JLabel();
        CB_Type = new javax.swing.JComboBox<>();
        PainelSenha = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        edSenha = new javax.swing.JPasswordField();
        BT_Cadastrar = new javax.swing.JButton();
        BT_Cancelar = new javax.swing.JButton();
        Gerenciador = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        PainelBack.setBackground(new java.awt.Color(57, 69, 81));

        PainelTop.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icon.png"))); // NOI18N

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Usuário");

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

        Cadastro.setBackground(new java.awt.Color(57, 69, 81));

        LB_Senha.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        LB_Senha.setForeground(new java.awt.Color(255, 255, 255));
        LB_Senha.setText("Senha");

        PainelEmail.setBackground(new java.awt.Color(255, 255, 255));

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/email.png"))); // NOI18N

        edEmail.setBackground(new java.awt.Color(255, 255, 255));
        edEmail.setForeground(new java.awt.Color(0, 0, 0));
        edEmail.setBorder(null);

        javax.swing.GroupLayout PainelEmailLayout = new javax.swing.GroupLayout(PainelEmail);
        PainelEmail.setLayout(PainelEmailLayout);
        PainelEmailLayout.setHorizontalGroup(
            PainelEmailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelEmailLayout.createSequentialGroup()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(edEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE))
        );
        PainelEmailLayout.setVerticalGroup(
            PainelEmailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(edEmail)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        LB_Type.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        LB_Type.setForeground(new java.awt.Color(255, 255, 255));
        LB_Type.setText("Tipo de Usuário");

        LB_CPF.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        LB_CPF.setForeground(new java.awt.Color(255, 255, 255));
        LB_CPF.setText("CPF");

        LB_Title.setFont(new java.awt.Font("BankGothic Md BT", 0, 24)); // NOI18N
        LB_Title.setForeground(new java.awt.Color(255, 255, 255));
        LB_Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LB_Title.setText("CADASTRAR USUÁRIO");

        PainelCPF.setBackground(new java.awt.Color(255, 255, 255));

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cpf.png"))); // NOI18N

        edCPF.setBackground(new java.awt.Color(255, 255, 255));
        edCPF.setBorder(null);
        edCPF.setForeground(new java.awt.Color(0, 0, 0));
        try {
            edCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout PainelCPFLayout = new javax.swing.GroupLayout(PainelCPF);
        PainelCPF.setLayout(PainelCPFLayout);
        PainelCPFLayout.setHorizontalGroup(
            PainelCPFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelCPFLayout.createSequentialGroup()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(edCPF, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE))
        );
        PainelCPFLayout.setVerticalGroup(
            PainelCPFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
            .addComponent(edCPF)
        );

        LB_Icone.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LB_Icone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cadastrar_usuario.png"))); // NOI18N

        PainelNome.setBackground(new java.awt.Color(255, 255, 255));

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/user.png"))); // NOI18N

        edNome.setBackground(new java.awt.Color(255, 255, 255));
        edNome.setForeground(new java.awt.Color(0, 0, 0));
        edNome.setBorder(null);

        javax.swing.GroupLayout PainelNomeLayout = new javax.swing.GroupLayout(PainelNome);
        PainelNome.setLayout(PainelNomeLayout);
        PainelNomeLayout.setHorizontalGroup(
            PainelNomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelNomeLayout.createSequentialGroup()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(edNome, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE))
        );
        PainelNomeLayout.setVerticalGroup(
            PainelNomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
            .addComponent(edNome)
        );

        LB_Email.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        LB_Email.setForeground(new java.awt.Color(255, 255, 255));
        LB_Email.setText("E-Mail");

        LB_Nome.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        LB_Nome.setForeground(new java.awt.Color(255, 255, 255));
        LB_Nome.setText("Nome Completo");

        CB_Type.setBackground(new java.awt.Color(255, 255, 255));
        CB_Type.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        CB_Type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Funcionário" }));
        CB_Type.setSelectedIndex(-1);
        CB_Type.setBorder(null);
        CB_Type.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        PainelSenha.setBackground(new java.awt.Color(255, 255, 255));

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/padlock.png"))); // NOI18N

        edSenha.setBackground(new java.awt.Color(255, 255, 255));
        edSenha.setForeground(new java.awt.Color(0, 0, 0));
        edSenha.setBorder(null);

        javax.swing.GroupLayout PainelSenhaLayout = new javax.swing.GroupLayout(PainelSenha);
        PainelSenha.setLayout(PainelSenhaLayout);
        PainelSenhaLayout.setHorizontalGroup(
            PainelSenhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelSenhaLayout.createSequentialGroup()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(edSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE))
        );
        PainelSenhaLayout.setVerticalGroup(
            PainelSenhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
            .addComponent(edSenha)
        );

        BT_Cadastrar.setBackground(new java.awt.Color(30, 144, 255));
        BT_Cadastrar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BT_Cadastrar.setForeground(new java.awt.Color(255, 255, 255));
        BT_Cadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cadastrar.png"))); // NOI18N
        BT_Cadastrar.setText("CADASTRAR");
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

        javax.swing.GroupLayout CadastroLayout = new javax.swing.GroupLayout(Cadastro);
        Cadastro.setLayout(CadastroLayout);
        CadastroLayout.setHorizontalGroup(
            CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CadastroLayout.createSequentialGroup()
                .addContainerGap(239, Short.MAX_VALUE)
                .addComponent(BT_Cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(115, 115, 115)
                .addComponent(BT_Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(244, Short.MAX_VALUE))
            .addGroup(CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(CadastroLayout.createSequentialGroup()
                    .addGap(81, 81, 81)
                    .addGroup(CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(LB_Icone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(CadastroLayout.createSequentialGroup()
                            .addGap(0, 163, Short.MAX_VALUE)
                            .addGroup(CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(PainelEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, CadastroLayout.createSequentialGroup()
                                            .addComponent(PainelCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(78, 78, 78)
                                            .addComponent(CB_Type, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(PainelSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(LB_Nome)
                                .addGroup(CadastroLayout.createSequentialGroup()
                                    .addComponent(LB_CPF)
                                    .addGap(207, 207, 207)
                                    .addComponent(LB_Type))
                                .addComponent(LB_Email)
                                .addComponent(LB_Senha)
                                .addComponent(PainelNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(0, 163, Short.MAX_VALUE))
                        .addComponent(LB_Title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGap(81, 81, 81)))
        );
        CadastroLayout.setVerticalGroup(
            CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CadastroLayout.createSequentialGroup()
                .addContainerGap(567, Short.MAX_VALUE)
                .addGroup(CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BT_Cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BT_Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
            .addGroup(CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(CadastroLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(LB_Icone, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(LB_Title)
                    .addGap(40, 40, 40)
                    .addComponent(LB_Nome)
                    .addGap(6, 6, 6)
                    .addComponent(PainelNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(35, 35, 35)
                    .addGroup(CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(LB_CPF)
                        .addComponent(LB_Type))
                    .addGap(6, 6, 6)
                    .addGroup(CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(PainelCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(CB_Type, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(40, 40, 40)
                    .addComponent(LB_Email)
                    .addGap(6, 6, 6)
                    .addComponent(PainelEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(40, 40, 40)
                    .addComponent(LB_Senha)
                    .addGap(6, 6, 6)
                    .addComponent(PainelSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        PanelGuias.addTab("Cadastro", Cadastro);

        Gerenciador.setBackground(new java.awt.Color(57, 69, 81));

        javax.swing.GroupLayout GerenciadorLayout = new javax.swing.GroupLayout(Gerenciador);
        Gerenciador.setLayout(GerenciadorLayout);
        GerenciadorLayout.setHorizontalGroup(
            GerenciadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 898, Short.MAX_VALUE)
        );
        GerenciadorLayout.setVerticalGroup(
            GerenciadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 649, Short.MAX_VALUE)
        );

        PanelGuias.addTab("Gerenciador de Usuários", Gerenciador);

        javax.swing.GroupLayout PainelBackLayout = new javax.swing.GroupLayout(PainelBack);
        PainelBack.setLayout(PainelBackLayout);
        PainelBackLayout.setHorizontalGroup(
            PainelBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelTop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(PanelGuias)
        );
        PainelBackLayout.setVerticalGroup(
            PainelBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelBackLayout.createSequentialGroup()
                .addComponent(PainelTop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(PanelGuias))
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

    private void BT_CadastrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_CadastrarMouseEntered
        BT_Cadastrar.setBackground(new Color(255, 255, 255));
        BT_Cadastrar.setForeground(new Color(30, 144, 255));
    }//GEN-LAST:event_BT_CadastrarMouseEntered

    private void BT_CadastrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_CadastrarMouseExited
        BT_Cadastrar.setBackground(new Color(30,144,255));
        BT_Cadastrar.setForeground(Color.WHITE);
    }//GEN-LAST:event_BT_CadastrarMouseExited

    private void BT_CadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_CadastrarActionPerformed
        int ind = CB_Type.getSelectedIndex();

        if (edNome.getText().isEmpty() || edCPF.getText().trim().replace(" ", "").length() < 11 || ind == -1 || edEmail.getText().isEmpty() || edSenha.getText().isEmpty()) {
            msg.Mensagem("Preencha todos os campos!", "SistemaEF diz:", 2);

        } else {
            Usuario user = new Usuario();
            user.setName(edNome.getText());
            user.setTipe(CB_Type.getSelectedItem().toString());
            user.setCpf(edCPF.getText());
            user.setPassword(edSenha.getText());
            user.setEmail(edEmail.getText());

            UsuarioDao userdao = new UsuarioDao();
            userdao.insert(user);
            edNome.setText(null);
            edCPF.setText(null);
            CB_Type.setSelectedIndex(-1);
            edEmail.setText(null);
            edSenha.setText(null);
        }
    }//GEN-LAST:event_BT_CadastrarActionPerformed

    private void BT_CancelarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_CancelarMouseEntered
        BT_Cancelar.setBackground(new Color(255, 255, 255));
        BT_Cancelar.setForeground(new Color(255, 0, 0));
    }//GEN-LAST:event_BT_CancelarMouseEntered

    private void BT_CancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_CancelarMouseExited
        BT_Cancelar.setBackground(new Color(255, 0, 0));
        BT_Cancelar.setForeground(Color.WHITE);
    }//GEN-LAST:event_BT_CancelarMouseExited

    private void BT_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_CancelarActionPerformed
        limparCampos();
    }//GEN-LAST:event_BT_CancelarActionPerformed

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
            java.util.logging.Logger.getLogger(ViewUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ViewUsuario dialog = new ViewUsuario(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton BT_Cadastrar;
    private javax.swing.JButton BT_Cancelar;
    private javax.swing.JButton BT_Sair;
    private javax.swing.JComboBox<String> CB_Type;
    private javax.swing.JPanel Cadastro;
    private javax.swing.JPanel Gerenciador;
    private javax.swing.JLabel LB_CPF;
    private javax.swing.JLabel LB_Email;
    private javax.swing.JLabel LB_Icone;
    private javax.swing.JLabel LB_Nome;
    private javax.swing.JLabel LB_Senha;
    private javax.swing.JLabel LB_Title;
    private javax.swing.JLabel LB_Type;
    private javax.swing.JPanel PainelBack;
    private javax.swing.JPanel PainelCPF;
    private javax.swing.JPanel PainelEmail;
    private javax.swing.JPanel PainelNome;
    private javax.swing.JPanel PainelSenha;
    private javax.swing.JPanel PainelTop;
    private javax.swing.JTabbedPane PanelGuias;
    private javax.swing.JFormattedTextField edCPF;
    private javax.swing.JTextField edEmail;
    private javax.swing.JTextField edNome;
    private javax.swing.JPasswordField edSenha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
    Mensagem msg = new Mensagem();
}
