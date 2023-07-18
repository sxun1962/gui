package gui.cardlayout;

import java.awt.CardLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class cardlayout extends JFrame implements ActionListener {

	private JPanel contentPane;
	JPanel panel;
	CardLayout card;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					cardlayout frame = new cardlayout();
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
	public cardlayout() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 533, 485);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		//上部パネル
		panel = new JPanel();
		card = new CardLayout();
		panel.setLayout(card);
		panel.add("パネル1",new Panel1());
		panel.add("パネル2",new Panel2());
		panel.add("パネル3",new Panel3());
		panel.setBounds(12, 10, 493, 270);
		contentPane.add(panel);
		//下部パネル
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(12, 313, 493, 112);
		contentPane.add(panel_1);
		//ボタン
		JButton btnNewButton = new JButton("ボタン1");
		panel_1.add(btnNewButton);
		btnNewButton.addActionListener(this);
		btnNewButton.setActionCommand("ボタン1");
		JButton btnNewButton_1 = new JButton("ボタン2");
		panel_1.add(btnNewButton_1);
		btnNewButton_1.addActionListener(this);
		btnNewButton_1.setActionCommand("ボタン2");
		JButton btnNewButton_2 = new JButton("ボタン3");
		panel_1.add(btnNewButton_2);
		btnNewButton_2.addActionListener(this);
		btnNewButton_2.setActionCommand("ボタン3");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		if(e.getActionCommand().equals("ボタン1")) {
			card.show(panel, "パネル1");
		}else if(e.getActionCommand().equals("ボタン2")) {
			card.show(panel, "パネル2");
		}else if(e.getActionCommand().equals("ボタン3")) {
			card.show(panel, "パネル3");
		}
	}
}
