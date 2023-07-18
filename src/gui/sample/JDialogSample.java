package gui.sample;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.swing.j
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

class DialogSamle extends JDialog{
	
}

public class JDialogSample extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JDialogSample frame = new JDialogSample();
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
	public JDialogSample() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JButton btnNewButton = new JButton("new Button");
		btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO 自動生成されたメソッド・スタブ
				//JDialogのインスタンスを作る
				JDialog d = new JDialog();
				//ダイアログにタイトルをつける
				     d.setTitle("ダイアログ");
				//ダイアログのサイズを指定する
				     d.setSize(300, 200);
				    //ダイアログの表示場所。Nullなら画面中央。
				     d.setLocationRelativeTo(null);
				    // ダイアログをモーダルダイアログとして設定
				    // モーダルの時は他のウインドウとかの操作をブロックできる
				     d.setModal(true);

				     // ダイアログにコンポーネントを追加
				     // ダイアログにテキストフィールドを追加
				     JTextField textField = new JTextField();
				     d.getContentPane().add(textField, BorderLayout.NORTH);
				     // ダイアログにボタンを追加
				     JButton dialogButton = new JButton("OK");
				d.getContentPane().add(dialogButton, BorderLayout.SOUTH);
				// ダイアログの表示
				     d.setVisible(true);

			}
		});
		
		
	}

}
