
import java.awt.Color;
import javax.swing.JOptionPane;
import stu_pro.*;
import learning.*;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author user
 */
public class Background extends javax.swing.JFrame implements Global_variables{
    Query_Processor t4=new Query_Processor();
    trainer train=new trainer();//model is trained in constructer....
    nlp n=new nlp(train);
    
    /**
     * Creates new form Background
     */
    public Background() {
        initComponents();
        jTextArea1.setEditable(false);
        featurepane.setBackground(new Color(102, 0, 204, 123));
        featurepane.setBorder(new SubtleSquareBorder(true));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        featurepane = new javax.swing.JLayeredPane();
        toggle_fc = new javax.swing.JToggleButton();
        toggle_bc = new javax.swing.JToggleButton();
        jLabel9 = new javax.swing.JLabel();
        learngen = new javax.swing.JButton();
        showconsole = new javax.swing.JButton();
        learnspecific = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1250, 680));
        setMinimumSize(new java.awt.Dimension(1250, 680));
        getContentPane().setLayout(null);

        jTextField2.setFont(new java.awt.Font("Raleway", 0, 18)); // NOI18N
        jTextField2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 5));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2);
        jTextField2.setBounds(200, 220, 160, 40);

        jTextField3.setFont(new java.awt.Font("Raleway", 0, 18)); // NOI18N
        jTextField3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 5));
        getContentPane().add(jTextField3);
        jTextField3.setBounds(380, 220, 260, 40);

        jTextField4.setFont(new java.awt.Font("Raleway", 0, 18)); // NOI18N
        jTextField4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 5));
        getContentPane().add(jTextField4);
        jTextField4.setBounds(660, 220, 250, 40);

        featurepane.setBackground(new java.awt.Color(102, 0, 204));
        featurepane.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        featurepane.setFocusable(false);
        featurepane.setOpaque(true);

        toggle_fc.setBackground(new java.awt.Color(255, 255, 255));
        toggle_fc.setFont(new java.awt.Font("Raleway", 0, 18)); // NOI18N
        toggle_fc.setText("Forward Chaining ON");
        toggle_fc.setBorder(null);
        toggle_fc.setBorderPainted(false);
        toggle_fc.setFocusPainted(false);
        toggle_fc.setFocusable(false);
        toggle_fc.setMaximumSize(new java.awt.Dimension(200, 23));
        toggle_fc.setRequestFocusEnabled(false);
        toggle_fc.setRolloverEnabled(false);
        toggle_fc.setVerifyInputWhenFocusTarget(false);
        toggle_fc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toggle_fcActionPerformed(evt);
            }
        });
        featurepane.add(toggle_fc);
        toggle_fc.setBounds(10, 70, 240, 40);

        toggle_bc.setBackground(new java.awt.Color(255, 255, 255));
        toggle_bc.setFont(new java.awt.Font("Raleway", 0, 18)); // NOI18N
        toggle_bc.setText("Backward Chaining ON");
        toggle_bc.setBorder(null);
        toggle_bc.setBorderPainted(false);
        toggle_bc.setFocusPainted(false);
        toggle_bc.setFocusable(false);
        toggle_bc.setMaximumSize(new java.awt.Dimension(200, 23));
        toggle_bc.setRequestFocusEnabled(false);
        toggle_bc.setRolloverEnabled(false);
        toggle_bc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toggle_bcActionPerformed(evt);
            }
        });
        featurepane.add(toggle_bc);
        toggle_bc.setBounds(10, 120, 240, 40);

        jLabel9.setFont(new java.awt.Font("Airborne", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Features");
        featurepane.add(jLabel9);
        jLabel9.setBounds(70, 20, 150, 30);

        learngen.setBackground(new java.awt.Color(255, 255, 255));
        learngen.setFont(new java.awt.Font("Raleway", 0, 18)); // NOI18N
        learngen.setText("Learn Generic\n");
        learngen.setBorder(null);
        learngen.setBorderPainted(false);
        learngen.setFocusPainted(false);
        learngen.setFocusable(false);
        learngen.setRequestFocusEnabled(false);
        learngen.setRolloverEnabled(false);
        learngen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                learngenActionPerformed(evt);
            }
        });
        featurepane.add(learngen);
        learngen.setBounds(10, 220, 240, 40);

        showconsole.setBackground(new java.awt.Color(255, 255, 255));
        showconsole.setFont(new java.awt.Font("Raleway", 0, 18)); // NOI18N
        showconsole.setText("Show Console\n");
        showconsole.setBorder(null);
        showconsole.setBorderPainted(false);
        showconsole.setFocusPainted(false);
        showconsole.setFocusable(false);
        showconsole.setRequestFocusEnabled(false);
        showconsole.setRolloverEnabled(false);
        showconsole.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showconsoleActionPerformed(evt);
            }
        });
        featurepane.add(showconsole);
        showconsole.setBounds(10, 270, 240, 40);

        learnspecific.setBackground(new java.awt.Color(255, 255, 255));
        learnspecific.setFont(new java.awt.Font("Raleway", 0, 18)); // NOI18N
        learnspecific.setText("Learn Specific\n");
        learnspecific.setBorder(null);
        learnspecific.setBorderPainted(false);
        learnspecific.setFocusPainted(false);
        learnspecific.setFocusable(false);
        learnspecific.setRequestFocusEnabled(false);
        learnspecific.setRolloverEnabled(false);
        learnspecific.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                learnspecificActionPerformed(evt);
            }
        });
        featurepane.add(learnspecific);
        learnspecific.setBounds(10, 170, 240, 40);

        getContentPane().add(featurepane);
        featurepane.setBounds(970, 110, 280, 340);

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Raleway", 0, 20)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(50, 440, 590, 160);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Example :    When      student     have-to-pay     fine");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(50, 280, 590, 30);

        jLabel4.setFont(new java.awt.Font("Raleway", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Query ");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(50, 190, 70, 20);

        jLabel5.setFont(new java.awt.Font("Raleway", 0, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabel5);
        jLabel5.setBounds(200, 190, 90, 0);

        jLabel6.setFont(new java.awt.Font("Raleway", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Fact");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(380, 190, 90, 20);

        jLabel7.setFont(new java.awt.Font("Raleway", 0, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabel7);
        jLabel7.setBounds(660, 190, 80, 0);

        jComboBox1.setFont(new java.awt.Font("Raleway", 0, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "When", "What is", "Where is", "What happen", "True/False", " " }));
        jComboBox1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 0, true));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(50, 220, 130, 40);

        jLabel1.setFont(new java.awt.Font("Raleway", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Answer :");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(50, 410, 120, 30);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Raleway", 0, 20)); // NOI18N
        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(380, 340, 130, 40);

        jLabel3.setFont(new java.awt.Font("Airborne", 0, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("STU-H Adaptive Agent");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 40, 830, 70);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bannerSmallCrop.jpg"))); // NOI18N
        jLabel2.setMaximumSize(new java.awt.Dimension(1000, 1000));
        jLabel2.setMinimumSize(new java.awt.Dimension(400, 350));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(-20, 0, 1464, 1225);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    
        
    String string0, string1, string2, string3, query,result = null;
    string0 = (String) jComboBox1.getSelectedItem();
    // We have to parse the text to a type float.
    string1 = jTextField2.getText();
    string2 = jTextField3.getText();
    string3 = jTextField4.getText();
   // Now we can perform the addition.
    if(string0.isEmpty() && string1.isEmpty() && string2.isEmpty() && string3.isEmpty()){
     JOptionPane.showMessageDialog(null,"Query Field is empty.\n Please enter your query."); 
  }
   else if(!string0.isEmpty() && string1.isEmpty() && string2.isEmpty() && string3.isEmpty()){
     JOptionPane.showMessageDialog(null,"Query Field is empty.\n Please enter your query."); 
  }
    if(string0.isEmpty()){
        string0="-";
    }else if(string0.equalsIgnoreCase("true/false")){
    string0="t/f";
    }else if(string0.equalsIgnoreCase("when")){
    string0="when";
    }else if(string0.equalsIgnoreCase("what happen")){
    string0="what-happen";
    }else if(string0.equalsIgnoreCase("where is")){
    string0="where-is";
    }else if(string0.equalsIgnoreCase("what is")){
    string0="what-is";
    }
    
    if(string1.isEmpty()){
        string1="-";
    }
    if(string2.isEmpty()){
        string2="-";
    }
    if(string3.isEmpty()){
        string3="-";
    }
    
    query = string0+" "+string1+" " +string2+" "+string3;
        try {
            result=t4.main2(query);
        } catch (IOException ex) {
            Logger.getLogger(Background.class.getName()).log(Level.SEVERE, null, ex);
        }
    /*jTextField2.setText("");
    jTextField3.setText("");
    jTextField4.setText("");   
    */
    if(result.length()>40){
    String a[]=result.split(" ");
    result="";
    int count=0;
    for(String s:a ){
    result+=s+" ";
    count++;
    if(count>=7){
        result+="\n";count=0;
    }
    }
    }
    jTextArea1.setText(String.valueOf(result));
    }//GEN-LAST:event_jButton1ActionPerformed
    protected void updateState(){
        boolean disabled=jComboBox1.getSelectedItem().equals("Where is");
        jTextField2.setEnabled(!disabled);
        jTextField3.setEnabled(!disabled);
    }
    
    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        updateState();
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void toggle_fcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toggle_fcActionPerformed
        // TODO add your handling code here:
        if(toggle_fc.isSelected()){
            toggle_fc.setText("Forward chaining OFF");
            Color r = new Color(102,102,225);
            toggle_fc.setBackground(r);
            toggle_fc.setForeground(Color.WHITE);
        }else{
            toggle_fc.setText("Forward chaining ON");
            toggle_fc.setBackground(Color.WHITE);
            toggle_fc.setForeground(Color.BLACK);
        }
        t4.change_flag(toggle_fc.isSelected(),toggle_bc.isSelected());
    }//GEN-LAST:event_toggle_fcActionPerformed

    private void toggle_bcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toggle_bcActionPerformed
        // TODO add your handling code here:
        if(toggle_bc.isSelected()){
            toggle_bc.setText("Backward chaining OFF");
            Color r = new Color(102,102,225);
            toggle_bc.setBackground(r);
            toggle_bc.setForeground(Color.WHITE);
        }else{
            toggle_bc.setText("Backward chaining ON");
            toggle_bc.setBackground(Color.WHITE);
            toggle_bc.setForeground(Color.BLACK);
        }
        t4.change_flag(toggle_fc.isSelected(),toggle_bc.isSelected());
    }//GEN-LAST:event_toggle_bcActionPerformed

    private void learngenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_learngenActionPerformed
        // TODO add your handling code here:
        //console c = new console();
        //c.learning_sepcific(new Crawl1(n));
                new Thread(new Runnable() {
                   public void run() {
                       Crawl1 c=new Crawl1(n);
                       c.loopcrawl_gen();
                       //System.out.println("Look ma, no hands");
                   }
               }).start();

               new Thread(new Runnable() {
                   public void run() {
                      console c=new console();
                       //System.out.println("Look at me, look at me...");
                   }
               }).start();
        
    }//GEN-LAST:event_learngenActionPerformed

    private void showconsoleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showconsoleActionPerformed
        // TODO add your handling code here:
        //f.dispose();
        console c = new console();
    }//GEN-LAST:event_showconsoleActionPerformed

    private void learnspecificActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_learnspecificActionPerformed
        // TODO add your handling code here:
        //learn_sepcific_ui l=new learn_sepcific_ui();
        new learn_specific_ui(n).setVisible(true);
    }//GEN-LAST:event_learnspecificActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws IOException, Exception {
        
        Stu_H_Main.main();
        
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
            java.util.logging.Logger.getLogger(Background.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Background.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Background.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Background.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Background().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane featurepane;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JButton learngen;
    private javax.swing.JButton learnspecific;
    private javax.swing.JButton showconsole;
    private javax.swing.JToggleButton toggle_bc;
    private javax.swing.JToggleButton toggle_fc;
    // End of variables declaration//GEN-END:variables
}
