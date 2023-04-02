package com.zak.main;

import com.zak.form2.FormChat;
import com.zak.form2.InternalChat;
import com.zak.form2.Form5;
import com.zak.form2.Form7;
import com.zak.form2.Form51;
import com.zak.form2.Form1;
import com.zak.form2.Form52;
import com.zak.form2.Form8;
import com.zak.form2.Form2;
import com.zak.form2.Form9;
import com.zak.form2.Form3;
import com.zak.form2.Form4;
import com.zak.form2.Form53;
import com.formdev.flatlaf.FlatDarculaLaf;
import com.formdev.flatlaf.FlatIntelliJLaf;
import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.extras.FlatAnimatedLafChange;
import com.zak.menu.EventMenu;
import com.zak.menu.MainForm;
import com.zak.menu.MenuItem;
import java.awt.Component;
import java.awt.EventQueue;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Main extends javax.swing.JFrame {
        public FormChat f=null;



    /**
     * Creates new form Main
     */
    public Main() {
        
        initComponents();
        
        
        menu.addEventMenuSelected(new EventMenu() {
            @Override
            public void mainMenuSelected(MainForm mainForm, int index, MenuItem menuItem) {
            }

            @Override
            public void subMenuSelected(MainForm mainForm, int index, int subMenuIndex, Component menuItem) {
                if(index == 0){
                   if(f!=null){
                        InternalChat ch = f.ch;
                    try {
                        ch.server.removeClient(ch.name);
                    } catch (RemoteException ex) {
                        System.out.println("Error: " + ex.getMessage());
                    }catch(Exception e){
                    System.err.println("No chat initialized");
                    }
                    }
                    if(subMenuIndex == 0){
                        mainForm.displayForm(new Form1());
                    }else if(subMenuIndex == 1){
                        mainForm.displayForm(new Form2());
                    }else if(subMenuIndex == 2){
                        mainForm.displayForm(new Form3());
                    }else{
                        mainForm.displayForm(new Form4());
                    }
                }else if(index == 1){
                    if(f!=null){
                        InternalChat ch = f.ch;
                    try {
                        ch.server.removeClient(ch.name);
                    } catch (RemoteException ex) {
                        System.out.println("Error: " + ex.getMessage());
                    }catch(Exception e){
                    System.err.println("No chat initialized");
                    }
                    }
                    
                    if(subMenuIndex == 0){
                        mainForm.displayForm(new Form5());
                    }else if(subMenuIndex == 1){
                        mainForm.displayForm(new Form51());
                    }
                    else if(subMenuIndex==2){
                        mainForm.displayForm(new Form52());
                    }
                    else if(subMenuIndex==3){
                        mainForm.displayForm(new Form53());
                    }
                }else if(index == 2){
                    if(f!=null){
                            InternalChat ch = f.ch;
                        try {
                            ch.server.removeClient(ch.name);
                        } catch (RemoteException ex) {
                            System.out.println("Error: " + ex.getMessage());
                        }catch(Exception e){
                        System.err.println("No chat initialized");
                        }
                    }
                    if(subMenuIndex == 0){
                        mainForm.displayForm(new Form7());
                    }else if(subMenuIndex == 1){
                        mainForm.displayForm(new Form8());
                    }else{
                        mainForm.displayForm(new Form9());
                    }
                }else{
                    f = new FormChat();
                    mainForm.displayForm(f);
                    menuItem.setVisible(false);

                    
                    
                    
                    
                    
                }
            }
        });
        menu.setSelectedIndex(0); 
        this.addWindowListener(new java.awt.event.WindowAdapter() {    
            @Override
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                
                
                try{
                    InternalChat ch = f.ch;
                    if (JOptionPane.showConfirmDialog(new JFrame(), 
                    "Are you sure you want to close this chat ?", "Close chat?", 
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION){
                    try {
                        ch.server.removeClient(ch.name);
                    } catch (RemoteException ex) {
                        System.out.println("Error: " + ex.getMessage());
                    }
                    System.exit(0);
                }else{
                   
                }
                }catch(Exception e){
                    System.err.println("No chat initialized");
                }
                
                if(f == null){
                    System.exit(0);
                }
            }
        });
        
    }
    
   
    
    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        subMenu = new com.zak.menu.SubMenuPanel();
        menu = new com.zak.menu.Menu();
        lbLogo = new javax.swing.JLabel();
        mainMenuItem1 = new com.zak.menu.MenuItem();
        mainMenuItem3 = new com.zak.menu.MenuItem();
        mainMenuItem2 = new com.zak.menu.MenuItem();
        mainMenuItem4 = new com.zak.menu.MenuItem();
        mainForm = new com.zak.menu.MainForm();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        chDarkMode = new javax.swing.JCheckBoxMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        subMenu.setBorder(javax.swing.BorderFactory.createEmptyBorder(80, 1, 1, 1));

        menu.setMainForm(mainForm);
        menu.setSubMenuPanel(subMenu);

        lbLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/zak/icon/logo.png"))); // NOI18N
        lbLogo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbLogo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        menu.add(lbLogo);

        mainMenuItem1.setBackground(new java.awt.Color(255, 45, 185));
        mainMenuItem1.setForeground(new java.awt.Color(75, 0, 243));
        mainMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/zak/icon/menu1.png"))); // NOI18N
        mainMenuItem1.setMenuIcon(new javax.swing.AbstractListModel() {
            String[] strings = { "com/zak/icon/s1_1.png", "com/zak/icon/s1_2.png", "com/zak/icon/s1_3.png", "com/zak/icon/s1_4.png", "com/zak/icon/s1_5.png", "com/zak/icon/s1_6.png", "com/zak/icon/s1_7.png" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        mainMenuItem1.setMenuModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Addition", "Substraction", "Multiplication", "Division" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        mainMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainMenuItem1ActionPerformed(evt);
            }
        });
        menu.add(mainMenuItem1);

        mainMenuItem3.setBackground(new java.awt.Color(0, 217, 64));
        mainMenuItem3.setForeground(new java.awt.Color(74, 74, 74));
        mainMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/zak/icon/menu2.png"))); // NOI18N
        mainMenuItem3.setMenuIcon(new javax.swing.AbstractListModel() {
            String[] strings = { "com/zak/icon/s2_1.png", "com/zak/icon/s2_2.png", "com/zak/icon/s2_3.png", "com/zak/icon/s2_4.png", "com/zak/icon/s2_5.png" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        mainMenuItem3.setMenuModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Addition", "Substraction", "Multiplication", "Division" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        mainMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainMenuItem3ActionPerformed(evt);
            }
        });
        menu.add(mainMenuItem3);

        mainMenuItem2.setBackground(new java.awt.Color(102, 102, 255));
        mainMenuItem2.setForeground(new java.awt.Color(0, 153, 153));
        mainMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/zak/icon/menu3.png"))); // NOI18N
        mainMenuItem2.setMenuIcon(new javax.swing.AbstractListModel() {
            String[] strings = { "com/zak/icon/s3_1.png", "com/zak/icon/s3_2.png", "com/zak/icon/s3_3.png" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        mainMenuItem2.setMenuModel(new javax.swing.AbstractListModel() {
            String[] strings = { "GrayScale", "Sepia", "Negative" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        mainMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainMenuItem2ActionPerformed(evt);
            }
        });
        menu.add(mainMenuItem2);

        mainMenuItem4.setBackground(new java.awt.Color(8, 191, 196));
        mainMenuItem4.setForeground(new java.awt.Color(3, 66, 178));
        mainMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/zak/icon/menu4.png"))); // NOI18N
        mainMenuItem4.setMenuIcon(new javax.swing.AbstractListModel() {
            String[] strings = { "com/zak/icon/s4_1.png", "com/zak/icon/s4_2.png", "com/zak/icon/s4_3.png" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        mainMenuItem4.setMenuModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Open Group Chat" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        menu.add(mainMenuItem4);

        jMenu3.setText("Options");

        chDarkMode.setText("Dark Mode");
        chDarkMode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chDarkModeActionPerformed(evt);
            }
        });
        jMenu3.add(chDarkMode);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(subMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mainForm, javax.swing.GroupLayout.DEFAULT_SIZE, 792, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(mainForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(menu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 577, Short.MAX_VALUE)
                    .addComponent(subMenu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    private void mainMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mainMenuItem1ActionPerformed

    private void mainMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainMenuItem3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mainMenuItem3ActionPerformed

    private void mainMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainMenuItem2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mainMenuItem2ActionPerformed

    private void chDarkModeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chDarkModeActionPerformed
        if (chDarkMode.isSelected()) {
            EventQueue.invokeLater(() -> {
                FlatAnimatedLafChange.showSnapshot();
                FlatDarculaLaf.setup();
                FlatLaf.updateUI();
                FlatAnimatedLafChange.hideSnapshotWithAnimation();
            });
        } else {
            EventQueue.invokeLater(() -> {
                FlatAnimatedLafChange.showSnapshot();
                FlatIntelliJLaf.setup();
                FlatLaf.updateUI();
                FlatAnimatedLafChange.hideSnapshotWithAnimation();
            });
        }
    }//GEN-LAST:event_chDarkModeActionPerformed

    public static void main(String args[]) {
        FlatLaf.registerCustomDefaultsSource("com.zak.style");
        FlatIntelliJLaf.setup();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }
    
    public void setMainForm(com.zak.menu.MainForm m){
        mainForm.displayForm(m);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBoxMenuItem chDarkMode;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lbLogo;
    private com.zak.menu.MainForm mainForm;
    private com.zak.menu.MenuItem mainMenuItem1;
    private com.zak.menu.MenuItem mainMenuItem2;
    private com.zak.menu.MenuItem mainMenuItem3;
    private com.zak.menu.MenuItem mainMenuItem4;
    private com.zak.menu.Menu menu;
    private com.zak.menu.SubMenuPanel subMenu;
    // End of variables declaration//GEN-END:variables
}
