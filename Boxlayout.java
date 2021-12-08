         p1=new JPanel();
        // p1.setLayout(new GridLayout(47,1));
         box=new BoxLayout(p1,BoxLayout.Y_AXIS);
         p1.setLayout(box);
         
     p1.add(btn1);
          p1.add(Box.createVerticalStrut(50));

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Registration;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author 01957
 */

public class AssetLiabilitys extends JFrame {
     JPanel p1;
     JPanel P2;
     JPanel main;
     JScrollPane jc;
     JButton btn1;
    JButton btn2;
    JTextArea ta;
    BoxLayout box;
    JLabel header;
    public AssetLiabilitys(){
        intitcom();
        addScrollPane();
        
    }
 public void intitcom()
 {
        this.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
          Dimension screen=Toolkit.getDefaultToolkit().getScreenSize();
          this.setSize(screen.width-20, screen.height-70);
               setTitle("MultiPanel Test");
       
       
        
 }
 public void addScrollPane()
 {
        p1=new JPanel();
         box=new BoxLayout(p1,BoxLayout.Y_AXIS);
         p1.setLayout(box);
         header=new JLabel("okk");
         header.setSize(1200, 20);
         header.setBackground(Color.red);
         p1.add(header);
         
        
       
    
        for(int i=3;i<50;i++)
        {
             JLabel jj=new JLabel("btn"+i);
            if(i==3)
            {
             
            p1.add(Box.createHorizontalStrut(5));
            p1.add(Box.createVerticalStrut(50)); 
           p1.add(jj);
           p1.add(Box.createVerticalStrut(50));  
            }
            else{
            p1.add(Box.createHorizontalStrut(5));
           p1.add(jj);
           p1.add(Box.createVerticalStrut(50));  
            }
           

        }
   
        jc=new  JScrollPane(p1);
         
        jc.setVerticalScrollBarPolicy( JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        this.add(jc); 
         this.setVisible(true); 
 }
   public static void main(String[] args) {
        AssetLiabilitys window = new AssetLiabilitys();
        

    }  
}

        
