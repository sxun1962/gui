package gui.grouwork;

import java.awt.CardLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class ryo extends JFrame implements ActionListener{

	JPanel panel;
	CardLayout card;

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ryo frame = new ryo();
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
	public ryo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		//下部パネル
		//-----重要な処理-------------------------------------------------
		panel = new JPanel();
		card = new CardLayout();
		panel.setLayout(card);
		panel.add("パネル1",new StockPanel());
		panel.add("パネル2",new InsertPanel());
		panel.add("パネル3",new ShowPanel());
		panel.add("パネル4",new EditPanel());
		panel.add("パネル5",new InformationPanel());
		//--------------------------------------------------------

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(12, 306, 527, 135);
		contentPane.add(panel_1);

		//-----ボタン----------------------------------------------------
		JButton btnNewButton = new JButton("入荷・出荷");
		btnNewButton.addActionListener(this);
		btnNewButton.setActionCommand("入荷・出荷");
		panel_1.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("商品追加");
		btnNewButton_1.addActionListener(this);
		btnNewButton_1.setActionCommand("商品追加");
		panel_1.add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("データ表示");
		btnNewButton_2.addActionListener(this);
		btnNewButton_2.setActionCommand("データ表示");
		panel_1.add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("編集・削除");
		btnNewButton_3.addActionListener(this);
		btnNewButton_3.setActionCommand("編集・削除");
		panel_1.add(btnNewButton_3);

		JButton btnNewButton_4 = new JButton("インフォメーション");
		btnNewButton_4.addActionListener(this);
		btnNewButton_4.setActionCommand("インフォメーション");
		panel_1.add(btnNewButton_4);

		//---------------------------------------------------------------
	}

	//-----画面遷移機能--------------------------------------------------
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("入荷・出荷")) {
			card.show(panel, "パネル1");
		}else if(e.getActionCommand().equals("商品追加")) {
			card.show(panel, "パネル2");
		}else if(e.getActionCommand().equals("データ表示")) {
			card.show(panel, "パネル3");
		}else if(e.getActionCommand().equals("編集・削除")) {
			card.show(panel, "パネル4");
		}else if(e.getActionCommand().equals("インフォメーション")) {
			card.show(panel, "パネル5");
		}
	}
	setContentPane(contentPane);



}


