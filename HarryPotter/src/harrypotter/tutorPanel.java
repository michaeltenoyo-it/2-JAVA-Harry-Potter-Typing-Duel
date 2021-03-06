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
public class tutorPanel extends javax.swing.JPanel {
    int x = 0;
    int posA = 0;
    int posB = 0;
    int wordNow = 0;
    int start = 0;
    int dorm = 0;
    int text = 1;
    
    
    
    public tutorPanel() {
        initComponents();
        this.setSize(800,600);
        jTextArea1.setText("Welcome to the dorm! Now let's go to the tutorial...");
        
    }
    
    public void rebuild(){
        if(text == 3){
            jTextArea1.setText("So that's your status information.");
        }
        
        mainFrame temp = (mainFrame)this.getParent().getParent().getParent().getParent();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

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
        add(jButton3);
        jButton3.setBounds(20, 190, 170, 30);

        jButton4.setBackground(new java.awt.Color(153, 0, 0));
        jButton4.setFont(new java.awt.Font("Tekton Pro", 3, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("SCHOOL OF MAGIC");
        add(jButton4);
        jButton4.setBounds(20, 230, 170, 30);

        jButton5.setBackground(new java.awt.Color(153, 0, 0));
        jButton5.setFont(new java.awt.Font("Tekton Pro", 3, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("BOOK OF SPELL");
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
        add(jButton7);
        jButton7.setBounds(80, 310, 170, 30);

        jButton8.setBackground(new java.awt.Color(153, 0, 0));
        jButton8.setFont(new java.awt.Font("Tekton Pro", 3, 18)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("BAG");
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

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Monotype Corsiva", 0, 18)); // NOI18N
        jTextArea1.setRows(1);
        jScrollPane1.setViewportView(jTextArea1);

        add(jScrollPane1);
        jScrollPane1.setBounds(320, 160, 410, 120);
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        keyPressed();
    }//GEN-LAST:event_formMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
    }//GEN-LAST:event_jButton2ActionPerformed
    public void keyPressed(){
        mainFrame temp = (mainFrame)this.getParent().getParent().getParent().getParent();
        if(text == 1){
            text = 2;
            jTextArea1.setText("So you are a "+temp.p1.dorm+". First, let's see your status information.");
        }else if(text == 2){
            text = 3;
            temp.goToStatusPanel();
        }else if(text == 3){
            text = 4;
            jTextArea1.setText("STORY, in here you will journey through the story, finish the\n" +
"story to gain experience and know the story.");
        }else if(text == 4){
            text = 5;
            jTextArea1.setText("ARCADE, battle with an enemy along the way until death,\n" +
"gain experience and item in the battle.");
        }else if(text == 5){
            text = 6;
            jTextArea1.setText("SCHOOL OF MAGIC, learn new spell and charm here to\n" +
"improve you skill in the battlefield.");
        }else if(text == 6){
            text = 7;
            jTextArea1.setText("BOOK OF SPELL, i know you are bad at remembering spell\n" +
"so to make it easy I already write it all in the Book of Spell but\n" +
"remember you can only see the spell that you already learned.");
        }else if(text == 7){
            text = 8;
            jTextArea1.setText("SHOP, there's 2 shop that you can visit. Ollivander shop sell\n" +
"a wand that u can use in the battlefield. You can also buy\n" +
"wand's recipe and item here.");
        }else if(text == 8){
            text = 9;
            jTextArea1.setText("BAG, well i bet you already know what bag is, so just ignore it");
        }else if(text == 9){
            text = 10;
            jTextArea1.setText("About the patronus, well you are not good enough to learn\n" +
"about it. Don't worry, gain much level until you got better.\n" +
"Until then i will not tell you about patronus, for now just\n" +
"forget about it.");
        }else if(text == 10){
            text = 11;
            jTextArea1.setText("EXERCISE, in here you can learn to fight before you go to the\n" +
"real one. Don't worry you only fight a dummy here.");
        }else if(text == 11){
            text = 12;
            jTextArea1.setText("About the battlefield, let's just go to the arena so i can teach\n" +
"you how to fight...");
        }else if(text == 12){
            //GOTOARENA
            temp.goToTutorArena();
        }
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
