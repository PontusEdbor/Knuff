public class Map{
    private Tile[][] tiles; //a Tile matrix
    
    public Map(){
	this.tiles = new Tile[9][16]; //Starting out small with hardcoded values [y][x]
	this.generateWalls();
	this.connectTiles();
    }
    private void generateWalls(){
	int yLen = tiles.length;
	for(int y = 0; y < yLen; y++){
	    int xLen = tiles[y].length;
	    for(int x = 0; x < xLen; x++){
		if (x == 0 || y == 0 || y == yLen-1 || x == xLen-1){
		    this.tiles[y][x] = new Wall();
		}
		else{
		    this.tiles[y][x] = new Floor();
		}
	    }
	}
    }
    private void connectTiles(){
	int yLen = tiles.length;
	for(int y = 0; y < yLen; y++){
	    int xLen = tiles[y].length;
	    for(int x = 0; x < xLen; x++){
		Tile a = null;
		Tile l = null;
		Tile r = null;
		Tile b = null;
		if (x != 0){l = this.tiles[y][x-1];}
		if (y != 0){a = this.tiles[y-1][x];}
		if (x != xLen-1){r = this.tiles[y][x+1];}
		if (y != yLen-1){b = this.tiles[y+1][x];}
		this.tiles[y][x].setConnections(a,l,r,b);
	    }
	}
    }
    public char getTileRender(int x, int y){
	Tile t = this.tiles[y][x];
	return t.render();
    }
    public Tile getTile(int x, int y){
	return this.tiles[y][x];
    }
}
