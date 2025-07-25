package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;
import javax.swing.JComboBox;


public class SignupTwo extends JFrame implements  ActionListener{
            
            JButton next;
            JTextField panTextField,aadharTextField;
            JRadioButton syes,sno,eyes,eno;
            JComboBox religion,category,income,occupation,education;
            String formno;
           SignupTwo(String formno){
               this.formno=formno;
            setLayout(null);
            
            setTitle("NEW ACCOUNT APPLICATION FORM - PAGE2");
            
             JLabel additionalDetails=new JLabel("Page 2: Additional Details");
            additionalDetails.setFont(new Font("Raleway",Font.BOLD,22));
            additionalDetails.setBounds(290,80,400,30);
            add(additionalDetails);
            
            JLabel name=new JLabel("Religion:");
            name.setFont(new Font("Raleway",Font.BOLD,20));
            name.setBounds(100,140,100,30);
            add(name);
            
            String valReligion[]={"Hindu","Sikh","Muslim","Christian","Other"};
            religion=new JComboBox(valReligion);
            religion.setBounds(300,140,400,30);
            religion.setBackground(Color.WHITE);
            add(religion);  
            
            JLabel fname=new JLabel("Category:");
            fname.setFont(new Font("Raleway",Font.BOLD,20));
            fname.setBounds(100,190,100,30);
            add(fname);
            
             String valCategory[]={"General","SC","OBC","Other"};
            category=new JComboBox(valCategory);
            category.setBounds(300,190,400,30);
            category.setBackground(Color.WHITE);
            add(category);
            
            JLabel dob=new JLabel("Income:");
            dob.setFont(new Font("Raleway",Font.BOLD,20));
            dob.setBounds(100,240,200,30);
            add(dob);
            
            
             String valIncome[]={"Null","< 1,50,000","<2,50,000","<5,00,000","Upto 10,00,00"};
            income=new JComboBox(valIncome);
            income.setBounds(300,240,400,30);
            income.setBackground(Color.WHITE);
            add(income);
            
             JLabel gender=new JLabel("Educational");
            gender.setFont(new Font("Raleway",Font.BOLD,20));
            gender.setBounds(100,290,200,30);
            add(gender);
            
            JLabel qualification=new JLabel("Qualification:");
            qualification.setFont(new Font("Raleway",Font.BOLD,20));
            qualification.setBounds(100,320,200,30);
            add(qualification);
            
            
            String valEducation[]={"Non-Graduate","Graduate","Post-Graduatuion","Doctrate","Others"};
            education=new JComboBox(valEducation);
            education.setBounds(300,320,400,30);
            education.setBackground(Color.WHITE);
            add(education);
            
            JLabel Occupation=new JLabel("Occupation:");
            Occupation.setFont(new Font("Raleway",Font.BOLD,20));
            Occupation.setBounds(100,390,200,30);
            add(Occupation);
            
            String occupationValues[]={"Salaried","Self-Employed","Bussiness","Student","Retired"};
            occupation=new JComboBox(occupationValues);
            occupation.setBounds(300,390,400,30);
            occupation.setBackground(Color.WHITE);
            add(occupation);
            
            
            JLabel pan=new JLabel("PAN No:");
            pan.setFont(new Font("Raleway",Font.BOLD,20));
            pan.setBounds(100,440,200,30);
            add(pan);
            
            panTextField=new JTextField();
            panTextField.setFont(new Font("Raleway",Font.BOLD,14));
            panTextField.setBounds(300,440,400,30);
            add(panTextField);
            
            JLabel aadharno=new JLabel("Aadhar No:");
            aadharno.setFont(new Font("Raleway",Font.BOLD,20));
            aadharno.setBounds(100,490,200,30);
            add(aadharno);
            
            aadharTextField=new JTextField();
            aadharTextField.setFont(new Font("Raleway",Font.BOLD,14));
            aadharTextField.setBounds(300,490,400,30);
            add(aadharTextField);
            
            JLabel state=new JLabel("Senior Citizen :");
            state.setFont(new Font("Raleway",Font.BOLD,20));
            state.setBounds(100,540,200,30);
            add(state);
            
             syes=new JRadioButton("Yes");
            syes.setBounds(300,540,100,30);
            syes.setBackground(Color.WHITE);
            add(syes);
            
            
            sno=new JRadioButton("No");
            sno.setBounds(450,540,100,30);
            sno.setBackground(Color.WHITE);
            add(sno);
            
            ButtonGroup seniorGroup=new ButtonGroup();
            seniorGroup.add(syes);
            seniorGroup.add(sno);
            
            JLabel pincode=new JLabel(" Existing Account:");
            pincode.setFont(new Font("Raleway",Font.BOLD,20));
            pincode.setBounds(100,590,200,30);
            add(pincode);
            
            eyes=new JRadioButton("Yes");
            eyes.setBounds(300,590,100,30);
            eyes.setBackground(Color.WHITE);
            add(eyes);
            
            
            eno=new JRadioButton("No");
            eno.setBounds(450,590,100,30);
            eno.setBackground(Color.WHITE);
            add(eno);
            
            ButtonGroup ExistingGroup=new ButtonGroup();
            ExistingGroup.add(eyes);
            ExistingGroup.add(eno);
            
            next=new JButton("Next");
            next.setBackground(Color.BLACK);
            next.setForeground(Color.WHITE);
            next.setFont(new Font("Raleway",Font.BOLD,14));
            next.setBounds(620,660,80,30);
            next.addActionListener(this);
            add(next);
            
            
            getContentPane().setBackground(Color.WHITE);
            
            setSize(850,800);
            setLocation(350,10);
            setVisible(true);
}
        public void actionPerformed  (ActionEvent ae){
        
        String sreligion = (String) religion.getSelectedItem();
        String scategory = (String) category.getSelectedItem();
        String sincome = (String) income.getSelectedItem();
        String seducation = (String) education.getSelectedItem();
        String soccupation = (String) occupation.getSelectedItem();
        String seniorcitizen= null;
        if(syes.isSelected()){
        seniorcitizen="Yes";}
        else if(sno.isSelected()){
        seniorcitizen="No";
        }
       
        String existingaccount = null;
        if(eyes.isSelected()){
        existingaccount="Yes";
        }
        else if(eno.isSelected()){
            existingaccount="NO";
        }
        
        String pan= panTextField.getText();
        String aadhar=aadharTextField.getText();
     
        
        try{
           
            Conn c = new Conn();
            //String query = "insert into signuptwo values('" + formno + "','" + sreligion + "','" +scategory+ "','" +sincome + "','" +seducation + "','" + soccupation + "','" + pan + "','" + aadhar + "','" +  existingaccount + "','" + seniorcitizen + ")";
            String query = "insert into signuptwo values('" + formno + "','" + sreligion + "','" + scategory + "','" + sincome + "','" + seducation + "','" + soccupation + "','" + pan + "','" + aadhar + "','" + existingaccount + "','" + seniorcitizen + "')";

            c.s.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Successfully Created");
        //signup3 obj
        setVisible(false);
        new SignupThree(formno).setVisible(true);
        }
        
        
        
        catch(Exception e){
            System.out.println(e);
        }

        }
         public static void main (String args[]){
    new SignupTwo("");
    }
}


   


    
