package client;
import java.awt.EventQueue;

public class ClientRunner {
	public static void main(String[] args) {
		Connection Asif = new Connection("127.0.0.1", 5312, "Asif");
		
		
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
//		User Ragib = new User("127.0.0.1", 5312, "Ragib");
//		Asif.startPoker();
	}
}
	
