public class Knuff{
    public static void main(String[] args){
	Renderer r = new Renderer();
        Map m = new Map();
	Hero h = new Hero();
	r.render(m); //add the map to the renderer
	r.render(h); //add hero to the renderer
	r.print();
    }
}
