package day42_Encapsulation;

public class Human {
	private String gender;
	private int age;
	static String todaysDate;
	
	 static String motivation;
	
	
	
	
	public void setGender(String gender) {
		if(gender.equalsIgnoreCase("female") || gender.equalsIgnoreCase("male")) {
			this.gender = gender;
			
		}else {
			System.out.println("invalid input");
			
		}
	}
	public String getGender() {
		return gender;
	}
	
	public void setAge (int age) {
		if(age>=0 && age<=150) {
			
			this.age = age;
		}else {
			this.age = -0;
			
		}
	}
	
	public int getAge() {
		return age;
	}


}
