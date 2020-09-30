package ASimulatorSystem;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.util.*;

public class Signup extends JFrame implements ActionListener{
    
    /**
	 * 
	 */
	private static final long serialVersionUID = 5467255170630067948L;
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15, l16;
    JTextField t1,t2,t3,t4,t5,t6,t7;
    JRadioButton r1,r2,r3,r4,r5, r6, r7;
    JButton b;
    JComboBox c1,c2,c3,c4;
    
    Random ran = new Random(); // To generate a random form number
    long first4 = (ran.nextLong() % 9000L) + 1000L; // Formula to generate 4 digit random form number
    long first = Math.abs(first4); // To generate only positive numbers
    
    Signup(){ // Assigning constructor Signup
        
     // Center Alignment
        setFont(new Font("System", Font.BOLD, 26));
        Font f = getFont();
        FontMetrics fm = getFontMetrics(f);
        int x = fm.stringWidth("STEP 1- NEW ACCOUNT SIGNUP FORM");
        int y = fm.stringWidth(" ");
        int z = getWidth() - x;
        int w = z/y;
        String pad ="";
        // for (int i=0; i!=w; i++) pad +=" ";   
        pad = String.format("%"+w+"s", pad);
        setTitle(pad + "STEP 1- NEW ACCOUNT SIGNUP FORM");
        
        l1 = new JLabel("SIGNUP FORM Number " + first); // + used to concatenation the string
   // first used to store the random 4 digit generated number
        l1.setFont(new Font("Raleway", Font.BOLD, 26));
        
        l2 = new JLabel("Step 1: Fill up your personal details");
        l2.setFont(new Font("Raleway", Font.BOLD, 16));
        
        l3 = new JLabel("Legal Name:");
        l3.setFont(new Font("Raleway", Font.BOLD, 14));
        
        l16 = new JLabel("(as per the Canadian driving license)");
        l16.setFont(new Font("Raleway", Font.ITALIC, 10));
        
        l4 = new JLabel("Email:");
        l4.setFont(new Font("Raleway", Font.BOLD, 14));
        
        l5 = new JLabel("Date of Birth:");
        l5.setFont(new Font("Raleway", Font.BOLD, 14));
        
        l6 = new JLabel("Gender:");
        l6.setFont(new Font("Raleway", Font.BOLD, 14));
        
        l7 = new JLabel("Cellphone:");
        l7.setFont(new Font("Raleway", Font.BOLD, 14));
        
        l8 = new JLabel("Marital Status:");
        l8.setFont(new Font("Raleway", Font.BOLD, 14));
        
        l9 = new JLabel("Address:");
        l9.setFont(new Font("Raleway", Font.BOLD, 14));
        
        l10 = new JLabel("City:");
        l10.setFont(new Font("Raleway", Font.BOLD, 14));
        
        l11 = new JLabel("Postal Code:");
        l11.setFont(new Font("Raleway", Font.BOLD, 14));
        
        l12 = new JLabel("Province:");
        l12.setFont(new Font("Raleway", Font.BOLD, 14));
        
        l13 = new JLabel("Day");
        l13.setFont(new Font("Raleway", Font.BOLD, 12));
        
        l14 = new JLabel("Month");
        l14.setFont(new Font("Raleway", Font.BOLD, 12));
        
        l15 = new JLabel("Year");
        l15.setFont(new Font("Raleway", Font.BOLD, 12));
        
        t1 = new JTextField();
        t1.setFont(new Font("Raleway", Font.BOLD, 12));
        
        t2 = new JTextField();
        t2.setFont(new Font("Raleway", Font.BOLD, 12));
        
        t3 = new JTextField();
        t3.setFont(new Font("Raleway", Font.BOLD, 14));
        
        t4 = new JTextField();
        t4.setFont(new Font("Raleway", Font.BOLD, 12));
        
        t5 = new JTextField();
        t5.setFont(new Font("Raleway", Font.BOLD, 12));
        
        t6 = new JTextField();
        t6.setFont(new Font("Raleway", Font.BOLD, 12));
        
     // t7 = new JTextField();
     // t7.setFont(new Font("Raleway", Font.BOLD, 12));
        
        b = new JButton("Next");
        b.setFont(new Font("Raleway", Font.BOLD, 12));
        b.setBackground(Color.RED);
        b.setForeground(Color.WHITE);
        
        r1 = new JRadioButton("Male");
        r1.setFont(new Font("Raleway", Font.BOLD, 12));
        r1.setBackground(Color.WHITE);
        
        r2 = new JRadioButton("Female");
        r2.setFont(new Font("Raleway", Font.BOLD, 12));
        r2.setBackground(Color.WHITE);
        
        r6 = new JRadioButton("LGBTQ+");
        r6.setFont(new Font("Raleway", Font.BOLD, 12));
        r6.setBackground(Color.WHITE);
        
        r3 = new JRadioButton("Single");
        r3.setFont(new Font("Raleway", Font.BOLD, 12));
        r3.setBackground(Color.WHITE);
        
        r4 = new JRadioButton("Married");
        r4.setFont(new Font("Raleway", Font.BOLD, 12));
        r4.setBackground(Color.WHITE);
        
        r5 = new JRadioButton("Common Law");
        r5.setFont(new Font("Raleway", Font.BOLD, 12));
        r5.setBackground(Color.WHITE);
        
        r7 = new JRadioButton("Divorced");
        r7.setFont(new Font("Raleway", Font.BOLD, 12));
        r7.setBackground(Color.WHITE);   
     
        String date[] = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
        c1 = new JComboBox(date);
        c1.setBackground(Color.WHITE);
        
        String month[] = {"January","February","March","April","May","June","July","August","September","October","November","December"};
        c2 = new JComboBox(month);
        c2.setBackground(Color.WHITE);
        
        String year[] = {"1980","1981","1982","1983","1984","1985","1986","1987","1988","1989","1990","1991","1992","1993","1994","1995","1996","1997","1998","1999","2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011","2012","2013","2014","2015","2016","2017","2018","2019","2020"};
        c3 = new JComboBox(year);
        c3.setBackground(Color.WHITE);
        
        String province[] = {"Alberta","British Columbia","Manitoba","New Brunswick","Newfoundland and Labrador","Nova Scotia","Ontario","Prince Edward Island","Quebec","Saskatchewan"};
        c4 = new JComboBox(province);
        c4.setBackground(Color.WHITE);
  
  // By default border layout     
        setLayout(null);
     
     // Set bounds is a method of the java.awt.component class
    // It is used to set the size & position of component
   // (integer x, integer y, integer width, integer height) 
        l1.setBounds(300,40,600,40);
        add(l1); // To show it on the frame
        
        l2.setBounds(350,70,600,60);
        add(l2);
        
        l3.setBounds(100,140,100,30);
        add(l3);
        
        l16.setBounds(100,160,200,30);
        add(l16);
        
        t1.setBounds(300,140,400,30);
        add(t1);
        
        l4.setBounds(100,190,200,30);
        add(l4);
        
        t2.setBounds(300,190,400,30);
        add(t2);
        
        l5.setBounds(100,240,200,30);
        add(l5);
        
        l13.setBounds(300,240,40,30);
        add(l13);
        
        c1.setBounds(340,240,60,30);
        add(c1);
        
        l14.setBounds(410,240,50,30);
        add(l14);
        
        c2.setBounds(460,240,100,30);
        add(c2);
        
        l15.setBounds(570,240,40,30);
        add(l15);
        
        c3.setBounds(610,240,90,30);
        add(c3);
        
        c4.setBounds(300,590,400,30);
        add(c4);
        
        l6.setBounds(100,290,200,30);
        add(l6);
        
        r1.setBounds(300,290,100,30);
        add(r1);
        
        r2.setBounds(450,290,100,30);
        add(r2);
        
        r6.setBounds(600,290,100,30);
        add(r6);
        
        l7.setBounds(100,340,200,30);
        add(l7);
        
        t3.setBounds(300,340,400,30);
        add(t3);
        
        l8.setBounds(100,390,200,30);
        add(l8);
        
        r3.setBounds(300,390,100,30);
        add(r3);
        
        r4.setBounds(380,390,100,30);
        add(r4);
        
        r5.setBounds(460,390,120,30);
        add(r5);
        
        r7.setBounds(580,390,100,30);
        add(r7);
        
        l9.setBounds(100,440,200,30);
        add(l9);
        
        t4.setBounds(300,440,400,30);
        add(t4);
        
        l10.setBounds(100,490,200,30);
        add(l10);
        
        t5.setBounds(300,490,400,30);
        add(t5);
        
        l11.setBounds(100,540,200,30);
        add(l11);
        
        t6.setBounds(300,540,400,30);
        add(t6);
        
        l12.setBounds(100,590,200,30);
        add(l12);
        
       // t7.setBounds(300,590,400,30);
       // add(t7);
        
        b.setBounds(620,660,80,30);
        add(b);
        
    // To perform action on button b
        b.addActionListener(this);
        
    // To set the content pane color to White
        getContentPane().setBackground(Color.WHITE);
        
        setSize(900,900); // Setting size of the frame
        setLocation(500,90);
        setVisible(true); // To show the frame. By default it is false
    }
    
    public void actionPerformed(ActionEvent ae){
        
        
// Get text is a function to retrieve data
    	String a = t1.getText();
    	String b = t2.getText();
        
// To retrieve the item selected in the getSelectedItem function
// Return type of getSelectedItem is an object. To remove the incompatibility, I typecast it
        String ac = (String)c1.getSelectedItem();
        String bc = (String)c2.getSelectedItem();
        String cc = (String)c3.getSelectedItem();
        String dc = (String)c4.getSelectedItem();
      
        String d = null;
        if(r1.isSelected()){ 
            d = "Male";
        }
        else if(r2.isSelected()){ 
            d = "Female";
        }
        else if(r6.isSelected()){ 
            d = "LGBTQ+";
        }
            
        String e = t3.getText();
        String f = null;
        if(r3.isSelected()){ 
            f = "Single";
        }else if(r4.isSelected()){ 
            f = "Married";
        }else if(r5.isSelected()){ 
            f = "Common Law";
        }else if(r7.isSelected()){ 
            f = "Divorced";
        }
           
        String g = t4.getText();
        String h = t5.getText();
        String i = t6.getText();
      //  String j = t7.getText();
     
        try{
           
            if(t6.getText().equals("")){
                JOptionPane.showMessageDialog(null, "All fields are required!!");
            }else{
                
// Making an object of conn class to start connecting with database
            	conn c1 = new conn();
            	
// Inserting values into database. + used to concat
                String q1 = "insert into signup values('"+a+"','"+b+"','"+ac+"','"+bc+"','"+cc+"','"+d+"','"+e+"','"+f+"','"+g+"','"+h+"','"+i+"','"+dc+"','"+first+"')"; //'"+j+"','

          // To update values in the database
                c1.s.executeUpdate(q1);
                    
          // Create an object of class Signup2
                new Signup2().setVisible(true);
                setVisible(false);
            }
            
        }catch(Exception ex){
             ex.printStackTrace();
        }
        
    }
     
    public static void main(String[] args){
        new Signup().setVisible(true);
    }
}
