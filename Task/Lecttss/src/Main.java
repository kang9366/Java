import java.util.Scanner;
import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		
		while(true)
		{
			System.out.println("--------------menu--------------");
	         System.out.println("1. Add student information\n" + 
	                        "2. Update student information\n" +  
	                        "3. Search student information\n" + 
	                        "4. Delete student informaton\n" +
	                        "5. Display a list of all student\n"+
	                        "6. Update Course information\n"+
	                        "7. Search Course information\n"+
	                        "8. Delete Course information\n"+
	                        "9. Display a list of all Course\n" +
	                        "10. Display List which student(s) are taking which Course\n"+
	                        "11. File Save");
	         int a = input.nextInt();
	         switch(a)
	         {
	         case 1:
	        	 HUFSStudentManager.AddStudent();
	        	 break;
	         case 2:
	        	 HUFSStudentManager.UpdateStudent();
	        	 break;
	         case 3:
	        	 HUFSStudentManager.SearchStudent();
	        	 break;
	         case 4:
	        	 HUFSStudentManager.DeleteStudent();
	        	 break;
	         case 5:
	        	 HUFSStudentManager.DisplayStudent();
	        	 break;
	         case 6:
	        	 CourseManager.UpdateCourse();
	        	 break;
	         case 7:
	        	 CourseManager.SearchCourse();
	        	 break;
	         case 8:
	        	 CourseManager.DeleteCourse();
	        	 break;
	         case 9:
	        	 CourseManager.DisplayCourse();
	        	 break;
	         case 10:
	        	 HUFSStudentManager.DisplayStudentBYCourse();
	        	 break;
	         case 11:
	        	 CourseManager.WriteStudentDataToFile();
	        	 HUFSStudentManager.WriteStudentDataToFile();
	         }
		}

	}

}
