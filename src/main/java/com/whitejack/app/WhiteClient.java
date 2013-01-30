package com.whitejack.app;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import org.apache.log4j.Logger;

import com.whitejack.api.net.server.Server;
import com.whitejack.net.server.WhiteServer;

public abstract class WhiteClient {
	
	private static Logger log = Logger.getLogger("WhiteJack");

	private String version = "0.1.0";

	public String getVersion() {
		return version;
	}

	/**
	 * Lets connect to the official servers!
	 * @param server
	 */
	public void connectToOnlineServer(Server server) {
		try {
			Socket socket = new Socket("98.149.134.164", 57656);
		} catch (IOException exception) {
			System.out.println("Error: " + exception);
		}
	}
	
	public void makeOfflineServer(Server server) {
		WhiteServer offlineServer = new WhiteServer();
		offlineServer.setup();
		
	}

}
