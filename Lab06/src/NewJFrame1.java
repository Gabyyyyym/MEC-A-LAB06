
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class NewJFrame1 extends javax.swing.JFrame {

   int monedas=20;
   
   
    public NewJFrame1() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lbMonedas = new javax.swing.JLabel();
        lb1 = new javax.swing.JLabel();
        lb2 = new javax.swing.JLabel();
        lb3 = new javax.swing.JLabel();
        play = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("SWSimp", 1, 24)); // NOI18N
        jLabel1.setText("MAQUINA TRAGAMONEDAS ");

        lbMonedas.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        lbMonedas.setText("MONEDAS 20");

        lb1.setFont(new java.awt.Font("Tahoma", 1, 70)); // NOI18N
        lb1.setText("5");

        lb2.setFont(new java.awt.Font("Tahoma", 1, 70)); // NOI18N
        lb2.setText("3");

        lb3.setFont(new java.awt.Font("Tahoma", 1, 70)); // NOI18N
        lb3.setText("9");

        play.setFont(new java.awt.Font("Yu Gothic Medium", 1, 20)); // NOI18N
        play.setText("PLAY");
        play.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(lb1)
                .addGap(108, 108, 108)
                .addComponent(lb2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lb3)
                .addGap(131, 131, 131))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(100, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(123, 123, 123))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lbMonedas)
                        .addGap(49, 49, 49))))
            .addGroup(layout.createSequentialGroup()
                .addGap(241, 241, 241)
                .addComponent(play)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbMonedas, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb2)
                    .addComponent(lb1)
                    .addComponent(lb3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(play)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void playActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playActionPerformed
       monedas-=1;
       
       
       int slot1=(int)(Math.random()*9+1);
        int slot2=(int)(Math.random()*9+1);
         int slot3=(int)(Math.random()*9+1);
       lb1.setText(String.valueOf(slot1));
       lb2.setText(String.valueOf(slot2));
        lb3.setText(String.valueOf(slot3));
        if(slot1== slot2&&slot2==slot3){
            switch(slot1){
                case 5:
                    monedas+=20+1;
                    JOptionPane.showMessageDialog(this, "Ganaste 20 monedas");
                    break;
                    case 7:
                    monedas+=20+1;
                    JOptionPane.showMessageDialog(this, "Ganaste 50 monedas");
                    break;
                    case 9:
                    monedas+=20+1;
                    JOptionPane.showMessageDialog(this, "Ganaste 20 monedas");
                    break;
                    default:
                     
                    monedas+=slot1+1;
                    JOptionPane.showMessageDialog(this, "Ganaste "+slot1+" monedas");
                    break;  
            }
        }
       lbMonedas.setText("MONEDAS  "+String.valueOf(monedas));
       if(monedas==0){
           int numero=JOptionPane.showConfirmDialog(this,
                   "Juegas de nuevo","Maquina traga monedas",
                   JOptionPane.YES_NO_OPTION);
           if (numero==0){
               monedas=20;
               lbMonedas.setText("Monedas"+ String.valueOf(monedas));
               
           }
           else{
               System.exit(0);
           }
           
       }
    }//GEN-LAST:event_playActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold> 

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lb1;
    private javax.swing.JLabel lb2;
    private javax.swing.JLabel lb3;
    private javax.swing.JLabel lbMonedas;
    private javax.swing.JButton play;
    // End of variables declaration//GEN-END:variables
}
