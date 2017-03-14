package client;
import java.util.ArrayList;

public class Player{

	private int balance = 0, RoundBet = 0, Round = 0, PlayerBet = 0;
	private boolean isBigBlind = false, isSmallBlind = false, isStarting = false, isPlaying = false, isMyTurn = false;
	private PlayerAction action;
	
	public static void main(String[] args) {
		Player p = new Player();
	}
	
	public Player()
	{

	}
	
	//Will be called from the GUI to enable or disable buttons
	public ArrayList<PlayerAction> possibleActions()
	{
		ArrayList<PlayerAction> a = new ArrayList<>();
		if(Round == 0 && (isSmallBlind || isBigBlind))
		{
			a.add(PlayerAction.RAISE);
			return a;
		}
		else
		{
			if(isSmallBlind)
			{
				a.add(PlayerAction.RAISE);
				a.add(PlayerAction.CHECK);
				a.add(PlayerAction.FOLD);
			}
			else
			{
				a.add(PlayerAction.CALL);
				a.add(PlayerAction.FOLD);
				a.add(PlayerAction.RAISE);
			}
		}
		return a;
	}
}
