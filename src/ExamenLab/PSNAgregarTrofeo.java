package ExamenLab;

import java.io.IOException;
import javax.swing.JOptionPane;

public class PSNAgregarTrofeo extends javax.swing.JFrame {

    PSNUsers psn = new PSNUsers();
    String username;
    
    public PSNAgregarTrofeo(String username) throws IOException{
        this.username=username;
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        JuegoTxT = new javax.swing.JLabel();
        TrofeoTxT = new javax.swing.JLabel();
        TipoTxT = new javax.swing.JLabel();
        Juego = new javax.swing.JTextField();
        Trofeo = new javax.swing.JTextField();
        TipoCBx = new javax.swing.JComboBox<>();
        AceptarBtn = new javax.swing.JButton();
        VolverBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setText("Agregar Trofeo");

        JuegoTxT.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        JuegoTxT.setText("Juego");

        TrofeoTxT.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        TrofeoTxT.setText("Trofeo");

        TipoTxT.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        TipoTxT.setText("Tipo");

        Juego.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        Trofeo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        TipoCBx.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        TipoCBx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Platino", "Oro", "Plata", "Bronce" }));

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
                                .addGap(118, 118, 118)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(87, 87, 87)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(JuegoTxT)
                                    .addComponent(TrofeoTxT)
                                    .addComponent(TipoTxT))
                                .addGap(78, 78, 78)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TipoCBx, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Trofeo, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Juego, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(153, 153, 153)
                                .addComponent(AceptarBtn)))
                        .addGap(0, 80, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(VolverBtn)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel1)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JuegoTxT)
                    .addComponent(Juego, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TrofeoTxT)
                    .addComponent(Trofeo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TipoTxT)
                    .addComponent(TipoCBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(AceptarBtn)
                .addGap(13, 13, 13)
                .addComponent(VolverBtn)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AceptarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AceptarBtnActionPerformed
        String juego = Juego.getText();
        String trofeo = Trofeo.getText();
        String tipo = String.valueOf(TipoCBx.getSelectedItem());
        if(juego!=null && trofeo!=null && tipo!=null)
            try{
            switch (tipo){
                case "Platino":
                    psn.addTrophyTo(username, juego, trofeo, Trophy.PLATINO);
                    break;
                case "Oro":
                    psn.addTrophyTo(username, juego, trofeo, Trophy.ORO);
                    break;
                case "Plata":
                    psn.addTrophyTo(username, juego, trofeo, Trophy.PLATA);
                    break;
                case "Bronce":
                    psn.addTrophyTo(username, juego, trofeo, Trophy.BRONCE);
                    break;
            }
                System.out.println("xd");
            JOptionPane.showMessageDialog(null, "Se ha aregado el trofeo exitosamente", "Trofeo agregado", JOptionPane.INFORMATION_MESSAGE);
            PSNMenuUser psnmenu = new PSNMenuUser(username);
            psnmenu.setVisible(true);
            this.dispose();
            }catch(IOException e){
                
            }
    }//GEN-LAST:event_AceptarBtnActionPerformed

    private void VolverBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverBtnActionPerformed
        try{
            PSNMenuUser psnmenu = new PSNMenuUser(username);
            psnmenu.setVisible(true);
            this.dispose();
        }catch(IOException e){
            
        }
    }//GEN-LAST:event_VolverBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AceptarBtn;
    private javax.swing.JTextField Juego;
    private javax.swing.JLabel JuegoTxT;
    private javax.swing.JComboBox<String> TipoCBx;
    private javax.swing.JLabel TipoTxT;
    private javax.swing.JTextField Trofeo;
    private javax.swing.JLabel TrofeoTxT;
    private javax.swing.JButton VolverBtn;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
