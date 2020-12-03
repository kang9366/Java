import java.util.*;
import java.io.*;
public class HUFSStudentManager {
	static HUFSStudents std[] = new HUFSStudents[20];
	static Scanner input = new Scanner(System.in);
	static int cnt = 0;
	static int index;
	static int w;
	static String search;
	static int cID = 0;
	
	
	
	public static void AddStudent()
	{
		int tempID = 0;
		std[cnt]= new HUFSStudents();
        while(true)
        {
           int v=0;
           System.out.print("Input Student ID: ");
           tempID = input.nextInt();
           
           if(tempID < 0)
           {
              System.out.println("negative number is nope!");
           }
           else
           {
              for(int i=0; i<cnt; i++)
              {
                 if(tempID == std[i].ID)
                 {
                    
                    v++;
                    break;
                 }
              }
              if(v==1)
              {
                 System.out.println("no unique student ID!");

              }
              else
              {
                 std[cnt].ID = tempID;
                 break;
              }
           }
        }

        
        System.out.print("Input student Name: ");
        std[cnt].Name = input.next();
        System.out.print("Input student Address: ");
        std[cnt].Address = input.next();
        System.out.print("Input student Department: ");
        std[cnt].Department = input.next();
        System.out.print("Input Course ID: ");
        CourseManager.couID = input.nextInt(); 
        int find = 0;
        for(int i = 0; i<CourseManager.cnt; i++)
        {
     	   if(CourseManager.cou[i].ID == CourseManager.couID)
     	   {
     		   find = 1;
     		   std[cnt].cID = CourseManager.couID;
     		  
     	   }
     	   
        }
        if(find == 0)
 	   {
 		   std[cnt].cID = CourseManager.couID;
 		   CourseManager.AddCourse();
 		   
 	   }
        
        
        cnt++;
        System.out.println("Done.");
	}
	
	public static void UpdateStudent()
	{
		if(cnt<1)
	      {
	         System.out.println("You don't have any data!");
	         
	      }
	      else
	      {
	    	  DisplayStudent();
         while(true) 
         {
         System.out.print("Enter the number: ");
         index = input.nextInt();
         	if(index-1 >= cnt || index-1 <0)
         	{
         		System.out.println("no!");
         	}
         	else
         	break;
         }
         
         System.out.println("What do you want to update? ");
         System.out.println("1. student ID");
         System.out.println("2. student Name");
         System.out.println("3. student Address");
         System.out.println("4. student Department");
         System.out.print(">");
         w = input.nextInt();
         switch(w)
         {
         case 1:
         	 std[cnt]= new HUFSStudents();
         	while(true)
             {
                int v=0;
                System.out.print("Input Student ID: ");
                int number = input.nextInt();
                
                if(number < 0)
                {
                   System.out.println("negative number is nope!");
                }
                else
                {
                   for(int i=0; i<=cnt; i++)
                   {
                      if(number == std[i].ID)
                      {
                         
                         v++;
                         break;
                      }
                   }
                   if(v==1)
                   {
                      System.out.println("no unique student ID!");

                   }
                   else
                   {
                      std[index-1].ID = number;
                      break;
                   }
                }
             }
            break;
         case 2:
            System.out.println("Input student Name: ");
            std[index-1].Name = input.next();
            break;
         case 3:
            System.out.println("Input stdent Address: ");
            std[index-1].Address = input.next();
            break;
         case 4:
            System.out.println("Input stdent Department: ");
            std[index-1].Department = input.next();
            break;
         }
	     }
	}
	
	public static void SearchStudent()
	{
		System.out.println("1. Search by student ID");
        System.out.println("2. Search by student Name");
        System.out.println("3. Search by student Address");
        System.out.println("4. Search by student Department");
        System.out.print(">");
        w = input.nextInt();
        switch(w)
        {
        case 1:
           System.out.println("input student ID");
           int temp = input.nextInt();
           for(int i = 0; i<cnt; i++)
           {
              if(std[i].ID == temp)
              {
            	  System.out.printf("number: %d\n", i+1);
	               System.out.println("Student ID: " + std[i].ID);
	               System.out.println("Student Name: " + std[i].Name);
	               System.out.println("Student Address: " + std[i].Address);
	               System.out.println("Student Department: " + std[i].Department);
	               System.out.println("Course ID: " + std[i].cID);
	               System.out.println();
              }
           }
           break;
        case 2:
           System.out.println("input student Name");
           search = input.next();
           for(int i = 0; i<cnt; i++)
           {
              if(std[i].Name.equals(search))
              {
            	  System.out.printf("number: %d\n", i+1);
	               System.out.println("Student ID: " + std[i].ID);
	               System.out.println("Student Name: " + std[i].Name);
	               System.out.println("Student Address: " + std[i].Address);
	               System.out.println("Student Department: " + std[i].Department);
	               System.out.println("Course ID: " + std[i].cID);
	               System.out.println();
              }
           }
           break;
        case 3:
           System.out.println("input student Address");
           search = input.next();
           for(int i = 0; i<cnt; i++)
           {
              if(std[i].Address.equals(search))
              {
            	  System.out.printf("number: %d\n", i+1);
	               System.out.println("Student ID: " + std[i].ID);
	               System.out.println("Student Name: " + std[i].Name);
	               System.out.println("Student Address: " + std[i].Address);
	               System.out.println("Student Department: " + std[i].Department);
	               System.out.println("Course ID: " + std[i].cID);
	               System.out.println();
              }
           }
           break;
        case 4:
           System.out.println("input student Department");
           search = input.next();
           for(int i = 0; i<cnt; i++)
           {
              if(search.equals(std[i].Department))
              {
            	  System.out.printf("number: %d\n", i+1);
	               System.out.println("Student ID: " + std[i].ID);
	               System.out.println("Student Name: " + std[i].Name);
	               System.out.println("Student Address: " + std[i].Address);
	               System.out.println("Student Department: " + std[i].Department);
	               System.out.println("Course ID: " + std[i].cID);
	               System.out.println();
              }
           }
        break;
        }
	}
	
	public static void DeleteStudent()
	{
		DisplayStudent();
		while(true) 
        {
        System.out.print("Enter you want to delete number: ");
        index = input.nextInt();
        	if(index-1 >= cnt || index-1 < 0)
        	{
        		System.out.println("no!");
        	}
        	else
        	
        
        if(index == cnt)
        {
        	cnt--;
        	break;
        }
        else
        {
        	for(int i = index; i<cnt; i++)
        	{
        		std[i-1] = std[i];
        	}
        cnt--;
        break;
        }
	}
	}
	
	public static void DisplayStudent()
	{
		if(cnt<1)
	      {
	         System.out.println("You don't have any data!");
	         
	      }
	      else
	      {
	         for(int i = 0; i<cnt; i++)
	         {
	               System.out.printf("number: %d\n", i+1);
	               System.out.println("Student ID: " + std[i].ID);
	               System.out.println("Student Name: " + std[i].Name);
	               System.out.println("Student Address: " + std[i].Address);
	               System.out.println("Student Department: " + std[i].Department);
	               System.out.println("Course ID: " + std[i].cID);
	               System.out.println();
	         }
	         }
	}
	
	public static void DisplayStudentBYCourse()
	   {
		   if(cnt<1)
		      {
		         System.out.println("You don't have any data!");
		         
		      }
		      else
		      {
		         for(int i = 0; i<cnt; i++)
		         {
		              System.out.println("Student ID: " + std[i].ID +
		            		  			 " Student Name: " + std[i].Name +
		            		  			 " takes Course ID :" + std[i].cID);
		              System.out.println();
		         }
		         }
	   }
	
	
	
	
	    public static void WriteStudentDataToFile() throws IOException 
	    {
	        PrintWriter pw = new PrintWriter("data1.txt");
	        for(int i=0; i<cnt; i++) {
	        	String str = "number: "+(i+1)+"\n" + "Student ID: " + std[i].ID +
        		   		"Student Name: " + std[i].Name + "Student Address: " + std[i].Address +
        		   		"Student Department: " + std[i].Department + "Course ID: " + std[i].cID+"\n";
	            pw.println(str);
	        }
	        pw.close();
	    }
	
	
	

}
