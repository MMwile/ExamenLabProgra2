package ExamenLab;

import java.io.IOException;
import java.util.ArrayList;
import javax.swing.DefaultListModel;

public class PSNMain extends javax.swing.JFrame {

    PSNUsers psn = new PSNUsers();
    DefaultListModel model = new DefaultListModel();
    
    public PSNMain() throws IOException{
        initComponents();
        setLocationRelativeTo(null);
        setListaUsuarios();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Titulo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListaUsuarios = new javax.swing.JList<>();
        AceptarBtn = new javax.swing.JButton();
        CrearUsuarioBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        Titulo.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        Titulo.setText("Play Station Network");

        jLabel1.setText("Bienvenido a Play Station Network");

        jLabel2.setText("Si ya tienes una cuenta, buscala clickea sobre ella y luego el boton de \"Aceptar\"");

        jLabel3.setText("Si aun no tienes una cuenta, da click en el boton de \"Crear usuario\"");

        ListaUsuarios.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        ListaUsuarios.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(ListaUsuarios);

        AceptarBtn.setText("Aceptar");
        AceptarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AceptarBtnActionPerformed(evt);
            }
        });

        CrearUsuarioBtn.setText("Crear usuario");
        CrearUsuarioBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearUsuarioBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(Titulo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(AceptarBtn)
                        .addGap(89, 89, 89)
                        .addComponent(CrearUsuarioBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(Titulo)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(37, 37, 37)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AceptarBtn)
                    .addComponent(CrearUsuarioBtn))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AceptarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AceptarBtnActionPerformed
        String user = ListaUsuarios.getSelectedValue();
        if(user!=null){
            if(!user.equals("No hay usuarios registrados")){
                try{
                    PSNMenuUser psnmenu = new PSNMenuUser(user);
                    psnmenu.setVisible(true);
                    this.dispose();
                }catch(IOException e){

                }
            }
        }
    }//GEN-LAST:event_AceptarBtnActionPerformed

    private void CrearUsuarioBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearUsuarioBtnActionPerformed
        try{
            PSNCrearUser psncrear = new PSNCrearUser();
            psncrear.setVisible(true);
            this.dispose();
        }catch(IOException e){
            
        }
    }//GEN-LAST:event_CrearUsuarioBtnActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try{
                new PSNMain().setVisible(true);
                }catch(IOException e){
                    
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AceptarBtn;
    private javax.swing.JButton CrearUsuarioBtn;
    private javax.swing.JList<String> ListaUsuarios;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    public void setListaUsuarios(){
        ArrayList<String> users = psn.getAllUsers();
        if(users!=null){
            for(int i=0;i<users.size();i++){
                model.addElement(users.get(i));
            }
        }else{
            model.addElement("No hay usuarios registrados");
        }
        ListaUsuarios.setModel(model);
    }
}
