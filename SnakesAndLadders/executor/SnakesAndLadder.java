package com.test.executor;

import java.util.Scanner;

import com.test.entities.Board;
import com.test.entities.Player;

public class SnakesAndLadder {

	public static void main(String[] args) {
		Board boardObj=new Board();
		//System.out.println("Board initialized");
		Scanner scanner=new Scanner(System.in);
		int noOfSnakes=scanner.nextInt();
		
		
		for(int i=0;i<noOfSnakes;i++)
		{
			int head=scanner.nextInt();
			int tail=scanner.nextInt();
			boardObj.setSnake(head, tail);
			
		}
		
		//System.out.println("Snakes initialized");
		int noOfLadders=scanner.nextInt();
		
		
		for(int i=0;i<noOfLadders;i++)
		{
			int start=scanner.nextInt();
			int end=scanner.nextInt();
			boardObj.setLadder(start, end);
			
		}
		//System.out.println("Ladders initialized");
		int noOfPlayers=scanner.nextInt();
		Player players[]=new Player[noOfPlayers];
		scanner.nextLine();
		for(int i=0;i<noOfPlayers;i++)
		{
			String playerName=scanner.nextLine();
			Player newPlayer=new Player(playerName);
			players[i]=newPlayer;
			
		}
		//System.out.println("Players initialized");
		int currPlayer=0;
		while(true)
		{
			//System.out.println("Before Move");
			Player p=players[currPlayer];
			int start=p.getPosition();
			int steps=boardObj.move(p);
			//System.out.println("AfterMove:"+steps);
			System.out.println(p.getName()+" Rolled "+steps+"and moved from "+start+" "+p.getPosition());
			
			if(p.getPosition()==100)
			{
				System.out.println(p.getName()+" wins the game");
				break;
			}
			
			
			currPlayer++;
			currPlayer=currPlayer%noOfPlayers;
		}
		
		
		

	}

}
