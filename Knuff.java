import java.util.Scanner;
    
public class Knuff{
    public static void main(String[] args){
	Scanner s = new Scanner(System.in);
	Renderer r = new Renderer();
        Map m = new Map();
	Hero h = new Hero(m.getTile(1,1));
	while (true){
	    r.render(m); //add the map to the renderer
	    r.render(h); //add hero to the renderer
	    r.print();
	    char choice = s.nextLine().charAt(0);
	    System.out.println(choice);
	    switch (choice){
	    case 'w':
		h.moveUp();
		break;
	    case 'a':
		h.moveLeft();
		break;
	    case 's':
		h.moveDown();
		break;
	    case 'd':
		h.moveRight();
		break;
	    case 'x':
		return;
	    default:
		//eh
	    }
	}
    }
}
