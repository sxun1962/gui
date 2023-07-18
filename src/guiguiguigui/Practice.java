package guiguiguigui;

import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Practice extends JFrame {

	private JPanel contentPane;
	private JTextField txtCd;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Practice frame = new Practice();
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
	public Practice() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		 // ラベルにGIF画像を貼り付ける
        ImageIcon imageIcon1 = new ImageIcon("C:\\Users\\3030741\\Pictures\\Camera Roll\\CD.gif");
        JLabel gifLabel1 = new JLabel(imageIcon1);
        gifLabel1.setBounds(267, 102, 155, 136);
        ImageIcon imageIcon2 = new ImageIcon("C:\\Users\\3030741\\Pictures\\Camera Roll\\クレしん4.gif");
        JLabel gifLabel2 = new JLabel(imageIcon2);
        gifLabel2.setBounds(12, 102, 142, 136);
     // コンテンツパネルにラベルを追加
        contentPane.add(gifLabel1);
     // コンテンツパネルにラベルを追加
        contentPane.add(gifLabel2);
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("開始");
		btnNewButton.setBounds(164, 102, 91, 21);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("終了");
		btnNewButton_1.setBounds(164, 160, 91, 21);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("CD在庫管理システム");
		lblNewLabel.setSize(new Dimension(10, 10));
		lblNewLabel.setBounds(152, 23, 108, 13);
		contentPane.add(lblNewLabel);
		
		

	}
}
