
	public class GeneralEducation extends Course{    
		private String requirement;    
		//----------------------------------------------------------------    
		//  Sets up a general education course with the specified    
		//  information.    
		//----------------------------------------------------------------    
		public GeneralEducation(String title, String number, String description, String department, 
				String requirement)    {   
			super(title, number, description, department);
			// to do: hint, this is sublcass of course class.
			this.requirement = requirement;
			
			}    
		
		//----------------------------------------------------------------    
		//  Returns information about this course as a string.    
		//----------------------------------------------------------------    
		public String toString() {        
			String result = super.toString();
			result += "\n General Education Requirement Filled: " + requirement + "]"; 
			return result;    
			}
		}


