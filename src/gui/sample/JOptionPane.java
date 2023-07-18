package gui.sample;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class JOptionPane extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JOptionPane frame = new JOptionPane();
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
	public JOptionPane() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		JButton btnNewButton = new JButton("new Button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		//第一引数がnullになっているが、ここは親コンポーネントを指定する場合は記述
		JOptionPane.showMessageDialog(null, "これは情報メッセージです。");
		//確認ダイアログ(はい、いいえ、キャンセルを求める)
		int result = JOptionPane.showConfirmDialog(null, "メッセージ内容を記述");
		//確認ダイアログの選択肢に応じて処理をする
		if (result == JOptionPane.YES_OPTION) {
			//「はい」の時の処理
		} else if (result == JOptionPane.NO_OPTION) {
			//「いいえ」の時の処理
		} else if (result == JOptionPane.CANCEL_OPTION) {
			//「キャンセル」の時の処理
		}
		//文字入力ダイアログ
		String input = JOptionPane.showInputDialog("メッセージ内容");
		//Stringの選択を求めるダイアログの表示
		Object[] possibleValues = { "First", "Second", "Third" };

		Object selectedValue = JOptionPane.showInputDialog(null, "Choose one", "Input",
		             JOptionPane.INFORMATION_MESSAGE, null,
		             possibleValues, possibleValues[0]);
			}
	});
		contentPane.add(btnNewButton);
	}
}
