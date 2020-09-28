package ASimulatorSystem;

import java.awt.*; // Import the class AWT to use it's features
import java.awt.event.*;
import javax.swing.*; // Import the class Swing to use it's features
import java.sql.*; // Import the class MySQL  to use it's features

public class Login extends JFrame implements ActionListener{ //Used to perform the clear action
    /**
	 * 
	 */
	private static final long serialVersionUID = 5273355937119205990L;
	
	// Defining global variables. Using them outside the function as well
	JLabel l1,l2,l3,l4,l5;
    JTextField tf1;
    JPasswordField pf2;
    JButton b1,b2,b3;
  
    Login(){ // Assigning constructor login
        
  //For Center alignment 
        setFont(new Font("System", Font.BOLD, 22));
        Font f = getFont();
        FontMetrics fm = getFontMetrics(f);
        int x = fm.stringWidth("ATM - By Rishabh");
        int y = fm.stringWidth(" ");
        int z = getWidth() - x;
        int w = z/y;
        String pad ="";
        //for (int i=0; i!=w; i++) pad +=" ";   
        pad = String.format("%"+w+"s", pad);
        setTitle(pad + "BANK OF CANADA APPLICATION");
        
        l1 = new JLabel("Bank of Canada ATM APPLICATION");
        l1.setFont(new Font("Osward", Font.BOLD, 28));
        
        l4 = new JLabel("(This application is made by Rishabh Garhewal for the Java project demonstration purposes only)");
        l4.setFont(new Font("Osward", Font.ITALIC, 13));
        
        l2 = new JLabel("Card Number");
        l2.setFont(new Font("Raleway", Font.BOLD, 18));
        
        l3 = new JLabel("PIN");
        l3.setFont(new Font("Raleway", Font.BOLD, 18));
        
        l5 = new JLabel("Become a Bank of Canada customer. Join us today.");
        l5.setFont(new Font("Raleway", Font.BOLD, 18));
        
        tf1 = new JTextField(15);
        pf2 = new JPasswordField(15);
        
        b1 = new JButton("SIGN IN");
        b1.setBackground(Color.WHITE);
        b1.setForeground(Color.BLACK);
        
        b2 = new JButton("CLEAR");
        b2.setBackground(Color.WHITE);
        b2.setForeground(Color.BLACK);
        
        b3 = new JButton("SIGN UP");
        b3.setBackground(Color.WHITE);
        b3.setForeground(Color.BLACK);
        
        setLayout(null);
        
// Set bounds is a method of the java.awt.component class
// It is used to set the size & position of component
// (integer x, integer y, integer width, integer height)  
        l1.setBounds(175,50,650,200);
        add(l1); // Used to show in the frame
        
        l4.setBounds(120,80,650,200);
        add(l4);
        
        l2.setBounds(125,150,375,200);
        add(l2);
        
        tf1.setBounds(300,235,230,30);
        add(tf1);
        
        l3.setBounds(125,225,375,200);
        add(l3);
        
        l5.setBounds(180,360,480,200);
        add(l5);
        
        tf1.setFont(new Font("Arial", Font.BOLD, 14));
        
        pf2.setFont(new Font("Arial", Font.BOLD, 14));
        pf2.setBounds(300,310,230,30);
        add(pf2);
        
        b1.setFont(new Font("Arial", Font.BOLD, 14));
        b1.setBounds(300,400,100,30);
        add(b1);
        
        b2.setFont(new Font("Arial", Font.BOLD, 14));
        b2.setBounds(430,400,100,30);
        add(b2);
        
        b3.setFont(new Font("Arial", Font.BOLD, 14));
        b3.setBounds(300,480,230,30);
        add(b3);
        
        b1.addActionListener(this); // To perform action on button b1 & passes current class reference this
        b2.addActionListener(this); // To perform action on button b2
        b3.addActionListener(this); // To perform action on button b3
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(850,850); // Setting size of the frame
        setLocation(400,200);
        setVisible(true); // To show the frame. By default it is false
         
    }
    public void actionPerformed(ActionEvent ae){
       
        try{        
            conn c1 = new conn(); // Making object of the class conn
            String a  = tf1.getText(); // Get text is a function to retrieve data 
            String b  = pf2.getText();
           
            // String q only retrieve correct data
            // Card no & PIN must be matches to get access 
            // If I add wrong PIN then it doesn't work
            String q  = "select * from login where cardno = '"+a+"' and pin = '"+b+"'";
           
            ResultSet rs = c1.s.executeQuery(q); 
            // executeQuery is used to retrieve data from database
            // executeUpdate is used to add data in the database 
            // ResultSet is a java object that contains the results of executing an SQL query. It contains the row that satisfies the conditions of query
            
            if(ae.getSource()==b1){ // When I click on Sign in then it goes into ae. It must be = to b1
                if(rs.next()){ // Next is used to jump & look through each column in database
                   
            // If rs = c1 then it will open a new transcations class
            // Set visible is used to open a new frame
                	new Transcations().setVisible(true);
           
                	setVisible(false); // Old frame closed
                
                }else{
             // If card number & PIN does not match
                    JOptionPane.showMessageDialog(null, "Invaild number or Password");
                }
            }else if(ae.getSource()==b2){ // b2 is CLEAR button
                tf1.setText(""); // Set text is a function to set/add data in the database
                pf2.setText("");
            }else if(ae.getSource()==b3){ // b3 is SIGNUP button 
                new Signup().setVisible(true);
                setVisible(false); // Close the current frame
            }
        }catch(Exception e){
                    e.printStackTrace();
                    System.out.println("error: "+e);
        }
            
    }
    
    public static void main(String[] args){
        new Login().setVisible(true);
    }
    
}