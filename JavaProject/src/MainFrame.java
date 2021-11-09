import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainFrame {
	public int[] menu_num = {0,0,0,0,0,0,0,0,0,0,0,0,0,0};
	private JFrame frame;
	public JCheckBox btn1;
	public JCheckBox btn2;
	public JCheckBox btn3;
	public JCheckBox btn4;
	public JCheckBox btn5;
	public JCheckBox btn6;
	public JCheckBox btn7;
	public JCheckBox btn8;
	public JCheckBox btn9;
	public JCheckBox btn10;
	public JCheckBox btn11;
	public JCheckBox btn12;
	public JCheckBox btn13;
	public JCheckBox btn14;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame window = new MainFrame();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public class orderCheck implements ItemListener{
		public void itemStateChanged(ItemEvent e) {
			if(e.getStateChange()==ItemEvent.SELECTED) {
				if(e.getItem()==btn1)
				{
					System.out.println("selected");
					menu_num[0]=1;
					
				}
				if(e.getItem()==btn2)
				{
					System.out.println("selected");
					menu_num[1]=2;
					
				}
				if(e.getItem()==btn3)
				{
					menu_num[2]=3;
					
				}
				if(e.getItem()==btn4)
				{
					menu_num[3]=4;
					
				}
				if(e.getItem()==btn5)
				{
					menu_num[4]=5;
					
				}
				if(e.getItem()==btn6)
				{
					menu_num[5]=6;
					
				}
				if(e.getItem()==btn7)
				{
					menu_num[6]=7;
					
				}
				if(e.getItem()==btn8)
				{
					menu_num[7]=8;
					
				}
				if(e.getItem()==btn9)
				{
					menu_num[8]=9;
					
				}
				if(e.getItem()==btn10)
				{
					menu_num[9]=10;
					
				}
				if(e.getItem()==btn11)
				{
					menu_num[10]=11;
					
				}
				if(e.getItem()==btn12)
				{
					menu_num[11]=12;
					
				}
				if(e.getItem()==btn13)
				{
					menu_num[12]=13;
					
				}
				if(e.getItem()==btn14)
				{
					menu_num[13]=14;
					
				}}
				
				if(e.getStateChange()==ItemEvent.DESELECTED) {
					
					if(e.getItem()==btn1)
					{
						menu_num[0]=0;
					}
					if(e.getItem()==btn2)
					{
						menu_num[1]=0;
						
					}
					if(e.getItem()==btn3)
					{
						menu_num[2]=0;
						
					}
					if(e.getItem()==btn4)
					{
						menu_num[3]=0;
						
					}
					if(e.getItem()==btn5)
					{
						menu_num[4]=0;
						
					}
					if(e.getItem()==btn6)
					{
						menu_num[5]=0;
						
					}
					if(e.getItem()==btn7)
					{
						menu_num[6]=0;
						
					}
					if(e.getItem()==btn8)
					{
						menu_num[7]=0;
						
					}
					if(e.getItem()==btn9)
					{
						menu_num[8]=0;
						
					}
					if(e.getItem()==btn10)
					{
						menu_num[9]=0;
						
					}
					if(e.getItem()==btn11)
					{
						menu_num[10]=0;
					}
					if(e.getItem()==btn12)
					{
						menu_num[11]=0;
					}
					if(e.getItem()==btn13)
					{
						menu_num[12]=0;
					}
					if(e.getItem()==btn14)
					{
						menu_num[13]=0;
					}
			}
		}
	}
	
	/**
	 * Create the application.
	 */
	public MainFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 1200, 1000);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		
		//諛곕떖 �룷�옣 �꽑�깮 �솕硫�
		JPanel startpage = new JPanel();
		startpage.setBounds(10, 0, 1200, 1000);
		
		JLabel orderDir1 = new JLabel("Delivering");
		JLabel orderDir2 = new JLabel("Packing");
		
		orderCheck isSelected = new orderCheck();
		
		ImageIcon delimg = new ImageIcon("./image/delv.jpg");
		JButton delivery = new JButton(delimg);
		delivery.setFont(new Font("MS UI Gothic", Font.PLAIN, 55));
		delivery.setBounds(709, 469, 354, 290);
		startpage.add(delivery);

		ImageIcon packimg = new ImageIcon("./image/takot.jpg");
		JButton packaging = new JButton(packimg);
		packaging.setFont(new Font("MS UI Gothic", Font.PLAIN, 55));
		packaging.setBounds(79, 122, 354, 290);
		startpage.add(packaging);
		
		
		frame.getContentPane().add(startpage);
		startpage.setLayout(null);
		
		//�쓬�떇 �꽑�깮 �솕硫�
		
		JPanel SelectMenu = new JPanel();
		SelectMenu.setBounds(0, 0, 1200, 1000);
		SelectMenu.setLayout(null);
		btn1 = new JCheckBox("1");
		btn1.setBounds(0, 1, 595, 102);
		SelectMenu.add(btn1);
		btn2 = new JCheckBox("2");
		btn2.setBounds(605, 1, 595, 102);
		SelectMenu.add(btn2);
		btn3 = new JCheckBox("3");
		btn3.setBounds(0, 113, 595, 102);
		SelectMenu.add(btn3);
		btn4 = new JCheckBox("4");
		btn4.setBounds(605, 113, 595, 102);
		SelectMenu.add(btn4);
		btn5 = new JCheckBox("5");
		btn5.setBounds(0, 225, 595, 102);
		SelectMenu.add(btn5);
		btn6 = new JCheckBox("6");
		btn6.setBounds(605, 225, 595, 102);
		SelectMenu.add(btn6);
		btn7 = new JCheckBox("7");
		btn7.setBounds(0, 337, 595, 102);
		SelectMenu.add(btn7);
		btn8 = new JCheckBox("8");
		btn8.setBounds(605, 337, 595, 102);
		SelectMenu.add(btn8);
		btn9 = new JCheckBox("9");
		btn9.setBounds(0, 449, 595, 102);
		SelectMenu.add(btn9);
		btn10 = new JCheckBox("10");
		btn10.setBounds(605, 449, 595, 102);
		SelectMenu.add(btn10);
		btn11 = new JCheckBox("11");
		btn11.setBounds(0, 561, 595, 102);
		SelectMenu.add(btn11);
		btn12 = new JCheckBox("12");
		btn12.setBounds(605, 561, 595, 102);
		SelectMenu.add(btn12);
		btn13 = new JCheckBox("13");
		btn13.setBounds(0, 673, 595, 102);
		SelectMenu.add(btn13);
		btn14 = new JCheckBox("14");
		btn14.setBounds(605, 673, 595, 102);
		SelectMenu.add(btn14);
		
		btn1.addItemListener(isSelected);
		btn2.addItemListener(isSelected);
		btn3.addItemListener(isSelected);
		btn4.addItemListener(isSelected);
		btn5.addItemListener(isSelected);
		btn6.addItemListener(isSelected);
		btn7.addItemListener(isSelected);
		btn8.addItemListener(isSelected);
		btn9.addItemListener(isSelected);
		btn10.addItemListener(isSelected);
		btn11.addItemListener(isSelected);
		btn12.addItemListener(isSelected);
		btn13.addItemListener(isSelected);
		btn14.addItemListener(isSelected);
		
		JButton backbtn = new JButton("back");
		backbtn.setBounds(100, 826, 387, 88);
		SelectMenu.add(backbtn);
		
		JButton pay = new JButton("pay");
		pay.setBounds(700, 826, 387, 88);
		SelectMenu.add(pay);
		
		frame.getContentPane().add(SelectMenu);
		SelectMenu.setVisible(false);
		
		// 寃곗젣�솕硫�
		JPanel PayScreen = new JPanel();
		PayScreen.setBounds(0, 0, 1200, 1000);
		PayScreen.setVisible(false);
		
		JLabel MenuList = new JLabel("Menu List");
		
		JLabel menu[] = new JLabel[14];
		for(int i=0; i<14; i++)
		{
			if(menu_num[i]==0)
			{
				continue;
			}
			else {
				int x = 30;
				int y = 30;
				menu[i] = new JLabel(menu_num[i]+" ");
				PayScreen.add(menu[i]);
				menu[i].setBounds(20+x*2, 20+y*2, 387, 88);
			}
		}
		PayScreen.add(MenuList);
		frame.add(PayScreen);
		
		
		
		
		

//		background backg = new background(new ImageIcon("./image/background.jpg").getImage());
//		frame.getContentPane().add(backg);
//		frame.pack();
//		
		
		delivery.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				startpage.setVisible(false);
				SelectMenu.setVisible(true);
			}
			
		});
		
		packaging.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				startpage.setVisible(false);
				SelectMenu.setVisible(true);
			}
			
		});
		
		backbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				startpage.setVisible(true);
				SelectMenu.setVisible(false);
			}
		});
		
		pay.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				SelectMenu.setVisible(false);
				PayScreen.setVisible(true);
			}
			
		});
	}
}
