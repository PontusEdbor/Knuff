public class Map{
    private int[][] tiles; //Starting out with
    
    public Map(){
	this.tiles = new int[9][16]; //Starting out small with hardcoded values [y][x]
    }
    public void render(){
	for(int[] row : this.tiles){
	    for(int tile : row){
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
