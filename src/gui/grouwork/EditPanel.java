package gui.grouwork;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class EditPanel extends JFrame {
	package groupgui;

	import java.awt.BorderLayout;
	import java.awt.EventQueue;
	import java.awt.GridBagConstraints;
	import java.awt.GridBagLayout;
	import java.awt.Insets;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;

	import javax.swing.ButtonGroup;
	import javax.swing.JButton;
	import javax.swing.JComboBox;
	import javax.swing.JDialog;
	import javax.swing.JFrame;
	import javax.swing.JLabel;
	import javax.swing.JOptionPane;
	import javax.swing.JPanel;
	import javax.swing.JRadioButton;
	import javax.swing.JTextField;
	import javax.swing.border.EmptyBorder;

	public class EditPanel extends JFrame implements ActionListener {

		private JPanel contentPane;
		private JTextField itemNo;
		private JTextField itemname;
		private JTextField artist;
		private JTextField price;
		JLabel itemnumber;
		int itemNum ;
		JComboBox<String> genre;

		JTextField deletetextField;
		JRadioButton editbutton;
		JRadioButton deletebutton;
		boolean dialogbool = true;

		/**
		 * Launch the application.
		 */
		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						EditPanel frame = new EditPanel();
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
		public EditPanel() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 450, 409);
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

			setContentPane(contentPane);
			contentPane.setLayout(null);

			JPanel panel = new JPanel();
			panel.setBounds(12, 10, 410, 350);
			contentPane.add(panel);
			panel.setLayout(null);

			itemNo = new JTextField();
			itemNo.setBounds(159, 29, 117, 19);
			panel.add(itemNo);
			itemNo.setColumns(10);


			JButton bottun1 = new JButton("検索");
			bottun1.addActionListener(this);
			bottun1.setActionCommand("検索");
			bottun1.setBounds(179, 57, 71, 21);
			panel.add(bottun1);

			itemnumber = new JLabel("商品番号　：　");

			itemnumber.setBounds(80, 88, 160, 13);
			panel.add(itemnumber);


			JPanel panel_1 = new JPanel();
			panel_1.setBounds(80, 111, 238, 103);
			panel.add(panel_1);
			GridBagLayout gbl_panel_1 = new GridBagLayout();
			gbl_panel_1.columnWidths = new int[]{0, 0, 0};
			gbl_panel_1.rowHeights = new int[]{0, 0, 0, 0, 0};
			gbl_panel_1.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
			gbl_panel_1.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
			panel_1.setLayout(gbl_panel_1);

			JLabel lblNewLabel_1 = new JLabel("商品名");
			GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
			gbc_lblNewLabel_1.anchor = GridBagConstraints.WEST;
			gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
			gbc_lblNewLabel_1.gridx = 0;
			gbc_lblNewLabel_1.gridy = 0;
			panel_1.add(lblNewLabel_1, gbc_lblNewLabel_1);

			itemname = new JTextField();
			GridBagConstraints gbc_itemname = new GridBagConstraints();
			gbc_itemname.insets = new Insets(0, 0, 5, 0);
			gbc_itemname.fill = GridBagConstraints.HORIZONTAL;
			gbc_itemname.gridx = 1;
			gbc_itemname.gridy = 0;
			panel_1.add(itemname, gbc_itemname);
			itemname.setColumns(10);

			JLabel lblNewLabel_2 = new JLabel("歌手");
			GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
			gbc_lblNewLabel_2.anchor = GridBagConstraints.WEST;
			gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
			gbc_lblNewLabel_2.gridx = 0;
			gbc_lblNewLabel_2.gridy = 1;
			panel_1.add(lblNewLabel_2, gbc_lblNewLabel_2);

			artist = new JTextField();
			GridBagConstraints gbc_artist = new GridBagConstraints();
			gbc_artist.insets = new Insets(0, 0, 5, 0);
			gbc_artist.fill = GridBagConstraints.HORIZONTAL;
			gbc_artist.gridx = 1;
			gbc_artist.gridy = 1;
			panel_1.add(artist, gbc_artist);
			artist.setColumns(10);

			JLabel lblNewLabel_3 = new JLabel("ジャンル");
			GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
			gbc_lblNewLabel_3.anchor = GridBagConstraints.WEST;
			gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
			gbc_lblNewLabel_3.gridx = 0;
			gbc_lblNewLabel_3.gridy = 2;
			panel_1.add(lblNewLabel_3, gbc_lblNewLabel_3);

			genre = new JComboBox<>();
			GridBagConstraints gbc_comboBox = new GridBagConstraints();
			gbc_comboBox.insets = new Insets(0, 0, 5, 0);
			gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
			gbc_comboBox.gridx = 1;
			gbc_comboBox.gridy = 2;
			genre.addItem("J-POP");
			genre.addItem("K-POP");
			genre.addItem("洋楽");
			genre.addItem("童謡");
			genre.addItem("アニメソング");
			panel_1.add(genre, gbc_comboBox);

			JLabel lblNewLabel_4 = new JLabel("金額");
			GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
			gbc_lblNewLabel_4.anchor = GridBagConstraints.WEST;
			gbc_lblNewLabel_4.insets = new Insets(0, 0, 0, 5);
			gbc_lblNewLabel_4.gridx = 0;
			gbc_lblNewLabel_4.gridy = 3;
			panel_1.add(lblNewLabel_4, gbc_lblNewLabel_4);

			price = new JTextField();
			GridBagConstraints gbc_price = new GridBagConstraints();
			gbc_price.fill = GridBagConstraints.HORIZONTAL;
			gbc_price.gridx = 1;
			gbc_price.gridy = 3;
			panel_1.add(price, gbc_price);
			price.setColumns(10);

			JButton button2 = new JButton("確認");
			button2.addActionListener(this);
			button2.setActionCommand("編集確認");
			button2.setBounds(327, 193, 71, 21);
			panel.add(button2);

			editbutton = new JRadioButton("編集",true);
			editbutton.setBounds(8, 6, 58, 21);
			panel.add(editbutton);

			deletebutton = new JRadioButton("削除");
			deletebutton.setBounds(8, 244, 58, 21);
			panel.add(deletebutton);

			JLabel lblNewLabel = new JLabel("商品番号");
			lblNewLabel.setBounds(80, 32, 50, 13);
			panel.add(lblNewLabel);

			JPanel panel_2 = new JPanel();
			panel_2.setBounds(80, 282, 196, 27);
			panel.add(panel_2);
			GridBagLayout gbl_panel_2 = new GridBagLayout();
			gbl_panel_2.columnWidths = new int[]{0, 0, 0, 0};
			gbl_panel_2.rowHeights = new int[]{0, 0};
			gbl_panel_2.columnWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
			gbl_panel_2.rowWeights = new double[]{0.0, Double.MIN_VALUE};
			panel_2.setLayout(gbl_panel_2);

			JLabel lblNewLabel_5 = new JLabel("商品番号");
			GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
			gbc_lblNewLabel_5.insets = new Insets(0, 0, 0, 5);
			gbc_lblNewLabel_5.gridx = 0;
			gbc_lblNewLabel_5.gridy = 0;
			panel_2.add(lblNewLabel_5, gbc_lblNewLabel_5);

			deletetextField = new JTextField();
			GridBagConstraints gbc_textField = new GridBagConstraints();
			gbc_textField.fill = GridBagConstraints.HORIZONTAL;
			gbc_textField.gridx = 2;
			gbc_textField.gridy = 0;
			panel_2.add(deletetextField, gbc_textField);
			deletetextField.setColumns(10);


			JButton button3 = new JButton("確認");
			button3.setBounds(327, 282, 71, 21);
			button3.addActionListener(this);
			button3.setActionCommand("削除確認");
			panel.add(button3);

			ButtonGroup bg = new ButtonGroup();
			bg.add(editbutton);
			bg.add(deletebutton);


		}

		@Override
		public void actionPerformed(ActionEvent e) {
			DatabaseManager db= DatabaseManager.getInstance();

			if(editbutton.isSelected()) {
				if(e.getActionCommand().equals("検索")) {
					try {
						Integer.parseInt(itemNo.getText());

					} catch (NumberFormatException s) {
						JDialog d = new JDialog();
						d.setTitle("alert");
						d.setSize(200,120);
						d.setLocationRelativeTo(contentPane);
						d.setModal(true);
						JLabel alert =new JLabel();
						alert.setHorizontalAlignment(JLabel.CENTER);
						alert.setText("<html>商品番号は<br>半角数字のみで<br>入力してください</html>");
						d.getContentPane().add(alert,BorderLayout.NORTH);
						JButton okbutton = new JButton("ok");
						okbutton.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								d.setVisible(false);

							}
						});

						d.getContentPane().add(okbutton,BorderLayout.SOUTH);
						d.setVisible(true);

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
					}else if(genreinput.equals("童謡")) {
						genre.setSelectedItem("童謡");
					}else if(genreinput.equals("アニメソング")) {
						genre.setSelectedItem("アニメソング");
					}

					price.setText(object[4].toString());
					} else {
						
						JDialog d = new JDialog();
						d.setTitle("アラート");
						d.setSize(200, 150);
						d.setLocationRelativeTo(contentPane);
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
						dialogbool=true;

					} catch (NumberFormatException s) {
						JDialog d = new JDialog();
						d.setTitle("alert");
						d.setSize(200,120);
						d.setLocationRelativeTo(contentPane);
						d.setModal(true);
						JLabel alert =new JLabel();
						alert.setHorizontalAlignment(JLabel.CENTER);
						alert.setText("<html>金額は<br>半角数字のみで<br>入力してください</html>");
						d.getContentPane().add(alert,BorderLayout.NORTH);
						JButton okbutton = new JButton("ok");
						okbutton.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								dialogbool=false;
								d.setVisible(false);


							}
						});

						d.getContentPane().add(okbutton,BorderLayout.SOUTH);
						d.setVisible(true);

					}

					if(dialogbool == true) {
						int result = JOptionPane.showConfirmDialog(null,itemNo.getText() + "\n商品名：" + itemname.getText() + "\n歌手：" + artist.getText() + "\nジャンル：" + genre.getSelectedItem() + "\n金額：" + price.getText() + "\nこの内容で登録しますか？", "確認",  JOptionPane.YES_NO_OPTION);
						if (result == JOptionPane.YES_OPTION) {

							db.connect();
							db.updateCDData(itemname.getText(), artist.getText(), (String)genre.getSelectedItem(), Integer.parseInt(price.getText()), Integer.parseInt(itemNo.getText()));
							db.disconnect();
						} else if (result == JOptionPane.NO_OPTION) {
							//				JOptionPaneを閉じる

						}

					}
				}

			}else if(deletebutton.isSelected()){

				if(e.getActionCommand().equals("削除確認")) {
					try {
						Integer.parseInt(deletetextField.getText());

					} catch (NumberFormatException s) {
						JDialog d = new JDialog();
						d.setTitle("alert");
						d.setSize(200,120);
						d.setLocationRelativeTo(contentPane);
						d.setModal(true);
						JLabel alert =new JLabel();
						alert.setHorizontalAlignment(JLabel.CENTER);
						alert.setText("<html>商品番号は<br>半角数字のみで<br>入力してください</html>");
						d.getContentPane().add(alert,BorderLayout.NORTH);
						JButton okbutton = new JButton("ok");
						okbutton.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {

								d.setVisible(false);

							}
						});

						d.getContentPane().add(okbutton,BorderLayout.SOUTH);
						d.setVisible(true);

					}
					db.connect();

					if (db.inputtextfield(Integer.parseInt(deletetextField.getText())) != null) {
						Object [] deleteobject = db.showDeleteData(Integer.parseInt(deletetextField.getText()));
						int result = JOptionPane.showConfirmDialog(null,deleteobject[0]+ "\n商品名：" +deleteobject[1].toString()  + "\n歌手：" + deleteobject[2].toString()+ "\nジャンル：" + deleteobject[3].toString() + "\n金額：" + deleteobject[4] + "\nこの商品を削除しますか？", "確認",  JOptionPane.YES_NO_OPTION);
						if (result == JOptionPane.YES_OPTION) {
							db.deleteCDData(Integer.parseInt(deletetextField.getText()));
							db.disconnect();
						} else if (result == JOptionPane.NO_OPTION) {
						}
						//				JOptionPaneを閉じる
					} else {

						JDialog d = new JDialog();
						d.setTitle("アラート");
						d.setSize(200, 150);
						d.setLocationRelativeTo(contentPane);
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
				}
			}
		}

	}

//	private JPanel contentPane;
//
//	/**
//	 * Launch the application.
//	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					okano frame = new okano();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}
//
//	/**
//	 * Create the frame.
//	 */
//	public okano() {
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		setBounds(100, 100, 450, 300);
//		contentPane = new JPanel();
//		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
//
//		setContentPane(contentPane);
//	}
//	

}
