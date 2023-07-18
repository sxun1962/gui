package gui.sample;

import java.awt.EventQueue;
import javax.swing.JComboBox;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class JComboBoxSample extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JComboBoxSample frame = new JComboBoxSample();
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
	public JComboBoxSample() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
	}
	//コンボボックスの宣言
	JComboBox<String> comboBox = new JComboBox<String>();
	//選択欄の追加
	comboBox.addItem("選択肢1");
	//コンボボックスの値の取得
	String item = (String)comboBox.getSelectedItem();
	//コンボボックスのインデックスの取得
	int index = comboBox.getSelectedIndex();


}
