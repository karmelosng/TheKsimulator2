/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.karmelos.ksimulator.jdialogs;

import java.awt.BorderLayout;
import java.awt.Dialog;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Ables
 */
public class YesNoOption  extends JDialog{
private JPanel  panel1;
private JPanel panel2;
private JButton yesButton;
private JButton noButton;
private JButton cancelButton;
JLabel label;
private String label1;
private int keyOP;
ImageIcon icon = new ImageIcon(getClass().getResource("/com/karmelos/ksimulator/2ndbaricon/kicon.png"));
    public YesNoOption(Frame owner) {
        super(owner);
        //initialize components
    }

    public String getLabel1() {
        return label1;
    }

    public void setLabel1(String label1) {
        this.label1 = label1;
    }

    public int getKeyOP() {
        return keyOP;
    }

    public void setKeyOP(int keyOP) {
        this.keyOP = keyOP;
    }
    
    class ButtonHandler implements ActionListener{
        public void actionPerformed(ActionEvent event){
        if(event.getActionCommand().equals(" Yes ")){
            setKeyOP(1);
            
        YesNoOption.this.dispose();
        }
        else if(event.getActionCommand().equals(" No ")){
            setKeyOP(2);
            YesNoOption.this.dispose();
        }
        
        else if(event.getActionCommand().equals("Cancel")){
            setKeyOP(3);
        YesNoOption.this.dispose();
        }
        }
    
    }
//    public static void main(String[] args) {
//        new CloseWindowDialog(null, null);
//    }
    public int showDialog(){
    
             panel1 = new JPanel();
        panel2 = new JPanel();
        
        label = new JLabel(getLabel1());
        label.setFont(new Font("trebuchet ms", Font.PLAIN, 12));
        panel1.add(label);
        
        //instantiates handler
        ButtonHandler handler = new ButtonHandler();
        //creating yesButton
        yesButton = new JButton(" Yes ");
        yesButton.setFont(new Font("trebuchet ms", Font.PLAIN, 12));
        yesButton.addActionListener(handler);
        
        //creating noButton;
        noButton = new JButton(" No ");
        noButton.setFont(new Font("trebuchet ms", Font.PLAIN, 12));
        noButton.addActionListener(handler);
        
        cancelButton = new JButton("Cancel");
        cancelButton.setFont(new Font("trebuchet ms", Font.PLAIN, 12));
        cancelButton.addActionListener(handler);
        
        panel2.add(yesButton);
        panel2.add(noButton);
        panel2.add(cancelButton);
        //add panels to jdialog
        add(panel1);
        add(panel2,BorderLayout.SOUTH);
                
//        setSize(300, 130);
        setModal(true);
        setModalityType(Dialog.ModalityType.APPLICATION_MODAL);
        setModalExclusionType(Dialog.ModalExclusionType.NO_EXCLUDE);
        setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
        setLocationRelativeTo(null);
        setIconImage(icon.getImage());
        setTitle("KSimulator");
        setVisible(true);
        
        return getKeyOP();
    }
}
