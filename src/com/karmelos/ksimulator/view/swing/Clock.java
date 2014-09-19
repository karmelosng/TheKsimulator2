/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karmelos.ksimulator.view.swing;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Ables
 */
public class Clock extends JPanel{

        private javax.swing.Timer timer;
        private static final int ONE_SEC = 1000;
        private static final int TENTH_SEC = 100;
        private Font clockFont;
        private JLabel label;
        private int clockTick;  	//number of clock ticks; tick can be 1.0 s or 0.1 s
        private double clockTime;  	//time in seconds
        protected String clockTimeString;
        private int timeInSecs;
        private int min;
        private int sec;
        private int tick;
        
        public Clock(){
        timer = new javax.swing.Timer(TENTH_SEC, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               clockTick = 0;
        clockTime = clockTick/10;
        min = (int) (clockTime/60);
        sec = (int) (clockTime%60);
        tick = clockTick%10;
        clockTimeString = Integer.toString(min)+":"+ Integer.toString(sec)+":"+Integer.toString(min);
            }
        });
        }
        
        public String toString(){
        return clockTimeString;
        }
        
      public void start(){
      timer.start();
          System.out.println("timer called");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Clock.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("tick is"+tick);
          
      }
      public void stop(){
      timer.stop();
      }
    }

