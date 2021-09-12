/*
 * Created by JFormDesigner on Sun Sep 12 08:54:20 CST 2021
 */

package ui;

import control.StfManager;
import control.UserManager;
import util.BaseException;

import java.awt.*;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author inpachi
 */
public class FrmLogin extends JDialog {
    public FrmLogin(Frame f, String s, Boolean b) {
        super(f, s, b);
        initComponents();
    }

    private void btnregActionPerformed() {
        FrmRegister dlg=new FrmRegister(this,"注册",true);
                dlg.setVisible(true);
    }

    private void btnstfActionPerformed() {
        String name = this.UserID.getText();
        String pwd = new String(this.Pwd.getPassword());
        try {
            StfManager a = new StfManager();
            StfManager.currentStf = a.login(name,pwd);
        } catch (BaseException e1) {
            JOptionPane.showMessageDialog(null,e1.getMessage(),"错误",JOptionPane.ERROR_MESSAGE);
            return;
        }
        this.setVisible(false);
    }

    private void btnuserActionPerformed() {
        String name = this.UserID.getText();
        String pwd = new String(this.Pwd.getPassword());
        try {
            UserManager a = new UserManager();
            UserManager.currentUser = a.login(name,pwd);
        } catch (BaseException e1) {
            JOptionPane.showMessageDialog(null,e1.getMessage(),"错误",JOptionPane.ERROR_MESSAGE);
            return;
        }
        this.setVisible(false);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        Pwd = new JPasswordField();
        label5 = new JLabel();
        label4 = new JLabel();
        UserID = new JTextField();
        label1 = new JLabel();
        btnreg = new JButton();
        btnstf = new JButton();
        btnuser = new JButton();

        //======== this ========
        var contentPane = getContentPane();

        //---- label5 ----
        label5.setText("\u5bc6\u7801");

        //---- label4 ----
        label4.setText("\u7528\u6237\u540d");

        //---- label1 ----
        label1.setText("\u6b22\u8fce\u6765\u5230\u79df\u8f66\u7ba1\u7406\u7cfb\u7edf");
        label1.setHorizontalAlignment(SwingConstants.CENTER);

        //---- btnreg ----
        btnreg.setText("\u6ce8\u518c");
        btnreg.addActionListener(e -> btnregActionPerformed());

        //---- btnstf ----
        btnstf.setText("\u5458\u5de5\u767b\u9646");
        btnstf.addActionListener(e -> btnstfActionPerformed());

        //---- btnuser ----
        btnuser.setText("\u7528\u6237\u767b\u9646");
        btnuser.addActionListener(e -> btnuserActionPerformed());

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
                contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                                .addGroup(contentPaneLayout.createParallelGroup()
                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(label1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                                .addGroup(contentPaneLayout.createParallelGroup()
                                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                                                .addGap(38, 38, 38)
                                                                .addComponent(btnreg)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(btnstf)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(btnuser))
                                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                                                .addGap(51, 51, 51)
                                                                .addGroup(contentPaneLayout.createParallelGroup()
                                                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                                                                .addComponent(label4, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(18, 18, 18)
                                                                                .addComponent(UserID, GroupLayout.PREFERRED_SIZE, 282, GroupLayout.PREFERRED_SIZE))
                                                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                                                                .addComponent(label5, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(18, 18, 18)
                                                                                .addComponent(Pwd, GroupLayout.PREFERRED_SIZE, 282, GroupLayout.PREFERRED_SIZE)))))
                                                .addGap(0, 40, Short.MAX_VALUE)))
                                .addContainerGap())
        );
        contentPaneLayout.setVerticalGroup(
                contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(label1, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addGroup(contentPaneLayout.createParallelGroup()
                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                                .addGap(8, 8, 8)
                                                .addComponent(label4, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE))
                                        .addComponent(UserID, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(12, 12, 12)
                                .addGroup(contentPaneLayout.createParallelGroup()
                                        .addComponent(label5, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Pwd, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(46, 46, 46)
                                .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnreg)
                                        .addComponent(btnstf)
                                        .addComponent(btnuser))
                                .addContainerGap(66, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JPasswordField Pwd;
    private JLabel label5;
    private JLabel label4;
    private JTextField UserID;
    private JLabel label1;
    private JButton btnreg;
    private JButton btnstf;
    private JButton btnuser;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
