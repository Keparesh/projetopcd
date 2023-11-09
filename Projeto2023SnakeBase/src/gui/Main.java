package gui;

import java.io.Console;
import java.io.IOException;

import javax.net.ssl.StandardConstants;

import environment.LocalBoard;
import game.Server;

public class Main {
	public static void main(String[] args) {
		LocalBoard board=new LocalBoard();
		SnakeGui game = new SnakeGui(board,600,0);
		game.init();
		// Launch server
		// TODO
		
	}
}


//git token:[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]
