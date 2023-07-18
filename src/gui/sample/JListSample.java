package gui.sample;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class JListSample extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JListSample frame = new JListSample();
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
	public JListSample() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
	}
	//リストボックスの宣言方法
	//DefaultListModelで、JListに表示するリストの一覧モデルを作成する
	DefaultListModel<String> listModel = new DefaultListModel<>();
	//リストの一覧モデルを使用（コンストラクタに渡す）してJListを宣言する。
	JList<String> listBox = new JList<>(listModel);
	//リストモデルに選択肢を追加する
	listModel.addElement("項目1");
	listModel.addElement("項目2");
	listModel.addElement("項目3");
	listModel.addElement("項目4");
	listModel.addElement("項目5");
	
	//選択項目の取得
	String selected = listBox.getSelectedValue();

}
