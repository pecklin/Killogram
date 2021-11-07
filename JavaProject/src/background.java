//import java.awt.Dimension;
//import java.awt.Graphics;
//import java.awt.Image;
//
//import javax.swing.JPanel;
//
//public class background extends JPanel{
//	public Image img;
//	
//	public background(Image img) {
//		this.img = img;
//		setSize(new Dimension(img.getWidth(null), img.getHeight(null)));
//		setPreferredSize(new Dimension(img.getWidth(null),img.getHeight(null)));
//		setLayout(null);
//	}
//	
//	public void paintComponent(Graphics g) {
//		g.drawImage(img, 0, 0, null);
//	}
//}
//
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class background extends JFrame{
	static JPanel page1=new JPanel() {
		Image background=new ImageIcon(MainFrame.class.getResource("../image/background1.png")).getImage();
		public void paint(Graphics g) {//그리는 함수
				g.drawImage(background, 0, 0, null);//background를 그려줌		
		}
	};
}