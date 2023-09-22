package ExamenLab;

import java.io.IOException;
import javax.swing.JOptionPane;

public class PSNMenuUser extends javax.swing.JFrame {

    PSNUsers psn = new PSNUsers();
    String username;
    public PSNMenuUser(String username) throws IOException{
        this.username=username;
        initComponents();
        setLocationRelativeTo(null);
        UsernameTxT.setText(username);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        UsernameTxT = new javax.swing.JLabel();
        AgregarTrofeoBtn = new javax.swing.JButton();
        VerMiPerfilBtn = new javax.swing.JButton();
        BorrarCuentaBtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        UsernameTxT.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        UsernameTxT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        AgregarTrofeoBtn.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        AgregarTrofeoBtn.setText("Agregar Trofeo");
        AgregarTrofeoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarTrofeoBtnActionPerformed(evt);
            }
        });

        VerMiPerfilBtn.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        VerMiPerfilBtn.setText("Ver mi Perfil");
        VerMiPerfilBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerMiPerfilBtnActionPerformed(evt);
            }
        });

        BorrarCuentaBtn.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        BorrarCuentaBtn.setText("Borrar mi Cuenta");
        BorrarCuentaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrarCuentaBtnActionPerformed(evt);
            }
        });

        jButton1.setText("Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(AgregarTrofeoBtn)
                .addGap(135, 135, 135))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(UsernameTxT, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(VerMiPerfilBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(BorrarCuentaBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addComponent(jButton1)))
                .addContainerGap(85, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(UsernameTxT, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(AgregarTrofeoBtn)
                .addGap(34, 34, 34)
                .addComponent(VerMiPerfilBtn)
                .addGap(35, 35, 35)
                .addComponent(BorrarCuentaBtn)
                .addGap(53, 53, 53)
                .addComponent(jButton1)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BorrarCuentaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrarCuentaBtnActionPerformed
        int opcion = JOptionPane.showOptionDialog(null, "¿Está seguro que desea borrar su cuenta?", "Salir", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new String[]{"Si", "No"}, "No");
        if (opcion==JOptionPane.YES_OPTION){
            try{
                psn.deactivateUser(username);
                PSNMain psnmain = new PSNMain();
                psnmain.setVisible(true);
                this.dispose();
            }catch(IOException e){
                
            }
        }
    }//GEN-LAST:event_BorrarCuentaBtnActionPerformed

    private void AgregarTrofeoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarTrofeoBtnActionPerformed
        try{
            PSNAgregarTrofeo psnagregar = new PSNAgregarTrofeo(username);
            psnagregar.setVisible(true);
            this.dispose();
        }catch(IOException e){
            
        }
    }//GEN-LAST:event_AgregarTrofeoBtnActionPerformed

    private void VerMiPerfilBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerMiPerfilBtnActionPerformed
        try{
            PSNPlayerInfo psnplayer = new PSNPlayerInfo(username);
            psnplayer.setVisible(true);
            this.dispose();
        }catch(IOException e){
            
        }
    }//GEN-LAST:event_VerMiPerfilBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
            PSNMain psnmain = new PSNMain();
            psnmain.setVisible(true);
            this.dispose();
        }catch(IOException e){
                    
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgregarTrofeoBtn;
    private javax.swing.JButton BorrarCuentaBtn;
    private javax.swing.JLabel UsernameTxT;
    private javax.swing.JButton VerMiPerfilBtn;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
