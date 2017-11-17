public class Renderer{
    private char[][] tiles;
    public Renderer(){
	this.tiles = new char[9][16]; //Starting out small with hardcoded values [y][x]
    }
    public void print(){
	System.out.print("\033[2J\033[;H"); //Magic screen clearing line
	for(char[] row : this.tiles){
	    for(char tile : row){
		System.out.print(tile);
	    }
	    System.out.println();
	}
    }
    public void render(Map m){
	int y = 0;
	for(char[] row : this.tiles){
	    int x = 0;
	    for(char tile : row){
		this.tiles[y][x] = m.getTile(x,y);
		x++;
	    }
	    y++;
	}
    }
    public void render(Hero h){
	this.tiles[h.getY()][h.getX()] = 'H';
    }
}
