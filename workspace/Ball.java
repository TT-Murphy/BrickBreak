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
	public int getXpos(){
		return xPos;
	}

	public int getYpos(){
		return yPos;
	}

	public int getSize(){
		return size;
	}

	public int getXvelocity(){
		return xVelocity;
	}

	public int getYvelocity(){
		return yVelocity;
	}

	//setters
	public void setXVelocity(int v){
		this.xVelocity = v;
	}

	public void setYVelocity(int v){
		this.yVelocity = v;
	}

	public void setX (int x){
		this.xPos = x;
	}

	public void setY (int y){
		this.yPos = y;
	}


	public void reverseY (){
		this.yVelocity = -1*this.yVelocity;
	}

	public void reverseX (){
		this.xVelocity = -1*this.xVelocity;
	}

	public void move (){
		this.xPos+=this.xVelocity;
		this.yPos+=this.yVelocity;
	}

	public void draw (Graphics g){
		g.setColor(Color.red);
        g.fillOval(xPos, yPos, size, size);;
	}
}
