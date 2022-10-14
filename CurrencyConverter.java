import java.util.*;  
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class CurrencyConverter implements ActionListener  {
	JTextField tf1,tf2;
	JButton b1,b2;
	JLabel l1,l2,l3,l4,l5;
	JComboBox jc,jc1;
	CurrencyConverter() {
		JFrame f=new JFrame("CurrencyCounter");
		f.setLayout(null);

	//*TextField**

		tf1=new JTextField(10);
		f.add(tf1);
		tf1.setBounds(50,100,100,20);
		tf2=new JTextField();
		f.add(tf2);
		tf2.setBounds(270,170,150,30);
		tf2.setEditable(false);
		
	//**Buttons***
		
		b1=new JButton("Convert");
		f.add(b1);
		b1.setBounds(180,250,80,40);
		b2=new JButton("Clear");
		f.add(b2);
		b2.setBounds(280,250,80,40);
		b1.addActionListener(this);
		b2.addActionListener(this);

	//**Label**

		l1=new JLabel("Convert this amount");
		f.add(l1);
		l1.setBounds(40,80,150,20);
		l2=new JLabel("From this Currency");
		f.add(l2);
		l2.setBounds(200,80,150,20);
		l3=new JLabel("To this Currency");
		f.add(l3);
		l3.setBounds(370,80,150,20);
		l4=new JLabel("CURRENCY CONVERTER");
		f.add(l4);
		l4.setBounds(20,20,150,50);
		l5=new JLabel("Result");
		f.add(l5);
		l5.setBounds(220,170,100,30);
		

	//**JCombo Box*

		String[] country={"Indian Ruppee(INR)","US Dollar(USD)","Singapore Dollar(SGD)","European euro(EUR)","Canadian dollar(CAD)","Chinese Yuan Renminbi(CNY)","Australian dollar(AUD)","Egyptian pound(EGP)","Indonesian rupiah(IDR)","Iranian rial(IRR)","Japanese yen(JPY)","Kuwaiti dinar(KWD)"};
		jc=new JComboBox(country);
		f.add(jc);
		jc.setSelectedIndex(1);
		jc.setBounds(350,100,150,20);
		String[] country1={"Indian Ruppee(INR)"};
		jc1=new JComboBox(country1);
		f.add(jc1);
		jc1.setSelectedIndex(0);
		jc1.setBounds(180,100,150,20);
		

		f.setSize(600,400);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

		public void actionPerformed(ActionEvent e) {
			double res=0;
			double a=Double.valueOf(tf1.getText());
			if(jc1.getSelectedIndex()==0 & jc.getSelectedIndex()==1) {
				res = a*0.013;
			}
			else if(jc1.getSelectedIndex()==0 & jc.getSelectedIndex()==2) {
				res = a*0.018;
			}
			else if(jc1.getSelectedIndex()==0 & jc.getSelectedIndex()==3) {
				res = a*0.012;
			}
			else if(jc1.getSelectedIndex()==0 & jc.getSelectedIndex()==4) {
				res = a*0.017;
			}
			else if(jc1.getSelectedIndex()==0 & jc.getSelectedIndex()==5) {
				res = a*0.085;
			}
			else if(jc1.getSelectedIndex()==0 & jc.getSelectedIndex()==6) {
				res = a*0.019;
			}
			else if(jc1.getSelectedIndex()==0 & jc.getSelectedIndex()==7) {
				res = a*0.21 ;
			}
			else if(jc1.getSelectedIndex()==0 & jc.getSelectedIndex()==8) {
				res = a*191.16;
			}
			else if(jc1.getSelectedIndex()==0 & jc.getSelectedIndex()==9) {
				res = a*561.20 ;
			}
			else if(jc1.getSelectedIndex()==0 & jc.getSelectedIndex()==10) {
				res = a*1.51 ;
			}
			else if(jc1.getSelectedIndex()==0 & jc.getSelectedIndex()==11) {
				res = a*0.0040;
			}
			tf2.setText(String.valueOf(res));
			if(e.getSource()==b2){
  				tf1.setText("0000");
 				 tf2.setText("0000");
			}
		}
		
	public static void main(String[] args) {
		CurrencyConverter ob=new CurrencyConverter();
	}
	}
