import java.io.*;

/*
 * This Program runs on Java 7. The first argument to the programs needs to be the absolute path of the file
 */

public class mThLastElement {
	public static void main(String[] args) throws IOException {
		if (args.length < 1) {
			throw new IllegalArgumentException("Error: Input file not specified!");
		}
		File inputFile = new File(args[0]);
		try (BufferedReader br = new BufferedReader(new FileReader(inputFile))) {
			while (br.ready()) {
				String s = br.readLine();
				String[] split = s.split("\\s+");
				try {
					int index = Integer.parseInt(split[split.length - 1]);
					if (index > 0) {
						int mThLastElementLocation = split.length - index - 1;
						if ((mThLastElementLocation >= 0) && (mThLastElementLocation < split.length)) {
							System.out.println(split[mThLastElementLocation]);
						}
					}
				}
				catch (NumberFormatException e){
					throw new NumberFormatException("Symbol or Special character is not a valid Index");
				}
			}
		}
	}
}
