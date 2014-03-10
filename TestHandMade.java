import java.util.*;

public class TestHandMade {
	public static void main(String[] args) {

		while(true) {
			Scanner in = new Scanner(System.in);
			System.out.println("Choose what kind of game you want to play (3 to exit): ");
			System.out.println("(1) Singleplayer ");
			System.out.println("(2) Multiplayer ");
			int selettore = in.nextInt();
			System.out.println();
			System.out.println("Selettore = " + selettore);
			System.out.println();
			System.out.println("Flush? y/n");
			if(in.next().toUpperCase().equals("Y")) { //testing flush (like "clear" command in bash)
				for( int i = 0; i < 25; i++ ) {
    				System.out.println("");
				}
				System.out.printf("%c[%d;%df", 0x1B, 0, 0);
			} 
		}
	}
}