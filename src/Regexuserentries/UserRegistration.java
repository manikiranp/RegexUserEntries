package Regexuserentries;

import java.util.Scanner;

public class UserRegistration {
	private static Scanner inp;

	public static void main(String[] args) {
		System.out.println("Validation of user entries in Ugiser Registration");
		int cond = 1;
		while (cond == 1) {
			Validation menu = new Validation(); 
			System.out.println("User Registration:\n"
					+ "1) Firstname\n"
					+ "2) Lastname\n"
					+ "3) Email\n"
					+ "4) Phonenumber\n"
					+ "5) Password\n"
					+ "0) Close");
			inp = new Scanner(System.in);
			System.out.println("Select an option:");
			String num=inp.next(); 
			switch (num) {
			case "1":
				try {
					menu.validateName("ni");
				} catch (ValidationException e) {
					System.out.println("Invakda a");
					
				}
				continue;
//			case "2":
//				menu.validatelastName();
//				break;
//			case "3":
//				menu.validateEmail();
//				break;
			case "4":
				try {
				menu.validatephone("+91090909090");
				}catch (ValidationException e) {
					System.out.println("Exception occured:"+e.getMessage());
					
				}
				break;
//			case "5":
//				menu.validatepassword();
//				break;
//			case "0":
//				cond=0;
//				break;
			default:
				System.out.println("Wrong option");
				break;
			}
		}
	}
}