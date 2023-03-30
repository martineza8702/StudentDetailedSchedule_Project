
public class Course {
	
		
		// assume course has following basic informations    
		private String title;    
		private String number;    
		private String description;    
		private String department;
		
		
		//----------------------------------------------------------------    
		//  Sets up a course with the specified information (write constructor)    
		//----------------------------------------------------------------
		
		public Course(String title, String number, String description, String department)   {
			
			this.title = title;
			this.number = number;
			this.description = description;
			this.department = department;
		
			
		}
		public Course()
		{
			
		}


		
		
		//-----------------------------------------------------------------    
		//  Returns a string including the basic course information.    
		//-----------------------------------------------------------------

		@Override
		public String toString() {
			return " Course [Title=" + title + ", Number = " + number + ", Description = " + description + ", Department = "
					+ department ;
		}




		public String getTitle() {
			return title;
		}




		public String getNumber() {
			return number;
		}




		public String getDescription() {
			return description;
		}




		public String getDepartment() {
			return department;
		}
		
		
		
	}



