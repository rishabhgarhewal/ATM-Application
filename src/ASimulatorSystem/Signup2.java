
package ASimulatorSystem;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class Signup2 extends JFrame implements ActionListener{
    
    /**
	 * 
	 */
	private static final long serialVersionUID = -771745118911636910L;
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12;
    JButton b;
    JRadioButton r1,r2,r3,r4,r5;
    JTextField t1,t2,t3;
    JComboBox c1,c2,c3,c4,c5;   
    
    Signup2(){ // Assigning constructor Signup2
        
    // Move text to the center     
    	setFont(new Font("System", Font.BOLD, 18));
        Font f = getFont();
        FontMetrics fm = getFontMetrics(f);
        int x = fm.stringWidth("STEP 2- NEW ACCOUNT SIGNUP FORM");
        int y = fm.stringWidth(" ");
        int z = getWidth()/2 - (x/2);
        int w = z/y;
        String pad ="";
        //for (int i=0; i!=w; i++) pad +=" ";   
        pad = String.format("%"+w+"s", pad);
        setTitle(pad+"STEP 2- NEW ACCOUNT SIGNUP FORM");
        
        l1 = new JLabel("Step 2: Please tell us a bit more about yourself");
        l1.setFont(new Font("Raleway", Font.BOLD, 22));
        
        l2 = new JLabel("Race/Ethnicity:");
        l2.setFont(new Font("Raleway", Font.BOLD, 18));
        
        l3 = new JLabel("Age:");
        l3.setFont(new Font("Raleway", Font.BOLD, 18));
        
        l4 = new JLabel("Income:");
        l4.setFont(new Font("Raleway", Font.BOLD, 18));
        
        l5 = new JLabel("Educational");
        l5.setFont(new Font("Raleway", Font.BOLD, 18));
        
        l11 = new JLabel("Qualification:");
        l11.setFont(new Font("Raleway", Font.BOLD, 18));
        
        l6 = new JLabel("Occupation:");
        l6.setFont(new Font("Raleway", Font.BOLD, 18));
        
        l7 = new JLabel("Govt Issued ID");
        l7.setFont(new Font("Raleway", Font.BOLD, 18));
        
        l8 = new JLabel("ID Type:");
        l8.setFont(new Font("Raleway", Font.BOLD, 18));
        
        l9 = new JLabel("Disability:");
        l9.setFont(new Font("Raleway", Font.BOLD, 18));
        
        l10 = new JLabel("Existing Account:");
        l10.setFont(new Font("Raleway", Font.BOLD, 18));
        
        l12 = new JLabel("Form No:");
        l12.setFont(new Font("Raleway", Font.BOLD, 13));
        
        b = new JButton("Next");
        b.setFont(new Font("Raleway", Font.BOLD, 14));
        b.setBackground(Color.WHITE);
        b.setForeground(Color.BLACK);
        
        t1 = new JTextField();
        t1.setFont(new Font("Raleway", Font.BOLD, 14));
        
        t2 = new JTextField();
        t2.setFont(new Font("Raleway", Font.BOLD, 14));
        
        t3 = new JTextField();
        t3.setFont(new Font("Raleway", Font.BOLD, 13));  
        
        r1 = new JRadioButton("Yes");
        r1.setFont(new Font("Raleway", Font.BOLD, 14));
        r1.setBackground(Color.WHITE);
        
        r2 = new JRadioButton("No");
        r2.setFont(new Font("Raleway", Font.BOLD, 14));
        r2.setBackground(Color.WHITE);
        
        r5 = new JRadioButton("Prefer not to say");
        r5.setFont(new Font("Raleway", Font.BOLD, 14));
        r5.setBackground(Color.WHITE);
        
        r3 = new JRadioButton("Yes");
        r3.setFont(new Font("Raleway", Font.BOLD, 14));
        r3.setBackground(Color.WHITE);
        
        r4 = new JRadioButton("No");
        r4.setFont(new Font("Raleway", Font.BOLD, 14));
        r4.setBackground(Color.WHITE);
        
        String race[] = {"Prefer not to say",
        					"Arab/Middle Eastern",
        					"Black Black (eg. people of African descent, Caribbean, etc.)",
        					"East Asian (eg. China, Japan, Korea)",
        					"Indigenous Peoples (eg. First Nations, Inuit, Metis, Maori, etc.)",
        					"Pacific (eg. Hawaii, Guam, Fiji)",
        					"South Asian (eg. India, Pakistan, Sri Lanka)",
        					"Southeast Asian (eg. Vietnam, Cambodia, Laos, Thailand, Philippines)",
        					"West Asian (eg. Afghanistan, Iran)",
        					"White / People of European descent",
        					"Mixed/Two or more races",
        					"Not listed"};
        
        c1 = new JComboBox(race);
        c1.setBackground(Color.WHITE);
        c1.setFont(new Font("Raleway", Font.BOLD, 14));
        
        String age[] = {"18-24","25-34","35-44","45-54","55-64", "65 and over", "Prefer not to say"};
        c2 = new JComboBox(age);
        c2.setBackground(Color.WHITE);
        c2.setFont(new Font("Raleway", Font.BOLD, 14));
        
        String income[] = {"<$35,000","<$70,000","<$100,000","<$150,000","Above $150,000"};
        c3 = new JComboBox(income);
        c3.setBackground(Color.WHITE);
        c3.setFont(new Font("Raleway", Font.BOLD, 14));
        
        String education[] = {"School","Some Degree","Graduate","Masters","Doctrate","Prefer not to say"};
        c4 = new JComboBox(education);
        c4.setBackground(Color.WHITE);
        c4.setFont(new Font("Raleway", Font.BOLD, 14));
        
        String occupation[] = {"Salaried","Self-Employmed","Business","Student","Retired","Prefer not to say"};
        c5 = new JComboBox(occupation);
        c5.setBackground(Color.WHITE);
        c5.setFont(new Font("Raleway", Font.BOLD, 14));      
        
  // By default border layout
        setLayout(null);  
        
        l12.setBounds(700,10,60,30);
        add(l12); // To show it on the frame
        
        t3.setBounds(760,10,60,30);
        add(t3);
        
        l1.setBounds(150,70,600,40);
        add(l1);
        
        l2.setBounds(100,140,140,30);
        add(l2);
        
        c1.setBounds(370,140,320,30);
        add(c1);
        
        l3.setBounds(100,190,100,30);
        add(l3);
        
        c2.setBounds(370,190,320,30);
        add(c2);
        
        l4.setBounds(100,240,100,30);
        add(l4);
        
        c3.setBounds(370,240,320,30);
        add(c3);
        
        l5.setBounds(100,290,150,30);
        add(l5);
        
        c4.setBounds(370,290,320,30);
        add(c4);
        
        l11.setBounds(100,310,150,30);
        add(l11);
        
        l6.setBounds(100,350,150,30);
        add(l6);
        
        c5.setBounds(370,350,320,30);
        add(c5);
        
        l7.setBounds(100,390,150,30);
        add(l7);
        
        t1.setBounds(370,390,320,30);
        add(t1);
        
        l8.setBounds(100,440,180,30);
        add(l8);
        
        t2.setBounds(370,440,320,30);
        add(t2);
        
        l9.setBounds(100,490,180,30);
        add(l9);
        
        r1.setBounds(370,490,180,30);
        add(r1);
        
        r2.setBounds(460,490,180,30);
        add(r2);
        
        r5.setBounds(570,490,180,30);
        add(r5);
        
        l10.setBounds(100,540,180,30);
        add(l10);
        
        r3.setBounds(370,540,100,30);
        add(r3);
        
        r4.setBounds(460,540,100,30);
        add(r4);
        
        b.setBounds(570,600,100,30);
        add(b);
      
 // To get the work done, I used action listener function       
        b.addActionListener(this);
        
// To set the content pane color to White
        getContentPane().setBackground(Color.WHITE);
        
        setSize(850,850); // Setting size of the frame
        setLocation(500,90);
        setVisible(true); // To show the frame. By default it is false
    }
    
    public void actionPerformed(ActionEvent ae){
        
   //These will retrieve the selected data from the combo box
        String a = (String)c1.getSelectedItem(); // Typecast coz it's return type is object & I cannot store object into string
        String b = (String)c2.getSelectedItem();
        String c = (String)c3.getSelectedItem();
        String d = (String)c4.getSelectedItem();
        String e = (String)c5.getSelectedItem();
        
        String f = t1.getText(); //To retrieve information
        String g = t2.getText();
        
        String h = "";
        if(r1.isSelected()){ 
            h = "Yes";
        }else if(r2.isSelected()){ 
            h = "No";
        }else if(r5.isSelected()){ 
            h = "Prefer not to say";
        } 
           
        String i = "";
        if(r3.isSelected()){ 
            i = "Yes";
        }else if(r4.isSelected()){ 
            i = "No";
        }
        
      String j = t3.getText();
        
        try{
            
            if(t2.getText().equals("")){
                JOptionPane.showMessageDialog(null, "All fields are required!!");
            }else{
       
        // Create an object of conn class to setup connection with the database
            	conn c1 = new conn();
        
       // Inserting values into database. + used to concat
            	String q1 = "insert into signup2 values('"+a+"','"+b+"','"+c+"','"+d+"','"+e+"','"+f+"','"+g+"','"+h+"','"+i+"','"+j+"')";    
              
      // To update values in the database
            	c1.s.executeUpdate(q1);
                
     // Create an object of class Signup3
            	new Signup3().setVisible(true);
                setVisible(false);
            }    
            
        }catch(Exception ex){
             ex.printStackTrace();
        }
         
    }
    
    public static void main(String[] args){
        new Signup2().setVisible(true);
    }
}
