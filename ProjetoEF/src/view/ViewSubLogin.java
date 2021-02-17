package view;

import dao.UsuarioDao;
import funcoes.Mensagem;
import mapeamento.Usuario;

/**
 *
 * @author Jerônimo
 */
public class ViewSubLogin extends javax.swing.JDialog {

    Usuario UsuarioLogado;

    public ViewSubLogin(Usuario user, java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        UsuarioLogado = user;

        PainelRobo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, null, javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14), new java.awt.Color(0, 0, 0)));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelBack = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        PainelRobo = new javax.swing.JPanel();
        BT_Proseguir = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        edSenha = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Confirmar Senha");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PainelBack.setBackground(new java.awt.Color(204, 204, 204));
        PainelBack.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Para continuar,");
        PainelBack.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, -1, 30));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/robo.png"))); // NOI18N
        PainelBack.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 240, 260));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("informe sua senha...");
        PainelBack.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/balao.png"))); // NOI18N
        PainelBack.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, -1, -1));

        PainelRobo.setBackground(new java.awt.Color(204, 204, 204));

        BT_Proseguir.setText("PROSSEGUIR");
        BT_Proseguir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BT_Proseguir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_ProseguirActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Senha");

        edSenha.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        javax.swing.GroupLayout PainelRoboLayout = new javax.swing.GroupLayout(PainelRobo);
        PainelRobo.setLayout(PainelRoboLayout);
        PainelRoboLayout.setHorizontalGroup(
            PainelRoboLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelRoboLayout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(PainelRoboLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(edSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(156, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelRoboLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BT_Proseguir, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        PainelRoboLayout.setVerticalGroup(
            PainelRoboLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelRoboLayout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(BT_Proseguir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        PainelBack.add(PainelRobo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 470, 180));

        getContentPane().add(PainelBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 450));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BT_ProseguirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_ProseguirActionPerformed
        Mensagem msg = new Mensagem();
        UsuarioDao userdao = new UsuarioDao();
        Usuario user = userdao.login(UsuarioLogado.getName(), UsuarioLogado.getPassword());

        //msg.Mensagem("Erro: " + user.getId_user(), "Erro", 1);
        if (user.getId_user() != 0) {
            viewConfigUsuario configUser = new viewConfigUsuario(UsuarioLogado);
            this.dispose();
            configUser.setVisible(true);

        } else {
            msg.Mensagem("Erro", "Erro", 1);
        }


    }//GEN-LAST:event_BT_ProseguirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BT_Proseguir;
    private javax.swing.JPanel PainelBack;
    private javax.swing.JPanel PainelRobo;
    private javax.swing.JPasswordField edSenha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
