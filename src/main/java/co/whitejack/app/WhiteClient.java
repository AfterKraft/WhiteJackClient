package co.whitejack.app;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;

import org.apache.log4j.Logger;

import co.whitejack.api.net.server.Server;
import co.whitejack.net.server.WhiteServer;


public abstract class WhiteClient {
	
	private static Logger log = Logger.getLogger("WhiteJack");

	private String version = "0.1.0";
//	private SocketAddress endpoint = new SocketAddress("mctest.afterkraft.com",57656);

	public String getVersion() {
		return version;
	}

	/**
	 * Lets connect to the official servers!
	 * @param server
	 */
//	public void connectToOnlineServer(Server server) {
//		log.info("Will try to connect to online server now");
//		try {
//			Socket socket = new Socket("mctest.afterkraft.com", 57656);
//			socket.connect(endpoint);
//		} catch (IOException exception) {
//			System.out.println("Error: " + exception);
//		}
//	}
	
	public void makeOfflineServer(Server server) {
		WhiteServer offlineServer = new WhiteServer();
		offlineServer.setup();
		
	}

}
