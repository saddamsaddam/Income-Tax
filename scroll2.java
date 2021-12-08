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
import javax.swing.JButton;
import javax.swing.JFrame;
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
    public AssetLiabilitys(){
        intitcom();
        addScrollPane();
        
    }
 public void intitcom()
 {
        this.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
          Dimension screen=Toolkit.getDefaultToolkit().getScreenSize();
          this.setSize(screen.width, 1200);
        this.setLayout(null);
        this.setVisible(true); 
       
        
 }
 public void addScrollPane()
 {
        btn1=new JButton("o");
        p1=new JPanel();
         p1.setLayout(new GridLayout(47,1));
        
       
    
        for(int i=3;i<50;i++)
        {
           JButton jj=new JButton("btn"+i);
           p1.add(jj);
        }
        jc=new  JScrollPane(p1);
           Dimension screen=Toolkit.getDefaultToolkit().getScreenSize();
        jc.setBounds(0, 0,screen.width-20,screen.height-70);
        jc.setVerticalScrollBarPolicy( JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        this.add(jc);  
 }
   public static void main(String[] args) {
        AssetLiabilitys window = new AssetLiabilitys();
        

    }  
}
