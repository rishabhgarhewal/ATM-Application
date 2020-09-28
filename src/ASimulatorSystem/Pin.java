
package ASimulatorSystem;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class Pin extends JFrame implements ActionListener{
    
    /**
	 * 
	 */
	private static final long serialVersionUID = 1855551386367185472L;
	JPasswordField t1,t2,t3;
    JButton b1,b2;                               
    JLabel l1,l2,l3,l4;
    
    Pin(){ // Assigning constructor PIN
    	
    // Moving text to the center     
        setFont(new Font("System", Font.BOLD, 22));
        Font f = getFont();
        FontMetrics fm = getFontMetrics(f);
        int x = fm.stringWidth("PIN CHANGE");
        int y = fm.stringWidth(" ");
        int z = getWidth() - (3*x);
        int w = z/y;
        String pad ="";
        //for (int i=0; i!=w; i++) pad +=" ";   
        pad = String.format("%"+w+"s", pad);
        setTitle(pad+"PIN CHANGE");
        
        
        l1 = new JLabel("CHANGE YOUR PIN");
        l1.setFont(new Font("System", Font.BOLD, 25));
        
        l2 = new JLabel("Current PIN:");
        l2.setFont(new Font("System", Font.BOLD, 22));
        
        l3 = new JLabel("New PIN:");
        l3.setFont(new Font("System", Font.BOLD, 22));
        
        l4 = new JLabel("Re-Enter New PIN:");
        l4.setFont(new Font("System", Font.BOLD, 22));
        
        t1 = new JPasswordField();
        t1.setFont(new Font("Raleway", Font.BOLD, 22));
        
        t2 = new JPasswordField();
        t2.setFont(new Font("Raleway", Font.BOLD, 22));
        
        t3 = new JPasswordField();
        t3.setFont(new Font("Raleway", Font.BOLD, 22));
        
        b1 = new JButton("SAVE");
        b1.setFont(new Font("System", Font.BOLD, 18));
        b1.setBackground(Color.WHITE);
        b1.setForeground(Color.BLACK);
    
        b2 = new JButton("BACK");
        b2.setFont(new Font("System", Font.BOLD, 18));
        b2.setBackground(Color.WHITE);
        b2.setForeground(Color.BLACK);
    
     // Assigning action listener to all 2 buttons     
        b1.addActionListener(this);
        b2.addActionListener(this);
        
     // By default border layout    
        setLayout(null);
    
     // Set bounds is a method of the java.awt.component class
    // It is used to set the size & position of component
   // (integer x, integer y, integer width, integer height)  
        l1.setBounds(220,130,800,60);
        add(l1); // To show it on the frame
        
        l2.setBounds(100,240,150,40);
        add(l2);
        
        l3.setBounds(100,300,150,40);
        add(l3);
        
        l4.setBounds(100,360,200,40);
        add(l4);
        
        t1.setBounds(310,240,360,40);
        add(t1);
        
        t2.setBounds(310,300,360,40);
        add(t2);
        
        t3.setBounds(310,360,360,40);
        add(t3);
        
        b1.setBounds(220,460,160,50);
        add(b1);
        
        b2.setBounds(400,460,160,50);
        add(b2);
              
   // To set the content pane color to White         
        getContentPane().setBackground(Color.WHITE);
        
        setSize(800,800); // Setting size of the frame
        setLocation(500,90);
        setVisible(true); // To show the frame. By default it is false
    
    }
    
    public void actionPerformed(ActionEvent ae){
       
        try{        
        
       // These will retrieve the selected data from the text fields 
            String a = t1.getText(); // To retrieve information 
            String b = t2.getText();
            String c = t3.getText(); 
            
            if(ae.getSource()==b1){
                if(t1.getText().equals("")){ // If user leave the text field blank
      // showMessageDialog is used when we displays output to the user                     
                    JOptionPane.showMessageDialog(null, "Please Enter Current PIN");
                
                }
                if(t2.getText().equals("")){
                    
                    JOptionPane.showMessageDialog(null, "Enter New PIN");
                }
                if (t3.getText().equals("")){
                    
                    JOptionPane.showMessageDialog(null, "Re-Enter new PIN");
                }
                
                if(t2.getText().equals(t3.getText())){ // When t2 matches t3 
                	
       // Making object of the class conn        
                    conn c1 = new conn();
                    
                    String q1 = "update bank set pin = '"+b+"' where pin = '"+a+"' "; // Updating PIN in bank table
                    String q2 = "update login set pin = '"+b+"' where pin = '"+a+"' "; // Updating PIN in login table
                    String q3 = "update signup3 set pin = '"+b+"' where pin = '"+a+"' "; // Updating PIN in Signup3 table
                    
                    c1.s.executeUpdate(q1); //Executing Query
                    c1.s.executeUpdate(q2);
                    c1.s.executeUpdate(q3);
                    
                    
                    JOptionPane.showMessageDialog(null, "PIN changed successfully");
                    
                    new Transcations().setVisible(true);
                    setVisible(false);
                    
                }else{
                    
                    JOptionPane.showMessageDialog(null, "PIN entered doesn't match");
                }
                       
            }else if(ae.getSource()==b2){ // b2 is Back button
                
                new Transcations().setVisible(true); // Open Transcation window
                setVisible(false);
                
            }
        }catch(Exception e){
                    e.printStackTrace();
                    System.out.println("error: "+e);
        }
            
    }  
    
    public static void main(String[] args){
        new Pin().setVisible(true);
    }
}
