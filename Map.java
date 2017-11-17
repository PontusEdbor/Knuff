public class Map{
    private char[][] tiles; //Starting out with representing them with chars
    
    public Map(){
	this.tiles = new char[9][16]; //Starting out small with hardcoded values [y][x]
	this.generateWalls();
    }
    private void generateWalls(){
	int x = 0;
	int y = 0;
	for(char[] row : this.tiles){
	    for(char tile : row){
		if (x == 0 || x == row.length-1 || y == 0 || y == this.tiles.length-1){
		    tiles[y][x] = 'X';
		}
		else {
		    tiles[y][x] = '.';
		}
		x++;
	    }
	    x = 0;
	    y++;
	}
    }
    public char getTile(int x, int y){
	return this.tiles[y][x];
    }
    public void render(){
	for(char[] row : this.tiles){
	    for(char tile : row){
		System.out.print(tile);
	    }
	    System.out.println();
	}
    }
    public static void main(String[] args){
	Map m = new Map();
	m.render();
    }
}
