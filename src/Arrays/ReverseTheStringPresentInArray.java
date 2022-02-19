package Arrays;

public class ReverseTheStringPresentInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "Java123Keerthi53Harish";
		String[] parts = input.split("(?<=\\D)(?=\\d)|(?<=\\d)(?=\\D)");
		StringBuilder sb = new StringBuilder();
		for (String part : parts) {
		    if (part.matches("\\D+")) {
		        StringBuilder num = new StringBuilder(part);
		        sb.append(num.reverse());
		    }
		    else {
		        sb.append(part);
		    }
		}
		System.out.println(sb.toString());
	}
}
