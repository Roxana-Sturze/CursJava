package curs3;

public class HomeworkEx2 {

	public static void main(String[] args) {

		AgeEvaluator obj = new AgeEvaluator();
		obj.enterAge();
		System.out.println(obj.checkAge(obj.age));
	}

}
