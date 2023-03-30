import java.util.*;
public class Schedule {
	   
		private ArrayList<Course> courseList = new ArrayList<Course>(5);
		
		//-----------------------------------------------------------------    
		//  Sets up the list of courses. Assume each student takes five courses: two major courses, two general education  courses, and one Elective course   
		// you need to ask student to enter his/her course information, based on above option.    
		//-----------------------------------------------------------------  
		public Schedule()   
		{       
			   
			 /*MajorCourse course1=new MajorCourse("Math", "1000", "description", "department", "major", "requistie");
			 MajorCourse course2=new MajorCourse("Science", "2000" , "description", "department", "major", "requistie");
			 GeneralEducation course3=new GeneralEducation("English", "3000", "description", "department", "requirement");
			 GeneralEducation course4=new GeneralEducation("Geography", "4000", "description", "department", "requirement");
			 Elective course5=new Elective("Spanish", "5000", "description", "department");
			 */
		
			// to do: assign course that student enter in course categories. Hint, you need to call the constructor of relevant course    
			 
		
		
		}
		
		public void assign()
		{
			Scanner scan=new Scanner(System.in);
			System.out.println("Please enter you classes one at a time and its requirements if displayed. ");
			System.out.println("First your two major courses" + "\n");
			
			
			
			while(courseList.size()<2)
			{
				System.out.print("title");
				String title=scan.nextLine();
				
				System.out.print("description");
				String description=scan.nextLine();
				
				System.out.print("department");
				String department=scan.nextLine();
				
				System.out.print("requirement");
				String requirement=scan.nextLine();
				
				System.out.print("number");
				String number=scan.nextLine();
				
				System.out.print("major");
				String major=scan.nextLine();
				
				System.out.print("requisite");
				String requistie=scan.nextLine();
				
				courseList.add(new MajorCourse(title, number, description, department, major, requistie));
				

			}
			System.out.println("Now enter your General Education classes"+"\n");
			while(courseList.size()<4)
			{
				System.out.print("title");
				String title=scan.nextLine();
				
				System.out.print("description");
				String description=scan.nextLine();
				
				System.out.print("department");
				String department=scan.nextLine();
				
				System.out.print("requirement");
				String requirement=scan.nextLine();
				
				System.out.print("number");
				String number=scan.nextLine();
				
				courseList.add(new GeneralEducation(title, number, description, department, requirement));
			}
			
			System.out.println("Now enter you elective class."+"\n");
			
			while(courseList.size()<5)
			{
				System.out.print("title");
				String title=scan.nextLine();
				
				System.out.print("description");
				String description=scan.nextLine();
				
				System.out.print("department");
				String department=scan.nextLine();
				
				System.out.print("number");
				String number=scan.nextLine();
				
				courseList.add(new Elective(title, number, description, department));
			}
		
			System.out.println("Success, all courses were added to the schedule.");
		}
			
			
		
		
		//-----------------------------------------------------------------   
		//  Prints out a detailed schedule of all classes.  
		//-----------------------------------------------------------------   
		public void display()   
		{  
			for(Course x: courseList)
			{
				System.out.println(x);
			
		}
			// to do   
		}
}
		
		
	
