package ASimulatorSystem;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.util.*;

public class FastCash extends JFrame implements ActionListener{

    /**
	 * 
	 */
	private static final long serialVersionUID = -2608871522127734067L;
	JLabel l1,l2;
    JButton b1,b2,b3,b4,b5,b6,b7,b8;
    JTextField t1;
    
    FastCash(){ // Assigning constructor FastCash
   
   // Move text to the center
        setFont(new Font("System", Font.BOLD, 22));
        Font f = getFont();
        FontMetrics fm = getFontMetrics(f);
        int x = fm.stringWidth("FAST CASH");
        int y = fm.stringWidth(" ");
        int z = getWidth() - (4*x);
        int w = z/y;
        String pad ="";
        //for (int i=0; i!=w; i++) pad +=" ";   
        pad = String.format("%"+w+"s", pad);
        setTitle(pad+"FAST CASH");
        
        l1 = new JLabel("SELECT WITHDRAWL AMOUNT");
        l1.setFont(new Font("System", Font.BOLD, 38));
        
        l2 = new JLabel("Enter PIN");
        l2.setFont(new Font("System", Font.BOLD, 13));
        
        t1 = new JTextField();
        t1.setFont(new Font("System", Font.BOLD, 13));
       
        b1 = new JButton("$5");
        b1.setFont(new Font("System", Font.BOLD, 18));
        b1.setBackground(Color.WHITE);
        b1.setForeground(Color.BLACK);
    
        b2 = new JButton("$10");
        b2.setFont(new Font("System", Font.BOLD, 18));
        b2.setBackground(Color.WHITE);
        b2.setForeground(Color.BLACK);
        
        b3 = new JButton("$20");
        b3.setFont(new Font("System", Font.BOLD, 18));
        b3.setBackground(Color.WHITE);
        b3.setForeground(Color.BLACK);
        
        b4 = new JButton("$50");
        b4.setFont(new Font("System", Font.BOLD, 18));
        b4.setBackground(Color.WHITE);
        b4.setForeground(Color.BLACK);
        
        b5 = new JButton("$100");
        b5.setFont(new Font("System", Font.BOLD, 18));
        b5.setBackground(Color.WHITE);
        b5.setForeground(Color.BLACK);
        
     /*   b6 = new JButton("$1");
        b6.setFont(new Font("System", Font.BOLD, 18));
        b6.setBackground(Color.BLACK);
        b6.setForeground(Color.WHITE); */
        
        b7 = new JButton("BACK");
        b7.setFont(new Font("System", Font.BOLD, 18));
        b7.setBackground(Color.WHITE);
        b7.setForeground(Color.BLACK);
        
        b7 = new JButton("EXIT");
        b7.setFont(new Font("System", Font.BOLD, 18));
        b7.setBackground(Color.WHITE);
        b7.setForeground(Color.BLACK);
        
     // By default border layout  
        setLayout(null);
     
     // Set bounds is a method of the java.awt.component class
     // It is used to set the size & position of component
    // (integer x, integer y, integer width, integer height) 
        l2.setBounds(640,10,60,40);
        add(l2);
        
        t1.setBounds(710,10,60,40);
        add(t1);
        
        l1.setBounds(100,100,700,40);
        add(l1);
        
        b1.setBounds(40,250,300,60);
        add(b1);
        
        b2.setBounds(440,250,300,60);
        add(b2);
        
        b3.setBounds(40,360,300,60);
        add(b3);
        
        b4.setBounds(440,360,300,60);
        add(b4);
        
        b5.setBounds(40,470,300,60);
        add(b5);
        
      //  b6.setBounds(440,470,300,60);
      // add(b6);
        
        b7.setBounds(240,600,300,60);
        add(b7);
        
   // Assigning action listener to all 7 buttons      
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
   //   b6.addActionListener(this);
        b7.addActionListener(this);
       
  // To set the content pane color to White      
        getContentPane().setBackground(Color.WHITE);
        
        setSize(800,800); // Setting size of the frame
        setLocation(500,90);
        setVisible(true);  // To show the frame. By default it is false
        
    }
    
    public void actionPerformed(ActionEvent ae){
       
            try{        
           
            String a = t1.getText();
            double balance = 0;
            
            if(ae.getSource()==b1){
                
            // Making object of the class conn 
            	conn c1 = new conn();
                    
                    ResultSet rs = c1.s.executeQuery(" select * from bank where pin = '"+a+"' ");     
                    
                    if(rs.next()){
                        String pin = rs.getString("pin"); 
                        balance = rs.getDouble("balance");
                        balance-=5; // Deducting $5 from the database
                        
                //Inserting new balance into the database 
                        String q1= "insert into bank values('"+pin+"',null,5,'"+balance+"')";
                    
                        c1.s.executeUpdate(q1); // Executing the SQL query
                    }
                
                    JOptionPane.showMessageDialog(null, "$"+5+" Debited Successfully");
                    
                    new Transcations().setVisible(true);
                    setVisible(false);         
            }
            
            else if(ae.getSource()==b2){
                
                    conn c1 = new conn();
                    
                    ResultSet rs = c1.s.executeQuery(" select * from bank where pin = '"+a+"' ");
                    
                    
                    if(rs.next()){
                        String pin = rs.getString("pin");
                        
                        balance = rs.getDouble("balance");
                     
                        balance-=10;
                        String q1= "insert into bank values('"+pin+"',null,10,'"+balance+"')";
                    
                        c1.s.executeUpdate(q1);
                    }
                
                    JOptionPane.showMessageDialog(null, "$"+10+" Debited Successfully");
                    
                    new Transcations().setVisible(true);
                    setVisible(false);
        
                }
            else if(ae.getSource()==b3){
                
                    conn c1 = new conn();
                    
                    ResultSet rs = c1.s.executeQuery(" select * from bank where pin = '"+a+"' ");
                    
                    
                    if(rs.next()){
                        String pin = rs.getString("pin");
                        
                        balance = rs.getDouble("balance");
                     
                        balance-=20;
                        String q1= "insert into bank values('"+pin+"',null,20,'"+balance+"')";
                    
                        c1.s.executeUpdate(q1);
                    }
                
                    JOptionPane.showMessageDialog(null, "$"+20+" Debited Successfully");
                    
                    new Transcations().setVisible(true);
                    setVisible(false);

                }
            else if(ae.getSource()==b4){
                
                    conn c1 = new conn();
                    
                    ResultSet rs = c1.s.executeQuery(" select * from bank where pin = '"+a+"' ");
                    
                    
                    if(rs.next()){
                        String pin = rs.getString("pin");
                        
                        balance = rs.getDouble("balance");
                     
                        balance-=50;
                        String q1= "insert into bank values('"+pin+"',null,50,'"+balance+"')";
                    
                        c1.s.executeUpdate(q1);
                    }
    
                    JOptionPane.showMessageDialog(null, "$"+50+" Debited Successfully");
                    
                    new Transcations().setVisible(true);
                    setVisible(false);
             
                }
            else if(ae.getSource()==b5){
                
                    conn c1 = new conn();
                    
                    ResultSet rs = c1.s.executeQuery(" select * from bank where pin = '"+a+"' ");
                    
                    
                    if(rs.next()){
                        String pin = rs.getString("pin");
                        
                        balance = rs.getDouble("balance");
                     
                        balance-=100;
                        String q1= "insert into bank values('"+pin+"',null,100,'"+balance+"')";
                    
                        c1.s.executeUpdate(q1);
                    }
           
                    JOptionPane.showMessageDialog(null, "$"+100+" Debited Successfully");
                    
                    new Transcations().setVisible(true);
                    setVisible(false);   
                }
     /*    else if(ae.getSource()==b6){
                
                    conn c1 = new conn();
                    
                    ResultSet rs = c1.s.executeQuery(" select * from bank where pin = '"+a+"' ");    
                    
                    if(rs.next()){
                        String pin = rs.getString("pin");
                        
                        balance = rs.getDouble("balance");
                     
                        balance-=1;
                        String q1= "insert into bank values('"+pin+"',null,1,'"+balance+"')";
                    
                        c1.s.executeUpdate(q1);
                    } 
                    JOptionPane.showMessageDialog(null, "$"+1+" Debited Successfully");
                    
                    new Transcations().setVisible(true);
                    setVisible(false); 
                    
                } */
                
            else if(ae.getSource()==b7){
                
                System.exit(0);
                
            }
        }catch(Exception e){
                e.printStackTrace();
                System.out.println("error: "+e);
        }
            
    }

    public static void main(String[] args){
        new FastCash().setVisible(true);
    }
}