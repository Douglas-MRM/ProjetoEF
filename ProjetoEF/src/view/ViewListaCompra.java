package view;

import dao.ListaDao;
import funcoes.Mensagem;
import java.awt.Color;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import mapeamento.Lista;

/**
 *
 * @author Jerônimo
 */
public class ViewListaCompra extends javax.swing.JFrame {

    public ViewListaCompra() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
        preencherTabela();
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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelBack = new javax.swing.JPanel();
        PainelTop = new javax.swing.JPanel();
        LB_Titulo = new javax.swing.JLabel();
        BT_Sair = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TB_Listas = new javax.swing.JTable();
        BT_NovaLista = new javax.swing.JButton();
        BT_EditarLista = new javax.swing.JButton();
        BT_DesativarLista = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        PainelBack.setBackground(new java.awt.Color(204, 204, 204));

        PainelTop.setBackground(new java.awt.Color(255, 255, 255));

        LB_Titulo.setText("Compra");

        BT_Sair.setBackground(new java.awt.Color(255, 255, 255));
        BT_Sair.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        BT_Sair.setText("X");
        BT_Sair.setActionCommand("");
        BT_Sair.setBorder(null);
        BT_Sair.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelTopLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(LB_Titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 626, Short.MAX_VALUE)
                .addComponent(BT_Sair, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        PainelTopLayout.setVerticalGroup(
            PainelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LB_Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(BT_Sair, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        TB_Listas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Data de Início", "Data de Termino"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TB_Listas);
        if (TB_Listas.getColumnModel().getColumnCount() > 0) {
            TB_Listas.getColumnModel().getColumn(0).setMinWidth(50);
            TB_Listas.getColumnModel().getColumn(0).setPreferredWidth(50);
            TB_Listas.getColumnModel().getColumn(0).setMaxWidth(50);
            TB_Listas.getColumnModel().getColumn(2).setMinWidth(120);
            TB_Listas.getColumnModel().getColumn(2).setPreferredWidth(120);
            TB_Listas.getColumnModel().getColumn(2).setMaxWidth(120);
            TB_Listas.getColumnModel().getColumn(3).setMinWidth(120);
            TB_Listas.getColumnModel().getColumn(3).setPreferredWidth(120);
            TB_Listas.getColumnModel().getColumn(3).setMaxWidth(120);
        }

        BT_NovaLista.setText("NOVA LISTA");
        BT_NovaLista.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BT_NovaLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_NovaListaActionPerformed(evt);
            }
        });

        BT_EditarLista.setText("EDITAR LISTA");
        BT_EditarLista.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BT_EditarLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_EditarListaActionPerformed(evt);
            }
        });

        BT_DesativarLista.setText("DESATIVAR LISTA");
        BT_DesativarLista.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BT_DesativarLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_DesativarListaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PainelBackLayout = new javax.swing.GroupLayout(PainelBack);
        PainelBack.setLayout(PainelBackLayout);
        PainelBackLayout.setHorizontalGroup(
            PainelBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelTop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(PainelBackLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PainelBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelBackLayout.createSequentialGroup()
                        .addComponent(BT_NovaLista, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(BT_EditarLista, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(BT_DesativarLista, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PainelBackLayout.setVerticalGroup(
            PainelBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelBackLayout.createSequentialGroup()
                .addComponent(PainelTop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addGroup(PainelBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BT_NovaLista, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BT_EditarLista, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BT_DesativarLista, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(108, 108, 108)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
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

    private void BT_NovaListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_NovaListaActionPerformed
        ViewNovaLista vnl = new ViewNovaLista();
        vnl.setVisible(true);
    }//GEN-LAST:event_BT_NovaListaActionPerformed

    private void BT_EditarListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_EditarListaActionPerformed
        int indice = TB_Listas.getSelectedRow();
        if (indice >= 0) {
            
            
        } else {
            msg.Mensagem("Selecione uma linha da tabela!", "SisBike diz:", 1);
        }
    }//GEN-LAST:event_BT_EditarListaActionPerformed

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
            msg.Mensagem("Selecione uma linha da tabela!", "SisBike diz:", 1);
        }
    }//GEN-LAST:event_BT_DesativarListaActionPerformed

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
                new ViewListaCompra().setVisible(true);
            }
        });
    }

    Mensagem msg = new Mensagem();

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BT_DesativarLista;
    private javax.swing.JButton BT_EditarLista;
    private javax.swing.JButton BT_NovaLista;
    private javax.swing.JButton BT_Sair;
    private javax.swing.JLabel LB_Titulo;
    private javax.swing.JPanel PainelBack;
    private javax.swing.JPanel PainelTop;
    private javax.swing.JTable TB_Listas;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
