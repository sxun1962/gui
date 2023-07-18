package gui.sample;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class JLabelSample extends JFrame implements ActionListener {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JLabelSample frame = new JLabelSample();
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
	public JLabelSample() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 950, 900);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		//ImageIconクラスを使ってアイコン(画像)を読み込む
		ImageIcon icon = new ImageIcon("C:\\Users\\3030741\\Pictures\\Camera Roll\\OIP.jpg");
		//ImageIconをJLabelのコンストラクタに渡してラベルを作成
		JLabel lblNewLabel = new JLabel(icon);
		// 位置とサイズの設定
		lblNewLabel.setBounds(50, 50, icon.getIconWidth(), icon.getIconHeight()); 
		//後からアイコンを変更する場合
		lblNewLabel.setIcon(icon);
		contentPane.add(lblNewLabel);
		
		JButton button = new JButton("クリック");
		// ActionListenerとして自身を設定
		button.addActionListener(this);
		// ボタンにアクションコマンドを設定
		button.setActionCommand("myButton");
		contentPane.add(button);
		
		
		setContentPane(contentPane);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("aaaaaaaaa");
	}

}
