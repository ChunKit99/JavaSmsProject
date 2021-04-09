import java.util.Scanner;

public class StaffInfo {
	private String firstName;
	private String surName;
	private String userCode;

	StaffInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.print("First name:");
		firstName = sc.nextLine();
		System.out.print("Surname:");
		surName = sc.nextLine();
		userCode = generateCode();

	}

	public String generateCode() {
		String code;
		boolean isSpace = false;
		if (firstName.contains(" ")) {
			isSpace = true;
		}
		if (isSpace) {
			code = firstName.charAt(0) + surName;
		} else {
			code = "guest";
		}
		return code;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	public String getUserCode() {
		return userCode;
	}

	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}

	@Override
	public String toString() {
		return "\nUser Info: \nName :" + firstName + " " + surName + "\nuserCode :" + userCode;
	}

}
