
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class day1 {

	public static void main(String[] args) throws IOException {

		String input = new String(Files.readAllBytes(Paths.get("input1.txt")));

		int floor = 0;
		int basement = 0;
		int position = 0;

		for(char c : input.toCharArray()) {
			if(c == '(') floor++;
			if(c == ')') floor--;

			if(basement == 0 && floor == -1) basement = position + 1;

			position++;
		}

		System.out.println(floor);

		System.out.println("basement was entered at " + basement);
	}
}
