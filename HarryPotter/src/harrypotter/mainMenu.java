/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package harrypotter;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import javax.swing.*;


/**
 *
 * @author KELVIN
 */
public class mainMenu extends javax.swing.JPanel {
    int x = 0;
    int posA = 0;
    int posB = 0;
    int wordNow = 0;
    int start = 0;
    int dorm = 0;
    int text = 1;
    
    
    
    public mainMenu() {
        initComponents();
        this.setSize(800,600);
    }
    
    public void rebuild(){
        //cheatXP(10000000);
        check();
        mainFrame temp = (mainFrame)this.getParent().getParent().getParent().getParent();
        
        Timer myTimer = new Timer(1000,new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                jLabel7.setText(temp.p1.hh+":"+temp.p1.mm+":"+temp.p1.ss);
            }
        });
        myTimer.start();
        
        int gold = temp.p1.gold;
        jLabel8.setText("GOLD : "+gold+"G");
        String tempDorm = temp.p1.dorm;
        String temppatronus = temp.p1.patronusName;
        String logoExt = "Image/gryffindorLogo.png";
        String playerName = temp.p1.nama;
        int playerLevelNum;
        String playerLevel = "Lvl. "+String.valueOf(temp.p1.level);
        int xpNow = temp.p1.xp;
        int xpMax = temp.p1.level * 300 + temp.p1.level * 50;
        String lvlProgress = String.valueOf(xpNow)+"/"+String.valueOf(xpMax);
        
        jLabel1.setText(playerName);
        jLabel2.setText(playerLevel);
        jLabel3.setText(lvlProgress);
        
        
        if(tempDorm.equals("gryffindor")){
            logoExt = "Image/gryffindorLogo.png";
        }
        else if(tempDorm.equals("ravenclaw")){
            logoExt = "Image/ravenclawLogo.png"; 
        }
        else if(tempDorm.equals("hufflepuff")){
            logoExt = "Image/hufflepuffLogo.png";
        }
        else if(tempDorm.equals("slytherin")){
            logoExt = "Image/slytherinLogo.png";
        }
        ImageIcon raw = new ImageIcon(logoExt);
        Image img = raw.getImage();
        Image newImg = img.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        ImageIcon finalImage = new ImageIcon(newImg);
        JLabel lblMiniLogo = new JLabel(finalImage);
        
        lblMiniLogo.setBounds(0,20,100,100);
        
        //Background
        ImageIcon raw1 = new ImageIcon("Image/BackgroundMenu.jpg");
        Image img1 = raw1.getImage();
        Image newImg1 = img1.getScaledInstance(900, 700, Image.SCALE_SMOOTH);
        ImageIcon finalImage1 = new ImageIcon(newImg1);
        JLabel lblBackground = new JLabel(finalImage1);
        
        lblBackground.setBounds(0, 0, 900, 700);
        
        //input gambar
        this.add(lblMiniLogo);
        this.add(lblBackground);
        System.out.println(temppatronus);
        if(temppatronus.equals("NO PATRONUS")){
            ImageIcon rawPatronus = new ImageIcon("Image/patronus0.jpg");
            jLabel5.setIcon(rawPatronus);
            jLabel6.setText("NO PATRONUS");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();

        jLabel4.setText("jLabel4");

        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        setLayout(null);

        jLabel1.setFont(new java.awt.Font("Lucida Calligraphy", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("PlayerName");
        add(jLabel1);
        jLabel1.setBounds(110, 30, 250, 30);

        jLabel2.setFont(new java.awt.Font("Lucida Calligraphy", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Lvl. playerLevel");
        add(jLabel2);
        jLabel2.setBounds(110, 60, 250, 25);

        jLabel3.setFont(new java.awt.Font("Lucida Calligraphy", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("LvlNow/LvlMax");
        add(jLabel3);
        jLabel3.setBounds(110, 90, 250, 25);

        jButton1.setBackground(new java.awt.Color(153, 0, 0));
        jButton1.setFont(new java.awt.Font("Tekton Pro", 3, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("EXERCISE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(80, 350, 170, 30);

        jButton2.setBackground(new java.awt.Color(153, 0, 0));
        jButton2.setFont(new java.awt.Font("Tekton Pro", 3, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("STORY");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2);
        jButton2.setBounds(20, 150, 170, 30);

        jButton3.setBackground(new java.awt.Color(153, 0, 0));
        jButton3.setFont(new java.awt.Font("Tekton Pro", 3, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("ARCADE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3);
        jButton3.setBounds(20, 190, 170, 30);

        jButton4.setBackground(new java.awt.Color(153, 0, 0));
        jButton4.setFont(new java.awt.Font("Tekton Pro", 3, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("SCHOOL OF MAGIC");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        add(jButton4);
        jButton4.setBounds(20, 230, 170, 30);

        jButton5.setBackground(new java.awt.Color(153, 0, 0));
        jButton5.setFont(new java.awt.Font("Tekton Pro", 3, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("BOOK OF SPELL");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        add(jButton5);
        jButton5.setBounds(80, 270, 170, 30);

        jButton6.setBackground(new java.awt.Color(0, 102, 255));
        jButton6.setFont(new java.awt.Font("Tekton Pro", 3, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("PATRONUS");
        add(jButton6);
        jButton6.setBounds(530, 560, 250, 30);

        jButton7.setBackground(new java.awt.Color(153, 0, 0));
        jButton7.setFont(new java.awt.Font("Tekton Pro", 3, 18)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("SHOP");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        add(jButton7);
        jButton7.setBounds(80, 310, 170, 30);

        jButton8.setBackground(new java.awt.Color(153, 0, 0));
        jButton8.setFont(new java.awt.Font("Tekton Pro", 3, 18)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("BAG");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        add(jButton8);
        jButton8.setBounds(10, 520, 170, 30);

        jPanel1.setBackground(new java.awt.Color(0, 0, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setForeground(new java.awt.Color(0, 0, 102));
        jPanel1.setLayout(null);
        jPanel1.add(jLabel5);
        jLabel5.setBounds(10, 10, 230, 180);

        add(jPanel1);
        jPanel1.setBounds(530, 350, 250, 200);

        jLabel6.setFont(new java.awt.Font("Pristina", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("NO PATRONUS");
        add(jLabel6);
        jLabel6.setBounds(530, 320, 250, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        add(jLabel7);
        jLabel7.setBounds(570, 10, 200, 30);

        jPanel2.setBackground(new java.awt.Color(153, 0, 0));

        jLabel8.setFont(new java.awt.Font("Lucida Calligraphy", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("GOLD : ");
        jPanel2.add(jLabel8);

        add(jPanel2);
        jPanel2.setBounds(210, 520, 310, 30);

        jLabel9.setFont(new java.awt.Font("Tekton Pro", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("BUSY LEARNING");
        add(jLabel9);
        jLabel9.setBounds(580, 40, 190, 30);

        jButton9.setText("OPTION");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        add(jButton9);
        jButton9.setBounds(20, 560, 90, 23);
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
       
    }//GEN-LAST:event_formMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        mainFrame temp = (mainFrame)this.getParent().getParent().getParent().getParent();
        temp.goToStp();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        mainFrame temp = (mainFrame)this.getParent().getParent().getParent().getParent();
        temp.goToSchool();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here: {                                         
        mainFrame temp = (mainFrame)this.getParent().getParent().getParent().getParent();
        temp.goToShop();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        mainFrame temp = (mainFrame)this.getParent().getParent().getParent().getParent();
        temp.goToBag();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        mainFrame temp = (mainFrame)this.getParent().getParent().getParent().getParent();
        temp.goToBook();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        mainFrame temp = (mainFrame)this.getParent().getParent().getParent().getParent();
        temp.goToArcade();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        mainFrame temp = (mainFrame)this.getParent().getParent().getParent().getParent();
        temp.goToExe();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed
    public void check(){
        mainFrame temp = (mainFrame)this.getParent().getParent().getParent().getParent();
        

        int xpNow = temp.p1.xp;
        int xpMax = temp.p1.level*300 + temp.p1.level*50;
      
        while(xpNow >= xpMax){
            temp.p1.level++;
            temp.p1.xp -= xpMax;
            xpNow = temp.p1.xp;
            xpMax = temp.p1.level*300 + temp.p1.level*50;

            temp.p1.str += temp.p1.strGrowth;
            temp.p1.intel += temp.p1.intGrowth;
            temp.p1.agi += temp.p1.agiGrowth;
            temp.p1.hp = temp.p1.str*30;
            temp.p1.basicAtk = temp.p1.agi*2;
            temp.p1.magicDmg = temp.p1.intel*3;
        }
    }
    
    public void cheatXP(int xp){
        mainFrame temp = (mainFrame)this.getParent().getParent().getParent().getParent();
        temp.p1.xp += xp;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
