package com.karmelos.ksimulator.view.swing;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

/**
 *PopUpFrame is the parent container for pop up panels(AboutPanel,DemoVideoPanel
 * ,HelpTipsPanel,PrinterPanel)
 * 
 * @author Adebayo Adeniyan
 */
public class PopUpFrame extends javax.swing.JFrame {
    private String popSaveSetting;
    
    private String rowSaveSetting;
    
    
    /**
     * Creates new form PopUpFrame
     */
    public PopUpFrame() {
        
        initComponents();
        this.setLocationRelativeTo(null);//sets the pop up frame location to the centre of the application
       this.setTitle("KSimulator");
    }

    public String getPopSaveSetting() {
        return popSaveSetting;
    }

    public void setPopSaveSetting(String popSaveSetting) {
        this.popSaveSetting = popSaveSetting;
    }

    public String getRowSaveSetting() {
        return rowSaveSetting;
    }

    public void setRowSaveSetting(String rowSaveSetting) {
        this.rowSaveSetting = rowSaveSetting;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainpanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setIconImage(new ImageIcon(getClass().getResource("/com/karmelos/ksimulator/2ndbaricon/kicon.png")).getImage());
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 403, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(mainpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(423, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
      getMainPanel().removeAll();
        this.setVisible(false);
        repaint();
      // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosing
//    @Override
//    public void paint(Graphics grphcs) {
//        super.paint(grphcs); //To change body of generated methods, choose Tools | Templates.
//      try {
//          grphcs.drawImage(ImageIO.read(this.getClass().getResource("/com/karmelos/ksimulator/2ndbaricon/splashscreen.png")),0, 0, this);
//      } catch (IOException ex) {
//          Logger.getLogger(StatePanel.class.getName()).log(Level.SEVERE, null, ex);
//      }
//    
//    }
    //getter method that returns the Jpanel(mainpanel) on the Pop up frame
    public JPanel getMainPanel()
    { 
    return mainpanel;
    }

    //AddPanel method that adds pop up panels to the mainpanel on the Pop up Frame when invoked
    public PopUpFrame addPanels( final JPanel pane)
   {      mainpanel.removeAll();
        JPanel panel= getMainPanel();//calls the mainpanel
        
         panel.add(pane);//adds a specific pop up panel to the main panel
        panel.revalidate();
        panel.repaint();
     return this;
   }
   public PopUpFrame addSavePanel(SavePanel sp,SimView s)
   {   mainpanel.removeAll();
        JPanel panel= getMainPanel();//calls the mainpanel        
        sp.setWrk(s);
        panel.add(sp);//adds a specific pop up panel to the main panel
        panel.revalidate();
        panel.repaint();
   
   return this;
   }
   public PopUpFrame addOpenPanel(StatePanel openState,SimView s)
   {    mainpanel.removeAll();
        JPanel panel= getMainPanel();//calls the mainpanel        
        openState.setWrk(s);
        panel.add(openState);//adds a specific pop up panel to the main panel
        panel.revalidate();
        panel.repaint();
   
   return this; 
   
   }
   public PopUpFrame addLoginPanel(LoginPane logPanel,SimView s)
   {
        mainpanel.removeAll();
        JPanel panel= getMainPanel();//calls the mainpanel        
        logPanel.setWrk(s);
        logPanel.setBorder(new EmptyBorder(20, 35, 20, 20));
        panel.add(logPanel);//adds a specific pop up panel to the main panel
        panel.revalidate();
        panel.repaint();
   
   return this;
   
   
   
   }
    /**
     * @param args the command line arguments
     */
    public static void main(final String args[]) {
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
            java.util.logging.Logger.getLogger(PopUpFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PopUpFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PopUpFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PopUpFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PopUpFrame().setVisible(true);
            
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel mainpanel;
    // End of variables declaration//GEN-END:variables
}
