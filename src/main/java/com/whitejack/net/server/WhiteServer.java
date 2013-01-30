package com.whitejack.net.server;

import java.io.IOException;
import java.net.ServerSocket;

import org.apache.log4j.Logger;

import com.whitejack.api.net.server.Server;

/**
 * WhiteServer to be used for offline 
 * local client games NOT to be interacting
 * with official server statistics
 * @author gabizou
 *
 */
public class WhiteServer extends Server {
	
	private static Logger log = Logger.getLogger("WhiteJack");

	private final boolean onlineMode = false;
	
	public boolean getOnlineMode() {
		return onlineMode;
	}

	/**
	 * Setup Offline Server for offline Playing
	 */
	public void setup() {
		log.info("Trying to make an Offline Server!");
		try {
			ServerSocket serverSocket = new ServerSocket(57656);
			serverSocket.accept();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
}
