package gui.grouwork;

import java.awt.CardLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class FirstFrame extends JFrame {

	private JPanel contentPane;
	JPanel panel;
	CardLayout card;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FirstFrame frame = new FirstFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FirstFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(12, 10, 710, 40);
//		label.setBounds(12, 30, 710, 441);
		contentPane.add(panel);
	
		
		JButton btnNewButton = new JButton("入荷・出荷");
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("商品追加");
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("データ表示");
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("編集・削除");
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("インフォメーション");
		panel.add(btnNewButton_4);
		
//		// 既存のコードの一部を置き換える
//		JPanel panel1 = new JPanel();
//		panel1.setBounds(12, 10, 710, 441);
//		contentPane.add(panel);
//
//		// JLabelをpanelに追加する
//		JLabel label = new JLabel();
//		panel1.add(label);
//
//		// 画像のパスを正しく指定する
//		ImageIcon icon = new ImageIcon("C:\\Users\\3030741\\Pictures\\Camera Roll\\image.jpg");
//		label.setIcon(icon);
//
//		// labelのサイズを画像のサイズに合わせる
//		label.setSize(icon.getIconWidth(), icon.getIconHeight());
//		
//		
//		// 既存のコードの一部を置き換える
//		JPanel panel1 = new JPanel();
//		panel1.setBounds(12, 10, 710, 441);
//		contentPane.add(panel1);
//
//		// JLabelをpanelに追加する
//		JLabel label = new JLabel();
//		label.setBounds(0, 0, 710, 441);
//		panel1.add(label);
//
//		// 画像のパスを正しく指定する
//		ImageIcon icon = new ImageIcon("C:\\Users\\3030741\\Pictures\\Camera Roll");
//		label.setIcon(icon);
//		
//		ImageIcon icon = new ImageIcon("カセットテープ.png");
//		JLabel label = new JLabel(icon);
//		label.setBounds(12, 10, 510, 341);
//		contentPane.add(label);
		
		
//		メインページの初期画面に画像を張る
		ImageIcon icon = new ImageIcon("C:\\Users\\3030741\\Pictures\\Camera Roll\\OIP(1).png");
		JLabel label = new JLabel(icon);
	//	label.setIcon(icon);
	//	label.setBounds(500, 500, 600, 600);
		label.setBounds(12, 45, 710, 441);
		contentPane.add(label);
	}
}
