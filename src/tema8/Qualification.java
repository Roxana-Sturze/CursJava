package tema8;

public class Qualification extends Teacher{

	public Qualification(String course, int experienceYears, String schedule  ) {
		this.setCourse(course);	
		this.setExperienceYears(experienceYears);
		this.setSchedule(schedule);
	}
	
	public void verify() {
		
		if(this.getCourse().equals("Java") && this.getExperienceYears() > 3 && this.getSchedule().equals("Afternoon") ) {
			
			System.out.println("You qualify to teach at this school!");
			
		}else {
			
			System.out.println("You do not qualify!");
		}
	}
	

}
