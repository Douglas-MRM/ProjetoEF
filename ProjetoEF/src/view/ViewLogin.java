package view;

import dao.UsuarioDao;
import funcoes.Mensagem;
import java.awt.Color;
import mapeamento.Usuario;

public class ViewLogin extends javax.swing.JFrame {
    
    public ViewLogin() {
        initComponents();
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PaineBack = new javax.swing.JPanel();
        LB_Titulo = new javax.swing.JLabel();
        LB_Nome = new javax.swing.JLabel();
        PainelNome = new javax.swing.JPanel();
        edNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        LB_Senha = new javax.swing.JLabel();
        PainelSenha = new javax.swing.JPanel();
        edSenha = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        BT_Logar = new javax.swing.JButton();
        BT_Sair = new javax.swing.JButton();
        LB_RecoverPassword = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 153));
        setUndecorated(true);

        PaineBack.setBackground(new java.awt.Color(204, 204, 204));

        LB_Titulo.setFont(new java.awt.Font("DeVinne Txt BT", 1, 24)); // NOI18N
        LB_Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LB_Titulo.setText("Sing in to SistemaEF");

        LB_Nome.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        LB_Nome.setText("NOME");

        PainelNome.setBackground(new java.awt.Color(255, 255, 255));

        edNome.setBorder(null);
        edNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                edNomeKeyReleased(evt);
            }
        });

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/user.png"))); // NOI18N

        javax.swing.GroupLayout PainelNomeLayout = new javax.swing.GroupLayout(PainelNome);
        PainelNome.setLayout(PainelNomeLayout);
        PainelNomeLayout.setHorizontalGroup(
            PainelNomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelNomeLayout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edNome))
        );
        PainelNomeLayout.setVerticalGroup(
            PainelNomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(edNome)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        LB_Senha.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        LB_Senha.setText("SENHA");

        PainelSenha.setBackground(new java.awt.Color(255, 255, 255));

        edSenha.setBorder(null);
        edSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edSenhaActionPerformed(evt);
            }
        });

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/padlock.png"))); // NOI18N

        javax.swing.GroupLayout PainelSenhaLayout = new javax.swing.GroupLayout(PainelSenha);
        PainelSenha.setLayout(PainelSenhaLayout);
        PainelSenhaLayout.setHorizontalGroup(
            PainelSenhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelSenhaLayout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE))
        );
        PainelSenhaLayout.setVerticalGroup(
            PainelSenhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(edSenha)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        BT_Logar.setBackground(new java.awt.Color(138, 43, 226));
        BT_Logar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BT_Logar.setText("LOGAR");
        BT_Logar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BT_Logar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BT_LogarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BT_LogarMouseExited(evt);
            }
        });
        BT_Logar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_LogarActionPerformed(evt);
            }
        });

        BT_Sair.setBackground(new java.awt.Color(178, 34, 34));
        BT_Sair.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BT_Sair.setText("SAIR");
        BT_Sair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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

        LB_RecoverPassword.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        LB_RecoverPassword.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LB_RecoverPassword.setText("Esqueceu sua senha?");
        LB_RecoverPassword.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LB_RecoverPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LB_RecoverPasswordMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LB_RecoverPasswordMouseExited(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/login.png"))); // NOI18N

        javax.swing.GroupLayout PaineBackLayout = new javax.swing.GroupLayout(PaineBack);
        PaineBack.setLayout(PaineBackLayout);
        PaineBackLayout.setHorizontalGroup(
            PaineBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LB_Titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(PaineBackLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(PaineBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PaineBackLayout.createSequentialGroup()
                        .addComponent(BT_Logar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BT_Sair, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(LB_Senha, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LB_Nome, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PainelNome, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PainelSenha, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(84, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PaineBackLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LB_RecoverPassword)
                .addGap(156, 156, 156))
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PaineBackLayout.setVerticalGroup(
            PaineBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PaineBackLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(LB_Titulo)
                .addGap(27, 27, 27)
                .addComponent(LB_Nome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PainelNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(LB_Senha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PainelSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addGroup(PaineBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BT_Logar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BT_Sair, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addComponent(LB_RecoverPassword)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PaineBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PaineBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void acaoLogin() {
        UsuarioDao userdao = new UsuarioDao();
        Usuario user = userdao.login(edNome.getText(), edSenha.getText());
        
        if (user.getId_user() > 0) {

            //Redirecionamento conforme o TIPO DO USUÁRIO
            String type = user.getTipe();
            
            if (type.equals("Administrador")) {
                ViewMenuAdmin menu = new ViewMenuAdmin(user);
                menu.setVisible(true);
                this.dispose();
                menu.setLocationRelativeTo(menu);
                
            } else {
                if (type.equals("Funcionário")) {
                    ViewMenu menuFuncionario = new ViewMenu(user);
                    menuFuncionario.setVisible(true);
                    this.dispose();
                    menuFuncionario.setLocationRelativeTo(menuFuncionario);
                    
                }
            }
            
        } else {
            Mensagem msg = new Mensagem();
            msg.Mensagem("Nome de usuário ou senha incorreto!", "SistemaEF diz:", 1);
        }
    }

    private void BT_LogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_LogarActionPerformed
        acaoLogin();
    }//GEN-LAST:event_BT_LogarActionPerformed

    private void BT_SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_SairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BT_SairActionPerformed

    private void BT_LogarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_LogarMouseEntered
        BT_Logar.setBackground(new Color(235, 235, 235));
        BT_Logar.setForeground(new Color(138, 43, 226));
    }//GEN-LAST:event_BT_LogarMouseEntered

    private void BT_LogarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_LogarMouseExited
        BT_Logar.setBackground(new Color(138, 43, 226));
        BT_Logar.setForeground(Color.WHITE);
    }//GEN-LAST:event_BT_LogarMouseExited

    private void BT_SairMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_SairMouseEntered
        BT_Sair.setBackground(new Color(235, 235, 235));
        BT_Sair.setForeground(new Color(178, 34, 34));
    }//GEN-LAST:event_BT_SairMouseEntered

    private void BT_SairMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_SairMouseExited
        BT_Sair.setBackground(new Color(178, 34, 34));
        BT_Sair.setForeground(Color.WHITE);
    }//GEN-LAST:event_BT_SairMouseExited

    private void LB_RecoverPasswordMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LB_RecoverPasswordMouseEntered
        LB_RecoverPassword.setForeground(new Color(153, 0, 0));
    }//GEN-LAST:event_LB_RecoverPasswordMouseEntered

    private void LB_RecoverPasswordMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LB_RecoverPasswordMouseExited
        LB_RecoverPassword.setForeground(Color.BLACK);
    }//GEN-LAST:event_LB_RecoverPasswordMouseExited

    private void edSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edSenhaActionPerformed
        acaoLogin();
    }//GEN-LAST:event_edSenhaActionPerformed

    private void edNomeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edNomeKeyReleased
        String nome = edNome.getText();
        edNome.setText(nome.toUpperCase());     
    }//GEN-LAST:event_edNomeKeyReleased
    
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ViewLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BT_Logar;
    private javax.swing.JButton BT_Sair;
    private javax.swing.JLabel LB_Nome;
    private javax.swing.JLabel LB_RecoverPassword;
    private javax.swing.JLabel LB_Senha;
    private javax.swing.JLabel LB_Titulo;
    private javax.swing.JPanel PaineBack;
    private javax.swing.JPanel PainelNome;
    private javax.swing.JPanel PainelSenha;
    private javax.swing.JTextField edNome;
    private javax.swing.JPasswordField edSenha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables

Mensagem msg = new Mensagem();
}
