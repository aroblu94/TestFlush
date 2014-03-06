import java.util.*;

public class TestANSI {
	public static void main(String[] args) {
		char esc = 27;
		String clear = esc + "[2J";

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
				//System.out.print("\u001b[2J");
				//System.out.flush();
				System.out.print(clear);
			}
	}
}