
package realcase;

import java.awt.event.*;

import javax.swing.*;




public class HomePage extends JFrame implements ActionListener{
   
    JButton Sbutton;
    JButton Fbutton;
    JButton Cbutton;
    HomePage(){
    
    ImageIcon icon = new ImageIcon("wewew.jpg");
    
    JLabel label1= new JLabel();
    label1.setBounds(0,0,350,488);
    label1.setIcon(icon);
     
        
        
        
        
    Fbutton = new JButton("FACULTY");
    Fbutton.setBounds(0,300, 150, 150);
    Fbutton.setFocusable(false);
    Fbutton.addActionListener(this);
        
    Sbutton = new JButton("STUDENT");
    Sbutton.setBounds(0,150, 150, 150);
    Sbutton.setFocusable(false);
    Sbutton.addActionListener(this);
        
        
        
    Cbutton = new JButton("CUSTOMER");
    Cbutton.setBounds(0, 0, 150, 150);
    Cbutton.setFocusable(false);
    Cbutton.addActionListener(this);
        
    JPanel panel1=new JPanel();
    panel1.setLayout(null);
    panel1.setBounds(350, 0, 150, 500);
    //panel1.setBackground(Color.red);
    panel1.add(Cbutton);
    panel1.add(Sbutton);
    panel1.add(Fbutton);
   
        
        
        
    this.setTitle("CASE STUDY");
    this.setResizable(false);
    this.setSize(516,488);
    this.setLayout(null);
    this.setVisible(true);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.add(panel1);
    this.add(label1);
    
}

    
   
    @Override
    public void actionPerformed(ActionEvent e) {
    if (e.getSource()== Sbutton){
    this.dispose();
    String name = JOptionPane.showInputDialog(null, "Please enter your name:");
   if (name == null || name.matches(".*\\d+.*")) {
    JOptionPane.showMessageDialog(null, "INVALID NAME");
    System.exit(0);
   
}
   String Sage=JOptionPane.showInputDialog(null,"AGE");
  try{
  int age = Integer.parseInt(Sage);
  if(age < 18){
      
  JOptionPane.showMessageDialog(null,"MINOR!!!");
   System.exit(0);
  }
  
  }catch (NumberFormatException c){
  JOptionPane.showMessageDialog(null,"INVALID INPUT");
  System.exit(0);
  }
   String Snum =JOptionPane.showInputDialog(null,"STUDENT ID(maximum of 10 digits)");
   long id = Long.parseLong(Snum);

   if (Snum == null || Snum.length() != 10) {
    
    JOptionPane.showMessageDialog(null,"INVALID ID");
      System.exit(0);
  
} 

   new Student();
    }
   
   if (e.getSource()==Fbutton){
   this.dispose();
    String name = JOptionPane.showInputDialog(null, "Please enter your name:");
   if (name == null || name.matches(".*\\d+.*")) {
    JOptionPane.showMessageDialog(null, "INVALID NAME");
    System.exit(0);
   }
   String Fage=JOptionPane.showInputDialog(null,"AGE");
 
   try{
  int age = Integer.parseInt(Fage);
  if(age < 18){
      
  JOptionPane.showMessageDialog(null,"MINOR!!!");
   System.exit(0);
  }
  }catch (NumberFormatException c){
  JOptionPane.showMessageDialog(null,"INVALID INPUT");
  System.exit(0);
  }
   String Fnum =JOptionPane.showInputDialog(null,"FACULTY ID(maximum of 10 digits)");
   long id = Long.parseLong(Fnum);
    if (Fnum == null || Fnum.length() != 10) {
    
    JOptionPane.showMessageDialog(null,"INVALID ID");
      System.exit(0);
  
} 
    new Faculty();
   
   
    
    
    
    }
   if (e.getSource()==Cbutton){
   this.dispose();
    String name = JOptionPane.showInputDialog(null, "Please enter your name:");
   if (name == null || name.matches(".*\\d+.*")) {
    JOptionPane.showMessageDialog(null, "INVALID NAME");
    System.exit(0);
   }
   String Cage=JOptionPane.showInputDialog(null,"AGE");
 
   try{
  int age = Integer.parseInt(Cage);
  if(age < 18){
      
  JOptionPane.showMessageDialog(null,"MINOR!!!");
   System.exit(0);
  }
  }catch (NumberFormatException c){
  JOptionPane.showMessageDialog(null,"INVALID INPUT");
  System.exit(0);
  }
   new Customer();
   }
   


}
}
