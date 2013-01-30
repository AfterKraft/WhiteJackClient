package com.whitejack.app;

import org.apache.log4j.Logger;
import org.apache.log4j.BasicConfigurator;

import com.whitejack.api.GameMaker;
import com.whitejack.blackjack.*;
import com.whitejack.gui.GUIManager;

public class WhiteJack extends WhiteClient {

	// initialize starting variables for startup
	// TODO: We have none yet.
	private static Logger log = Logger.getLogger("WhiteJack");

	
	/**
	 * @depreciated Write an actual client to connect to the WhiteJack Server and run the gui
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		BasicConfigurator.configure();

		log.info("====================\n" + "Welcome to WhiteJack\n");
		log.info("\n");

		// Start GameMaker
		GameMaker<BlackJackGame, BlackJackGameTable, BlackJackFactory> GM = new GameMaker<BlackJackGame, BlackJackGameTable, BlackJackFactory>(4); // Initialize

		GM.gameFactory = new BlackJackFactory();
		GM.setupGame(); // Start the Game making process

		GUIManager gui = new GUIManager();
		log.info("\ngui opened");
		gui.startGUI();
	}

}
