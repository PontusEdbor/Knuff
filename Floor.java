public class Floor extends Tile{
    public Floor(){
	super.setWalkable(true);//redundant
    }
    public char render(){
	return '.'; //Hardcoded
    }
}
