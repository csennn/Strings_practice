import java.io.*;

class Result {

	public static int marsExploration(String s) {

		int counter = 0;

		int size = (s.length() / 3);

		String sos = "SOS";

		String expected = sos.repeat(size);

		for (int i = 0; i < s.length(); i++) {
			char charOfS = s.charAt(i);
			char charOfE = expected.charAt(i);
			if (charOfS == charOfE) {

			} else {
				counter++;
			}
		}

		return counter;

	}

}

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		String s = bufferedReader.readLine();

		int result = Result.marsExploration(s);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedReader.close();
		bufferedWriter.close();
	}
}
