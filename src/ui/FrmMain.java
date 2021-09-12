/*
 * Created by JFormDesigner on Sun Sep 12 09:22:13 CST 2021
 */

package ui;

import control.StfManager;
import control.UserManager;

import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author inpachi
 */
public class FrmMain extends JFrame {
    public FrmMain() {
        FrmLogin dlgLogin = new FrmLogin(this, "登陆", true);
        dlgLogin.setVisible(true);
        initComponents();

        this.setVisible(true);
        this.menu1.setVisible(false);
        this.menu2.setVisible(false);
        this.menu3.setVisible(false);

        if (UserManager.currentUser != null) {
            this.menu1.setVisible(true);
        }
        if (StfManager.currentStf != null) {
            this.menu2.setVisible(true);
            if (StfManager.currentStf.getBranch() == 0) {
                this.menu3.setVisible(true);
            }
        }


    }


    // 用户个人信息管理
    private void menuItem53ActionPerformed() {
        UserInfo info = new UserInfo(this, "个人信息", true);
        info.setVisible(true);
    }

    private void menuItem2ActionPerformed() {
        ChangeUserPassword CUP = new ChangeUserPassword(this, "修改密码", true);
        CUP.setVisible(true);
    }

    private void menuItem3ActionPerformed() {
        ChangeUserInfo CUI = new ChangeUserInfo(this, "修改个人信息", true);
        CUI.setVisible(true);
    }

    //员工自行修改密码
    private void menuItem10ActionPerformed() {
        ChangeStaffPassWord CSP = new ChangeStaffPassWord(this, "修改密码", true);
        CSP.setVisible(true);
    }

    //管理员管理用户信息
    //直接添加用户
    private void menuItem26ActionPerformed(ActionEvent e) {
        AdminUserAdd AUA = new AdminUserAdd(this, "添加用户", true);
        AUA.setVisible(true);
    }

    //查看用户列表
    private void menuItem29ActionPerformed() {
        // TODO add your code here
    }

    //查看用户信息
    private void menuItem23ActionPerformed() {
        AdminUserInfo AUI = new AdminUserInfo(this, "查询用户信息", true);
        AUI.setVisible(true);
    }

    //修改信息
    private void menuItem24ActionPerformed() {
        AdminChangeUserInfo ACUI = new AdminChangeUserInfo(this, "修改用户信息", true);
        ACUI.setVisible(true);
    }

    //删除用户
    private void menuItem25ActionPerformed() {
        UserDelete UD = new UserDelete(this, "删除用户", true);
        UD.setVisible(true);
    }


    //管理员管理员工信息
    //新增员工
    private void menuItem27ActionPerformed() {
        AdminStfAdd ASA = new AdminStfAdd(this, "新增员工", true);
        ASA.setVisible(true);
    }
    //查询员工信息
    private void menuItem28ActionPerformed() {
        AdminStfInfo ASI=new AdminStfInfo(this,"查询员工信息",true);
        ASI.setVisible(true);
    }
    //修改员工信息
    private void menuItem31ActionPerformed() {
        // TODO add your code here
    }


    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        menuBar1 = new JMenuBar();
        menu1 = new JMenu();
        menu4 = new JMenu();
        menuItem53 = new JMenuItem();
        menuItem2 = new JMenuItem();
        menuItem3 = new JMenuItem();
        menu5 = new JMenu();
        menuItem4 = new JMenuItem();
        menuItem5 = new JMenuItem();
        menuItem8 = new JMenuItem();
        menuItem6 = new JMenuItem();
        menuItem7 = new JMenuItem();
        menuItem9 = new JMenuItem();
        menu2 = new JMenu();
        menu6 = new JMenu();
        menuItem10 = new JMenuItem();
        menu7 = new JMenu();
        menuItem12 = new JMenuItem();
        menuItem13 = new JMenuItem();
        menuItem14 = new JMenuItem();
        menuItem15 = new JMenuItem();
        menu8 = new JMenu();
        menuItem16 = new JMenuItem();
        menuItem17 = new JMenuItem();
        menuItem18 = new JMenuItem();
        menu9 = new JMenu();
        menuItem19 = new JMenuItem();
        menuItem20 = new JMenuItem();
        menu3 = new JMenu();
        menu11 = new JMenu();
        menu12 = new JMenu();
        menuItem26 = new JMenuItem();
        menuItem29 = new JMenuItem();
        menuItem23 = new JMenuItem();
        menuItem24 = new JMenuItem();
        menuItem25 = new JMenuItem();
        menu13 = new JMenu();
        menuItem27 = new JMenuItem();
        menuItem30 = new JMenuItem();
        menuItem28 = new JMenuItem();
        menuItem31 = new JMenuItem();
        menuItem32 = new JMenuItem();
        menu14 = new JMenu();
        menuItem33 = new JMenuItem();
        menuItem34 = new JMenuItem();
        menuItem38 = new JMenuItem();
        menuItem35 = new JMenuItem();
        menuItem36 = new JMenuItem();
        menuItem37 = new JMenuItem();
        menu15 = new JMenu();
        menuItem42 = new JMenuItem();
        menuItem39 = new JMenuItem();
        menuItem40 = new JMenuItem();
        menuItem41 = new JMenuItem();
        menu16 = new JMenu();
        menu17 = new JMenu();
        menuItem46 = new JMenuItem();
        menuItem43 = new JMenuItem();
        menuItem44 = new JMenuItem();
        menuItem45 = new JMenuItem();
        menuItem47 = new JMenuItem();
        menu18 = new JMenu();
        menuItem48 = new JMenuItem();
        menuItem49 = new JMenuItem();
        menuItem50 = new JMenuItem();
        menuItem51 = new JMenuItem();
        menuItem52 = new JMenuItem();

        //======== this ========
        var contentPane = getContentPane();

        //======== menuBar1 ========
        {

            //======== menu1 ========
            {
                menu1.setText("\u7528\u6237\u529f\u80fd");

                //======== menu4 ========
                {
                    menu4.setText("\u4e2a\u4eba\u4fe1\u606f");

                    //---- menuItem53 ----
                    menuItem53.setText("\u67e5\u770b\u4e2a\u4eba\u4fe1\u606f");
                    menuItem53.addActionListener(e -> menuItem53ActionPerformed());
                    menu4.add(menuItem53);

                    //---- menuItem2 ----
                    menuItem2.setText("\u4fee\u6539\u5bc6\u7801");
                    menuItem2.addActionListener(e -> menuItem2ActionPerformed());
                    menu4.add(menuItem2);

                    //---- menuItem3 ----
                    menuItem3.setText("\u4fee\u6539\u4e2a\u4eba\u4fe1\u606f");
                    menuItem3.addActionListener(e -> menuItem3ActionPerformed());
                    menu4.add(menuItem3);
                }
                menu1.add(menu4);

                //======== menu5 ========
                {
                    menu5.setText("\u79df\u8f66\u529f\u80fd");

                    //---- menuItem4 ----
                    menuItem4.setText("\u67e5\u8be2\u5f53\u524d\u53ef\u7528\u8f66\u8f86");
                    menu5.add(menuItem4);

                    //---- menuItem5 ----
                    menuItem5.setText("\u67e5\u8be2\u4f18\u60e0\u5238\u5217\u8868");
                    menu5.add(menuItem5);

                    //---- menuItem8 ----
                    menuItem8.setText("\u79df\u8f66\u72b6\u6001\u67e5\u8be2");
                    menu5.add(menuItem8);

                    //---- menuItem6 ----
                    menuItem6.setText("\u79df\u7528\u8f66\u8f86");
                    menu5.add(menuItem6);

                    //---- menuItem7 ----
                    menuItem7.setText("\u5f52\u8fd8\u8f66\u8f86");
                    menu5.add(menuItem7);

                    //---- menuItem9 ----
                    menuItem9.setText("\u5386\u53f2\u8ba2\u5355\u67e5\u8be2");
                    menu5.add(menuItem9);
                }
                menu1.add(menu5);
            }
            menuBar1.add(menu1);

            //======== menu2 ========
            {
                menu2.setText("\u5458\u5de5\u529f\u80fd");

                //======== menu6 ========
                {
                    menu6.setText("\u4e2a\u4eba\u4fe1\u606f\u7ba1\u7406");

                    //---- menuItem10 ----
                    menuItem10.setText("\u4fee\u6539\u5bc6\u7801");
                    menuItem10.addActionListener(e -> menuItem10ActionPerformed());
                    menu6.add(menuItem10);
                }
                menu2.add(menu6);

                //======== menu7 ========
                {
                    menu7.setText("\u7f51\u70b9\u8f66\u8f86\u7ba1\u7406");

                    //---- menuItem12 ----
                    menuItem12.setText("\u67e5\u8be2\u5f53\u524d\u7f51\u70b9\u8f66\u8f86");
                    menu7.add(menuItem12);

                    //---- menuItem13 ----
                    menuItem13.setText("\u67e5\u8be2\u5168\u90e8\u53ef\u7528\u8f66\u8f86");
                    menu7.add(menuItem13);

                    //---- menuItem14 ----
                    menuItem14.setText("\u7533\u8bf7\u8f66\u8f86\u8c03\u914d");
                    menu7.add(menuItem14);

                    //---- menuItem15 ----
                    menuItem15.setText("\u62a5\u5e9f\u8f66\u8f86");
                    menu7.add(menuItem15);
                }
                menu2.add(menu7);

                //======== menu8 ========
                {
                    menu8.setText("\u4f18\u60e0\u5238\u7ba1\u7406");

                    //---- menuItem16 ----
                    menuItem16.setText("\u4f18\u60e0\u5238\u5217\u8868\u67e5\u8be2");
                    menu8.add(menuItem16);

                    //---- menuItem17 ----
                    menuItem17.setText("\u4f18\u60e0\u5238\u6dfb\u52a0");
                    menu8.add(menuItem17);

                    //---- menuItem18 ----
                    menuItem18.setText("\u4f18\u60e0\u5238\u4fee\u6539");
                    menu8.add(menuItem18);
                }
                menu2.add(menu8);

                //======== menu9 ========
                {
                    menu9.setText("\u8ba2\u5355\u7ba1\u7406");

                    //---- menuItem19 ----
                    menuItem19.setText("\u8ba2\u5355\u67e5\u8be2");
                    menu9.add(menuItem19);

                    //---- menuItem20 ----
                    menuItem20.setText("\u8ba2\u5355\u4fee\u6539");
                    menu9.add(menuItem20);
                }
                menu2.add(menu9);
            }
            menuBar1.add(menu2);

            //======== menu3 ========
            {
                menu3.setText("\u7ba1\u7406\u5458\u529f\u80fd");

                //======== menu11 ========
                {
                    menu11.setText("\u4eba\u5458\u7ba1\u7406");

                    //======== menu12 ========
                    {
                        menu12.setText("\u7528\u6237\u7ba1\u7406");

                        //---- menuItem26 ----
                        menuItem26.setText("\u65b0\u589e\u7528\u6237");
                        menuItem26.addActionListener(e -> menuItem26ActionPerformed(e));
                        menu12.add(menuItem26);

                        //---- menuItem29 ----
                        menuItem29.setText("\u67e5\u770b\u7528\u6237\u5217\u8868");
                        menuItem29.addActionListener(e -> menuItem29ActionPerformed());
                        menu12.add(menuItem29);

                        //---- menuItem23 ----
                        menuItem23.setText("\u7528\u6237\u4fe1\u606f\u67e5\u8be2");
                        menuItem23.addActionListener(e -> menuItem23ActionPerformed());
                        menu12.add(menuItem23);

                        //---- menuItem24 ----
                        menuItem24.setText("\u7528\u6237\u4fe1\u606f\u4fee\u6539");
                        menuItem24.addActionListener(e -> menuItem24ActionPerformed());
                        menu12.add(menuItem24);

                        //---- menuItem25 ----
                        menuItem25.setText("\u7528\u6237\u4fe1\u606f\u5220\u9664");
                        menuItem25.addActionListener(e -> menuItem25ActionPerformed());
                        menu12.add(menuItem25);
                    }
                    menu11.add(menu12);

                    //======== menu13 ========
                    {
                        menu13.setText("\u5458\u5de5\u7ba1\u7406");

                        //---- menuItem27 ----
                        menuItem27.setText("\u65b0\u589e\u5458\u5de5");
                        menuItem27.addActionListener(e -> menuItem27ActionPerformed());
                        menu13.add(menuItem27);

                        //---- menuItem30 ----
                        menuItem30.setText("\u67e5\u770b\u5458\u5de5\u5217\u8868");
                        menu13.add(menuItem30);

                        //---- menuItem28 ----
                        menuItem28.setText("\u5458\u5de5\u4fe1\u606f\u67e5\u8be2");
                        menuItem28.addActionListener(e -> menuItem28ActionPerformed());
                        menu13.add(menuItem28);

                        //---- menuItem31 ----
                        menuItem31.setText("\u5458\u5de5\u4fe1\u606f\u4fee\u6539");
                        menuItem31.addActionListener(e -> menuItem31ActionPerformed());
                        menu13.add(menuItem31);

                        //---- menuItem32 ----
                        menuItem32.setText("\u5458\u5de5\u4fe1\u606f\u5220\u9664");
                        menu13.add(menuItem32);
                    }
                    menu11.add(menu13);
                }
                menu3.add(menu11);

                //======== menu14 ========
                {
                    menu14.setText("\u8f66\u8f86\u7ba1\u7406");

                    //---- menuItem33 ----
                    menuItem33.setText("\u65b0\u589e\u8f66\u8f86");
                    menu14.add(menuItem33);

                    //---- menuItem34 ----
                    menuItem34.setText("\u8f66\u8f86\u5217\u8868\u67e5\u8be2");
                    menu14.add(menuItem34);

                    //---- menuItem38 ----
                    menuItem38.setText("\u8f66\u8f86\u8c03\u914d");
                    menu14.add(menuItem38);

                    //---- menuItem35 ----
                    menuItem35.setText("\u8f66\u8f86\u4fe1\u606f\u4fee\u6539");
                    menu14.add(menuItem35);

                    //---- menuItem36 ----
                    menuItem36.setText("\u8f66\u8f86\u5220\u9664");
                    menu14.add(menuItem36);

                    //---- menuItem37 ----
                    menuItem37.setText("\u8f66\u8f86\u62a5\u5e9f");
                    menu14.add(menuItem37);
                }
                menu3.add(menu14);

                //======== menu15 ========
                {
                    menu15.setText("\u8ba2\u5355\u7ba1\u7406");

                    //---- menuItem42 ----
                    menuItem42.setText("\u8ba2\u5355\u5217\u8868");
                    menu15.add(menuItem42);

                    //---- menuItem39 ----
                    menuItem39.setText("\u8ba2\u5355\u67e5\u8be2");
                    menu15.add(menuItem39);

                    //---- menuItem40 ----
                    menuItem40.setText("\u8ba2\u5355\u4fee\u6539");
                    menu15.add(menuItem40);

                    //---- menuItem41 ----
                    menuItem41.setText("\u8ba2\u5355\u5220\u9664");
                    menu15.add(menuItem41);
                }
                menu3.add(menu15);

                //======== menu16 ========
                {
                    menu16.setText("\u4fc3\u9500\u7ba1\u7406");

                    //======== menu17 ========
                    {
                        menu17.setText("\u4f18\u60e0\u5238\u7ba1\u7406");

                        //---- menuItem46 ----
                        menuItem46.setText("\u4f18\u60e0\u5238\u521b\u5efa");
                        menu17.add(menuItem46);

                        //---- menuItem43 ----
                        menuItem43.setText("\u4f18\u60e0\u5238\u5217\u8868");
                        menu17.add(menuItem43);

                        //---- menuItem44 ----
                        menuItem44.setText("\u4f18\u60e0\u5238\u67e5\u8be2");
                        menu17.add(menuItem44);

                        //---- menuItem45 ----
                        menuItem45.setText("\u4f18\u60e0\u5238\u4fee\u6539");
                        menu17.add(menuItem45);

                        //---- menuItem47 ----
                        menuItem47.setText("\u4f18\u60e0\u5238\u5220\u9664");
                        menu17.add(menuItem47);
                    }
                    menu16.add(menu17);

                    //======== menu18 ========
                    {
                        menu18.setText("\u9650\u65f6\u4fc3\u9500\u7ba1\u7406");

                        //---- menuItem48 ----
                        menuItem48.setText("\u9650\u65f6\u4fc3\u9500\u521b\u5efa");
                        menu18.add(menuItem48);

                        //---- menuItem49 ----
                        menuItem49.setText("\u9650\u65f6\u4fc3\u9500\u5217\u8868");
                        menu18.add(menuItem49);

                        //---- menuItem50 ----
                        menuItem50.setText("\u9650\u65f6\u4fc3\u9500\u67e5\u8be2");
                        menu18.add(menuItem50);

                        //---- menuItem51 ----
                        menuItem51.setText("\u9650\u65f6\u4fc3\u9500\u7ba1\u7406");
                        menu18.add(menuItem51);

                        //---- menuItem52 ----
                        menuItem52.setText("\u9650\u65f6\u4fc3\u9500\u5220\u9664");
                        menu18.add(menuItem52);
                    }
                    menu16.add(menu18);
                }
                menu3.add(menu16);
            }
            menuBar1.add(menu3);
        }
        setJMenuBar(menuBar1);

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGap(0, 1741, Short.MAX_VALUE)
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGap(0, 1050, Short.MAX_VALUE)
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JMenuBar menuBar1;
    private JMenu menu1;
    private JMenu menu4;
    private JMenuItem menuItem53;
    private JMenuItem menuItem2;
    private JMenuItem menuItem3;
    private JMenu menu5;
    private JMenuItem menuItem4;
    private JMenuItem menuItem5;
    private JMenuItem menuItem8;
    private JMenuItem menuItem6;
    private JMenuItem menuItem7;
    private JMenuItem menuItem9;
    private JMenu menu2;
    private JMenu menu6;
    private JMenuItem menuItem10;
    private JMenu menu7;
    private JMenuItem menuItem12;
    private JMenuItem menuItem13;
    private JMenuItem menuItem14;
    private JMenuItem menuItem15;
    private JMenu menu8;
    private JMenuItem menuItem16;
    private JMenuItem menuItem17;
    private JMenuItem menuItem18;
    private JMenu menu9;
    private JMenuItem menuItem19;
    private JMenuItem menuItem20;
    private JMenu menu3;
    private JMenu menu11;
    private JMenu menu12;
    private JMenuItem menuItem26;
    private JMenuItem menuItem29;
    private JMenuItem menuItem23;
    private JMenuItem menuItem24;
    private JMenuItem menuItem25;
    private JMenu menu13;
    private JMenuItem menuItem27;
    private JMenuItem menuItem30;
    private JMenuItem menuItem28;
    private JMenuItem menuItem31;
    private JMenuItem menuItem32;
    private JMenu menu14;
    private JMenuItem menuItem33;
    private JMenuItem menuItem34;
    private JMenuItem menuItem38;
    private JMenuItem menuItem35;
    private JMenuItem menuItem36;
    private JMenuItem menuItem37;
    private JMenu menu15;
    private JMenuItem menuItem42;
    private JMenuItem menuItem39;
    private JMenuItem menuItem40;
    private JMenuItem menuItem41;
    private JMenu menu16;
    private JMenu menu17;
    private JMenuItem menuItem46;
    private JMenuItem menuItem43;
    private JMenuItem menuItem44;
    private JMenuItem menuItem45;
    private JMenuItem menuItem47;
    private JMenu menu18;
    private JMenuItem menuItem48;
    private JMenuItem menuItem49;
    private JMenuItem menuItem50;
    private JMenuItem menuItem51;
    private JMenuItem menuItem52;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
