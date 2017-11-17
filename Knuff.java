public class Knuff{
    public static void main(String[] args){
        Map m = new Map();
	Renderer r = new Renderer();
	r.render(m); //add the map to the renderer
	r.print();
    }
}
