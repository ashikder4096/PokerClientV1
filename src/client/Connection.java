package client;
import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class Connection {
	private Socket connection;
	private ObjectInputStream input;
	private ObjectOutputStream output;
	private DataInputStream read;
	private DataOutputStream write;
	private InetAddress ip;
	
	private Player player;
	
	public Player Player()
	{
		return player;
	}
	
	public Socket getConnection() {
		return connection;
	}

	public ObjectInputStream Input() {
		return input;
	}

	public ObjectOutputStream Output() {
		return output;
	}

	public DataInputStream Read() {
		return read;
	}

	public DataOutputStream Write() {
		return write;
	}
	
	public Connection(String ip, int port, String username)
	{
		try {
			this.ip = InetAddress.getByName(ip);
			connection = new Socket(this.ip, port);
			setupStream();
			write.writeUTF(username);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		player = new Player();		
	}
	
	private void setupStream() {
		try {
			output = new ObjectOutputStream(connection.getOutputStream());
			write = new DataOutputStream(connection.getOutputStream());
			output.flush();
			write.flush();
			System.out.println("Output stream setup");		
			input = new ObjectInputStream(connection.getInputStream());
			read = new DataInputStream(connection.getInputStream());
			System.out.println("Input Stream setup");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void closeConnection()
	{
		try {
			System.out.println("Closing connection....");
			write.close();
			read.close();
			connection.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
