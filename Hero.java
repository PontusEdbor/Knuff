public class Hero{
    private int xPos;
    private int yPos;
    private Tile onTile;
	
    public Hero(Tile onTile){
	this.xPos = 1;
	this.yPos = 1;
	this.onTile = onTile;
    }
    public int getX(){
	return this.xPos;
    }
    public int getY(){
	return this.yPos;
    }
    public void moveRight(){
	if (onTile.openRight()){
	    this.xPos++;
	    this.onTile = this.onTile.getRight();
	}
    }
    public void moveLeft(){
	if (onTile.openLeft()){
	    this.xPos--;
	    this.onTile = this.onTile.getLeft();
	}
    }
    public void moveUp(){
	if (onTile.openAbove()){
	    this.yPos--;
	    this.onTile = this.onTile.getAbove();
	}
    }
    public void moveDown(){
	if (onTile.openBelow()){
	    this.yPos++;
	    this.onTile = this.onTile.getBelow();
	}
    }
}
