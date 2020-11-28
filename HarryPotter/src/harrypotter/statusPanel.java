/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package harrypotter;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author KELVIN
 */
public class statusPanel extends javax.swing.JPanel {

    /**
     * Creates new form statusPanel
     */
    public statusPanel() {
        initComponents();
        this.setSize(800,600);
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        setLayout(null);

        jLabel1.setFont(new java.awt.Font("Monotype Corsiva", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("MAGIC DAMAGE : ");
        add(jLabel1);
        jLabel1.setBounds(50, 490, 450, 60);

        jLabel2.setFont(new java.awt.Font("Monotype Corsiva", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("STR = ");
        add(jLabel2);
        jLabel2.setBounds(50, 40, 450, 60);

        jLabel3.setFont(new java.awt.Font("Monotype Corsiva", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("INT = ");
        add(jLabel3);
        jLabel3.setBounds(50, 100, 450, 60);

        jLabel4.setFont(new java.awt.Font("Monotype Corsiva", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("AGI =");
        add(jLabel4);
        jLabel4.setBounds(50, 160, 450, 60);

        jLabel5.setFont(new java.awt.Font("Monotype Corsiva", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("HP : ");
        add(jLabel5);
        jLabel5.setBounds(50, 310, 450, 60);

        jLabel6.setFont(new java.awt.Font("Monotype Corsiva", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("MANA : ");
        add(jLabel6);
        jLabel6.setBounds(50, 370, 450, 60);

        jLabel7.setFont(new java.awt.Font("Monotype Corsiva", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("BASIC ATK : ");
        add(jLabel7);
        jLabel7.setBounds(50, 430, 450, 60);
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        keyPressed();
    }//GEN-LAST:event_formMouseClicked
    public void keyPressed(){
        mainFrame temp = (mainFrame)this.getParent().getParent().getParent().getParent();
        temp.goToTutorPanel();
    }
    
    public void rebuild(){
        mainFrame temp = (mainFrame)this.getParent().getParent().getParent().getParent();
       
        player tempP1 = (player)temp.p1.clone();
        String logoExt = "Image/gryffindorLogo.png";
        
        if(tempP1.dorm.equals("gryffindor")){
            logoExt = "Image/gryffindorLogo.png";
        }else if(tempP1.dorm.equals("ravenclaw")){
            logoExt = "Image/ravenclawLogo.png";
        }else if(tempP1.dorm.equals("hufflepuff")){
            logoExt = "Image/hufflepuffLogo.png";
        }else if(tempP1.dorm.equals("slytherin")){
            logoExt = "Image/slytherinLogo.png";
        }
        
        ImageIcon raw = new ImageIcon(logoExt);
        Image img = raw.getImage();
        Image newImg = img.getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        ImageIcon finalImage = new ImageIcon(newImg);
        JLabel lblMiniLogo = new JLabel(finalImage);
        
        lblMiniLogo.setBounds(600,20,200,200);
        this.add(lblMiniLogo);
        
        ImageIcon raw1 = new ImageIcon("Image/BackgroundStatus.jpg");
        Image img1 = raw1.getImage();
        Image newImg1 = img1.getScaledInstance(900, 700, Image.SCALE_SMOOTH);
        ImageIcon finalImage1 = new ImageIcon(newImg1);
        JLabel lblBackground = new JLabel(finalImage1);
        
        lblBackground.setBounds(0, 0, 900, 700);
        this.add(lblBackground);
        
        jLabel2.setText("STR = "+tempP1.str);
        jLabel3.setText("INT = "+tempP1.intel);
        jLabel4.setText("AGI = "+tempP1.agi);
        jLabel5.setText("HP : "+tempP1.hp);
        jLabel6.setText("MANA : "+tempP1.mana);
        jLabel7.setText("BASIC ATK : "+tempP1.basicAtk);
        jLabel1.setText("MAGIC DAMAGE : "+tempP1.magicDmg);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
