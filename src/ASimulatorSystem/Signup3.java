
package ASimulatorSystem;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.util.*; // Since I'm generating 16 digit random credit card number

public class Signup3 extends JFrame implements ActionListener{
    
    /**
	 * 
	 */
	private static final long serialVersionUID = -8981566086048594627L;
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11;
    JRadioButton r1,r2,r3,r4;
    JButton b1,b2;
    JCheckBox c1,c2,c3,c4,c5,c6,c7;
    JTextField t1;
    
    Signup3(){ // Assigning constructor Signup3
     
    // Move text to the center
        setFont(new Font("System", Font.BOLD, 22));
        Font f = getFont();
        FontMetrics fm = getFontMetrics(f);
        int x = fm.stringWidth("STEP 3- NEW ACCOUNT SIGNUP FORM");
        int y = fm.stringWidth(" ");
        int z = getWidth()/2 - (x/2);
        int w = z/y;
        String pad ="";
        //for (int i=0; i!=w; i++) pad +=" ";   
        pad = String.format("%"+w+"s", pad);
        setTitle(pad+"STEP 3- NEW ACCOUNT SIGNUP FORM");
        
        l1 = new JLabel("Page 3: Account Details");
        l1.setFont(new Font("Raleway", Font.BOLD, 22));
        
        l2 = new JLabel("Account Type:");
        l2.setFont(new Font("Raleway", Font.BOLD, 18));
        
        l3 = new JLabel("Card Number:");
        l3.setFont(new Font("Raleway", Font.BOLD, 18));
        
        l4 = new JLabel("XXXX-XXXX-XXXX-1005");
        l4.setFont(new Font("Raleway", Font.BOLD, 18));
        
        l5 = new JLabel("(Your 16-digit credit card number)");
        l5.setFont(new Font("Raleway", Font.BOLD, 11));
        
        l6 = new JLabel("It would appear on ATM Card and Statements");
        l6.setFont(new Font("Raleway", Font.BOLD, 11));
        
        l7 = new JLabel("PIN:");
        l7.setFont(new Font("Raleway", Font.BOLD, 18));
        
        l8 = new JLabel("XXXX");
        l8.setFont(new Font("Raleway", Font.BOLD, 18));
    
        l9 = new JLabel("(4-digit pin)");
        l9.setFont(new Font("Raleway", Font.BOLD, 11));
    
        l10 = new JLabel("Services Required:");
        l10.setFont(new Font("Raleway", Font.BOLD, 18));
        
        l11 = new JLabel("Form No:");
        l11.setFont(new Font("Raleway", Font.BOLD, 14));
        
        b1 = new JButton("Submit");
        b1.setFont(new Font("Raleway", Font.BOLD, 14));
        b1.setBackground(Color.WHITE);
        b1.setForeground(Color.BLACK);
        
        b2 = new JButton("Cancel");
        b2.setFont(new Font("Raleway", Font.BOLD, 14));
        b2.setBackground(Color.WHITE);
        b2.setForeground(Color.BLACK);
        
        c1 = new JCheckBox("Credit Card");
        c1.setBackground(Color.WHITE);
        c1.setFont(new Font("Raleway", Font.BOLD, 16));
        
        c2 = new JCheckBox("Internet Banking");
        c2.setBackground(Color.WHITE);
        c2.setFont(new Font("Raleway", Font.BOLD, 16));
        
        c3 = new JCheckBox("Mobile App Sign Up");
        c3.setBackground(Color.WHITE);
        c3.setFont(new Font("Raleway", Font.BOLD, 16));
        
        c4 = new JCheckBox("Email Alerts");
        c4.setBackground(Color.WHITE);
        c4.setFont(new Font("Raleway", Font.BOLD, 16));
        
        c5 = new JCheckBox("Cheque Book");
        c5.setBackground(Color.WHITE);
        c5.setFont(new Font("Raleway", Font.BOLD, 16));
        
        c6 = new JCheckBox("E-Statements");
        c6.setBackground(Color.WHITE);
        c6.setFont(new Font("Raleway", Font.BOLD, 16));
        
        c7 = new JCheckBox("I hereby declares that the above entered details correct and true my knowledge.",true);
        c7.setBackground(Color.WHITE);
        c7.setFont(new Font("Raleway", Font.BOLD, 11));
        
        r1 = new JRadioButton("Savings Account");
        r1.setFont(new Font("Raleway", Font.BOLD, 16));
        r1.setBackground(Color.WHITE);
        
        r2 = new JRadioButton("Investments Account");
        r2.setFont(new Font("Raleway", Font.BOLD, 16));
        r2.setBackground(Color.WHITE);
        
        r3 = new JRadioButton("Chequing Account");
        r3.setFont(new Font("Raleway", Font.BOLD, 16));
        r3.setBackground(Color.WHITE);
        
        r4 = new JRadioButton("RD Account");
        r4.setFont(new Font("Raleway", Font.BOLD, 16));
        r4.setBackground(Color.WHITE);
        
        t1 = new JTextField();
        t1.setFont(new Font("Raleway", Font.BOLD, 11));
        
     // By default border layout
        setLayout(null);
    
     // Set bounds is a method of the java.awt.component class
     // It is used to set the size & position of component
     // (integer x, integer y, integer width, integer height) 
        l11.setBounds(700,10,70,30);
        add(l11); // To show it on the frame
        
        t1.setBounds(770,10,40,30);
        add(t1);
        
        l1.setBounds(280,50,400,40);
        add(l1); 
        
        l2.setBounds(100,140,200,30);
        add(l2);
        
        r1.setBounds(100,180,180,30);
        add(r1);
        
        r2.setBounds(350,180,300,30);
        add(r2);
        
        r3.setBounds(100,220,250,30);
        add(r3);
        
        r4.setBounds(350,220,250,30);
        add(r4);
        
        l3.setBounds(100,300,200,30);
        add(l3);
        
        l4.setBounds(330,300,250,30);
        add(l4);
        
        l5.setBounds(100,330,200,20);
        add(l5);
        
        l6.setBounds(330,330,500,20);
        add(l6);
        
        l7.setBounds(100,370,200,30);
        add(l7);
        
        l8.setBounds(330,370,200,30);
        add(l8);
        
        l9.setBounds(100,400,200,20);
        add(l9);
        
        l10.setBounds(100,450,200,30);
        add(l10);
        
        c1.setBounds(100,500,200,30);
        add(c1);
        
        c2.setBounds(350,500,200,30);
        add(c2);
        
        c3.setBounds(100,550,200,30);
        add(c3);
        
        c4.setBounds(350,550,200,30);
        add(c4);
        
        c5.setBounds(100,600,200,30);
        add(c5);
        
        c6.setBounds(350,600,200,30);
        add(c6);
        
        c7.setBounds(100,680,600,20);
        add(c7);
        
        b1.setBounds(300,720,100,30);
        add(b1);
        
        b2.setBounds(420,720,100,30);
        add(b2);
        
  // To set the content pane color to White
        getContentPane().setBackground(Color.WHITE);
        
        setSize(850,850); // Setting size of the frame
        setLocation(500,90);
        setVisible(true); // To show the frame. By default it is false
    
 // To get the work done, I used action listener function 
        b1.addActionListener(this);
        b2.addActionListener(this);
        
    }
    
    public void actionPerformed(ActionEvent ae){
        
        String a = null;
        if(r1.isSelected()){ 
            a = "Savings Account";
        }
        else if(r2.isSelected()){ 
            a = "Investments Account";
        }
        else if(r3.isSelected()){ 
            a = "Chequing Account";
            
        }else if(r4.isSelected()){ 
            a = "RD Account";
        }
        
        Random ran = new Random();
        
   // Generating 16 digit random credit card number
        long first7 = (ran.nextLong() % 90000000L) + 6134131000000000L;
        long first8 = Math.abs(first7); // To get only positive numbers
        
  // Generating 4 digit random PIN number
        long first3 = (ran.nextLong() % 9000L) + 1000L;
        long first4 = Math.abs(first3); // To get only positive numbers
        
        String b = "";
        if(c1.isSelected()){ 
        	
  // Using concatenation since user can input multiple values-remember it's check box
            b = b+" Credit Card";
        }
        
  // If loop will only run when user click on the check box
        if(c2.isSelected()){ 
            b = b+" Internet Banking";
        }
        if(c3.isSelected()){ 
            b = b+" Mobile App Sign Up";
        }
        if(c4.isSelected()){ 
            b = b+" Email Alerts";
        }
        if(c5.isSelected()){ 
            b = b+" Cheque Book";
        }
        if(c6.isSelected()){ 
            b = b+" E-Statements";
        }
        
        String c = t1.getText(); //To get text from the text field 
        
        try{
            
            if(ae.getSource()==b1){
                
                if(b.equals("")){
                
                    JOptionPane.showMessageDialog(null, "All fields are required!!");
                
                }else{
                
// Create an object of conn class to setup connection with the database
                    conn c1 = new conn();

//If new user is created then we need data in both the tables signup3 & login
                    String q1 = "insert into signup3 values('"+a+"','"+first8+"','"+first4+"','"+b+"','"+c+"')";  
                    String q2 = "insert into login values('"+first8+"','"+first4+"')"; // Only need Credit card number & PIN. So inserting them into database 
                    
                    c1.s.executeUpdate(q1); //Updating q1 into database
                    c1.s.executeUpdate(q2); //Updating q2 into database

// Displaying the credit card number & PIN to the new user
                    JOptionPane.showMessageDialog(null,"!! DO NOT FORGET !!" + "\n Credit Card Number: " + first8 + "\n Pin:"+ first4);

// User can deposit money into the new account                   
                    new Deposit().setVisible(true);
                    setVisible(false);
                }
// b2 is Cancel button, in case user want to exit            
            }else if(ae.getSource()==b2){
                System.exit(0); // Program will terminate. 0 means true 
            }
            
        }catch(Exception ex){
            ex.printStackTrace();
        }
        
    }
    
    public static void main(String[] args){
        new Signup3().setVisible(true);
    }
    
}


