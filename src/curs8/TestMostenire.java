package curs8;

public class TestMostenire {

	public static void main(String[] args) {
		
		
		//Angajat --> Tester --> TesterAutomat 
		
		
		TesterAutomat testerAutomat = new TesterAutomat();
		
		
		
		testerAutomat.setProgrammingLanguage("Java");// clasa TesterAutomat()
		testerAutomat.setDepartment(" QA");// clasa Tester()
		testerAutomat.setSeniority("Junior"); // clasa Tester()
		testerAutomat.setEmail("bob@bob.com"); // clasa Angajat()
		testerAutomat.setNume("Bob"); // clasa Angajat()

		
		
	}

}
