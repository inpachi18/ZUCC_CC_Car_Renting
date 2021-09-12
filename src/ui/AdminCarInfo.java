/*
 * Created by JFormDesigner on Mon Sep 13 03:22:43 CST 2021
 */

package ui;

import control.CarManager;
import control.UserManager;
import model.BeanCar;
import model.BeanUser;
import util.BaseException;

import java.awt.*;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author inpachi
 */
public class AdminCarInfo extends JDialog {
    public AdminCarInfo(Frame f,String s,Boolean b) {
        super(f,s,b);
        initComponents();
    }

    private void quitActionPerformed() {
        this.setVisible(false);
    }

    private void searchActionPerformed() {
        try {
            String plate = this.plate.getText();
            BeanCar o = CarManager.SearchInfo(plate);
            this.type.setText(String.valueOf(o.getType()));
            this.branch.setText(String.valueOf(o.getBranch()));
            this.state.setText(o.getState());
        } catch (BaseException e1) {
            JOptionPane.showMessageDialog(null, e1.getMessage(), "错误", JOptionPane.ERROR_MESSAGE);
            return;
        }
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        label1 = new JLabel();
        plate = new JTextField();
        label2 = new JLabel();
        label3 = new JLabel();
        label4 = new JLabel();
        type = new JLabel();
        branch = new JLabel();
        state = new JLabel();
        quit = new JButton();
        search = new JButton();

        //======== this ========
        var contentPane = getContentPane();

        //---- label1 ----
        label1.setText("\u8f66\u724c\u53f7\uff1a");

        //---- label2 ----
        label2.setText("\u8f66\u578b\u7f16\u53f7\uff1a");

        //---- label3 ----
        label3.setText("\u7f51\u70b9\u7f16\u53f7\uff1a");

        //---- label4 ----
        label4.setText("\u72b6\u6001\uff1a");

        //---- quit ----
        quit.setText("\u79bb\u5f00");
        quit.addActionListener(e -> quitActionPerformed());

        //---- search ----
        search.setText("\u67e5\u8be2");
        search.addActionListener(e -> searchActionPerformed());

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(50, 50, 50)
                            .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                .addComponent(type, GroupLayout.PREFERRED_SIZE, 230, GroupLayout.PREFERRED_SIZE)
                                .addGroup(contentPaneLayout.createParallelGroup()
                                    .addGroup(contentPaneLayout.createSequentialGroup()
                                        .addComponent(label1)
                                        .addGap(54, 54, 54)
                                        .addComponent(plate, GroupLayout.PREFERRED_SIZE, 230, GroupLayout.PREFERRED_SIZE))
                                    .addGroup(contentPaneLayout.createSequentialGroup()
                                        .addComponent(label3)
                                        .addGap(32, 32, 32)
                                        .addComponent(branch, GroupLayout.PREFERRED_SIZE, 230, GroupLayout.PREFERRED_SIZE))
                                    .addGroup(contentPaneLayout.createSequentialGroup()
                                        .addComponent(label4)
                                        .addGap(76, 76, 76)
                                        .addComponent(state, GroupLayout.PREFERRED_SIZE, 230, GroupLayout.PREFERRED_SIZE))
                                    .addComponent(label2))))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(89, 89, 89)
                            .addComponent(quit)
                            .addGap(45, 45, 45)
                            .addComponent(search)))
                    .addContainerGap(54, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(30, 30, 30)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(label1)
                        .addComponent(plate, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addComponent(label2))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(type, GroupLayout.PREFERRED_SIZE, 6, GroupLayout.PREFERRED_SIZE)))
                    .addGap(12, 12, 12)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(label3)
                        .addComponent(branch))
                    .addGap(12, 12, 12)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(label4)
                        .addComponent(state))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(quit)
                        .addComponent(search))
                    .addGap(52, 52, 52))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JLabel label1;
    private JTextField plate;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JLabel type;
    private JLabel branch;
    private JLabel state;
    private JButton quit;
    private JButton search;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
