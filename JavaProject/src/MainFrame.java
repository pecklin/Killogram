import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainFrame {
	private JFrame frame;
	public JButton btn1;
	public JButton btn2;
	public JButton btn3;
	public JButton btn4;
	public JButton btn5;
	public JButton btn6;
	public JButton btn7;
	public JButton btn8;
	public JButton btn9;
	public JButton btn10;
	public JButton btn11;
	public JButton btn12;
	public JButton btn13;
	public JButton btn14;
	
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
		btn1 = new JButton("1");
		btn1.setBounds(0, 1, 595, 102);
		SelectMenu.add(btn1);
		btn2 = new JButton("2");
		btn2.setBounds(605, 1, 595, 102);
		SelectMenu.add(btn2);
		btn3 = new JButton("3");
		btn3.setBounds(0, 113, 595, 102);
		SelectMenu.add(btn3);
		btn4 = new JButton("4");
		btn4.setBounds(605, 113, 595, 102);
		SelectMenu.add(btn4);
		btn5 = new JButton("5");
		btn5.setBounds(0, 225, 595, 102);
		SelectMenu.add(btn5);
		btn6 = new JButton("6");
		btn6.setBounds(605, 225, 595, 102);
		SelectMenu.add(btn6);
		btn7 = new JButton("7");
		btn7.setBounds(0, 337, 595, 102);
		SelectMenu.add(btn7);
		btn8 = new JButton("8");
		btn8.setBounds(605, 337, 595, 102);
		SelectMenu.add(btn8);
		btn9 = new JButton("9");
		btn9.setBounds(0, 449, 595, 102);
		SelectMenu.add(btn9);
		btn10 = new JButton("10");
		btn10.setBounds(605, 449, 595, 102);
		SelectMenu.add(btn10);
		btn11 = new JButton("11");
		btn11.setBounds(0, 561, 595, 102);
		SelectMenu.add(btn11);
		btn12 = new JButton("12");
		btn12.setBounds(605, 561, 595, 102);
		SelectMenu.add(btn12);
		btn13 = new JButton("13");
		btn13.setBounds(0, 673, 595, 102);
		SelectMenu.add(btn13);
		btn14 = new JButton("14");
		btn14.setBounds(605, 673, 595, 102);
		SelectMenu.add(btn14);
		
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
