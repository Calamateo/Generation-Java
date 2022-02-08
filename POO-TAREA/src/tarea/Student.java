package tarea;

public class Student {
	String firstName;
    String lastName;
    int registration;
    int grade;
    int year;
    
    
    
    public static void main(String[] args) {
		
    	Student student1 = new Student("Daniel","Calamateo",12,75,2021);
    	
    	student1.printFullName();
    	student1.changeYearIfApproved();
	}
    
    public void printFullName(){
        //TODO implement
    	System.out.println(this.firstName+" "+this.lastName);
     }

     public Boolean isApproved(){
         //TODO implement: should return true if grade >= 60
    	 if (this.grade>=60) {
    		 return true;
    	 }else {
    		 return false;
    	 }
     }

     public int changeYearIfApproved(){
         //TODO implement: the student should advance to the next year if he/she grade is >= 60
         // Make year = year + 1, and print "Congragulations" if the student has been approved
    	 if(isApproved()==true) {
    		 this.year+=1;
    		 System.out.println("Congratulation "+year);
    	 } else {
    		 System.out.println("no pasaste");
    	 }
         return 0;
     }

	public Student(String firstName, String lastName, int registration, int grade, int year) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.registration = registration;
		this.grade = grade;
		this.year = year;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getRegistration() {
		return registration;
	}

	public void setRegistration(int registration) {
		this.registration = registration;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
     
     
     
}
