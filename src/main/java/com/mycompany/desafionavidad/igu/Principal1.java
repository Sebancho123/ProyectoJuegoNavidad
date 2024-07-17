package com.mycompany.desafionavidad.igu;

import com.mycompany.desafionavidad.logica.Controladora;

public class Principal1 extends javax.swing.JFrame {

    Controladora control = new Controladora();
    String matriz[][] = new String[4][4];
    String emoji[] = new String[4];
    int cantEncontrados;

    public Principal1() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtMatrizEmoji = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        cmbEmoji = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txtCantEmoji = new javax.swing.JTextField();
        txtAcertoOno = new javax.swing.JTextField();
        btnGenerar = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel1.setText("Adivina");

        txtMatrizEmoji.setEditable(false);
        txtMatrizEmoji.setColumns(20);
        txtMatrizEmoji.setRows(5);
        jScrollPane1.setViewportView(txtMatrizEmoji);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("Matriz");

        cmbEmoji.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        cmbEmoji.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "⭐", "🎄", "🎅", "🎁" }));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setText("Elije las veses q crees q aparecera : ");

        txtAcertoOno.setEditable(false);
        txtAcertoOno.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtAcertoOno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAcertoOnoActionPerformed(evt);
            }
        });

        btnGenerar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnGenerar.setText("Generar");
        btnGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarActionPerformed(evt);
            }
        });

        btnReset.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(322, 322, 322)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 789, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cmbEmoji, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(txtCantEmoji, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(57, 57, 57)
                                .addComponent(txtAcertoOno, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnGenerar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap(97, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(13, 13, 13)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbEmoji, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtAcertoOno, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(txtCantEmoji, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGenerar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtAcertoOnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAcertoOnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAcertoOnoActionPerformed

    private void btnGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarActionPerformed

        txtMatrizEmoji.setFont(new java.awt.Font("Dialog", 1, 48));
        
        emoji[0] = "⭐";
        emoji[1] = "🎄";
        emoji[2] = "🎅";
        emoji[3] = "🎁";

        int cantidad = Integer.parseInt(txtCantEmoji.getText());

        matriz = control.generarMatriz();
        String emojiOri = "";
        for (int i = 0; i < 4; i++) {

            if (cmbEmoji.getItemAt(i).equals(emoji[i])) {
                emojiOri = String.valueOf(cmbEmoji.getItemAt(i));
                break;
            }

        }
        cantEncontrados = control.cantEncontrados(emojiOri, cantidad, matriz);
        
        
        if (cantidad == cantEncontrados) {
            
            txtAcertoOno.setText("acerto");
            System.out.println("llege aqui");
        } else {
            txtAcertoOno.setText("fallo");
        }

        dibujarMatriz(matriz);

    }//GEN-LAST:event_btnGenerarActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed

        txtAcertoOno.setText("");
        txtCantEmoji.setText("");
        txtMatrizEmoji.setText("");

    }//GEN-LAST:event_btnResetActionPerformed

    public void dibujarMatriz(String matriz[][]) {

        for (int f = 0; f < 4; f++) {
            for (int c = 0; c < 4; c++) {

                txtMatrizEmoji.setText(txtMatrizEmoji.getText() + matriz[f][c] + " ");

            }
            txtMatrizEmoji.setText(txtMatrizEmoji.getText() + "\n");

        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGenerar;
    private javax.swing.JButton btnReset;
    private javax.swing.JComboBox<String> cmbEmoji;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtAcertoOno;
    private javax.swing.JTextField txtCantEmoji;
    private javax.swing.JTextArea txtMatrizEmoji;
    // End of variables declaration//GEN-END:variables
}
