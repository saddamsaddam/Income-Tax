/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Registration;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author 01957
 */
public class AssetsLiabilitys extends JFrame {
     JScrollPane  scrollPane;
      JButton button;
      JTextArea jt;
    public AssetsLiabilitys()
    {
      
       
      
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       this.setLayout(null);
       
       Dimension screen=Toolkit.getDefaultToolkit().getScreenSize();
        this.setSize(screen.width,screen.height);
        
        this.setVisible(true);
       
//scroll panel
        jt=new JTextArea();
          jt.setBounds(50, 0, 500, 500);
         scrollPane=new   JScrollPane(jt);
          
        scrollPane.setBounds(0, 0,screen.width-50,screen.height-150);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
         scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        this.add(scrollPane);

      /*
      
      */
        
    }
   
    
     public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new  AssetsLiabilitys().setVisible(true);
               
                
            }
        });
    }
    
}
