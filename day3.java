
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.lang.*;
import java.util.*;

public class day3 {

	public static class Santa {

		HashSet<String> housesVisited = new HashSet<>();

		public void visitHouse(int x, int y) {

			String key = "[" + x + ", " + y + "]";

			housesVisited.add(key);
		}

		public int totalHouses() {

			return housesVisited.size();
		}
	}

	public static void main(String[] args) throws IOException {

		String input = new String(Files.readAllBytes(Paths.get("input3.txt")));
		//String input = "^>v<";

		Santa[] santas = {new Santa(), new Santa()};
		int i = 0;

		int x = 0, y = 0;

		for(Santa santa: santas) {
			santa.visitHouse(x, y);
		}

		for(char c: input.toCharArray()) {

			Santa santa = santas[i];

			switch(c) {
				case '>':
					x++;
					break;
				case '<':
					x--;
					break;
				case '^':
					y++;
					break;
				case 'v':
					y--;
					break;
			}

			santa.visitHouse(x, y);

			i = i == santas.length - 1 ? 0 : i + 1;
		}

		for(int k = 0; k < santas.length; k++) {
			System.out.println("houses visited by santa " + (k + 1) + ": " + santas[k].totalHouses());
		}

	}
}
