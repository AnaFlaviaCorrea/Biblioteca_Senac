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
 * @author ana.correa8
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
        icone_atendimento = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menu_cadastro = new javax.swing.JMenu();
        item_cad_usuario = new javax.swing.JMenuItem();
        menu_pesquisa = new javax.swing.JMenu();
        item_cad_atendimento = new javax.swing.JMenuItem();
        item_cad_tipoAtendimento = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

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

        icone_atendimento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/cad_cliente.png"))); // NOI18N
        icone_atendimento.setToolTipText("Novo Atendimento");
        icone_atendimento.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        icone_atendimento.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        icone_atendimento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                icone_atendimentoMouseClicked(evt);
            }
        });

        menu_cadastro.setText("Entrada");
        menu_cadastro.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        item_cad_usuario.setText("Contador Visitantes");
        item_cad_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_cad_usuarioActionPerformed(evt);
            }
        });
        menu_cadastro.add(item_cad_usuario);

        jMenuBar1.add(menu_cadastro);

        menu_pesquisa.setText("Cadastro Atendimento");
        menu_pesquisa.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        item_cad_atendimento.setText("Atendimento");
        item_cad_atendimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_cad_atendimento(evt);
            }
        });
        menu_pesquisa.add(item_cad_atendimento);

        item_cad_tipoAtendimento.setText("Cadastrar Tipo de Atendimento");
        item_cad_tipoAtendimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_cad_tipoAtendimentoActionPerformed(evt);
            }
        });
        menu_pesquisa.add(item_cad_tipoAtendimento);

        jMenuBar1.add(menu_pesquisa);

        jMenu1.setText("Relatórios");
        jMenu1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        jMenuItem1.setText("Entrada");
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Atendimentos");
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

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
                .addComponent(icone_atendimento)
                .addGap(225, 225, 225))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(varUsuarioLogado, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(icone_nova_entrada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(icone_atendimento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 213, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void icone_nova_entradaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icone_nova_entradaMouseClicked
        new CadastroContadorEntrada().setVisible(true);
    }//GEN-LAST:event_icone_nova_entradaMouseClicked

    private void item_cad_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_cad_usuarioActionPerformed
        // TODO add your handling code here:
        new CadastroContadorEntrada().setVisible(true);
    }//GEN-LAST:event_item_cad_usuarioActionPerformed

    private void item_cad_atendimento(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_cad_atendimento
            // TODO add your handling code here:
            new CadastroAtendimento().setVisible(true);
    }//GEN-LAST:event_item_cad_atendimento

    private void icone_atendimentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icone_atendimentoMouseClicked
          new CadastroAtendimento().setVisible(true);
    }//GEN-LAST:event_icone_atendimentoMouseClicked

    private void item_cad_tipoAtendimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_cad_tipoAtendimentoActionPerformed
        // TODO add your handling code here:
        new CadastroTipoAtendimento().setVisible(true);
    }//GEN-LAST:event_item_cad_tipoAtendimentoActionPerformed

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
    private javax.swing.JLabel icone_atendimento;
    private javax.swing.JLabel icone_nova_entrada;
    private javax.swing.JMenuItem item_cad_atendimento;
    private javax.swing.JMenuItem item_cad_tipoAtendimento;
    private javax.swing.JMenuItem item_cad_usuario;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenu menu_cadastro;
    private javax.swing.JMenu menu_pesquisa;
    private javax.swing.JLabel varUsuarioLogado;
    // End of variables declaration//GEN-END:variables
}
