/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package netbanking;

import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author ASUS
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
    }

    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        BasePanel = new javax.swing.JPanel();
        SideBar = new javax.swing.JPanel();
        Logo = new javax.swing.JLabel();
        Heading = new javax.swing.JLabel();
        subHeading = new javax.swing.JLabel();
        CreateAccountBtn = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        ForgotPassBtn = new javax.swing.JPanel();
        ForgetPassBtn = new javax.swing.JLabel();
        LogoutBtn = new javax.swing.JPanel();
        ForgetPassBtn1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        loginProfile = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Username = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Password = new javax.swing.JPasswordField();
        SigninButton = new javax.swing.JButton();
        CloseButton = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BasePanel.setBackground(new java.awt.Color(255, 255, 255));

        SideBar.setBackground(new java.awt.Color(0, 51, 255));

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/pngwing.com.png"))); // NOI18N

        Heading.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 36)); // NOI18N
        Heading.setForeground(new java.awt.Color(255, 255, 255));
        Heading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Heading.setText("Sky Bank");

        subHeading.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        subHeading.setForeground(new java.awt.Color(255, 255, 255));
        subHeading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        subHeading.setText("India's Number One Online Bank");

        CreateAccountBtn.setBackground(new java.awt.Color(0, 0, 255));
        CreateAccountBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CreateAccountBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CreateAccountBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CreateAccountBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CreateAccountBtnMouseExited(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/white-addAccount.png"))); // NOI18N
        jLabel2.setText("Create Account");

        javax.swing.GroupLayout CreateAccountBtnLayout = new javax.swing.GroupLayout(CreateAccountBtn);
        CreateAccountBtn.setLayout(CreateAccountBtnLayout);
        CreateAccountBtnLayout.setHorizontalGroup(
            CreateAccountBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CreateAccountBtnLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        CreateAccountBtnLayout.setVerticalGroup(
            CreateAccountBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CreateAccountBtnLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(15, 15, 15))
        );

        ForgotPassBtn.setBackground(new java.awt.Color(0, 0, 255));
        ForgotPassBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ForgotPassBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ForgotPassBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ForgotPassBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ForgotPassBtnMouseExited(evt);
            }
        });

        ForgetPassBtn.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 24)); // NOI18N
        ForgetPassBtn.setForeground(new java.awt.Color(255, 255, 255));
        ForgetPassBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ForgetPassBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/white-forgetpass.png"))); // NOI18N
        ForgetPassBtn.setText("Forget Password");

        javax.swing.GroupLayout ForgotPassBtnLayout = new javax.swing.GroupLayout(ForgotPassBtn);
        ForgotPassBtn.setLayout(ForgotPassBtnLayout);
        ForgotPassBtnLayout.setHorizontalGroup(
            ForgotPassBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ForgotPassBtnLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(ForgetPassBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ForgotPassBtnLayout.setVerticalGroup(
            ForgotPassBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ForgotPassBtnLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ForgetPassBtn)
                .addGap(15, 15, 15))
        );

        LogoutBtn.setBackground(new java.awt.Color(0, 0, 255));
        LogoutBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LogoutBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogoutBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LogoutBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LogoutBtnMouseExited(evt);
            }
        });

        ForgetPassBtn1.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 24)); // NOI18N
        ForgetPassBtn1.setForeground(new java.awt.Color(255, 255, 255));
        ForgetPassBtn1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ForgetPassBtn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/white-close-icon.png"))); // NOI18N
        ForgetPassBtn1.setText("Exit");

        javax.swing.GroupLayout LogoutBtnLayout = new javax.swing.GroupLayout(LogoutBtn);
        LogoutBtn.setLayout(LogoutBtnLayout);
        LogoutBtnLayout.setHorizontalGroup(
            LogoutBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LogoutBtnLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(ForgetPassBtn1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        LogoutBtnLayout.setVerticalGroup(
            LogoutBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LogoutBtnLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ForgetPassBtn1)
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout SideBarLayout = new javax.swing.GroupLayout(SideBar);
        SideBar.setLayout(SideBarLayout);
        SideBarLayout.setHorizontalGroup(
            SideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SideBarLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(Logo, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                .addGap(163, 163, 163))
            .addGroup(SideBarLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(SideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Heading, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(subHeading))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(CreateAccountBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ForgotPassBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(LogoutBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        SideBarLayout.setVerticalGroup(
            SideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SideBarLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(Logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Heading, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(24, 24, 24)
                .addComponent(subHeading)
                .addGap(30, 30, 30)
                .addComponent(CreateAccountBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(ForgotPassBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(LogoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(491, 491, 491))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        loginProfile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/login-profile.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 255));
        jLabel3.setText("Welcome");

        Username.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        Username.setToolTipText("Please Enter Username");

        jLabel4.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jLabel4.setText("Username");

        jLabel5.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jLabel5.setText("Password");

        Password.setToolTipText("Please Enter Password");

        SigninButton.setBackground(new java.awt.Color(0, 0, 255));
        SigninButton.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 24)); // NOI18N
        SigninButton.setForeground(new java.awt.Color(255, 255, 255));
        SigninButton.setText("Signin");
        SigninButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(279, 279, 279)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(221, 221, 221)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4)
                            .addComponent(Username)
                            .addComponent(jLabel5)
                            .addComponent(Password, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(286, 286, 286)
                        .addComponent(SigninButton, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(258, 258, 258)
                .addComponent(loginProfile)
                .addContainerGap(273, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(loginProfile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(41, 41, 41)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Username, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(SigninButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(333, 333, 333))
        );

        CloseButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/close-btn.png"))); // NOI18N

        javax.swing.GroupLayout BasePanelLayout = new javax.swing.GroupLayout(BasePanel);
        BasePanel.setLayout(BasePanelLayout);
        BasePanelLayout.setHorizontalGroup(
            BasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BasePanelLayout.createSequentialGroup()
                .addComponent(SideBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CloseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        BasePanelLayout.setVerticalGroup(
            BasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SideBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(BasePanelLayout.createSequentialGroup()
                .addGroup(BasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CloseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BasePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BasePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CreateAccountBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CreateAccountBtnMouseEntered
        JPanel btn = CreateAccountBtn;
        isEnter(btn);
        
        
    }//GEN-LAST:event_CreateAccountBtnMouseEntered

    private void CreateAccountBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CreateAccountBtnMouseClicked
        // TODO add your handling code here:
        CreateAccount Ac = new CreateAccount();
        setVisible(false);
        
        Ac.setVisible(true);
        dispose();
    }//GEN-LAST:event_CreateAccountBtnMouseClicked

    private void CreateAccountBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CreateAccountBtnMouseExited
        // TODO add your handling code here:
        JPanel btn = CreateAccountBtn;
        isExit(btn);
    }//GEN-LAST:event_CreateAccountBtnMouseExited

    private void ForgotPassBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ForgotPassBtnMouseClicked
        // TODO add your handling code here:
         ForgotPassword FP = new ForgotPassword();
        setVisible(false);
        
        FP.setVisible(true);
        dispose();
    }//GEN-LAST:event_ForgotPassBtnMouseClicked

    private void ForgotPassBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ForgotPassBtnMouseEntered
        // TODO add your handling code here:
        JPanel btn = ForgotPassBtn;
        isEnter(btn);
    }//GEN-LAST:event_ForgotPassBtnMouseEntered

    private void ForgotPassBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ForgotPassBtnMouseExited
        // TODO add your handling code here:
        JPanel btn = ForgotPassBtn;
        isExit(btn);
    }//GEN-LAST:event_ForgotPassBtnMouseExited

    private void LogoutBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutBtnMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_LogoutBtnMouseClicked

    private void LogoutBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutBtnMouseEntered
        // TODO add your handling code here:
        JPanel btn = LogoutBtn;
        isEnter(btn);
    }//GEN-LAST:event_LogoutBtnMouseEntered

    private void LogoutBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutBtnMouseExited
        // TODO add your handling code here:
        JPanel btn = LogoutBtn;
        isExit(btn);
    }//GEN-LAST:event_LogoutBtnMouseExited
     void isEnter(JPanel btn){
        btn.setBackground( new Color(9, 50, 236));
    }
     
     void isExit(JPanel btn){
         btn.setBackground(new Color(0, 0, 225));
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BasePanel;
    private javax.swing.JButton CloseButton;
    private javax.swing.JPanel CreateAccountBtn;
    private javax.swing.JLabel ForgetPassBtn;
    private javax.swing.JLabel ForgetPassBtn1;
    private javax.swing.JPanel ForgotPassBtn;
    private javax.swing.JLabel Heading;
    private javax.swing.JLabel Logo;
    private javax.swing.JPanel LogoutBtn;
    private javax.swing.JPasswordField Password;
    private javax.swing.JPanel SideBar;
    private javax.swing.JButton SigninButton;
    private javax.swing.JTextField Username;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel loginProfile;
    private javax.swing.JLabel subHeading;
    // End of variables declaration//GEN-END:variables
}
