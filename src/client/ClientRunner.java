package client;
import java.awt.EventQueue;

public class ClientRunner {
	public static void main(String[] args) {
		Connection Asif = new Connection("127.0.0.1", 5342, "Asif");
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PokerGUI frame = new PokerGUI(Asif);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
//		Asif.Player().setBigBlind(true);
//		Asif.Player().setMyTurn(true);
//		System.out.println("setting up Ragib");
//		Connection Ragib = new Connection("127.0.0.1", 5312, "Ragib");
//		System.out.println("Has setup Ragib");
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					PokerGUI frame = new PokerGUI(Ragib);
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
	}
}
	
