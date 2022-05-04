package com.test.entities;



public class Board {
	private int board[] =new int[101];
	
	public void setSnake(int head,int tail)
	{
		board[head]=tail;
	}
	
	public void setLadder(int start,int end)
	{
		board[start]=end;
	}
	
	public int getSteps()
	{
		int steps=(int) (Math.random()*6)+1;
		//System.out.println("Steps:"+steps);
		return steps;
	}
	
	public int move(Player p)
	{
		int step=getSteps();
		if(step+p.getPosition()<=100)
		{
			//System.out.println("11111111111:"+p.getPosition());
			p.setPosition(step+p.getPosition());
			//System.out.println("22222222222:"+p.getPosition());
			while(board[p.getPosition()]!=0)
			{
				p.setPosition(board[p.getPosition()]);
			}
		}
		
		return step;
	}
}
