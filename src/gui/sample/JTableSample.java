package gui.sample;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.AbstractDocument.Content;

public class JTableSample extends JFrame {

	private JPanel contentPane;
	
	Object[][] data = {
		       { "John", 25, "Male" },
		       { "Jane", 30, "Female" },
		       { "Mike", 35, "Male" }
		  };
	
	String[] columnNames = { "Name", "Age", "Gender" };//列名の作成

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JTableSample frame = new JTableSample();
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
	public JTableSample() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		
	}
	// デフォルトのテーブルモデルを表示するデータ、列名情報をもとに作成
	DefaultTableModel model = new DefaultTableModel(data, columnNames);//二次元配列を作成（行と列）
	//テーブルモデルを使ってテーブルを作成
	JTable table = new JTable(model);
//	table.setPreferredSize(new Dimension(300,200));
	Object[] ob = {"charlie",30,"Male"};
	model.addRow(ob);
	JScrollPane js = new JScrollPane(table);
	js.setPreferredSize(new Dimension(300,80));
	contentPane.add(js);

}
