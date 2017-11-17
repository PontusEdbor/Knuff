public class Map{
    private char[][] tiles; //Starting out with representing them with chars
    
    public Map(){
	this.tiles = new char[9][16]; //Starting out small with hardcoded values [y][x]
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
