package client;

import java.io.IOException;
import java.util.ArrayList;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;

public class PokerGUI extends JFrame implements Runnable{

	private JPanel contentPane;
	private JTextField txtPlayer;
	private JTextField txtPlayer_1;
	private JLabel label_1;
	private JLabel label_2;
	private JLabel label_3;
	private JLabel label_4;
	private JTextField txtPlayer_2;
	private JLabel label_5;
	private JLabel label_6;
	private JTextField txtMyCards;
	private JTextField txtRoundBet;
	private JTextField txtTotalBet;
	private JTextField txtRound;
	private JLabel label_7;
	private JLabel label_8;
	private JLabel label_9;
	private JLabel label_10;
	private JLabel label_11;
	private JTextField txtCommunityCards;
	private JButton btnBetRaise;
	private JButton btnFold;
	private JButton btnCall;
	private JButton btnCheck;
	private JTextField textField;

	
	private static Connection user;
	private JTextArea chatWindow;
	private JTextField messageBox;
	private JScrollPane scrollPane;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PokerGUI frame = new PokerGUI(user);
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
	public PokerGUI(Connection user)
	{
		this.user = user;
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setBounds(100, 100, 836, 605);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(17, 47, 71, 96);
		lblNewLabel.setIcon(new ImageIcon(PokerGUI.class.getResource("/cards/back1.GIF")));
		
		JLabel label = new JLabel("");
		label.setBounds(95, 47, 71, 96);
		label.setIcon(new ImageIcon(PokerGUI.class.getResource("/cards/back1.GIF")));
		
		txtPlayer = new JTextField();
		txtPlayer.setBounds(17, 18, 57, 22);
		txtPlayer.setEditable(false);
		txtPlayer.setText("Player 1");
		txtPlayer.setColumns(10);
		
		txtPlayer_1 = new JTextField();
		txtPlayer_1.setBounds(202, 18, 63, 22);
		txtPlayer_1.setEditable(false);
		txtPlayer_1.setText("Player 2");
		txtPlayer_1.setColumns(10);
		
		label_1 = new JLabel("");
		label_1.setBounds(289, 47, 71, 96);
		label_1.setIcon(new ImageIcon(PokerGUI.class.getResource("/cards/back1.GIF")));
		
		label_2 = new JLabel("");
		label_2.setBounds(202, 47, 71, 96);
		label_2.setIcon(new ImageIcon(PokerGUI.class.getResource("/cards/back1.GIF")));
		
		label_3 = new JLabel("");
		label_3.setBounds(404, 47, 71, 96);
		label_3.setIcon(new ImageIcon(PokerGUI.class.getResource("/cards/back1.GIF")));
		
		label_4 = new JLabel("");
		label_4.setBounds(482, 47, 71, 96);
		label_4.setIcon(new ImageIcon(PokerGUI.class.getResource("/cards/back1.GIF")));
		
		txtPlayer_2 = new JTextField();
		txtPlayer_2.setBounds(404, 18, 57, 22);
		txtPlayer_2.setEditable(false);
		txtPlayer_2.setText("Player 3");
		txtPlayer_2.setColumns(10);
		
		label_5 = new JLabel("");
		label_5.setBounds(17, 444, 71, 96);
		label_5.setIcon(new ImageIcon(PokerGUI.class.getResource("/cards/back1.GIF")));
		
		label_6 = new JLabel("");
		label_6.setBounds(95, 444, 71, 96);
		label_6.setIcon(new ImageIcon(PokerGUI.class.getResource("/cards/back1.GIF")));
		
		txtMyCards = new JTextField();
		txtMyCards.setBounds(17, 415, 63, 22);
		txtMyCards.setEditable(false);
		txtMyCards.setText("My Cards");
		txtMyCards.setColumns(10);
		
		txtRoundBet = new JTextField();
		txtRoundBet.setBounds(426, 518, 126, 22);
		txtRoundBet.setEditable(false);
		txtRoundBet.setText("Round Bet: ");
		txtRoundBet.setColumns(10);
		
		txtTotalBet = new JTextField();
		txtTotalBet.setBounds(426, 482, 126, 22);
		txtTotalBet.setEditable(false);
		txtTotalBet.setText("Total Bet: ");
		txtTotalBet.setColumns(10);
		
		txtRound = new JTextField();
		txtRound.setBounds(426, 444, 127, 22);
		txtRound.setEditable(false);
		txtRound.setText("Round: ");
		txtRound.setColumns(10);
		
		label_7 = new JLabel("");
		label_7.setBounds(17, 239, 71, 96);
		label_7.setIcon(new ImageIcon(PokerGUI.class.getResource("/cards/back1.GIF")));
		
		label_8 = new JLabel("");
		label_8.setBounds(106, 239, 71, 96);
		label_8.setIcon(new ImageIcon(PokerGUI.class.getResource("/cards/back1.GIF")));
		
		label_9 = new JLabel("");
		label_9.setBounds(195, 239, 71, 96);
		label_9.setIcon(new ImageIcon(PokerGUI.class.getResource("/cards/back1.GIF")));
		
		label_10 = new JLabel("");
		label_10.setBounds(284, 239, 71, 96);
		label_10.setIcon(new ImageIcon(PokerGUI.class.getResource("/cards/back1.GIF")));
		
		label_11 = new JLabel("");
		label_11.setBounds(373, 239, 71, 96);
		label_11.setIcon(new ImageIcon(PokerGUI.class.getResource("/cards/back1.GIF")));
		
		txtCommunityCards = new JTextField();
		txtCommunityCards.setBounds(17, 210, 116, 22);
		txtCommunityCards.setEditable(false);
		txtCommunityCards.setText("Community Cards");
		txtCommunityCards.setColumns(10);
		
		btnCall = new JButton("Call");
		btnCall.setBounds(178, 444, 95, 25);
		btnCall.setEnabled(false);
		
		btnBetRaise = new JButton("Bet / Raise");
		btnBetRaise.setBounds(178, 517, 95, 25);
		btnBetRaise.setEnabled(false);
		
		btnCheck = new JButton("Check");
		btnCheck.setBounds(287, 444, 73, 25);
		btnCheck.setEnabled(false);
		
		textField = new JTextField();
		textField.setBounds(178, 482, 95, 22);
		textField.setColumns(10);
		
		btnFold = new JButton("Fold");
		btnFold.setBounds(287, 517, 73, 25);
		btnFold.setEnabled(false);
		contentPane.setLayout(null);
		contentPane.add(txtCommunityCards);
		contentPane.add(txtMyCards);
		contentPane.add(label_7);
		contentPane.add(label_8);
		contentPane.add(label_5);
		contentPane.add(label_6);
		contentPane.add(lblNewLabel);
		contentPane.add(label);
		contentPane.add(txtPlayer);
		contentPane.add(label_2);
		contentPane.add(label_1);
		contentPane.add(txtPlayer_1);
		contentPane.add(txtPlayer_2);
		contentPane.add(label_3);
		contentPane.add(btnCall);
		contentPane.add(btnCheck);
		contentPane.add(btnFold);
		contentPane.add(textField);
		contentPane.add(btnBetRaise);
		contentPane.add(label_9);
		contentPane.add(label_10);
		contentPane.add(label_11);
		contentPane.add(label_4);
		contentPane.add(txtRoundBet);
		contentPane.add(txtTotalBet);
		contentPane.add(txtRound);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(565, 18, 240, 495);
		contentPane.add(scrollPane);
		
		chatWindow = new JTextArea();
		scrollPane.setViewportView(chatWindow);
		chatWindow.setEditable(false);
		
		messageBox = new JTextField();
		messageBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent a) {
				try {
					user.Write().writeUTF("CHAT# " + a.getActionCommand());
					messageBox.setText("");
					user.Write().flush();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		messageBox.setBounds(564, 526, 241, 22);
		contentPane.add(messageBox);
		messageBox.setColumns(10);
		
		Thread t = new Thread(this);
		t.start();
	}
	
	public void buttonsRefresh()
	{
		ArrayList<PlayerAction> action = user.Player().possibleActions();
		btnCall.setEnabled(action.contains(PlayerAction.CALL));
		btnCheck.setEnabled(action.contains(PlayerAction.CHECK));
		btnBetRaise.setEnabled(action.contains(PlayerAction.RAISE));
		btnFold.setEnabled(action.contains(PlayerAction.FOLD));
	}

	@Override
	public void run() {
		while(true)
		{
			String message = null;
			try {
				message = user.Read().readUTF();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(message.contains("CHAT# "));
			{
//				System.out.println(message);
				chatWindow.append(message.substring(6) +  "\n");
			}
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
