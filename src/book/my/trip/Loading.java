package book.my.trip;

import javax.swing.*;
import java.awt.*;

public class Loading extends JFrame implements Runnable {
    
      Thread t;
      JProgressBar bar;
      String username;
      
      public void run(){
          try{
              for (int i = 1; i<= 101; i++){
              int max = bar.getMaximum();
              int value = bar.getValue();
              
              if( value < max){
                  bar.setValue(bar.getValue() + 1);
                  
              }else{
                setVisible(false);  
                new Dashboard(username);
                  
              }
              
              Thread.sleep(50);
              
            }
          }catch(Exception e){
              e.printStackTrace();
          }
      }
    
    
    
    
    Loading( String username){
        this.username = username;
        
        t = new Thread(this);
        setBounds(500, 200, 650,400);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel text = new JLabel("Boook My Trip");
        text.setBounds(180, 30, 900, 50);
        text.setForeground(Color.BLUE);
        text.setFont(new Font("Raleway", Font.BOLD,35));
        add(text);
        
        
        bar = new JProgressBar();
        bar.setBounds(150, 100, 300, 35);
        bar.setStringPainted(true);
        add(bar);
        
         JLabel loading = new JLabel("Loading, Please wait...");
        loading.setBounds(230, 110, 900, 80);
        loading.setForeground(Color.GREEN);
        loading.setFont(new Font("Raleway", Font.BOLD,14));
        add(loading);
        
        
         JLabel lbusername = new JLabel(" Welcome " + username);
        lbusername.setBounds(20, 310, 400, 30);
        lbusername.setForeground(Color.GREEN);
        lbusername.setFont(new Font("Raleway", Font.BOLD,15));
        add(lbusername);
        
        t.start();
        
        setVisible(true);
    }
    
    public static void main(String[] args){
        
        new Loading("");
    }
}
