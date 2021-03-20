package view;

import java.awt.Color;
import mapeamento.Usuario;

public class ViewMenuAdmin extends javax.swing.JFrame {

    Usuario UsuarioLogado;

    public ViewMenuAdmin(Usuario user) {
        initComponents();
        UsuarioLogado = user;
        setExtendedState(MAXIMIZED_BOTH);
        MsgWelcome(user);

    }

    @SuppressWarnings("unchecked")

    public void MsgWelcome(Usuario user) {
        String nome = user.getName();
        String primeiroNome = "";
        for (int i = 0; i < nome.length(); i++) {
            if (nome.charAt(i) == ' ') {
                //LB_NomeUser.setText("Seja bem vindo, " + primeiroNome + "!");
                break;

            } else {
                primeiroNome += nome.charAt(i);
            }
        }
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelBack = new javax.swing.JPanel();
        PainelButtons = new javax.swing.JPanel();
        BT_Compra = new javax.swing.JButton();
        BT_Usuarios = new javax.swing.JButton();
        BT_Agenda = new javax.swing.JButton();
        BT_Controle = new javax.swing.JButton();
        BT_Estoque = new javax.swing.JButton();
        BT_Itens = new javax.swing.JButton();
        LB_LogoEF = new javax.swing.JLabel();
        Barra_Menu = new javax.swing.JMenuBar();
        Configuracao = new javax.swing.JMenu();
        MI_ConfigurarUsuario = new javax.swing.JMenuItem();
        MI_TrocarUsuario = new javax.swing.JMenuItem();
        MI_Sair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        PainelBack.setBackground(new java.awt.Color(57, 69, 81));

        PainelButtons.setBackground(new java.awt.Color(57, 69, 81));

        BT_Compra.setBackground(new java.awt.Color(30, 144, 255));
        BT_Compra.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        BT_Compra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buy.png"))); // NOI18N
        BT_Compra.setText("COMPRA");
        BT_Compra.setBorder(null);
        BT_Compra.setBorderPainted(false);
        BT_Compra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BT_Compra.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BT_Compra.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BT_Compra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BT_CompraMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BT_CompraMouseExited(evt);
            }
        });
        BT_Compra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_CompraActionPerformed(evt);
            }
        });

        BT_Usuarios.setBackground(new java.awt.Color(30, 144, 255));
        BT_Usuarios.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        BT_Usuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/usuario.png"))); // NOI18N
        BT_Usuarios.setText("USUÁRIOS");
        BT_Usuarios.setBorder(null);
        BT_Usuarios.setBorderPainted(false);
        BT_Usuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BT_Usuarios.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BT_Usuarios.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BT_Usuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BT_UsuariosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BT_UsuariosMouseExited(evt);
            }
        });
        BT_Usuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_UsuariosActionPerformed(evt);
            }
        });

        BT_Agenda.setBackground(new java.awt.Color(30, 144, 255));
        BT_Agenda.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        BT_Agenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/superior_direto.png"))); // NOI18N
        BT_Agenda.setText(" SUPERIOR DIRETO");
        BT_Agenda.setBorder(null);
        BT_Agenda.setBorderPainted(false);
        BT_Agenda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BT_Agenda.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BT_Agenda.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BT_Agenda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BT_AgendaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BT_AgendaMouseExited(evt);
            }
        });
        BT_Agenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_AgendaActionPerformed(evt);
            }
        });

        BT_Controle.setBackground(new java.awt.Color(30, 144, 255));
        BT_Controle.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        BT_Controle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/controle.png"))); // NOI18N
        BT_Controle.setText("CONTROLE");
        BT_Controle.setBorder(null);
        BT_Controle.setBorderPainted(false);
        BT_Controle.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BT_Controle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BT_Controle.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BT_Controle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BT_ControleMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BT_ControleMouseExited(evt);
            }
        });
        BT_Controle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_ControleActionPerformed(evt);
            }
        });

        BT_Estoque.setBackground(new java.awt.Color(30, 144, 255));
        BT_Estoque.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        BT_Estoque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cotacao.png"))); // NOI18N
        BT_Estoque.setText("COTAÇÃO");
        BT_Estoque.setBorder(null);
        BT_Estoque.setBorderPainted(false);
        BT_Estoque.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BT_Estoque.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BT_Estoque.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BT_Estoque.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BT_EstoqueMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BT_EstoqueMouseExited(evt);
            }
        });
        BT_Estoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_EstoqueActionPerformed(evt);
            }
        });

        BT_Itens.setBackground(new java.awt.Color(30, 144, 255));
        BT_Itens.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        BT_Itens.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/estoque.png"))); // NOI18N
        BT_Itens.setText("ESTOQUE");
        BT_Itens.setBorder(null);
        BT_Itens.setBorderPainted(false);
        BT_Itens.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BT_Itens.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BT_Itens.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BT_Itens.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BT_ItensMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BT_ItensMouseExited(evt);
            }
        });
        BT_Itens.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_ItensActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PainelButtonsLayout = new javax.swing.GroupLayout(PainelButtons);
        PainelButtons.setLayout(PainelButtonsLayout);
        PainelButtonsLayout.setHorizontalGroup(
            PainelButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelButtonsLayout.createSequentialGroup()
                .addContainerGap(117, Short.MAX_VALUE)
                .addGroup(PainelButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BT_Agenda, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BT_Compra, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PainelButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelButtonsLayout.createSequentialGroup()
                        .addComponent(BT_Controle, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BT_Estoque, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PainelButtonsLayout.createSequentialGroup()
                        .addComponent(BT_Usuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BT_Itens, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(117, Short.MAX_VALUE))
        );
        PainelButtonsLayout.setVerticalGroup(
            PainelButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelButtonsLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(PainelButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BT_Agenda, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BT_Usuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BT_Itens, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PainelButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BT_Compra, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BT_Controle, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BT_Estoque, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(68, Short.MAX_VALUE))
        );

        LB_LogoEF.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LB_LogoEF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sitemaEF_logo.png"))); // NOI18N

        javax.swing.GroupLayout PainelBackLayout = new javax.swing.GroupLayout(PainelBack);
        PainelBack.setLayout(PainelBackLayout);
        PainelBackLayout.setHorizontalGroup(
            PainelBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LB_LogoEF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(PainelButtons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PainelBackLayout.setVerticalGroup(
            PainelBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelBackLayout.createSequentialGroup()
                .addComponent(LB_LogoEF, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(PainelButtons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Barra_Menu.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        Configuracao.setBorder(null);
        Configuracao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/configuracao.png"))); // NOI18N
        Configuracao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Configuracao.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Configuracao.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Configuracao.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        MI_ConfigurarUsuario.setText("Configurar Usuário");
        MI_ConfigurarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MI_ConfigurarUsuarioActionPerformed(evt);
            }
        });
        Configuracao.add(MI_ConfigurarUsuario);

        MI_TrocarUsuario.setText("Trocar Usuário");
        MI_TrocarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MI_TrocarUsuarioActionPerformed(evt);
            }
        });
        Configuracao.add(MI_TrocarUsuario);

        MI_Sair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        MI_Sair.setText("Sair");
        MI_Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MI_SairActionPerformed(evt);
            }
        });
        Configuracao.add(MI_Sair);

        Barra_Menu.add(Configuracao);

        setJMenuBar(Barra_Menu);

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

    // ITENS MENU \\

    private void MI_ConfigurarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MI_ConfigurarUsuarioActionPerformed
        ViewSubLogin subLogin = new ViewSubLogin(UsuarioLogado, this, rootPaneCheckingEnabled);
        subLogin.setVisible(true);
    }//GEN-LAST:event_MI_ConfigurarUsuarioActionPerformed

    private void MI_TrocarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MI_TrocarUsuarioActionPerformed
        ViewLogin login = new ViewLogin();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_MI_TrocarUsuarioActionPerformed

    private void MI_SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MI_SairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_MI_SairActionPerformed

    // BOTÕES \\

    private void BT_AgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_AgendaActionPerformed
        ViewSuperiorDireto vsd = new ViewSuperiorDireto(this, rootPaneCheckingEnabled);
        vsd.setVisible(true);
    }//GEN-LAST:event_BT_AgendaActionPerformed

    private void BT_UsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_UsuariosActionPerformed
        ViewUsuario vu = new ViewUsuario(this, rootPaneCheckingEnabled);
        vu.setVisible(true);
    }//GEN-LAST:event_BT_UsuariosActionPerformed

    private void BT_CompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_CompraActionPerformed
        ViewListaCompra vlc = new ViewListaCompra(this, rootPaneCheckingEnabled);
        vlc.setVisible(true);
    }//GEN-LAST:event_BT_CompraActionPerformed

    // EVENTOS \\

    private void BT_AgendaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_AgendaMouseEntered
        BT_Agenda.setBackground(new Color(235, 235, 235));
        BT_Agenda.setForeground(new Color(30, 144, 255));
    }//GEN-LAST:event_BT_AgendaMouseEntered

    private void BT_AgendaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_AgendaMouseExited
        BT_Agenda.setBackground(new Color(30, 144, 255));
        BT_Agenda.setForeground(Color.BLACK);
    }//GEN-LAST:event_BT_AgendaMouseExited

    private void BT_UsuariosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_UsuariosMouseEntered
        BT_Usuarios.setBackground(new Color(235, 235, 235));
        BT_Usuarios.setForeground(new Color(30, 144, 255));
    }//GEN-LAST:event_BT_UsuariosMouseEntered

    private void BT_UsuariosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_UsuariosMouseExited
        BT_Usuarios.setBackground(new Color(30, 144, 255));
        BT_Usuarios.setForeground(Color.BLACK);
    }//GEN-LAST:event_BT_UsuariosMouseExited

    private void BT_CompraMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_CompraMouseEntered
        BT_Compra.setBackground(new Color(235, 235, 235));
        BT_Compra.setForeground(new Color(30, 144, 255));
    }//GEN-LAST:event_BT_CompraMouseEntered

    private void BT_CompraMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_CompraMouseExited
        BT_Compra.setBackground(new Color(30, 144, 255));
        BT_Compra.setForeground(Color.BLACK);
    }//GEN-LAST:event_BT_CompraMouseExited

    private void BT_ControleMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_ControleMouseEntered
        BT_Controle.setBackground(new Color(235, 235, 235));
        BT_Controle.setForeground(new Color(30, 144, 255));
    }//GEN-LAST:event_BT_ControleMouseEntered

    private void BT_ControleMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_ControleMouseExited
        BT_Controle.setBackground(new Color(30, 144, 255));
        BT_Controle.setForeground(Color.BLACK);
    }//GEN-LAST:event_BT_ControleMouseExited

    private void BT_ControleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_ControleActionPerformed
        ViewListaControle vc = new ViewListaControle(this, rootPaneCheckingEnabled);
        vc.setVisible(true);
    }//GEN-LAST:event_BT_ControleActionPerformed

    private void BT_EstoqueMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_EstoqueMouseEntered
        BT_Estoque.setBackground(new Color(235, 235, 235));
        BT_Estoque.setForeground(new Color(30, 144, 255));
    }//GEN-LAST:event_BT_EstoqueMouseEntered

    private void BT_EstoqueMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_EstoqueMouseExited
        BT_Estoque.setBackground(new Color(30, 144, 255));
        BT_Estoque.setForeground(Color.BLACK);
    }//GEN-LAST:event_BT_EstoqueMouseExited

    private void BT_EstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_EstoqueActionPerformed
        ViewCotacao vc = new ViewCotacao(this, rootPaneCheckingEnabled);
        vc.setVisible(true);
    }//GEN-LAST:event_BT_EstoqueActionPerformed

    private void BT_ItensMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_ItensMouseEntered
        BT_Itens.setBackground(new Color(235, 235, 235));
        BT_Itens.setForeground(new Color(30, 144, 255));
    }//GEN-LAST:event_BT_ItensMouseEntered

    private void BT_ItensMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_ItensMouseExited
        BT_Itens.setBackground(new Color(30, 144, 255));
        BT_Itens.setForeground(Color.BLACK);
    }//GEN-LAST:event_BT_ItensMouseExited

    private void BT_ItensActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_ItensActionPerformed
        ViewEstoque vi = new ViewEstoque(this, rootPaneCheckingEnabled);
        vi.setVisible(true);
    }//GEN-LAST:event_BT_ItensActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BT_Agenda;
    private javax.swing.JButton BT_Compra;
    private javax.swing.JButton BT_Controle;
    private javax.swing.JButton BT_Estoque;
    private javax.swing.JButton BT_Itens;
    private javax.swing.JButton BT_Usuarios;
    private javax.swing.JMenuBar Barra_Menu;
    private javax.swing.JMenu Configuracao;
    private javax.swing.JLabel LB_LogoEF;
    private javax.swing.JMenuItem MI_ConfigurarUsuario;
    private javax.swing.JMenuItem MI_Sair;
    private javax.swing.JMenuItem MI_TrocarUsuario;
    private javax.swing.JPanel PainelBack;
    private javax.swing.JPanel PainelButtons;
    // End of variables declaration//GEN-END:variables
}
