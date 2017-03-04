package client;
import java.util.ArrayList;

public class Player{

	private int balance = 0, RoundBet = 0, Round = 0, PlayerBet = 0;
	private boolean isBigBlind = false, isSmallBlind = false, isStarting = false, isPlaying = false, isMyTurn = false;
	private Actions action;
	
	public Player()
	{

	}
	
	//Will be called from the GUI to enable or disable buttons
	public ArrayList<Actions> possibleActions()
	{
		ArrayList<Actions> a = new ArrayList<>();
		if(Round == 0 && (isSmallBlind || isBigBlind))
		{
			a.add(Actions.RAISE);
			return a;
		}
		else
		{
			if(isSmallBlind)
			{
				a.add(Actions.RAISE);
				a.add(Actions.CHECK);
				a.add(Actions.FOLD);
			}
			else
			{
				a.add(Actions.CALL);
				a.add(Actions.FOLD);
				a.add(Actions.RAISE);
			}
		}
		return a;
	}
	
	public void Check()
	{
		action = Actions.CHECK;
		PlayerBet = 0;
	}
	
	public void Call()
	{
		balance -= RoundBet;
		PlayerBet = RoundBet;
		action = Actions.CALL;
	}
	
	public void Raise(int amount)
	{
		balance -= (amount + RoundBet);
		PlayerBet = RoundBet + amount;
		action = Actions.RAISE;
	}
	
	public void fold()
	{
		isPlaying = false;
		PlayerBet = 0;
		action = Actions.FOLD;
	}

	
	
	//Getters and Setters
	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int getRoundBet() {
		return RoundBet;
	}

	public void setRoundBet(int roundBet) {
		RoundBet = roundBet;
	}

	public int getRound() {
		return Round;
	}

	public void setRound(int round) {
		Round = round;
	}

	public int getPlayerBet() {
		return PlayerBet;
	}

	public void setPlayerBet(int playerBet) {
		PlayerBet = playerBet;
	}

	public boolean isBigBlind() {
		return isBigBlind;
	}

	public void setBigBlind(boolean isBigBlind) {
		this.isBigBlind = isBigBlind;
	}

	public boolean isSmallBlind() {
		return isSmallBlind;
	}

	public void setSmallBlind(boolean isSmallBlind) {
		this.isSmallBlind = isSmallBlind;
	}

	public boolean isStarting() {
		return isStarting;
	}

	public void setStarting(boolean isStarting) {
		this.isStarting = isStarting;
	}

	public boolean isPlaying() {
		return isPlaying;
	}

	public void setPlaying(boolean isPlaying) {
		this.isPlaying = isPlaying;
	}

	public boolean isMyTurn() {
		return isMyTurn;
	}

	public void setMyTurn(boolean isMyTurn) {
		this.isMyTurn = isMyTurn;
	}

	public Actions getAction() {
		return action;
	}

	public void setAction(Actions action) {
		this.action = action;
	}
}
