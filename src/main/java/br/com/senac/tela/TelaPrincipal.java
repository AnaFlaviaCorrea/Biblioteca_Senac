/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senac.tela;

import br.com.senac.entidade.Atendimento;
import br.com.senac.entidade.Usuario;
import javax.swing.JOptionPane;

/**
 *
 * @author silvio.junior
 */
public class TelaPrincipal extends javax.swing.JFrame {

    private Usuario usuario;
    
    public TelaPrincipal() {
        initComponents();
    }
    
    public TelaPrincipal(Usuario usuario) {
        initComponents();
        this.usuario = usuario;   
        varUsuarioLogado.setText("Seja bem vindo " 
                                    + usuario.getNome());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        varUsuarioLogado = new javax.swing.JLabel();
        icone_nova_entrada = new javax.swing.JLabel();
        icone_cad_fornecedor = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menu_cadastro = new javax.swing.JMenu();
        item_cad_usuario = new javax.swing.JMenuItem();
        item_cad_perfil = new javax.swing.JMenuItem();
        menu_pesquisa = new javax.swing.JMenu();
        item_pesq_usuario = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Biblioteca Senac");

        icone_nova_entrada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/cad_usuario.png"))); // NOI18N
        icone_nova_entrada.setToolTipText("Nova Entrada");
        icone_nova_entrada.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        icone_nova_entrada.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        icone_nova_entrada.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                icone_nova_entradaMouseClicked(evt);
            }
        });

        icone_cad_fornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/cad_cliente.png"))); // NOI18N
        icone_cad_fornecedor.setToolTipText("Novo Atendimento");
        icone_cad_fornecedor.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        icone_cad_fornecedor.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        icone_cad_fornecedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                icone_cad_fornecedorMouseClicked(evt);
            }
        });

        menu_cadastro.setText("Entrada");

        item_cad_usuario.setText("Contador");
        item_cad_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_cad_usuarioActionPerformed(evt);
            }
        });
        menu_cadastro.add(item_cad_usuario);

        item_cad_perfil.setText("Gerar relatório");
        item_cad_perfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_cad_perfilActionPerformed(evt);
            }
        });
        menu_cadastro.add(item_cad_perfil);

        jMenuBar1.add(menu_cadastro);

        menu_pesquisa.setText("Cadastro atendimento");

        item_pesq_usuario.setText("Atendimento");
        item_pesq_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_pesq_usuarioActionPerformed(evt);
            }
        });
        menu_pesquisa.add(item_pesq_usuario);

        jMenuBar1.add(menu_pesquisa);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(varUsuarioLogado, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(icone_nova_entrada, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addComponent(icone_cad_fornecedor)
                .addGap(225, 225, 225))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(varUsuarioLogado, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(icone_nova_entrada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(icone_cad_fornecedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 216, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void icone_nova_entradaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icone_nova_entradaMouseClicked
        new ContadorEntrada().setVisible(true);
    }//GEN-LAST:event_icone_nova_entradaMouseClicked

    private void item_cad_perfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_cad_perfilActionPerformed
        new CadastroTipoAtendimento().setVisible(true);
    }//GEN-LAST:event_item_cad_perfilActionPerformed

    private void item_cad_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_cad_usuarioActionPerformed
        // TODO add your handling code here:
        new ContadorEntrada().setVisible(true);
    }//GEN-LAST:event_item_cad_usuarioActionPerformed

    private void item_pesq_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_pesq_usuarioActionPerformed
            // TODO add your handling code here:
    }//GEN-LAST:event_item_pesq_usuarioActionPerformed

    private void icone_cad_fornecedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icone_cad_fornecedorMouseClicked
       
    }//GEN-LAST:event_icone_cad_fornecedorMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                TelaPrincipal tela = new TelaPrincipal();
//                tela.setVisible(true);
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel icone_cad_fornecedor;
    private javax.swing.JLabel icone_nova_entrada;
    private javax.swing.JMenuItem item_cad_perfil;
    private javax.swing.JMenuItem item_cad_usuario;
    private javax.swing.JMenuItem item_pesq_usuario;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu menu_cadastro;
    private javax.swing.JMenu menu_pesquisa;
    private javax.swing.JLabel varUsuarioLogado;
    // End of variables declaration//GEN-END:variables
}
