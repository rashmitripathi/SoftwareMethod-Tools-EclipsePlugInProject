package edu.umkc.rashmi.asteroidengineplugin;

import org.psnbtech.Game;

import asteroidviewplugin.gameInterface.StartGameInterface;

public class StartGame implements StartGameInterface {

	@Override
	public void startGame() {
		// TODO Auto-generated method stub		
       Game game=new Game();		
       game.startGame();		
	}

}
