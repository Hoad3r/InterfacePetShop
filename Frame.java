/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfacevisual;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JPanel;


/**
 *
 * @author detup
 */
public class Frame extends javax.swing.JFrame {
Branco layoutbranco = new Branco();
    /**
     * Creates new form Frame
     */
    public void setconfpanel(JPanel p){
        p.setSize(2000,1024);
        p.setLocation(416,0 );
        panelPrincipal.add(p);
        panelPrincipal.revalidate();
        panelPrincipal.repaint();
    }
    
    public Frame() {
        initComponents();
        setconfpanel(layoutbranco);
    }   

    @SuppressWarnings("unchecked")
    class RoundedPanel extends JPanel
    {
        
        private int cornerRadius = 15;
        public RoundedPanel(int radius) {
            super();
            cornerRadius = radius;
        }
        @Override
        protected void paintComponent (Graphics g) {
            super.paintComponent (g);
            Dimension arcs = new Dimension (cornerRadius, cornerRadius);
            int width= getWidth();
            int height = getHeight();
            Graphics2D graphics = (Graphics2D) g;
            graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            //Draws the rounded panel with borders.
            graphics.setColor(Color.WHITE);
            graphics.fillRoundRect(0, 0, width-1, height-1, arcs.width, arcs.height); //paint background
           
        }
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jSpinner1 = new javax.swing.JSpinner();
        panelPrincipal = new javax.swing.JPanel();
        usuariobutton = new javax.swing.JButton();
        petsbutton = new javax.swing.JButton();
        vendasbutton = new javax.swing.JButton();
        servicosbutton = new javax.swing.JButton();
        tiposdeservicobutton = new javax.swing.JButton();
        sairbutton = new javax.swing.JButton();
        cuidadoresbutton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 =  new RoundedPanel(200);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 0, 0));
        setPreferredSize(new java.awt.Dimension(1440, 1024));
        setResizable(false);
        setSize(new java.awt.Dimension(1440, 1024));

        panelPrincipal.setBackground(new java.awt.Color(51, 0, 0));
        panelPrincipal.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        panelPrincipal.setForeground(new java.awt.Color(255, 255, 255));
        panelPrincipal.setPreferredSize(new java.awt.Dimension(1440, 1024));

        usuariobutton.setBackground(new java.awt.Color(51, 0, 0));
        usuariobutton.setForeground(new java.awt.Color(255, 255, 255));
        usuariobutton.setText("Usuarios");
        usuariobutton.setBorderPainted(false);
        usuariobutton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        usuariobutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuariobuttonActionPerformed(evt);
            }
        });

        petsbutton.setBackground(new java.awt.Color(51, 0, 0));
        petsbutton.setForeground(new java.awt.Color(255, 255, 255));
        petsbutton.setText("Pets");
        petsbutton.setBorderPainted(false);
        petsbutton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        petsbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                petsbuttonActionPerformed(evt);
            }
        });

        vendasbutton.setBackground(new java.awt.Color(51, 0, 0));
        vendasbutton.setForeground(new java.awt.Color(255, 255, 255));
        vendasbutton.setText("Vendas");
        vendasbutton.setBorderPainted(false);
        vendasbutton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        vendasbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vendasbuttonActionPerformed(evt);
            }
        });

        servicosbutton.setBackground(new java.awt.Color(51, 0, 0));
        servicosbutton.setForeground(new java.awt.Color(255, 255, 255));
        servicosbutton.setText("Serviços");
        servicosbutton.setBorderPainted(false);
        servicosbutton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        servicosbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                servicosbuttonActionPerformed(evt);
            }
        });

        tiposdeservicobutton.setBackground(new java.awt.Color(51, 0, 0));
        tiposdeservicobutton.setForeground(new java.awt.Color(255, 255, 255));
        tiposdeservicobutton.setText("Tipos de Serviços");
        tiposdeservicobutton.setBorderPainted(false);
        tiposdeservicobutton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        tiposdeservicobutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tiposdeservicobuttonActionPerformed(evt);
            }
        });

        sairbutton.setBackground(new java.awt.Color(102, 51, 0));
        sairbutton.setForeground(new java.awt.Color(255, 255, 255));
        sairbutton.setText("Sair da sessão");
        sairbutton.setBorderPainted(false);
        sairbutton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        sairbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairbuttonActionPerformed(evt);
            }
        });

        cuidadoresbutton.setBackground(new java.awt.Color(51, 0, 0));
        cuidadoresbutton.setForeground(new java.awt.Color(255, 255, 255));
        cuidadoresbutton.setText("Cuidadores");
        cuidadoresbutton.setBorderPainted(false);
        cuidadoresbutton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        cuidadoresbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuidadoresbuttonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Olá, Usuario!");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Bem-vindo!");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("______________________________________");

        jPanel3.setBackground(new java.awt.Color(51, 0, 0));
        jPanel3.setForeground(new java.awt.Color(51, 0, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(jLabel2))
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(usuariobutton, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(cuidadoresbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(petsbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(vendasbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(tiposdeservicobutton, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(servicosbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(sairbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(1071, Short.MAX_VALUE))
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jLabel1)
                .addGap(6, 6, 6)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jLabel3)
                .addGap(72, 72, 72)
                .addComponent(usuariobutton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(cuidadoresbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(petsbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(vendasbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(tiposdeservicobutton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(servicosbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(sairbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void tiposdeservicobuttonActionPerformed(java.awt.event.ActionEvent evt) {                                                     
        // TODO add your handling code here:
    }                                                    

    private void cuidadoresbuttonActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        // TODO add your handling code here:
    }                                                

    private void usuariobuttonActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
        Usuarios layoutusuario = new Usuarios();
        panelPrincipal.remove(layoutbranco);
        setconfpanel(layoutusuario);
        
    }                                             
    
    private void petsbuttonActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    private void vendasbuttonActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
    }                                            

    private void servicosbuttonActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
    }                                              

    private void sairbuttonActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

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
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               
                new Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton cuidadoresbutton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JButton petsbutton;
    private javax.swing.JButton sairbutton;
    private javax.swing.JButton servicosbutton;
    private javax.swing.JButton tiposdeservicobutton;
    private javax.swing.JButton usuariobutton;
    private javax.swing.JButton vendasbutton;
    // End of variables declaration                   
}
