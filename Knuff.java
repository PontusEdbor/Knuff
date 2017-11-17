import java.util.Scanner;
    
public class Knuff{
    public static void main(String[] args){
	Scanner s = new Scanner(System.in);
	Renderer r = new Renderer();
        Map m = new Map();
	Hero h = new Hero();
	while (true){
	    r.render(m); //add the map to the renderer
	    r.render(h); //add hero to the renderer
	    r.print();
	    s.nextLine();
	}
    }
}
