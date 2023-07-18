package jp.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;

public class EditPanel extends JPanel implements ActionListener{
	JTextField itemNo;
	JLabel itemnumber;
	JTextField itemname;
	JTextField artist;
	JTextField price;
	JComboBox<String> genre;

	JTextField deletetextField;
	JRadioButton editbutton;
	JRadioButton deletebutton;

	/**
	 * Create the panel.
	 */
	public EditPanel() {
		setBackground(new Color(133, 188, 146));

		ButtonGroup bg = new ButtonGroup();

		JPanel panel = new JPanel();
		panel.setBackground(new Color(133, 188, 146));
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
				groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
						.addContainerGap(106, Short.MAX_VALUE)
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 531, GroupLayout.PREFERRED_SIZE)
						.addGap(91))
				);
		groupLayout.setVerticalGroup(
				groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
						.addContainerGap(52, Short.MAX_VALUE)
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 401, GroupLayout.PREFERRED_SIZE)
						.addGap(28))
				);
		panel.setLayout(null);

		JPanel panel_2 = new JPanel();
		panel_2.setBounds(18, 309, 420, 30);
		panel.add(panel_2);
		panel_2.setBackground(new Color(133, 188, 146));
		panel_2.setLayout(null);

		JLabel lblNewLabel_5 = new JLabel("商品番号");
		lblNewLabel_5.setBounds(107, 8, 57, 13);
		lblNewLabel_5.setBackground(new Color(103, 130, 102));
		panel_2.add(lblNewLabel_5);

		deletetextField = new JTextField();
		deletetextField.setBounds(170, 5, 110, 20);
		panel_2.add(deletetextField);
		deletetextField.setColumns(10);


		JButton button3 = new JButton("確認");
		button3.setBounds(330, 4, 71, 21);
		panel_2.add(button3);
		button3.addActionListener(this);
		button3.setActionCommand("削除確認");

		deletebutton = new JRadioButton("削除");
		deletebutton.setBounds(7, 4, 58, 21);
		panel_2.add(deletebutton);
		bg.add(deletebutton);

		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(133, 188, 146));
		panel_3.setBounds(18, 10, 420, 30);
		panel.add(panel_3);
		panel_3.setLayout(null);

		JLabel lblNewLabel = new JLabel("商品番号");
		lblNewLabel.setBounds(107, 10, 50, 13);
		panel_3.add(lblNewLabel);


		itemNo = new JTextField();
		itemNo.setBounds(170, 7, 110, 20);
		panel_3.add(itemNo);
		itemNo.setColumns(10);

		JButton bottun1 = new JButton("検索");
		bottun1.setBounds(330, 6, 71, 21);
		panel_3.add(bottun1);
		bottun1.addActionListener(this);
		bottun1.setActionCommand("検索");

		editbutton = new JRadioButton("編集",true);
		editbutton.setBounds(7, 6, 58, 21);
		panel_3.add(editbutton);
		bg.add(editbutton);

		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(133, 188, 146));
		panel_4.setBounds(68, 74, 306, 187);
		LineBorder border = new LineBorder(Color.gray, 1, true);
		panel_4.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, new Color(128, 128, 128)));

		panel_4.setLayout(null);
		panel.add(panel_4);

		//項目用グリッドレイアウト
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(12, 10, 269, 166);
		panel_4.add(panel_1);
		panel_1.setBackground(new Color(133, 188, 146));
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{0, 0, 0};
		gbl_panel_1.rowHeights = new int[]{29, 0, 0, 0, 0, 0, 0};
		gbl_panel_1.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);

		itemnumber = new JLabel("商品番号　：　");
		GridBagConstraints gbc_itemnumber = new GridBagConstraints();
		gbc_itemnumber.anchor = GridBagConstraints.WEST;
		gbc_itemnumber.insets = new Insets(0, 0, 5, 5);
		gbc_itemnumber.gridx = 0;
		gbc_itemnumber.gridy = 0;
		panel_1.add(itemnumber, gbc_itemnumber);

		JLabel lblNewLabel_1 = new JLabel("商品名");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 1;
		panel_1.add(lblNewLabel_1, gbc_lblNewLabel_1);

		itemname = new JTextField();
		GridBagConstraints gbc_itemname = new GridBagConstraints();
		gbc_itemname.insets = new Insets(0, 0, 5, 0);
		gbc_itemname.fill = GridBagConstraints.HORIZONTAL;
		gbc_itemname.gridx = 1;
		gbc_itemname.gridy = 1;
		panel_1.add(itemname, gbc_itemname);
		itemname.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("歌手");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 2;
		panel_1.add(lblNewLabel_2, gbc_lblNewLabel_2);

		artist = new JTextField();
		GridBagConstraints gbc_artist = new GridBagConstraints();
		gbc_artist.insets = new Insets(0, 0, 5, 0);
		gbc_artist.fill = GridBagConstraints.HORIZONTAL;
		gbc_artist.gridx = 1;
		gbc_artist.gridy = 2;
		panel_1.add(artist, gbc_artist);
		artist.setColumns(10);

		JLabel lblNewLabel_3 = new JLabel("ジャンル");
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 0;
		gbc_lblNewLabel_3.gridy = 3;
		panel_1.add(lblNewLabel_3, gbc_lblNewLabel_3);

		genre = new JComboBox<>();
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.insets = new Insets(0, 0, 5, 0);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 1;
		gbc_comboBox.gridy = 3;
		genre.addItem("J-POP");
		genre.addItem("K-POP");
		genre.addItem("洋楽");
		genre.addItem("童謡");
		genre.addItem("アニメソング");
		panel_1.add(genre, gbc_comboBox);

		JLabel lblNewLabel_4 = new JLabel("金額");
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_4.gridx = 0;
		gbc_lblNewLabel_4.gridy = 4;
		panel_1.add(lblNewLabel_4, gbc_lblNewLabel_4);

		price = new JTextField();
		GridBagConstraints gbc_price = new GridBagConstraints();
		gbc_price.insets = new Insets(0, 0, 5, 0);
		gbc_price.fill = GridBagConstraints.HORIZONTAL;
		gbc_price.gridx = 1;
		gbc_price.gridy = 4;
		panel_1.add(price, gbc_price);
		price.setColumns(10);

		JButton button2 = new JButton("確認");
		GridBagConstraints gbc_button2 = new GridBagConstraints();
		gbc_button2.gridx = 1;
		gbc_button2.gridy = 5;
		panel_1.add(button2, gbc_button2);
		button2.addActionListener(this);
		button2.setActionCommand("編集確認");
		setLayout(groupLayout);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		AccessDB db= AccessDB.getInstance();
		AccessDB2 db2 = AccessDB2.getInstance();

		if(editbutton.isSelected()) {
			if(e.getActionCommand().equals("検索")) {
				try {
					Integer.parseInt(itemNo.getText());

				} catch (NumberFormatException s) {
					JOptionPane.showMessageDialog(this, "<html>商品番号は<br>半角数字のみで<br>入力してください</html>");
				}

				db.connect();
				if (db.inputtextfield(Integer.parseInt(itemNo.getText())) != null) {
					Object []object = db.inputtextfield(Integer.parseInt(itemNo.getText()));
					itemnumber.setText("商品番号　：　"+object[0]);
					itemname.setText(object[1].toString());
					artist.setText(object[2].toString());
					//genre
					String genreinput = object[3].toString();

					if(genreinput.equals("J-POP")) {
						genre.setSelectedItem("J-POP");
					}else if(genreinput.equals("K-POP")) {
						genre.setSelectedItem("K-POP");
					}else if(genreinput.equals("洋楽")) {
						genre.setSelectedItem("洋楽");
					}else if(genreinput.equals("演歌・歌謡曲")) {
						genre.setSelectedItem("演歌・歌謡曲");
					}else if(genreinput.equals("童謡・唱歌")) {
						genre.setSelectedItem("童謡・唱歌");
					}else if(genreinput.equals("アニメ・ゲーム")) {
						genre.setSelectedItem("アニメ・ゲーム");
					}else if(genreinput.equals("ロック・ポップス")) {
						genre.setSelectedItem("ロック・ポップス");
					}else if(genreinput.equals("クラシック")) {
						genre.setSelectedItem("クラシック");
					}else if(genreinput.equals("ジャズ")) {
						genre.setSelectedItem("ジャズ");
					}else if(genreinput.equals("ラップ・ヒップホップ")) {
						genre.setSelectedItem("ラップ・ヒップホップ");
					}else if(genreinput.equals("R&B・ソウル")) {
						genre.setSelectedItem("R&B・ソウル");
					}else if(genreinput.equals("ハードロック・メタル")) {
						genre.setSelectedItem("ハードロック・メタル");
					}

					price.setText(object[4].toString());
				} else {

					JDialog d = new JDialog();
					d.setTitle("アラート");
					d.setSize(200, 150);
					d.setLocationRelativeTo(this);
					d.setModal(true);
					JLabel alartLabel = new JLabel("存在しない商品番号です");
					alartLabel.setHorizontalAlignment(JLabel.CENTER);
					d.getContentPane().add(alartLabel);
					JButton dialogButton = new JButton("OK");
					d.getContentPane().add(dialogButton, BorderLayout.SOUTH);
					dialogButton.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							d.setVisible(false);
						}
					});
					d.setVisible(true);

				}
				db.disconnect();
			}


			if (e.getActionCommand().equals("編集確認")) {

				try {
					Integer.parseInt(price.getText());
					int result = JOptionPane.showConfirmDialog(this,itemNo.getText() + "\n商品名：" + itemname.getText() + "\n歌手：" + artist.getText() + "\nジャンル：" + genre.getSelectedItem() + "\n金額：" + price.getText() + "\nこの内容で登録しますか？", "確認",  JOptionPane.YES_NO_OPTION);
					if (result == JOptionPane.YES_OPTION) {

						db.connect();
						db.updateCDData(itemname.getText(), artist.getText(), (String)genre.getSelectedItem(), Integer.parseInt(price.getText()), Integer.parseInt(itemNo.getText()));
						db.disconnect();

						Date date = new Date();
						OperationHistory oh = new OperationHistory(Integer.parseInt(itemNo.getText()), itemname.getText(), "編集", 0, date);
						db2.connect();
						int result2 = db2.insertData(oh);//どう使うか悩んでます
						db2.disconnect();


						itemNo.setText("");
						itemname.setText("");
						artist.setText("");
						genre.setSelectedIndex(0);
						price.setText("");

					} else if (result == JOptionPane.NO_OPTION) {
						//				JOptionPaneを閉じる

					}

				} catch (NumberFormatException s) {
					JOptionPane.showMessageDialog(this, "<html>金額は<br>半角数字のみで<br>入力してください</html>");
				}
			}

		}else if(deletebutton.isSelected()){

			if(e.getActionCommand().equals("削除確認")) {
				try {
					Integer.parseInt(deletetextField.getText());

				} catch (NumberFormatException s) {
					JOptionPane.showMessageDialog(this, "<html>商品番号は<br>半角数字のみで<br>入力してください</html>");

				}
				db.connect();

				if (db.inputtextfield(Integer.parseInt(deletetextField.getText())) != null) {
					Object [] deleteobject = db.showDeleteData(Integer.parseInt(deletetextField.getText()));
					int result = JOptionPane.showConfirmDialog(this,deleteobject[0]+ "\n商品名：" +deleteobject[1].toString()  + "\n歌手：" + deleteobject[2].toString()+ "\nジャンル：" + deleteobject[3].toString() + "\n金額：" + deleteobject[4] + "\nこの商品を削除しますか？", "確認",  JOptionPane.YES_NO_OPTION);
					if (result == JOptionPane.YES_OPTION) {
						db.deleteCDData(Integer.parseInt(deletetextField.getText()));
						db.disconnect();


						Date date = new Date();
						OperationHistory oh = new OperationHistory(Integer.parseInt(itemNo.getText()), itemname.getText(), "削除", 0, date);
						db2.connect();
						int result2 = db2.insertData(oh);//どう使うか悩んでます
						db2.disconnect();

						deletetextField.setText("");

					} else if (result == JOptionPane.NO_OPTION) {
					}
					//				JOptionPaneを閉じる
				} else {

					JDialog d = new JDialog();
					d.setTitle("アラート");
					d.setSize(200, 150);
					d.setLocationRelativeTo(this);
					d.setModal(true);
					JLabel alartLabel = new JLabel("存在しない商品番号です");
					alartLabel.setHorizontalAlignment(JLabel.CENTER);
					d.getContentPane().add(alartLabel);
					JButton dialogButton = new JButton("OK");
					d.getContentPane().add(dialogButton, BorderLayout.SOUTH);
					dialogButton.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							d.setVisible(false);
						}
					});
					d.setVisible(true);
					db.disconnect();


				}
			}
		}
	}
}