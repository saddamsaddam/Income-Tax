/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/*
Rule
       take container
       fist take container or jpanel() and gridlayout class
         grid_name=new GridLayout();
         bc=new JPanel();
       then setlaout to container
        container_name.setLayout(bt1gl);
       */
package Registration;

import java.awt.Color;
import java.awt.Container;
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
public class AssetsLiabilitys extends JFrame {
     //JScrollPane  scrollPane;
      //JButton button;
     // JTextArea jt;
      Container c;
      JPanel bc;
      GridLayout gl ,bt1gl;
      JButton btn1,btn2,btn3,btn4;
       JButton bt1,bt2,bt3,bt4;
    public AssetsLiabilitys()
    {
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       this.setTitle("GridView");
       this.setBounds(0,0,400, 400);
       this.setLayout(null);
       
       
       //taking first block gridlayout
        bt1gl=new GridLayout();
       bc=new JPanel();
       bc.setLayout(bt1gl);
       
         bt1=new JButton("1");
          bt2=new JButton("2");
            bt3=new JButton("3");
              bt4=new JButton("4");
        bc.add(bt1);
        bc.add(bt2);
        bc.add(bt3);
        bc.add(bt4);
        //taking main gridlayout
        c=this.getContentPane();
        //GridLayOut
        gl=new GridLayout(2,2,5,5);
        c.setLayout(gl);
        
       
          btn2=new JButton("2");
            btn3=new JButton("3");
              btn4=new JButton("4");
        c.add(bc);
        c.add(btn2);
        c.add(btn3);
        c.add(btn4);
      
       
      // Dimension screen=Toolkit.getDefaultToolkit().getScreenSize();
       // this.setSize(screen.width,screen.height);
        
       // this.setVisible(true);
        
       /*
//scroll panel
        jt=new JTextArea();
          jt.setBounds(50, 0, 200, 500);
          jt.setBackground(Color.red);
         scrollPane=new   JScrollPane(jt);
          
        scrollPane.setBounds(0, 0,screen.width-50,screen.height-150);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
         scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        this.add(scrollPane);

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
