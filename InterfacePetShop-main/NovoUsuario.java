/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package interfacevisual;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author detup
 */
public class NovoUsuario extends javax.swing.JPanel {
    /**
     * Creates new form NewJPanel
     */ 
    public void setconfpanel(JPanel p){
        
        p.setSize(1024,1024);
        p.setLocation(0,0 ); // setlocation 0 p ser no meio da tela
        CadastroUsuarioPanel.add(p);
        CadastroUsuarioPanel.revalidate();
        CadastroUsuarioPanel.repaint();
    }
    
    public NovoUsuario(){
        initComponents();
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        CadastroUsuarioPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        senhacadastrousuario = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        cadastronomeusuario = new javax.swing.JFormattedTextField();
        emailcadastrousuario = new javax.swing.JFormattedTextField();
        cadastrarusuariobutton = new javax.swing.JButton();

        CadastroUsuarioPanel.setBackground(new java.awt.Color(255, 255, 255));
        CadastroUsuarioPanel.setPreferredSize(new java.awt.Dimension(1024, 1024));

        jLabel3.setText("Nome");

        jLabel4.setText("Senha");

        jLabel5.setText("E-mail");

        senhacadastrousuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senhacadastrousuarioActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Cadastrar Novo Usuário");

        cadastronomeusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastronomeusuarioActionPerformed(evt);
            }
        });

        emailcadastrousuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailcadastrousuarioActionPerformed(evt);
            }
        });

        cadastrarusuariobutton.setBackground(new java.awt.Color(0, 102, 204));
        cadastrarusuariobutton.setForeground(new java.awt.Color(255, 255, 255));
        cadastrarusuariobutton.setText("Cadastrar");
        cadastrarusuariobutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarusuariobuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CadastroUsuarioPanelLayout = new javax.swing.GroupLayout(CadastroUsuarioPanel);
        CadastroUsuarioPanel.setLayout(CadastroUsuarioPanelLayout);
        CadastroUsuarioPanelLayout.setHorizontalGroup(
            CadastroUsuarioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CadastroUsuarioPanelLayout.createSequentialGroup()
                .addContainerGap(386, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(279, 279, 279))
            .addGroup(CadastroUsuarioPanelLayout.createSequentialGroup()
                .addGap(360, 360, 360)
                .addGroup(CadastroUsuarioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(CadastroUsuarioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(senhacadastrousuario, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cadastronomeusuario)
                    .addComponent(emailcadastrousuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
                    .addGroup(CadastroUsuarioPanelLayout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(cadastrarusuariobutton, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        CadastroUsuarioPanelLayout.setVerticalGroup(
            CadastroUsuarioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CadastroUsuarioPanelLayout.createSequentialGroup()
                .addGap(239, 239, 239)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cadastronomeusuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emailcadastrousuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(senhacadastrousuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(cadastrarusuariobutton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(407, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(CadastroUsuarioPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(CadastroUsuarioPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>                        
    

    private void senhacadastrousuarioActionPerformed(java.awt.event.ActionEvent evt) {                                                     
        // TODO add your handling code here:
    }                                                    

    private void cadastronomeusuarioActionPerformed(java.awt.event.ActionEvent evt) {                                                    
        // TODO add your handling code here:
    }                                                   

    private void emailcadastrousuarioActionPerformed(java.awt.event.ActionEvent evt) {                                                     
        // TODO add your handling code here:
    }                                                    

    private void cadastrarusuariobuttonActionPerformed(java.awt.event.ActionEvent evt) {                                                       
        // TODO add your handling code here:
         if(cadastronomeusuario.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Nome Invalido!");
        }else if(emailcadastrousuario.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Email Invalido!");
        }else if(senhacadastrousuario.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Senha Invalido!");
        }else{
            Usuarios layoutusuario = new Usuarios();
            JOptionPane.showMessageDialog(null,"Cadastrado com Sucesso!");
            layoutusuario.setEmail(emailcadastrousuario.getText()); 
            layoutusuario.setNome(cadastronomeusuario.getText());
            layoutusuario.refreshtable();
            CadastroUsuarioPanel.removeAll();
            setconfpanel(layoutusuario);   
        }
    }                                                      
    
    // Variables declaration - do not modify                     
    private javax.swing.JPanel CadastroUsuarioPanel;
    public javax.swing.JButton cadastrarusuariobutton;
    public javax.swing.JFormattedTextField cadastronomeusuario;
    public javax.swing.JFormattedTextField emailcadastrousuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JPasswordField senhacadastrousuario;
    // End of variables declaration                   
}