public class Wall extends Tile{
    public Wall(){
	super.setWalkable(false);
    }
    public char render(){
	return 'X'; //Hardcoded
    }
}
