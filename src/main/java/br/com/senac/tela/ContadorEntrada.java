/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senac.tela;

import br.com.senac.dao.HibernateUtil;
import br.com.senac.dao.TipoAtendimentoDaoImpl;
import br.com.senac.dao.UsuarioDao;
import br.com.senac.dao.UsuarioDaoImpl;
import br.com.senac.entidade.TipoAtendimento;
import br.com.senac.entidade.Usuario;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import br.com.senac.dao.TipoAtendimentoDao;

/**
 *
 * @author silvio.junior
 */
public class ContadorEntrada extends javax.swing.JFrame {

    int contador = 0;
    private UsuarioDao usuarioDao = new UsuarioDaoImpl();
    private Session sessao;
    private Usuario usuario;
    private List<TipoAtendimento> atendimentos;

    public ContadorEntrada() {
        initComponents();

    }

    public ContadorEntrada(Usuario usuario) {
        initComponents();
//        btSalvar.setText("Alterar");
//        lb_titulo.setText("Alterar Usuário");
//        carregarAlteracaoUsuario(usuario);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb_titulo = new javax.swing.JLabel();
        lb_contador = new javax.swing.JLabel();
        btSalvar = new javax.swing.JButton();
        btVisitantes = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Usuário");

        lb_titulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lb_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_titulo.setText("Contador Entrada");

        lb_contador.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lb_contador.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_contador.setText("Contador: ");

        btSalvar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btSalvar.setText("Salvar");
        btSalvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btSalvarMouseClicked(evt);
            }
        });

        btVisitantes.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btVisitantes.setText("Visitantes");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lb_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lb_contador, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(btVisitantes))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lb_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_contador)
                    .addComponent(btVisitantes))
                .addGap(48, 48, 48)
                .addComponent(btSalvar)
                .addGap(0, 71, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btSalvarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSalvarMouseClicked
        // TODO add your handling code here:
        sessao = HibernateUtil.abrirConexao();
        if (btVisitantes.isSelected()) {
            contador++;
        }
        btSalvar.setText("" + contador);
        JOptionPane.showMessageDialog(null,"Visitante contabilizados");
        sessao.close();
    }//GEN-LAST:event_btSalvarMouseClicked

//    private boolean validarFormulario() {
//        String nome = varNome.getText().trim();
//        if (validarCampoMenor3Caracter(nome)) {
//            JOptionPane.showMessageDialog(null, "Preencha o nome corretamente!");
//            return false;
//        }
//        String login = varLogin.getText().trim();
//        if (validarCampoMenor3Caracter(login)) {
//            JOptionPane.showMessageDialog(null, "Preencha o login corretamente!");
//            return false;
//        }
//
//        int indice = varComboPerfil.getSelectedIndex();
//        if (indice == 0) {
//            JOptionPane.showMessageDialog(null, "Escolha um Perfil!");
//            return false;
//        }
//        return true;
//    }
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
            java.util.logging.Logger.getLogger(ContadorEntrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ContadorEntrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ContadorEntrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ContadorEntrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ContadorEntrada().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btSalvar;
    private javax.swing.JRadioButton btVisitantes;
    private javax.swing.JLabel lb_contador;
    private javax.swing.JLabel lb_titulo;
    // End of variables declaration//GEN-END:variables
}
