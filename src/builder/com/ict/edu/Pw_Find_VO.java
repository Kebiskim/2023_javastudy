package builder.com.ict.edu;

public class Pw_Find_VO {		
	private static String input_Id;
	private static String input_Pw;
	
	public String getInput_Id() {
		return input_Id;
	}
	public void setInput_Id(String input_Id) {
		this.input_Id = input_Id;
	}
	public String getInput_Pw() {
		return input_Pw;
	}
	public void setInput_Pw(String input_Pw) {
		this.input_Pw = input_Pw;
	}
	
	public static void main(String[] args) {
		System.out.println(input_Id);
		System.out.println(input_Pw);
	}
}