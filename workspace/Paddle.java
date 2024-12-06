import java.awt.*;

public class Paddle {

	private int velocity;
	private int height;
	private int xPos;
	private int yPos;
	private int width;

	//constructor(s):
	public Paddle (int x, int y, int w, int h){
		this.width=w;
		this.height=h;
		this.xPos=x;
		this.yPos=y;
	}

	//methods:
	//getters

	//Pre-condition - xPos must be an integer
	//post-condition - returns xPos
	public int getX(){
		return this.xPos;
	}
	
	//Pre-condition - yPos must be an integer
	//post-condition - returns yPos
	public int getY(){
		return this.yPos;
	}

	//Pre-condition - width must be an integer
	//post-condition - returns width
	public int getWidth(){
		return this.width;
	}

	//Pre-condition - height must be an integer
	//post-condition - returns height
	public int getHeight(){
		return this.height;
	}

	//Pre-condition - velocity must be an integer
	//post-condition - returns velocity
	public int getVelocity(){
		return this.velocity;
	}

	//setters

	//Pre-condition - x must be a positive
	//post-condition - sets xPos to x
	public void setX(int x){
		this.xPos=x;
	}

	//Pre-condition - 
	//post-condition - sets velocity to v
	public void setVelocity(int v){
		this.velocity=v;
	}

	//Pre-condition - n must be an int
	//post-condition - sets velocity to n/2 or to 2 if velocity >=2, or -2 if velocity <=2
	public void addVelocity(int n){
		this.velocity+=n/2;
		if (this.velocity>=2){
			this.velocity=2;
		}
		if (this.velocity<=-2){
			this.velocity=-2;
		}
	}

	//Pre-condition -
	//post-condition - increments xPos by velocity
	public void move (){
		this.xPos+=this.velocity;
	}

	//Pre-condition - g must be a graphic
	//post-condition - makes g red and draws a rect with the dimentions of xPos, yPos, width, and height.
	public void draw(Graphics g){
		g.setColor(Color.red);
        g.fillRect(xPos, yPos, width, height);
	}
}
