package ASimulatorSystem;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.util.*;

public class Deposit extends JFrame implements ActionListener{
    
    /**
	 * 
	 */
	private static final long serialVersionUID = -720144571171785203L;
	JTextField t1,t2;
    JButton b1,b2,b3;
    JLabel l1,l2,l3;
    
    Deposit(){ // Assigning constructor deposit
   
   // Moving text to the center     
        setFont(new Font("System", Font.BOLD, 22));
        Font f = getFont();
        FontMetrics fm = getFontMetrics(f);
        int x = fm.stringWidth("DEPOSIT");
        int y = fm.stringWidth(" ");
        int z = getWidth() - (5*x);
        int w = z/y;
        String pad ="";
        //for (int i=0; i!=w; i++) pad +=" ";   
        pad = String.format("%"+w+"s", pad);
        setTitle(pad + "DEPOSIT");
        
        
        l1 = new JLabel("ENTER AMOUNT YOU WANT");
        l1.setFont(new Font("System", Font.BOLD, 28));
        
        l2 = new JLabel("TO DEPOSIT");
        l2.setFont(new Font("System", Font.BOLD, 28));
        
        l3 = new JLabel("Enter Pin");
        l3.setFont(new Font("System", Font.BOLD, 14));
        
        t1 = new JTextField();
        t1.setFont(new Font("Raleway", Font.BOLD, 22));
        
        t2 = new JTextField();
        t2.setFont(new Font("Raleway", Font.BOLD, 14));
        
        b1 = new JButton("DEPOSIT");
        b1.setFont(new Font("System", Font.BOLD, 18));
        b1.setBackground(Color.RED);
        b1.setForeground(Color.WHITE);
    
        b2 = new JButton("BACK");
        b2.setFont(new Font("System", Font.BOLD, 18));
        b2.setBackground(Color.RED);
        b2.setForeground(Color.WHITE);
        
        b3 = new JButton("EXIT");
        b3.setFont(new Font("System", Font.BOLD, 18));
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        
 // By default border layout
        setLayout(null);
        
     // Set bounds is a method of the java.awt.component class
    // It is used to set the size & position of component
   // (integer x, integer y, integer width, integer height)
        l3.setBounds(620,10,80,30);
        add(l3); // To show it on the frame
        
        t2.setBounds(700,10,40,30);
        add(t2);
        
        l1.setBounds(180,160,800,60);
        add(l1);
        
        l2.setBounds(300,210,800,60);
        add(l2);
        
        t1.setBounds(250,300,300,50);
        add(t1);
        
        b1.setBounds(260,380,125,50);
        add(b1);
        
        b2.setBounds(415,380,125,50);
        add(b2);
        
        b3.setBounds(300,550,200,50);
        add(b3);
    
  // Assigning action listener to all 3 buttons
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
  
 // To set the content pane color to White  
        getContentPane().setBackground(Color.WHITE);
        
        setSize(800,800); // Setting size of the frame
        setLocation(500,90);
        setVisible(true); // To show the frame. By default it is false
    }
    
    public void actionPerformed(ActionEvent ae){
       
        try{        
      
    //These will retrieve the selected data from the text fields  
            String a = t1.getText(); //To retrieve information 
            String b = t2.getText();
            
            if(ae.getSource()==b1){
                if(t1.getText().equals("")){ // If user leave the text field blank
                	
 // showMessageDialog is used when we displays output to the user               
                    JOptionPane.showMessageDialog(null, "Please enter the Amount to you want to Deposit");
                
                }else{
                   
            // Making object of the class conn
                    conn c1 = new conn();
    
  // If user input PIN matches then we will insert the data into rs
                    ResultSet rs = c1.s.executeQuery(" select * from bank where pin = '"+b+"' ");
                    
                    double balance = 0;
                    if(rs.next()){
                        String pin = rs.getString("pin"); // Retrieve PIN
 						while(rs.next()) {                       
                        balance = rs.getDouble("balance"); // Retrieve Balance
                        }
                        
                        double d = Double.parseDouble(a);
                        balance+=d; // Adding user input deposit into the balance
 
          // Inserting final balance into the database
                        String q1= "insert into bank values('"+pin+"','"+d+"',null,'"+balance+"')";
                    
                        c1.s.executeUpdate(q1);
                    }
                    
                    JOptionPane.showMessageDialog(null, "$ "+a+" Deposited Successfully");
                    
                    new Transcations().setVisible(true); // Opening transcation frame
                    setVisible(false); // Closing current frame
                           
                }
                
            }else if(ae.getSource()==b2){ // If user clicked on back button
                
                new Transcations().setVisible(true);
                setVisible(false); // Closing current frame
                
            }else if(ae.getSource()==b3){ // If user clicked on exit button
                
                System.exit(0); // Exit
                
            }
        }catch(Exception e){
                e.printStackTrace();
                System.out.println("error: "+e);
        }
            
    }
    
    public static void main(String[] args){
        new Deposit().setVisible(true);
    }
}