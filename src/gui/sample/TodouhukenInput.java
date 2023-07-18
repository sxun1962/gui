package gui.sample;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class TodouhukenInput extends JFrame {
	
	private DefaultTableModel tablemodel;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JRadioButton rdbtnNewRadioButton_2;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel;
	 Object[][] data; 
	 String[] columnNames = { "名前", "住所", "性別" };
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TodouhukenInput frame = new TodouhukenInput();
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
	public TodouhukenInput() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		//テキストボックス
		textField = new JTextField();
		textField.setColumns(20);
		
		String[] todouhuken = {"北海道","青森県","岩手県","宮城県","秋田県","山形県","福島県"
				,"茨城県","栃木県","群馬県","埼玉県","千葉県","東京都","神奈川県","新潟県","富山県"
				,"石川県","福井県","山梨県","長野県","岐阜県","静岡県","愛知県","三重県","滋賀県"
				,"京都府","大阪府","兵庫県","奈良県","和歌山県","鳥取県","島根県","岡山県","広島県"
				,"山口県","徳島県","香川県","愛媛県","高知県","福岡県","佐賀県","長崎県","熊本県"
				,"大分県","宮崎県","鹿児島県","沖縄県"};
		//スクロールで都道府県選択
		JComboBox comboBox = new JComboBox();
		for(int i=0;i<todouhuken.length;i++) {
			comboBox.addItem(todouhuken[i]);
		}
		
		//タイトル
		lblNewLabel_1 = new JLabel("住所登録");
		
		//項目名前
		lblNewLabel_2 = new JLabel("名前");
		textField_1 = new JTextField("名前");
		textField_1.setColumns(10);
		//項目住所
		lblNewLabel_3 = new JLabel("住所(都道府県)");
		textField_2 = new JTextField("住所");
		lblNewLabel = new JLabel("都道府県以下住所");
		textField_2.setToolTipText("");
		textField_2.setColumns(10);
		//詳細住所
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		//項目性別
		lblNewLabel_4 = new JLabel("性別");
		//チェックボックス男
		JRadioButton rdbtnNewRadioButton = new JRadioButton("男性");
		//チェックボックス女
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("女性");
		//チェックボックスその他
		rdbtnNewRadioButton_2 = new JRadioButton("答えたくない");
		//チェックボックスを一つしか選択できないようにする
		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(rdbtnNewRadioButton);
		buttonGroup.add(rdbtnNewRadioButton_1);
		buttonGroup.add(rdbtnNewRadioButton_2);
		String str ="";
		if(rdbtnNewRadioButton.isSelected()) {
			str ="男性";
		}else if(rdbtnNewRadioButton_1.isSelected()){
			str ="女性";
		}else if(rdbtnNewRadioButton_2.isSelected()){
			str ="非開示";
		}
		//
		DefaultTableModel model = new DefaultTableModel(data, columnNames);
		JTable table = new JTable(model);
		//下の結果欄の項目作成
		JScrollPane scrollPane = new JScrollPane(table);
		tablemodel = new DefaultTableModel();
		tablemodel.addColumn("名前");
		tablemodel.addColumn("都道府県");
		tablemodel.addColumn("市町村");
		tablemodel.addColumn("性別");
		JTable j = new JTable(tablemodel);
		//枠の範囲を超えるとスクロールバーの発生
		JScrollPane ScrollPane = new JScrollPane();

		
		//登録ボタンと押した後におきること
		JButton btnNewButton = new JButton("登録");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = textField.getText();
				String prefecture = (String)comboBox.getSelectedItem();
				String details = textField_1.getText();
				String str ="";
				if(rdbtnNewRadioButton.isSelected()) {
					str ="男性";
				}else if(rdbtnNewRadioButton_1.isSelected()){
					str ="女性";
				}else if(rdbtnNewRadioButton_2.isSelected()){
					str ="非開示";
				}
				Object[] ob = {textField.getText(),comboBox.getSelectedItem(),str};
				model.addRow(ob);

					}
				});

		//以下レイヤー
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(155)
							.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
								.addComponent(textField_1, 0, 0, Short.MAX_VALUE)
								.addComponent(textField_2, 0, 0, Short.MAX_VALUE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel)
								.addComponent(lblNewLabel_3)
								.addComponent(lblNewLabel_2)
								.addComponent(lblNewLabel_4))
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(73)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addComponent(rdbtnNewRadioButton, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
											.addGap(18)
											.addComponent(rdbtnNewRadioButton_1, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(rdbtnNewRadioButton_2))
										.addGroup(gl_contentPane.createSequentialGroup()
											.addGap(321)
											.addComponent(btnNewButton))))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(46)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)
										.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 378, GroupLayout.PREFERRED_SIZE)))))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(30)
							.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 487, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_1)
					.addGap(35)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_2)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(42)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_3)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(42)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel))
					.addGap(38)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(rdbtnNewRadioButton, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
						.addComponent(rdbtnNewRadioButton_1, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
						.addComponent(rdbtnNewRadioButton_2)
						.addComponent(lblNewLabel_4))
					.addGap(27)
					.addComponent(btnNewButton)
					.addGap(32)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 259, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(36, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
		
		
		setContentPane(contentPane);
		
	}
}
