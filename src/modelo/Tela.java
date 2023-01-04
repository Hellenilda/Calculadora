package modelo;

/**
 *
 * @author Hellenilda
 */
public class Tela extends javax.swing.JFrame {

    /**
     * Creates new form Tela
     */
    public Tela() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtCalculadora = new javax.swing.JLabel();
        num2 = new javax.swing.JTextField();
        num1 = new javax.swing.JTextField();
        btnSoma = new javax.swing.JButton();
        btnSubtracao = new javax.swing.JButton();
        btnDivisao = new javax.swing.JButton();
        btnMultiplicacao = new javax.swing.JButton();
        txtResultado = new javax.swing.JLabel();
        resultado = new javax.swing.JLabel();
        resultado1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtCalculadora.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtCalculadora.setText("Calculadora");

        num2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        num2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num2ActionPerformed(evt);
            }
        });

        num1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        num1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num1ActionPerformed(evt);
            }
        });

        btnSoma.setBackground(new java.awt.Color(0, 204, 51));
        btnSoma.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSoma.setForeground(new java.awt.Color(255, 255, 255));
        btnSoma.setText("+");
        btnSoma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnSomaMousePressed(evt);
            }
        });
        btnSoma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSomaActionPerformed(evt);
            }
        });

        btnSubtracao.setBackground(new java.awt.Color(0, 204, 51));
        btnSubtracao.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSubtracao.setForeground(new java.awt.Color(255, 255, 255));
        btnSubtracao.setText("-");
        btnSubtracao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnSubtracaoMousePressed(evt);
            }
        });
        btnSubtracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubtracaoActionPerformed(evt);
            }
        });

        btnDivisao.setBackground(new java.awt.Color(0, 204, 51));
        btnDivisao.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnDivisao.setForeground(new java.awt.Color(255, 255, 255));
        btnDivisao.setText("/");
        btnDivisao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnDivisaoMousePressed(evt);
            }
        });
        btnDivisao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivisaoActionPerformed(evt);
            }
        });

        btnMultiplicacao.setBackground(new java.awt.Color(0, 204, 51));
        btnMultiplicacao.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnMultiplicacao.setForeground(new java.awt.Color(255, 255, 255));
        btnMultiplicacao.setText("*");
        btnMultiplicacao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnMultiplicacaoMousePressed(evt);
            }
        });
        btnMultiplicacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplicacaoActionPerformed(evt);
            }
        });

        txtResultado.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtResultado.setText("Resultado:");

        resultado.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        resultado1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(txtCalculadora))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(num1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(num2, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(txtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(btnSoma)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSubtracao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMultiplicacao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDivisao)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 94, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(resultado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resultado1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(txtCalculadora)
                .addGap(24, 24, 24)
                .addComponent(num1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(num2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSoma)
                    .addComponent(btnSubtracao)
                    .addComponent(btnMultiplicacao)
                    .addComponent(btnDivisao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtResultado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(resultado, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(resultado1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void num2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_num2ActionPerformed

    private void num1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_num1ActionPerformed

    private void btnDivisaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivisaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDivisaoActionPerformed

    private void btnMultiplicacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiplicacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMultiplicacaoActionPerformed

    private void btnSomaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSomaMousePressed
        try {
            resultado1.setText("");
            String strNum1 = num1.getText();
            String strNum2 = num2.getText();

            int num1 = Integer.parseInt(strNum1);
            int num2 = Integer.parseInt(strNum2);

            int soma = num1 + num2;
            String strSoma = String.valueOf(soma);

            resultado.setText(strSoma);
        } catch(java.lang.NumberFormatException exception) {
            resultado.setText("");
            resultado1.setText("Digite algum NÚMERO!");
        }
    }//GEN-LAST:event_btnSomaMousePressed

    private void btnSomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSomaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSomaActionPerformed

    private void btnSubtracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubtracaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSubtracaoActionPerformed

    private void btnSubtracaoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSubtracaoMousePressed
        try{
            resultado1.setText("");
            String strNum1 = num1.getText();
            String strNum2 = num2.getText();

            int num1 = Integer.parseInt(strNum1);
            int num2 = Integer.parseInt(strNum2);

            int subtracao = num1 - num2;
            String strSubtracao = String.valueOf(subtracao);

            resultado.setText(strSubtracao);
        } catch(java.lang.NumberFormatException exception) {
            resultado.setText("");
            resultado1.setText("Digite algum NÚMERO!");
        }
    }//GEN-LAST:event_btnSubtracaoMousePressed

    private void btnDivisaoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDivisaoMousePressed
        try{
            resultado1.setText("");
            String strNum1 = num1.getText();
            String strNum2 = num2.getText();

            int num1 = Integer.parseInt(strNum1);
            int num2 = Integer.parseInt(strNum2);

            int divisao = (num1) / (num2);
            String strDivisao = String.valueOf(divisao);

            resultado.setText(strDivisao);
        } catch(java.lang.NumberFormatException exception) {
            resultado.setText("");
            resultado1.setText("Digite algum NÚMERO!");
        }
    }//GEN-LAST:event_btnDivisaoMousePressed

    private void btnMultiplicacaoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMultiplicacaoMousePressed
        try{
            resultado1.setText("");
            String strNum1 = num1.getText();
            String strNum2 = num2.getText();

            int num1 = Integer.parseInt(strNum1);
            int num2 = Integer.parseInt(strNum2);

            int multiplicacao = (num1) * (num2);
            String strMultiplicacao = String.valueOf(multiplicacao);

            resultado.setText(strMultiplicacao);
        } catch(java.lang.NumberFormatException exception) {
            resultado.setText("");
            resultado1.setText("Digite algum NÚMERO!");
        }
    }//GEN-LAST:event_btnMultiplicacaoMousePressed

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
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDivisao;
    private javax.swing.JButton btnMultiplicacao;
    private javax.swing.JButton btnSoma;
    private javax.swing.JButton btnSubtracao;
    private javax.swing.JTextField num1;
    private javax.swing.JTextField num2;
    private javax.swing.JLabel resultado;
    private javax.swing.JLabel resultado1;
    private javax.swing.JLabel txtCalculadora;
    private javax.swing.JLabel txtResultado;
    // End of variables declaration//GEN-END:variables
}
