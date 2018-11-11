package day42_Encapsulation;

public class HumanPract {
	public static void main(String[] args) {
		
		Human a1 = new Human();
		
		System.out.println(a1.getGender());
		
		
		a1.setAge(124);
		System.out.println(a1.getAge());
		Human h2 = new Human();
		
		System.out.println(a1.todaysDate);
		a1.todaysDate = "6 November, 2018";
		System.out.println(h2.todaysDate);
		System.out.println(Human.todaysDate);
		Human.motivation = "Keep going, you can do it!";
		System.out.println(Human.motivation);
		System.out.println(h2.motivation);
		System.out.println(a1.motivation);
	}

}
