package jp.gui;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;

public class MainFrame extends JFrame implements ActionListener{

	private JPanel contentPane;
	//------------------------------------------------------------
	JPanel bottomPanel;//下部パネルだけフィールドで持てるようにする
	CardLayout card;
	//-----------------------------------------------------------------

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
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
	public MainFrame() {
		setTitle("CD在庫管理");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(250, 232, 197));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) { 
				Object message = "アプリケーションを終了しますか？";

				int result = JOptionPane.showConfirmDialog(contentPane,message, "alert",JOptionPane.YES_NO_OPTION,JOptionPane.PLAIN_MESSAGE);
				if (result == JOptionPane.YES_OPTION) {
					dispose();
				} else if (result == JOptionPane.NO_OPTION) {
					setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
				}

			}
		});
		setContentPane(contentPane);

		//-----上部パネル-------------------------------------------------
		JPanel topPanel = new JPanel(); 
		topPanel.setBackground(new Color(250, 232, 197));

		//-----下部パネル-------------------------------------------------
		bottomPanel = new JPanel();
		card = new CardLayout();
		bottomPanel.setLayout(card);
		bottomPanel.add("パネル1",new StockPanel());
		bottomPanel.add("パネル2",new InsertPanel());
		bottomPanel.add("パネル3",new ShowPanel());
		bottomPanel.add("パネル4",new EditPanel());
		bottomPanel.add("パネル5",new InformationPanel());
		//-----ここまで---------------------------------------------------

		//-----パネル全体-------------------------------------------------
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
				gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(topPanel, GroupLayout.PREFERRED_SIZE, 424, Short.MAX_VALUE)
				.addComponent(bottomPanel, GroupLayout.DEFAULT_SIZE, 574, Short.MAX_VALUE)
				);
		gl_contentPane.setVerticalGroup(
				gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
						.addComponent(topPanel, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(bottomPanel, GroupLayout.DEFAULT_SIZE, 364, Short.MAX_VALUE))
				);
		contentPane.setLayout(gl_contentPane);
		//-----ここまで---------------------------------------------------

		//-----ボタン-----------------------------------------------------
		JButton stockButton = new JButton("入荷・出荷");
		stockButton.addActionListener(this);
		stockButton.setActionCommand("入荷・出荷");
		topPanel.add(stockButton);

		JButton insertButton = new JButton("商品追加");
		insertButton.addActionListener(this);
		insertButton.setActionCommand("商品追加");
		topPanel.add(insertButton);

		JButton showButton = new JButton("データ表示");
		showButton.addActionListener(this);
		showButton.setActionCommand("データ表示");
		topPanel.add(showButton);

		JButton editButton = new JButton("編集・削除");
		editButton.addActionListener(this);
		editButton.setActionCommand("編集・削除");
		topPanel.add(editButton);

		JButton informationButton = new JButton("    INFO    ");
		informationButton.addActionListener(this);
		informationButton.setActionCommand("インフォメーション");
		topPanel.add(informationButton);
		//-----ここまで--------------------------------------------------
	}

	//-----画面遷移機能--------------------------------------------------
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("入荷・出荷")) {
			card.show(bottomPanel, "パネル1");
		}else if(e.getActionCommand().equals("商品追加")) {
			card.show(bottomPanel, "パネル2");
		}else if(e.getActionCommand().equals("データ表示")) {
			//データ表示ボタンを押したときに更新をかける
			bottomPanel.add("パネル3",new ShowPanel());
			card.show(bottomPanel, "パネル3");
		}else if(e.getActionCommand().equals("編集・削除")) {
			card.show(bottomPanel, "パネル4");
		}else if(e.getActionCommand().equals("インフォメーション")) {
			//INFOボタンを押したときに更新をかける
			bottomPanel.add("パネル5",new InformationPanel());
			card.show(bottomPanel, "パネル5");
		}
	}
	//-----ここまで------------------------------------------------------
}
