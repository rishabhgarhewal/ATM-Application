package ASimulatorSystem;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Transcations extends JFrame implements ActionListener{

    JLabel l1;
    JButton b1,b2,b3,b4,b5,b6,b7;
    
    Transcations(){ // Assigning constructor transcations
  
   // Move text to the center
        setFont(new Font("System", Font.BOLD, 22));
        Font f = getFont();
        FontMetrics fm = getFontMetrics(f);
        int x = fm.stringWidth("TRANSACTION");
        int y = fm.stringWidth(" ");
        int z = getWidth() - (3*x);
        int w = z/y;
        String pad ="";
        //for (int i=0; i!=w; i++) pad +=" ";   
        pad = String.format("%"+w+"s", pad);
        setTitle(pad + "TRANSACTION");
    
        l1 = new JLabel("Please Select Your Transaction");
        l1.setFont(new Font("System", Font.BOLD, 28));
       
        b1 = new JButton("DEPOSIT");
        b1.setFont(new Font("System", Font.BOLD, 18));
        b1.setBackground(Color.RED);
        b1.setForeground(Color.WHITE);
    
        b2 = new JButton("CASH WITHDRAWL");
        b2.setFont(new Font("System", Font.BOLD, 18));
        b2.setBackground(Color.RED);
        b2.setForeground(Color.WHITE);
        
        b3 = new JButton("FAST CASH");
        b3.setFont(new Font("System", Font.BOLD, 18));
        b3.setBackground(Color.RED);
        b3.setForeground(Color.WHITE);
        
        b4 = new JButton("MINI STATEMENT");
        b4.setFont(new Font("System", Font.BOLD, 18));
        b4.setBackground(Color.RED);
        b4.setForeground(Color.WHITE);
        
        b5 = new JButton("PIN CHANGE");
        b5.setFont(new Font("System", Font.BOLD, 18));
        b5.setBackground(Color.RED);
        b5.setForeground(Color.WHITE);
        
        b6 = new JButton("BALANCE INQUIRY");
        b6.setFont(new Font("System", Font.BOLD, 18));
        b6.setBackground(Color.RED);
        b6.setForeground(Color.WHITE);
        
        b7 = new JButton("EXIT");
        b7.setFont(new Font("System", Font.BOLD, 18));
        b7.setBackground(Color.BLACK);
        b7.setForeground(Color.WHITE);
 
     // By default border layout
        setLayout(null);
 
      // Set bounds is a method of the java.awt.component class
     // It is used to set the size & position of component
    // (integer x, integer y, integer width, integer height)
        l1.setBounds(100,100,700,40);
        add(l1); // To show it on the frame
        
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
        
        b6.setBounds(440,470,300,60);
        add(b6);
        
        b7.setBounds(240,600,300,60);
        add(b7);
        
   // Assigning action listener to all 7 buttons
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        
  // To set the content pane color to White      
        getContentPane().setBackground(Color.WHITE);
        
        setSize(800,800); // Setting size of the frame
        setLocation(500,90);
        setVisible(true); // To show the frame. By default it is false
        
    }
    
    public void actionPerformed(ActionEvent ae){
        
        if(ae.getSource()==b1){ 
        	
  // Calling the deposit class & opening the deposit frame           
            new Deposit().setVisible(true);
            setVisible(false);
            
        }
        else if(ae.getSource()==b2){ 
        
 // Calling the withdraw class & opening the withdraw frame 
            new Withdrawl().setVisible(true);
            setVisible(false);
            
        }
        else if(ae.getSource()==b3){ 
 
 // Calling the fast cash & opening the fast cash frame 
            new FastCash().setVisible(true);
            setVisible(false);
            
        }else if(ae.getSource()==b4){ 

// Calling the mini statement class & opening the mini statement frame           
            new MiniStatement().setVisible(true);
            setVisible(false);
            
        }else if(ae.getSource()==b5){ 
 
// Calling the Pin class & opening the pin frame             
            new Pin().setVisible(true);
            setVisible(false);
            
        }else if(ae.getSource()==b6){ // b6 is Balance Inquiry
 
    // showInputDialog is used when we take input from the user           
            String pinn = JOptionPane.showInputDialog("Enter your PIN"); 
         
     // Making object of the class conn
            conn c1 = new conn();
                    
            try {
    
 // ORDER BY keyword is used to sort the result in ASC/DSC order
// DESC LIMIT 1 is used to retrieve the last row from where the PIN matches coz the final balance stores there  
                ResultSet rs = c1.s.executeQuery(" SELECT balance FROM bank ORDER BY pin  = '"+pinn+"' DESC LIMIT 1");
     
          // Check each column of the database 
                if(rs.next()){
    
 // Retrieving the balance & storing it in string balance        
                String balance = rs.getString("balance");
 
 // Displaying user the updated balance
// showMessageDialog is used when we displays output to  the user
                JOptionPane.showMessageDialog(null,"Your Account Balance is "+ balance);
                
                }           
                
            } catch (Exception e) {
             
                e.printStackTrace();
            
            }   
        }else if(ae.getSource()==b7){ 
            
            System.exit(0);
            
        }                 
        
    }
    
    public static void main(String[] args){
        new Transcations().setVisible(true);
    }
}