package ExamenLab;

import java.io.IOException;

public class PSNCrearUser extends javax.swing.JFrame {

    PSNUsers psn = new PSNUsers();
    
    public PSNCrearUser() throws IOException{
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Titulo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        UsernameTxT = new javax.swing.JLabel();
        Username = new javax.swing.JTextField();
        AceptarBtn = new javax.swing.JButton();
        VolverBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Titulo.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Titulo.setText("Play Station Network");

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setText("Crear usuario");

        UsernameTxT.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        UsernameTxT.setText("Nombre de usuario");

        Username.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N

        AceptarBtn.setText("Aceptar");
        AceptarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AceptarBtnActionPerformed(evt);
            }
        });

        VolverBtn.setText("Volver");
        VolverBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(88, 88, 88)
                                .addComponent(Titulo))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(142, 142, 142)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(123, 123, 123)
                                .addComponent(UsernameTxT))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addComponent(Username, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(AceptarBtn)))
                        .addGap(0, 70, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(VolverBtn)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(Titulo)
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addComponent(UsernameTxT)
                .addGap(28, 28, 28)
                .addComponent(Username, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(AceptarBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(VolverBtn)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AceptarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AceptarBtnActionPerformed
        String username = Username.getText();
        if(username!=null){
            if(!username.equals("")){
                try{
                    psn.addUser(username);
                    PSNMain psnmain = new PSNMain();
                    psnmain.setVisible(true);
                    this.dispose();
                }catch(IOException e){
                    
                }
            }
        }
    }//GEN-LAST:event_AceptarBtnActionPerformed

    private void VolverBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverBtnActionPerformed
        try{
            PSNMain psnmain = new PSNMain();
            psnmain.setVisible(true);
            this.dispose();
        }catch(IOException e){
                    
        }
    }//GEN-LAST:event_VolverBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AceptarBtn;
    private javax.swing.JLabel Titulo;
    private javax.swing.JTextField Username;
    private javax.swing.JLabel UsernameTxT;
    private javax.swing.JButton VolverBtn;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
