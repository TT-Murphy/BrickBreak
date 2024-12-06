import java.awt.*;

public class Ball {
	//your code here!

	//don't forget you need instance variables:
	private int xVelocity = 1;
	private int yVelocity = -1;
	private int xPos;
	private int yPos;
	private int size;

	//constructor(s):
	public Ball (int x, int y, int s){
		this.size=s;
		this.xPos=x;
		this.yPos=y;
	}

	//methods:
	//getters

	//Pre-condition - xPos must be an integer
	//post-condition - returns xPos
	public int getXpos(){
		return xPos;
	}

	//Pre-condition - yPos must be an integer
	//post-condition - returns yPos
	public int getYpos(){
		return yPos;
	}

	//Pre-condition - size must be an integer
	//post-condition - returns size
	public int getSize(){
		return size;
	}

	//Pre-condition - xVelocitys must be an integer
	//post-condition - returns xVelocity
	public int getXvelocity(){
		return xVelocity;
	}

	//Pre-condition - yVelocity must be an integer
	//post-condition - returns yVelocity
	public int getYvelocity(){
		return yVelocity;
	}

	//setters

	//Pre-condition - v must be an integer
	//post-condition - sets xVelocity to v
	public void setXVelocity(int v){
		this.xVelocity = v;
	}

	//Pre-condition - v must be an integer
	//post-condition - sets yVelocity to v
	public void setYVelocity(int v){
		this.yVelocity = v;
	}
	
	//Pre-condition - x must be a positive
	//post-condition - sets xPos to x
	public void setX (int x){
		this.xPos = x;
	}

	//Pre-condition - y must be a positive
	//post-condition - sets yPos to y
	public void setY (int y){
		this.yPos = y;
	}

	//Pre-condition -
	//post-condition - makes yVelocity negative of its value
	public void reverseY (){
		this.yVelocity = -1*this.yVelocity;
	}

	//Pre-condition -
	//post-condition - makes xVelocity negative of its value
	public void reverseX (){
		this.xVelocity = -1*this.xVelocity;
	}

	//Pre-condition -
	//post-condition - increments xPos and yPos by xVelocity and yVelocity
	public void move (){
		this.xPos+=this.xVelocity;
		this.yPos+=this.yVelocity;
	}

	//Pre-condition - g must be a graphic
	//post-condition - makes g red and draws a circle with the dimentions of xPos, yPos, and size. 
	public void draw (Graphics g){
		g.setColor(Color.red);
        g.fillOval(xPos, yPos, size, size);;
	}
}
