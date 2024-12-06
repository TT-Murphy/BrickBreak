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
	public int getX(){
		return this.xPos;
	}
	
	public int getY(){
		return this.yPos;
	}

	public int getWidth(){
		return this.width;
	}

	public int getHeight(){
		return this.height;
	}

	public int getVelocity(){
		return this.velocity;
	}

	//setters
	public void setX(int x){
		this.xPos=x;
	}

	public void setVelocity(int v){
		this.velocity=v;
	}

	public void addVelocity(int n){
		this.velocity+=n/2;
		if (this.velocity>=2){
			this.velocity=2;
		}
		if (this.velocity<=-2){
			this.velocity=-2;
		}
	}

	public void move (){
		this.xPos+=this.velocity;
	}

	public void draw(Graphics g){
		g.setColor(Color.red);
        g.fillRect(xPos, yPos, width, height);
	}
}
