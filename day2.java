
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.lang.*;
import java.util.*;

public class day2 {

	public static void main(String[] args) throws IOException {

		String input = new String(Files.readAllBytes(Paths.get("input2.txt")));

		int wrapper_sqft = 0;
		int ribbon_ft = 0;

		Scanner scanner = new Scanner(input);

		while(scanner.hasNextLine()) {

			String[] line = scanner.nextLine().split("x");

			int l = Integer.parseInt(line[0]);
			int w = Integer.parseInt(line[1]);
			int h = Integer.parseInt(line[2]);

			int lw = l * w;
			int hw = h * w;
			int lh = l * h;

			int shortest_side = Math.min(Math.min(lw, hw), lh);
			wrapper_sqft += (2*lw + 2*hw + 2*lh) + shortest_side;

			int shortest_perim = (l + w + h - Math.max(Math.max(l, w), h)) * 2;
			ribbon_ft += l * w * h + shortest_perim;
		}

		System.out.println("total square feet of wrapper: " + wrapper_sqft + "sqft");
		System.out.println("total feet of ribbon: " + ribbon_ft + "ft");
	}
}
