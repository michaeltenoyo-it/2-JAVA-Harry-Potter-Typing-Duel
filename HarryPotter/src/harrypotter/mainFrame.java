/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package harrypotter;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class mainFrame extends javax.swing.JFrame {
    player p1 = new player();
    String kodePanel = "null";
    startMenu sm = new startMenu();
    ng1 newGame1 = new ng1();
    ng2 newGame2 = new ng2();
    ng3 newGame3 = new ng3();
    ng4 newGame4 = new ng4();
    ng5 newGame5 = new ng5();
    ng6 newGame6 = new ng6();
    ng7 newGame7 = new ng7();
    ng8 newGame8 = new ng8();
    ng9 newGame9 = new ng9();
    ng9Transition newGame9T = new ng9Transition();
    dormQ0 dq0 = new dormQ0();
    dormQ1 dq1 = new dormQ1();
    dormQ2 dq2 = new dormQ2();
    dormQ3 dq3 = new dormQ3();
    dormQ4 dq4 = new dormQ4();
    dormQ5 dq5 = new dormQ5();
    dormQ6 dq6 = new dormQ6();
    dormQ7 dq7 = new dormQ7();
    dormQ8 dq8 = new dormQ8();
    dorma1 da1 = new dorma1();
    dormb1 db1 = new dormb1();
    dormc1 dc1 = new dormc1();
    dormd1 dd1 = new dormd1();
    dorma2 da2 = new dorma2();
    dormb2 db2 = new dormb2();
    dormc2 dc2 = new dormc2();
    dormd2 dd2 = new dormd2();
    tutorPanel tp = new tutorPanel();
    statusPanel sp = new statusPanel();
    tutorArena ta = new tutorArena();
    storyPanel stp = new storyPanel();
    magicSchool ms = new magicSchool();
    spellBook sb = new spellBook();
    bagPanel bp = new bagPanel();
    shopPanel sh = new shopPanel();
    exercise ex = new exercise();
    patronusSelection ptSelection = new patronusSelection();
    patronusShow ptShow = new patronusShow();
    option op = new option();
    mainMenu mm = new mainMenu();
    arcadePanel ap = new arcadePanel();
    
    
    
    public mainFrame() {
        initComponents();
        setFocusable(true);
        this.setSize(816, 639);
        this.add(sm);
        this.add(newGame1);
        this.add(newGame2);
        this.add(newGame3);
        this.add(newGame4);
        this.add(newGame5);
        this.add(newGame6);
        this.add(newGame7);
        this.add(newGame8);
        this.add(newGame9);
        this.add(newGame9T);
        this.add(dq0);
        this.add(dq1);
        this.add(dq2);
        this.add(dq3);
        this.add(dq4);
        this.add(dq5);
        this.add(dq6);
        this.add(dq7);
        this.add(dq8);
        this.add(da1);
        this.add(db1);
        this.add(dc1);
        this.add(dd1);
        this.add(da2);
        this.add(db2);
        this.add(dc2);
        this.add(dd2);
        this.add(tp);
        this.add(sp);
        this.add(ta);
        this.add(stp);
        this.add(ms);
        this.add(sb);
        this.add(bp);
        this.add(sh);
        this.add(ex);
        this.add(ptSelection);
        this.add(ptShow);
        this.add(op);
        this.add(ap);
        this.add(mm);
        
        
        sm.setVisible(true);
        newGame1.setVisible(false);
        newGame2.setVisible(false);
        newGame3.setVisible(false);
        newGame4.setVisible(false);
        newGame5.setVisible(false);
        newGame6.setVisible(false);
        newGame7.setVisible(false);
        newGame8.setVisible(false);
        newGame9.setVisible(false);
        newGame9T.setVisible(false);
        dq0.setVisible(false);
        dq1.setVisible(false);
        dq2.setVisible(false);
        dq3.setVisible(false);
        dq4.setVisible(false);
        dq5.setVisible(false);
        dq6.setVisible(false);
        dq7.setVisible(false);
        dq8.setVisible(false);
        da1.setVisible(false);
        db1.setVisible(false);
        dc1.setVisible(false);
        dd1.setVisible(false);
        da2.setVisible(false);
        db2.setVisible(false);
        dc2.setVisible(false);
        dd2.setVisible(false);
        tp.setVisible(false);
        sp.setVisible(false);
        ta.setVisible(false);
        stp.setVisible(false);
        ms.setVisible(false);
        sb.setVisible(false);
        bp.setVisible(false);
        sh.setVisible(false);
        ex.setVisible(false);
        ptSelection.setVisible(false);
        ptShow.setVisible(false);
        op.setVisible(false);
        mm.setVisible(false);
        ap.setVisible(false);
    }
    
    public void goToNg1(){
        sm.setVisible(false);
        newGame2.setVisible(false);
        newGame1.setVisible(true);
        newGame1.rebuild();
    }
    public void goToNg2(){
        sm.setVisible(false);
        newGame2.setVisible(true);
        newGame1.setVisible(false);
        newGame2.rebuild();
    }
    public void goToNg3(){
        newGame1.setVisible(false);
        sm.setVisible(false);
        newGame2.setVisible(false);
        newGame3.setVisible(true);
        newGame3.rebuild();
    }
    public void goToNg4(){
        newGame1.setVisible(false);
        sm.setVisible(false);
        newGame2.setVisible(false);
        newGame3.setVisible(false);
        newGame4.setVisible(true);
        newGame4.rebuild();
    }
    
     public void goToNg5(){
        newGame1.setVisible(false);
        sm.setVisible(false);
        newGame2.setVisible(false);
        newGame3.setVisible(false);
        newGame4.setVisible(false);
        newGame5.setVisible(true);
        newGame5.rebuild();
    }
    public void goToNg6(){
        newGame1.setVisible(false);
        sm.setVisible(false);
        newGame2.setVisible(false);
        newGame3.setVisible(false);
        newGame4.setVisible(false);
        newGame5.setVisible(false);
        newGame6.setVisible(true);
        newGame6.rebuild();
    }
    public void goToNg7(){
        newGame1.setVisible(false);
        sm.setVisible(false);
        newGame2.setVisible(false);
        newGame3.setVisible(false);
        newGame4.setVisible(false);
        newGame5.setVisible(false);
        newGame6.setVisible(false);
        newGame7.setVisible(true);
        newGame7.rebuild();
    }
    public void goToNg8(){
        newGame1.setVisible(false);
        sm.setVisible(false);
        newGame2.setVisible(false);
        newGame3.setVisible(false);
        newGame4.setVisible(false);
        newGame5.setVisible(false);
        newGame6.setVisible(false);
        newGame7.setVisible(false);
        newGame8.setVisible(true);
        newGame8.rebuild();
    }
    public void goToNg9(){
        newGame1.setVisible(false);
        sm.setVisible(false);
        newGame2.setVisible(false);
        newGame3.setVisible(false);
        newGame4.setVisible(false);
        newGame5.setVisible(false);
        newGame6.setVisible(false);
        newGame7.setVisible(false);
        newGame8.setVisible(false);
        newGame9.setVisible(true);
        newGame9.rebuild();
    }
    public void goToNg9T(){
        newGame1.setVisible(false);
        sm.setVisible(false);
        newGame2.setVisible(false);
        newGame3.setVisible(false);
        newGame4.setVisible(false);
        newGame5.setVisible(false);
        newGame6.setVisible(false);
        newGame7.setVisible(false);
        newGame8.setVisible(false);
        newGame9.setVisible(false);
        newGame9T.setVisible(true);
    }
    public void goToDq0(){
        newGame1.setVisible(false);
        sm.setVisible(false);
        newGame2.setVisible(false);
        newGame3.setVisible(false);
        newGame4.setVisible(false);
        newGame5.setVisible(false);
        newGame6.setVisible(false);
        newGame7.setVisible(false);
        newGame8.setVisible(false);
        newGame9.setVisible(false);
        newGame9T.setVisible(false);
        dq0.setVisible(true);
        dq0.rebuild();
    }
    public void goToDq1(){
        newGame1.setVisible(false);
        sm.setVisible(false);
        newGame2.setVisible(false);
        newGame3.setVisible(false);
        newGame4.setVisible(false);
        newGame5.setVisible(false);
        newGame6.setVisible(false);
        newGame7.setVisible(false);
        newGame8.setVisible(false);
        newGame9.setVisible(false);
        newGame9T.setVisible(false);
        dq0.setVisible(false);
        dq1.setVisible(true);
        dq1.rebuild();
    }
    public void goToDq2(){
        newGame1.setVisible(false);
        sm.setVisible(false);
        newGame2.setVisible(false);
        newGame3.setVisible(false);
        newGame4.setVisible(false);
        newGame5.setVisible(false);
        newGame6.setVisible(false);
        newGame7.setVisible(false);
        newGame8.setVisible(false);
        newGame9.setVisible(false);
        newGame9T.setVisible(false);
        dq0.setVisible(false);
        dq1.setVisible(false);
        dq2.setVisible(true);
        dq2.rebuild();
    }
    public void goToDq3(){
        dq2.setVisible(false);
        dq3.setVisible(true);
        dq3.rebuild();
    }
    public void goToDq4(){
        dq3.setVisible(false);
        dq4.setVisible(true);
        dq4.rebuild();
    }
    public void goToDq5(){
        dq4.setVisible(false);
        dq5.setVisible(true);
        dq5.rebuild();
    }
    public void goToDq6(){
        dq5.setVisible(false);
        dq6.setVisible(true);
        dq6.rebuild();
    }
    
    public void goToDq7(){
        dq6.setVisible(false);
        dq7.setVisible(true);
        dq7.rebuild();
    }
    
    public void goToDq8(){
        dq7.setVisible(false);
        dq8.setVisible(true);
        dq8.rebuild();
    }
    
    public void goToDa1(){
        dq8.setVisible(false);
        da1.setVisible(true);
        da1.rebuild();
    }
    public void goToDa2(){
        da1.setVisible(false);
        da2.setVisible(true);
        da2.rebuild();
    }
    
    public void goToDb1(){
        dq8.setVisible(false);
        db1.setVisible(true);
        db1.rebuild();
    }
    public void goToDb2(){
        db1.setVisible(false);
        db2.setVisible(true);
        db2.rebuild();
    }
    
    public void goToDc1(){
        dq8.setVisible(false);
        dc1.setVisible(true);
        dc1.rebuild();
    }
    public void goToDc2(){
        dc1.setVisible(false);
        dc2.setVisible(true);
        dc2.rebuild();
    }
    
    public void goToDd1(){
        dq8.setVisible(false);
        dd1.setVisible(true);
        dd1.rebuild();
    }
    public void goToDd2(){
        dd1.setVisible(false);
        dd2.setVisible(true);
        dd2.rebuild();
    }
    
    public void goToTutorPanel(){
        sm.setVisible(false);
        sp.setVisible(false);
        da2.setVisible(false);
        db2.setVisible(false);
        dc2.setVisible(false);
        dd2.setVisible(false);
        tp.setVisible(true);
        tp.rebuild();
    }
    
    public void goToStatusPanel(){
        tp.setVisible(false);
        sp.setVisible(true);
        sp.rebuild();
    }
    
    public void goToTutorArena(){
        tp.setVisible(false);
        ta.setVisible(true);
        ta.rebuild();
    }
    
    public String returnNama(){
        return p1.nama;
    }
    
    public void goToStp(){
        stp.setVisible(true);
        mm.setVisible(false);
        stp.rebuild();
    }
    
    public void goToExe(){
        ex.setVisible(true);
        mm.setVisible(false);
        ex.rebuild();
        
    }
    public void goToBook(){
        sb.setVisible(true);
        mm.setVisible(false);
        sb.rebuild();
    }
    public void goToSchool(){
        ms.setVisible(true);
        mm.setVisible(false);
        ms.rebuild();
    }
    public void goToShop(){
        mm.setVisible(false);
        sh.setVisible(true);
        sh.rebuild();
    }
    
    public void goToMainMenu(){
        sm.setVisible(false);
        ta.setVisible(false);
        stp.setVisible(false);
        ms.setVisible(false);
        sb.setVisible(false);
        bp.setVisible(false);
        sh.setVisible(false);
        ex.setVisible(false);
        ptSelection.setVisible(false);
        ptShow.setVisible(false);
        op.setVisible(false);
        ap.setVisible(false);
        mm.setVisible(true);
        mm.rebuild();
    }
    
    public void goToBag(){
        mm.setVisible(false);
        bp.setVisible(true);
        bp.rebuild();
    }
    
    public void goToArcade(){
        mm.setVisible(false);
        ap.setVisible(true);
        ap.rebuild();
    }
    
    public void learn(String temp, int hh, int mm, int ss){
        p1.hh = hh;
        p1.mm = mm;
        p1.ss = ss;
        p1.busy = 1;
        int done = 0;
        Timer myTimer = new Timer(1000,new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                
                p1.ss--;
                
                if(p1.ss < 0 && p1.busy == 1){
                    p1.ss = 59;
                    p1.mm--;
                }
                if(p1.mm < 0 && p1.busy == 1){
                    p1.mm = 59;
                    p1.hh--;
                }
                if(p1.hh < 0 && p1.busy == 1){
                    p1.ss = 0;
                    p1.mm = 0;
                    p1.hh = 0;
                    p1.busy = 0;
                    JOptionPane.showMessageDialog(null, temp+" learning done!");
                    p1.spell.add(temp);
                    stopTimer((Timer)e.getSource());
                }                
            }
        });
        myTimer.start();
    }
    
    public void stopTimer (Timer e){
        e.stop();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        if(kodePanel.equals("null")){
            JOptionPane.showMessageDialog(null, "KEY TURNED OFF");
        }else if(kodePanel.equals("ta")){
            int keyCode = evt.getKeyCode();
            if(keyCode == 10){
                ta.keyPressed();
            }else{
                char input = evt.getKeyChar();
                ta.insertSpell(input);
                ta.resetPlayer = 2;
            }
            
        }else if(kodePanel.equals("ar")){
            int keyCode = evt.getKeyCode();
            if(p1.stop == 1){
                System.out.println("STUNNED!");
            }else if(keyCode == 10){
                ap.keyPressed();
            }else{
                char input = evt.getKeyChar();
                ap.insertSpell(input);
                ap.resetPlayer = 2;
            }
            
        }else if(kodePanel.equals("exe")){
            int keyCode = evt.getKeyCode();
            if(p1.stop == 1){
                System.out.println("STUNNED!");
            }else if(keyCode == 10){
                ex.keyPressed();
            }else{
                char input = evt.getKeyChar();
               ex.insertSpell(input);
                ex.resetPlayer = 2;
            }
            
        }
    }//GEN-LAST:event_formKeyPressed

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
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
