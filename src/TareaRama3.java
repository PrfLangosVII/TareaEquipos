import java.util.Scanner;

public class TareaRama3 {
	
	public static String repeatChars(String str) {
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            sb.append(String.valueOf(c).repeat(2));
        }
        return sb.toString();
    }

	public static void main(String[] args) {
		System.out.print("Dime una palabra: ");
		Scanner scn = new Scanner(System.in);
		String input = scn.nextLine();
        System.out.println(repeatChars(input));

	}

}