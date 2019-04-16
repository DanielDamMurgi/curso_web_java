/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cifrador_Archivos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import static java.util.Arrays.copyOf;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.CipherOutputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author usuario2
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form Ventana
     */
    public VentanaPrincipal() {
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

        buttonGroupAlgoritmo = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        rb128Bits = new javax.swing.JRadioButton();
        rb256Bits = new javax.swing.JRadioButton();
        rb3DES = new javax.swing.JRadioButton();
        txtClave = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btArchivo = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtArchivo = new javax.swing.JTextField();
        btCifrar = new javax.swing.JButton();
        btDescifrar = new javax.swing.JButton();
        btSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("CIFRADOR, DESCIFRADOR DE ARCHIVOS V 1.0");

        jLabel2.setText("ALGORITMO");

        buttonGroupAlgoritmo.add(rb128Bits);
        rb128Bits.setText("AES 128 Bits");
        rb128Bits.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb128BitsActionPerformed(evt);
            }
        });

        buttonGroupAlgoritmo.add(rb256Bits);
        rb256Bits.setText("AES 256 Bits");
        rb256Bits.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb256BitsActionPerformed(evt);
            }
        });

        buttonGroupAlgoritmo.add(rb3DES);
        rb3DES.setText("3DES");
        rb3DES.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb3DESActionPerformed(evt);
            }
        });

        jLabel3.setText("CLAVE DE CIFRADO");

        btArchivo.setText("ABRIR ARCHIVO");
        btArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btArchivoActionPerformed(evt);
            }
        });

        jLabel4.setText("ARCHIVO :");

        txtArchivo.setEditable(false);

        btCifrar.setText("CIFRAR");
        btCifrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCifrarActionPerformed(evt);
            }
        });

        btDescifrar.setText("DESCIFRAR");
        btDescifrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDescifrarActionPerformed(evt);
            }
        });

        btSalir.setText("SALIR");
        btSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rb128Bits)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtClave, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addGap(84, 84, 84))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rb256Bits)
                                    .addComponent(rb3DES))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btArchivo)
                                .addGap(74, 74, 74))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btCifrar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btDescifrar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(txtArchivo)))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb128Bits)
                    .addComponent(txtClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rb256Bits)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rb3DES))
                    .addComponent(btArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btCifrar, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                    .addComponent(btDescifrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(84, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rb128BitsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb128BitsActionPerformed
        // TODO add your handling code here:
        controlAlgoritmo = true;
        algoritmo = 1;
    }//GEN-LAST:event_rb128BitsActionPerformed

    private void btArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btArchivoActionPerformed
        // TODO add your handling code here:
        JFileChooser selecFichero = new JFileChooser();
        int fich = selecFichero.showDialog(jPanel1, "Escoge un fichero");

        if (fich == JFileChooser.APPROVE_OPTION) {

            if (selecFichero.getSelectedFile().isFile()) {
                controlFichero = true;
                fichero = selecFichero.getSelectedFile();
                txtArchivo.setText(fichero.getAbsolutePath());
            } else {
                JOptionPane.showMessageDialog(this, "Tienes que insertar un archivo");
            }
        }

    }//GEN-LAST:event_btArchivoActionPerformed

    private void btSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalirActionPerformed
        // TODO add your handling code here:
        int salir = JOptionPane.showConfirmDialog(this, "¿Deseas salir?", "Salida", JOptionPane.YES_NO_OPTION);

        if (salir == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_btSalirActionPerformed

    private void btCifrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCifrarActionPerformed
        // TODO add your handling code here:
        if (!controlAlgoritmo || txtClave.getText().isEmpty() || !controlFichero) {
            if (!controlAlgoritmo) {
                JOptionPane.showMessageDialog(this, "Seleciona un algoritmo");
            } else if (txtClave.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "No has puesto la clave");
            } else {
                JOptionPane.showMessageDialog(this, "No has insertado el fichero");
            }
        } else {

            clave = txtClave.getText().trim();
            cifrar(fichero, clave, Cipher.ENCRYPT_MODE);

            txtClave.setText("");
            txtArchivo.setText("");
        }
    }//GEN-LAST:event_btCifrarActionPerformed

    private void btDescifrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDescifrarActionPerformed
        // TODO add your handling code here:
        if (!controlAlgoritmo || txtClave.getText().isEmpty() || !controlFichero) {
            if (!controlAlgoritmo) {
                JOptionPane.showMessageDialog(this, "Seleciona un algoritmo");
            } else if (txtClave.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "No has puesto la clave");
            } else {
                JOptionPane.showMessageDialog(this, "No has insertado el fichero");
            }
        } else {
            JFileChooser selecFichNuevo = new JFileChooser();

            int fich = selecFichNuevo.showSaveDialog(this);

            if (fich == selecFichNuevo.APPROVE_OPTION) {

                ficheroNuevo = new File(selecFichNuevo.getSelectedFile().getAbsolutePath());
                clave = txtClave.getText().trim();
                cifrar(fichero, clave, Cipher.DECRYPT_MODE);

                txtClave.setText("");
                txtArchivo.setText("");

            }

        }
    }//GEN-LAST:event_btDescifrarActionPerformed

    private void rb256BitsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb256BitsActionPerformed
        // TODO add your handling code here:
        controlAlgoritmo = true;
        algoritmo = 2;
    }//GEN-LAST:event_rb256BitsActionPerformed

    private void rb3DESActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb3DESActionPerformed
        // TODO add your handling code here:
        controlAlgoritmo = true;
        algoritmo = 3;
    }//GEN-LAST:event_rb3DESActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btArchivo;
    private javax.swing.JButton btCifrar;
    private javax.swing.JButton btDescifrar;
    private javax.swing.JButton btSalir;
    private javax.swing.ButtonGroup buttonGroupAlgoritmo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton rb128Bits;
    private javax.swing.JRadioButton rb256Bits;
    private javax.swing.JRadioButton rb3DES;
    private javax.swing.JTextField txtArchivo;
    private javax.swing.JTextField txtClave;
    // End of variables declaration//GEN-END:variables

    private File fichero, ficheroNuevo;
    private String clave;
    private int algoritmo;
    private boolean controlAlgoritmo = false, controlFichero = false;
    private SecretKey secretKey;
    private Cipher cifrar;
    private byte[] auxPass;
    private byte[] pass;

// -----------------------------------------------------------------------------    
    private void cifrar(File fichero, String clave, int modo) {

        switch (algoritmo) {
            case 1: // AES 128 Bits

                AES(fichero, 16, clave, modo);
                break;

            case 2: // AES 256 Bits

                AES(fichero, 32, clave, modo);
                break;

            case 3: // 3DES
                DES(fichero, 24, clave, modo);
                break;
        }
    }

// -----------------------------------------------------------------------------
    private void AES(File fichero, int bytes, String clave, int modo) {
        try {
            auxPass = clave.getBytes("UTF8");
            pass = copyOf(auxPass, bytes);

            secretKey = new SecretKeySpec(pass, "AES");

            cifrar = Cipher.getInstance("AES/ECB/PKCS5padding");

            cifrar.init(modo, secretKey);

            if (modo == Cipher.ENCRYPT_MODE) {
                String f = fichero + ".aes";

                FileInputStream is = new FileInputStream(fichero);
                CipherOutputStream os = new CipherOutputStream(new FileOutputStream(f, true), cifrar);

                copiar(is, os);

                is.close();
                os.close();
                JOptionPane.showMessageDialog(this, "Cifrado el archivo " + f);
            } else {
                

                FileInputStream is = new FileInputStream(fichero);

                CipherOutputStream os = new CipherOutputStream(new FileOutputStream(ficheroNuevo, true), cifrar);

                copiar(is, os);

                is.close();
                os.close();

                JOptionPane.showMessageDialog(this, "Descifrado el archivo " + ficheroNuevo.getPath());
            }

        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoSuchPaddingException ex) {
            Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvalidKeyException ex) {
            Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void DES(File fichero, int bytes, String clave, int modo) {
        try {
            auxPass = clave.getBytes("UTF8");
            pass = copyOf(auxPass, bytes);

            secretKey = new SecretKeySpec(pass, "DESede");

            cifrar = Cipher.getInstance("DESede/ECB/PKCS5Padding");

            cifrar.init(modo, secretKey);

            if (modo == Cipher.ENCRYPT_MODE) {
                String f = fichero + ".des";

                FileInputStream is = new FileInputStream(fichero);
                CipherOutputStream os = new CipherOutputStream(new FileOutputStream(f, true), cifrar);

                copiar(is, os);

                is.close();
                os.close();
                JOptionPane.showMessageDialog(this, "Cifrado el archivo " + f);
            } else {
                

                FileInputStream is = new FileInputStream(fichero);

                CipherOutputStream os = new CipherOutputStream(new FileOutputStream(ficheroNuevo, true), cifrar);

                copiar(is, os);

                is.close();
                os.close();

                JOptionPane.showMessageDialog(this, "Descifrado el archivo " + ficheroNuevo.getPath());
            }

        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoSuchPaddingException ex) {
            Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvalidKeyException ex) {
            Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
// -----------------------------------------------------------------------------

    private static void copiar(InputStream is, OutputStream os) throws IOException {
        int i;
        byte[] b = new byte[1024];
        while ((i = is.read(b)) != -1) {
            os.write(b, 0, i);
        }
    }

}