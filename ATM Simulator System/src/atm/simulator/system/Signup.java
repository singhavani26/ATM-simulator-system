/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm.simulator.system;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.sql.*;


public class Signup extends JFrame implements ActionListener  {
    
     JLabel L1,L2,L3,L4,L5,L6,L7,L8,L9,L10,L11,L12,L13,L14,L15;
     JTextField T1,T2,T3,T4,T5,T6,T7;
     JRadioButton r1,r2,r3,r4,r5;
    JButton b,b1;
    JComboBox c1,c2,c3;
    
    Random random=new Random();
   int AppNo = (int)(Math.random()*9000)+1000;
   int appno= Math.abs(AppNo);
   
   
   Signup(){
        setFont(new Font("System",Font.BOLD,22));
       Font f= getFont();
       FontMetrics fm= getFontMetrics(f);
       int x= fm.stringWidth("NEW ACCOUNT APPLICATION FORM");
       int y= fm.stringWidth(" ");
       int z= getWidth() - x;
       int w=z/y;
       String pad="";
        pad= String.format("%"+w+"s",pad);
       setTitle(pad+"NEW ACCOUNT APPLICATION FORM");
   
    
   L1=new JLabel(" APPLICATION FORM NO. " +appno);
   L1.setFont(new Font("Raleway",Font.BOLD,38));
   
   L2=new JLabel("Page 1: Personal Details");
   L2.setFont(new Font("Raleway",Font.BOLD,22));
   
   L3=new JLabel("Name");
   L3.setFont(new Font("Raleway",Font.BOLD,20));
   
   L4=new JLabel("Father's Name");
   L4.setFont(new Font("Raleway",Font.BOLD,20));
   
   L5=new JLabel("Date Of Birth");
   L5.setFont(new Font("Raleway",Font.BOLD,20));
  
   L6=new JLabel("Gender : ");
   L6.setFont(new Font("Raleway",Font.BOLD,20));
   
   L7=new JLabel("Email Address");
   L7.setFont(new Font("Raleway",Font.BOLD,20));
   
    L8=new JLabel("Marital Status");
    L8.setFont(new Font("Raleway",Font.BOLD,20));
   
    L9=new JLabel("Address");
    L9.setFont(new Font("Raleway",Font.BOLD,20));
   
    L10=new JLabel("City :");
    L10.setFont(new Font("Raleway",Font.BOLD,20));
   
    L11=new JLabel("Pin Code :");
    L11.setFont(new Font("Raleway",Font.BOLD,20));
   
    L12=new JLabel("State");
    L12.setFont(new Font("Raleway",Font.BOLD,20));
    
    L13=new JLabel("Date");
    L13.setFont(new Font("Raleway",Font.BOLD,16));
    
    L14=new JLabel("Month");
    L14.setFont(new Font("Raleway",Font.BOLD,16));
    
    L15=new JLabel("Year");
    L15.setFont(new Font("Raleway",Font.BOLD,16));
    
    T1= new JTextField();
    T1.setFont(new Font("Raleway",Font.BOLD,14));
    
    T2= new JTextField();
    T2.setFont(new Font("Raleway",Font.BOLD,14));
    
    T3= new JTextField();
    T3.setFont(new Font("Raleway",Font.BOLD,14));
    
    T4= new JTextField();
    T4.setFont(new Font("Raleway",Font.BOLD,14));
    
    T5= new JTextField();
    T5.setFont(new Font("Raleway",Font.BOLD,14));
    
    T6= new JTextField();
    T6.setFont(new Font("Raleway",Font.BOLD,14));
    
    T7= new JTextField();
    T7.setFont(new Font("Raleway",Font.BOLD,14));
    
    r1= new JRadioButton("Male");
    r1.setFont(new Font("Raleway",Font.BOLD,14));
    r1.setBackground(Color.WHITE);
    
    r2= new JRadioButton("Female");
    r2.setFont(new Font("Raleway",Font.BOLD,14));
    r2.setBackground(Color.WHITE);
    
    r3= new JRadioButton("Married");
    r3.setFont(new Font("Raleway",Font.BOLD,14));
    r3.setBackground(Color.WHITE);
    
    r4= new JRadioButton("Unmarried");
    r4.setFont(new Font("Raleway",Font.BOLD,14));
    r4.setBackground(Color.WHITE);
    
    r5= new JRadioButton("Other");
    r5.setFont(new Font("Raleway",Font.BOLD,14));
    r5.setBackground(Color.WHITE);
    
    b=new JButton("Next");
    b.setFont(new Font("Raleway",Font.BOLD,14));
    
    b1=new JButton("Back");
    b1.setFont(new Font("Raleway",Font.BOLD,14));
    
    String date[]={"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30"};
    c1=new JComboBox(date);
    c1.setBackground(Color.WHITE);
    
    String Month[]={"Jan","Feb","March","April","May","June","July","Aug","Sept","Oct","Nov","Dec"};
    c2=new JComboBox(Month);
    c2.setBackground(Color.WHITE);
    
    String Year[]={"1991","1992","1993","1994","1995","1996","1997","1998","1999","2000","2001","2002","2003"};
    c3=new JComboBox(Year);
    c3.setBackground(Color.WHITE);
    
    
     setLayout(null);
       
        L1.setBounds(140,20,600,40);
        add(L1);
        
        L2.setBounds(290,80,600,30);
        add(L2);
        
        L3.setBounds(100,140,100,30);
        add(L3);
        
        T1.setBounds(300,140,400,30);
        add(T1);
        
        L4.setBounds(100,190,200,30);
        add(L4);
        
        T2.setBounds(300,190,400,30);
        add(T2);
        
        L5.setBounds(100,240,200,30);
        add(L5);
        
        L6.setBounds(100,290,200,30);
        add(L6);
        
        r1.setBounds(300,290,60,30);
        add(r1);
        
        r2.setBounds(450,290,90,30);
        add(r2);
        
        L7.setBounds(100,340,200,30);
        add(L7);
        
        T3.setBounds(300,340,400,30);
        add(T3);
        
        L8.setBounds(100,390,200,30);
        add(L8);
        
        r3.setBounds(300,390,100,30);
        add(r3);
        
        r4.setBounds(450,390,100,30);
        add(r4);
        
        r5.setBounds(635,390,100,30);
        add(r5);
        
        
        
        L9.setBounds(100,440,200,30);
        add(L9);
        
        
        T4.setBounds(300,440,400,30);
        add(T4);
        
        L10.setBounds(100,490,200,30);
        add(L10);
        
        T5.setBounds(300,490,400,30);
        add(T5);
        
        L11.setBounds(100,540,200,30);
        add(L11);
        
        T6.setBounds(300,540,400,30);
        add(T6);
        
        L12.setBounds(100,590,200,30);
        add(L12);
        
        L13.setBounds(300,240,40,30);
        add(L13);
        c1.setBounds(350,240,45,30);
        add(c1);
        
        L14.setBounds(410,240,60,30);
        add(L14);
         c2.setBounds(490,240,60,30);
        add(c2);
        
        L15.setBounds(570,240,40,30);
        add(L15);
         c3.setBounds(630,240,60,30);
        add(c3);
        
        T7.setBounds(300,590,400,30);
        add(T7);
        
        b1.setBounds(620,660,80,30);
        add(b1);
        
         b.setBounds(520,660,80,30);
        add(b);
        
        
        
        b.addActionListener(this);
         b1.addActionListener(this);
        
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(850,800);
        setLocation(500,120);
        setVisible(true);
   }
        public void actionPerformed(ActionEvent ae){
        
       if(ae.getSource()==b)
       {
           String a = T1.getText();
       
        String b = T2.getText();
        
       String ac=(String)c1.getSelectedItem();
       String bc=(String)c2.getSelectedItem();
       String cc=(String)c3.getSelectedItem();
       
       String d=null;
       if(r1.isSelected()){
           d="Male";
       }
       else if(r2.isSelected()){
           d="Female";
       }
       String e=T3.getText();
       String f=null;
       if(r3.isSelected()){
           f="Married";
           
       }else if(r4.isSelected()){
           f="Unmarried";
         
       }else if(r5.isSelected()){
           f="other";
       }
       
       String g=T4.getText();
       String h=T5.getText();
       String i=T6.getText();
       String j=T7.getText();
           
       
         try{
           
            if(T6.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Fill all the required fields");
            }else{
                Conn c1 = new Conn();
                String q1 = "insert into signup values('"+appno+"','"+a+"','"+b+"','"+ac+"','"+bc+"','"+cc+"','"+d+"','"+e+"','"+f+"','"+g+"','"+h+"','"+i+"','"+j+"')";
                c1.s.executeUpdate(q1);
                
                new Signup2().setVisible(true);
                setVisible(false);
            }
         }catch(Exception ex){
             ex.printStackTrace();
         }  }
       else if(ae.getSource()==b1){
           new Login().setVisible(true);
           setVisible(false);
       }
        } 
         
         public static void main(String[] args){
             new Signup().setVisible(true);
         }

       
        
        

   }

       
       
       
       
    
    
   
   
   
      
            

