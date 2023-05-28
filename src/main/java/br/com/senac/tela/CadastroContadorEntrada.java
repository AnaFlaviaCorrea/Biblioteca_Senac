/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senac.tela;

import br.com.senac.dao.ContadorEntradaDao;
import br.com.senac.dao.ContadorEntradaDaoImpl;
import br.com.senac.dao.HibernateUtil;
import javax.swing.JOptionPane;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import br.com.senac.entidade.ContadorEntrada;
import java.util.Date;

/**
 *
 * @author ana.correa8
 */
public class CadastroContadorEntrada extends javax.swing.JFrame {

    int contador = 0;
    private ContadorEntradaDao contadorDao = new ContadorEntradaDaoImpl();
    private Session sessao;
    private ContadorEntrada count;
    private Date data = new Date();

    // private List<TipoAtendimento> atendimentos;
    public CadastroContadorEntrada() {
        initComponents();

    }

    public CadastroContadorEntrada(ContadorEntrada count) {
        initComponents();
        this.count = count;
//        btSalvar.setText("Alterar");
//        lb_titulo.setText("Alterar Usuário");
//        carregarAlteracaoUsuario(usuario);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lb_titulo = new javax.swing.JLabel();
        lb_contador = new javax.swing.JLabel();
        btVisitantes = new javax.swing.JRadioButton();
        lb_contador1 = new javax.swing.JLabel();
        qtdVisitantes = new javax.swing.JTextField();
        btSalvar = new javax.swing.JButton();
        btEntrada = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Usuário");

        jPanel1.setBackground(new java.awt.Color(247, 139, 31));
        jPanel1.setPreferredSize(new java.awt.Dimension(525, 468));

        lb_titulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lb_titulo.setForeground(new java.awt.Color(0, 85, 148));
        lb_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_titulo.setText("Contador Entrada");

        lb_contador.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lb_contador.setForeground(new java.awt.Color(0, 85, 148));
        lb_contador.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_contador.setText("Contador: ");

        btVisitantes.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btVisitantes.setForeground(new java.awt.Color(0, 85, 148));
        btVisitantes.setText("Visitantes");

        lb_contador1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lb_contador1.setForeground(new java.awt.Color(0, 85, 148));
        lb_contador1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_contador1.setText("Insira o número de visitantes:");

        btSalvar.setBackground(new java.awt.Color(0, 85, 148));
        btSalvar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btSalvar.setForeground(new java.awt.Color(255, 255, 255));
        btSalvar.setText("Salvar");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        btEntrada.setBackground(new java.awt.Color(0, 85, 148));
        btEntrada.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btEntrada.setForeground(new java.awt.Color(255, 255, 255));
        btEntrada.setText("Visitante");
        btEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEntradaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_contador1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lb_contador, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btVisitantes)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(qtdVisitantes, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btVisitantes)
                    .addComponent(lb_contador)
                    .addComponent(btEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_contador1)
                    .addComponent(qtdVisitantes, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(75, 75, 75)
                .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(93, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed

        try {
            sessao = HibernateUtil.abrirConexao();
            count = contadorDao.contemAberturaDataCadastro(sessao);

            if (count == null) {
                count = new ContadorEntrada();
                if (btVisitantes.isSelected()) {
                    count.setQuantidade(1);

                } else if (qtdVisitantes.isEnabled()) {
                    String contado = qtdVisitantes.getText();
                    count.setQuantidade(Integer.parseInt(contado));

                }
                count.setData_cadastro(data);

            } else {
                
                 if (btVisitantes.isSelected()) {
                    count.setQuantidade(count.getQuantidade()+ 1);

                } else if (qtdVisitantes.isEnabled()) {
                    String contado = qtdVisitantes.getText();
                    count.setQuantidade(Integer.parseInt(contado)+ count.getQuantidade());

                }
            }

            contadorDao.salvarOuAlterar(count, sessao);

            JOptionPane.showMessageDialog(null, "Visitante contabilizados");
            
        } catch (HibernateException e) {
            System.out.println("Erro ao contabilizar visitante "+ e.getMessage());
        } finally {
            sessao.close();
        }

    }//GEN-LAST:event_btSalvarActionPerformed

    private void btEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEntradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btEntradaActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroContadorEntrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroContadorEntrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroContadorEntrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroContadorEntrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroContadorEntrada().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEntrada;
    private javax.swing.JButton btSalvar;
    private javax.swing.JRadioButton btVisitantes;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lb_contador;
    private javax.swing.JLabel lb_contador1;
    private javax.swing.JLabel lb_titulo;
    private javax.swing.JTextField qtdVisitantes;
    // End of variables declaration//GEN-END:variables
}
