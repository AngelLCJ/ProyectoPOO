/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inicio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import javax.swing.JOptionPane;
import empleados .*;

/**
 *
 * @author Correa Juárez Ángel Leonardo
 * @author Cruz Martínez Raúl
 * @author Mendoza Bolaños Carlos Gabriel
 * @author Villanueva Corona Miguel Ángel
 * 
 * En esta clase lo que se hace  es que se ingresa al usuario si es que se 
 * encuantra registrado en la base de datos.
 */
public class iniciarSesion extends javax.swing.JFrame{
    /**
     * Creates new form iniciarSesion
     */
    public iniciarSesion() {
        initComponents();
    }
    /**
     * 
     * @param contra es la contraseña del usuario 
     * @param id es el nombre del usuario
     * @return un boolean true si es que encuentra al usuario en la base de datos.
     */
    public boolean buscarRegistro(String contra, String id){
        
        boolean confirmado2 = false;
        String usu0, usu3;
        id += ".txt";
        usu0 = "DatosTXT\\";
        usu3 = usu0 + id;
        
        File fichero = new File(usu3);      
        String path = fichero.getAbsolutePath();
        String usuario=contra;
        try
        {
            BufferedReader leer=new BufferedReader(new FileReader (path));
            String linea="";
            while((linea=leer.readLine())!=null)
            {
                if (linea.indexOf(usuario)!=-1)
                {
                    confirmado2 = true;
                }
            }
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }
        return confirmado2;
    }
    /**
     * 
     * @param id es el tipo del usuario
     * @param arch es el nombre del usuario
     * @return boolean true si es que encuantran que tipo de usuario es
     */
    public boolean buscarTipoUsu(String id, String arch){
        
        String usu0, usu3;
        boolean tipo = false;
        boolean G=false, A=false, V=false;
        String gerente, acomodador, vendedor;
        gerente = "Gerente";
        acomodador = "Acomodador";
        vendedor = "Vendedor";
        
        arch += ".txt";
        usu0 = "DatosTXT\\";
        usu3 = usu0 + arch;
       
        File fichero = new File(usu3);      
        String path = fichero.getAbsolutePath();
        String usuario=id;
        try
        {
            BufferedReader leer=new BufferedReader(new FileReader (path));
            String linea="";
            while((linea=leer.readLine())!=null)
            {
                if (linea.indexOf(usuario)!=-1)
                {
                    if(gerente.equals(linea)){
                        G = true;
                        tipo = G;
                    }if(acomodador.equals(linea)){
                        A = true;
                        tipo = A;
                    }if(vendedor.equals(linea)){
                        V = true;
                        tipo = V;
                    }
                }
            }
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }
        return tipo;
    }
    /**
     * 
     * @param usu es el nombre del usuario
     * Lo que se hace es buscar si existe el usuario en la base de datos.
     * @return un boolean true si es que encuentra el usuario.
     */
    public boolean  buscarArchivo(String usu){
       
        String usu0, usu3;
        usu += ".txt";
        usu0 = "DatosTXT\\";
        usu3 = usu0;
        
        File fichero = new File(usu3);      
        String path = fichero.getAbsolutePath();

        String files;
        boolean confirmado = false;
        File folder = new File(path);
        File[] listOfFiles = folder.listFiles();
        
        for (int i = 0; i < listOfFiles.length; i++){

            if (listOfFiles[i].isFile()){
                files = listOfFiles[i].getName();
                if(files.equals(usu)){
                    confirmado = true;
                }
            }
        }
        return confirmado;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        pasword = new javax.swing.JPasswordField();
        Usuario = new javax.swing.JTextField();
        aceptar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Ingrese su usuario:");

        jLabel3.setText("Contraseña:");

        pasword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paswordActionPerformed(evt);
            }
        });

        Usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsuarioActionPerformed(evt);
            }
        });
        Usuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                UsuarioKeyTyped(evt);
            }
        });

        aceptar.setText("Aceptar");
        aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pasword, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                    .addComponent(Usuario))
                .addContainerGap(57, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(aceptar)
                .addGap(71, 71, 71))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(pasword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(aceptar)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsuarioActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_UsuarioActionPerformed

    private void paswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_paswordActionPerformed
    /**
     * @param evt 
     * Lo que se hace es las llamadas a las funciones buscarArchivo y 
     * buscarRegistro para ver si estos coninciden en la base de datos si es así
     * se le permite el acceso de lo contrario no podrá ingresar.
     */
    private void aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarActionPerformed
        // TODO add your handling code here:

        String id, contraseña, gerente, acomodador, vendedor;
        gerente = "Gerente";
        acomodador = "Acomodador";
        vendedor = "Vendedor";
        id = Usuario.getText();
        contraseña = pasword.getText().toString();
        if (Usuario.getText().equals("") || pasword.getText().equals("")){
           javax.swing.JOptionPane.showMessageDialog(this,
                   "Debe llenar todos los campos \n","AVISO!",javax.swing.JOptionPane.INFORMATION_MESSAGE);
            Usuario.requestFocus();
        }else{
            if(buscarArchivo(id) && buscarRegistro(contraseña, id)){
                this.setVisible(false);
                //
                if(buscarTipoUsu(gerente,id)){
                    JOptionPane.showMessageDialog(rootPane, "Bienvenido Gerente");
                    Gerente llamada1 = new Gerente();
                    llamada1.Gerente(id);
                }if(buscarTipoUsu(acomodador,id)){
                    JOptionPane.showMessageDialog(rootPane, "Bienvenido Acomodador");
                    Acomodador llamada2 = new Acomodador();
                    llamada2.Acomodador();
                }if(buscarTipoUsu(vendedor,id)){
                    JOptionPane.showMessageDialog(rootPane, "Bienvenido Vendedor");
                    Vendedor llamada3 = new Vendedor();
                    llamada3.Vendedor(id);
                }
            }else{
                JOptionPane.showMessageDialog(rootPane, "Contraseña o Usuario incorrectos");
            }
        }        
    }//GEN-LAST:event_aceptarActionPerformed
    /**
     *
     * @param evt 
     * Lo que hacemos es que evitimaos que usuario solo ponga letras y no números
     * o espacios en blanco.
     */
    private void UsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_UsuarioKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if((c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && (c < ' ' || c > ' ')){
            evt.consume();
        }
    }//GEN-LAST:event_UsuarioKeyTyped

    /**
     * @param args the command line arguments
     * 
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
            java.util.logging.Logger.getLogger(iniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(iniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(iniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(iniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new iniciarSesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Usuario;
    private javax.swing.JButton aceptar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField pasword;
    // End of variables declaration//GEN-END:variables
}
