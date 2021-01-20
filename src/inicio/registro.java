/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inicio;
import caja.Ticket;
import empleados.Gerente;
import java.io.IOException;
import java.io.File;
import java.util.Formatter;
import javax.swing.JOptionPane;
import zorzalMusic.*;



/**
 *
 * @author angel
 */
public class registro extends javax.swing.JFrame {
    
    String barra = File.separator;
    String crearUbicacion = System.getProperty("user.dir")+barra+"DatosTXT"+barra;

    /**
     * Creates new form registro
     */
    public registro() {
        initComponents();
    }
    
    private void crear(){
        String archivo = nombre.getText()+".txt";
        File crearUbic = new File(crearUbicacion);
        File crearArchi = new File(crearUbicacion + archivo);
        
        if(nombre.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "No existe usuario");
        }else{
            try{
                if(crearArchi.exists()){
                    JOptionPane.showMessageDialog(rootPane, "El usuario ya se encuentra registrado");
                }else{
                    crearUbic.mkdirs();
                    Formatter crearForma = new Formatter(crearUbicacion + archivo);
                    crearForma.format("%s\r\n%s\r\n%s\r\n","Usuario = "+nombre.getText(), 
                            "Tipo = \n"+tipoUsuario.getSelectedItem().toString(), 
                            "Contraseña = "+contra2.getText().toString());
                    crearForma.close();
                    JOptionPane.showMessageDialog(rootPane, "Registro Exitoso");
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(rootPane, "Registro Incorrecto");
            }
        }
       /* Gerente usuario = new Gerente();
        usuario.envioArchivo(crearArchi);*/
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tipoUsuario = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        contra1 = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        contra2 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 204, 255));

        tipoUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gerente", "Vendedor", "Acomodador" }));
        tipoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoUsuarioActionPerformed(evt);
            }
        });

        jLabel1.setText("Tipo de Usuario:");

        jLabel2.setText("Nombre:");

        jLabel3.setText("Contraseña:");

        nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreActionPerformed(evt);
            }
        });
        nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombreKeyTyped(evt);
            }
        });

        contra1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contra1ActionPerformed(evt);
            }
        });

        jLabel5.setText("Confirmar contraseña:");

        contra2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contra2ActionPerformed(evt);
            }
        });

        jButton1.setText("Aceptar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nombre)
                    .addComponent(tipoUsuario, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(contra1)
                    .addComponent(contra2))
                .addContainerGap(165, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(181, 181, 181))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(contra1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(contra2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(jButton1)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tipoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tipoUsuarioActionPerformed

    private void contra1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contra1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contra1ActionPerformed

    private void contra2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contra2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contra2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String cadena1, cadena2, cadena3, cadena4;
        boolean a;
        
        cadena1 = nombre.getText();
        cadena2 = contra1.getText().toString();
        cadena3 = contra2.getText().toString();
        cadena4 = tipoUsuario.getSelectedItem().toString();
        if (((nombre.getText().equals("") || contra1.getText().equals("")) || contra2.getText().equals("")) || (tipoUsuario.getSelectedItem().equals(null))) {
            
            javax.swing.JOptionPane.showMessageDialog(this,"Debe llenar todos los campos \n","AVISO!",javax.swing.JOptionPane.INFORMATION_MESSAGE);
            nombre.requestFocus();
        }else{
            if(cadena2.equals(cadena3)){
                this.setVisible(false);
                crear();
            }else{
                javax.swing.JOptionPane.showMessageDialog(this, "Las contraseñas no coinciden \n", "AVISO!",javax.swing.JOptionPane.INFORMATION_MESSAGE);
            }            
        } 
        nombre.setText("");
        contra2.setText("");
        contra1.setText("");
        tipoUsuario.setSelectedItem("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void nombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if((c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && (c < ' ' || c > ' ')){
            evt.consume();
        }
    }//GEN-LAST:event_nombreKeyTyped

    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreActionPerformed

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
            java.util.logging.Logger.getLogger(registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField contra1;
    private javax.swing.JPasswordField contra2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField nombre;
    private javax.swing.JComboBox<String> tipoUsuario;
    // End of variables declaration//GEN-END:variables
}
