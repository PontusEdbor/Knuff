public abstract class Tile{
    private boolean walkable;
    private Tile aboveTile;
    private Tile leftTile;
    private Tile rightTile;
    private Tile belowTile;
    public Tile(){
	this.walkable=true;
    }
    public void setConnections(Tile a, Tile l, Tile r, Tile b){
	this.aboveTile = a;
	this.leftTile = l;
	this.rightTile = r;
	this.belowTile = b;
    }
    protected void setWalkable(boolean b){
	this.walkable = b;
    }
    private boolean getWalkable(){
	return this.walkable;
    }
    abstract char render();
    public boolean openAbove(){
	if (aboveTile == null || aboveTile.getWalkable() == false){
	    return false;
	}
	else {
	    return true;
	}
    }
    public boolean openLeft(){
	if (leftTile == null || leftTile.getWalkable() == false){
	    return false;
	}
	else {
	    return true;
	}
    }
    public boolean openRight(){
	if (rightTile == null || rightTile.getWalkable() == false){
	    return false;
	}
	else {
	    return true;
	}
    }
    public boolean openBelow(){
	if (belowTile == null || belowTile.getWalkable() == false){
	    return false;
	}
	else {
	    return true;
	}
    }
    public Tile getRight(){
	return this.rightTile;
    }
    public Tile getLeft(){
	return this.leftTile;
    }
    public Tile getAbove(){
	return this.aboveTile;
    }
    public Tile getBelow(){
	return this.belowTile;
    }
}
