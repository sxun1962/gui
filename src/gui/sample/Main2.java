package gui.sample;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Main2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main2 frame = new Main2();
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
	public Main2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		// 新しいJPanelの作成
		JPanel panel = new JPanel();
		//panelに、ボタンを設置（Button 1及びButton 2）
		panel.add(new JButton("Button 1"));
		panel.add(new JButton("Button 2"));
		
		contentPane.add(panel);
		//ラベルの宣言
		JLabel label = new JLabel("テキストラベル");
		// ラベルの設定
		label.setBounds(50, 50, 200, 30); // 位置とサイズの設定
		//ラベルに文字列をセット
		label .setText("文字列");
		panel.add(label);
		
	}

}
