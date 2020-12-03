import java.util.*;
import java.io.*;

public class CourseManager {
	static Course cou[] = new Course[20];
	static Scanner input = new Scanner(System.in);
	static int cnt = 0;
	static int index;
	static int w;
	static String search;
	static int couID = 0;
	
	
	
	public static void AddCourse()
	{
		cou[cnt]= new Course();
        while(true)
        {
          
           cou[cnt].ID = HUFSStudentManager.std[HUFSStudentManager.cnt].cID;
           if(couID < 0)
           {
              System.out.println("negative number is nope!");
              System.out.print("Input Course ID: ");
              couID = input.nextInt();
              HUFSStudentManager.std[cnt].cID = couID;
           }
           else
        	   break;
        }

        
        System.out.print("Input Course Name: ");
        cou[cnt].Name = input.next();
        System.out.print("Input Course Faculty: ");
        cou[cnt].Faculty = input.next();
        System.out.print("Input Course Level: ");
        cou[cnt].Level = input.next();
        System.out.print("Input Course Professor: ");
        cou[cnt].Professor = input.next();
        cnt++;
        System.out.println("Done.");
	}
	
	public static void AddCourseforCourseDelete()
	{
		cou[cnt]= new Course();
		cou[index-1].ID = couID;
        while(true)
        {
           if(couID < 0)
           {
              System.out.println("negative number is nope!");
              System.out.print("Input Course ID: ");
              couID = input.nextInt();
              HUFSStudentManager.std[cnt].cID = couID;
              cou[index-1].ID = couID;
           }
           else
        	   break;
        }

        
        System.out.print("Input Course Name: ");
        cou[cnt].Name = input.next();
        System.out.print("Input Course Faculty: ");
        cou[cnt].Faculty = input.next();
        System.out.print("Input Course Level: ");
        cou[cnt].Level = input.next();
        System.out.print("Input Course Professor: ");
        cou[cnt].Professor = input.next();
        cnt++;
        System.out.println("Done.");
	}
	
	public static void UpdateCourse()
	{
		
	      if(cnt<1)
	      {
	         System.out.println("You don't have any data!");
	         
	      }
	      else
	      {
		 DisplayCourse();
		 
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
         System.out.println("1. Course ID");
         System.out.println("2. Course Name");
         System.out.println("3. Course Faculty");
         System.out.println("4. Course Level");
         System.out.println("5. Course Professor");
         System.out.print(">");
         w = input.nextInt();
         switch(w)
         {
         case 1:
        	 cou[cnt]= new Course();
         	while(true)
             {
                int v=0;
                System.out.print("Input Course ID: ");
                int number = input.nextInt();
                
                if(number < 0)
                {
                   System.out.println("negative number is nope!");
                }
                else
                {
                   for(int i=0; i<cnt; i++)
                   {
                      if(number == cou[i].ID)
                      {
                         
                         v++;
                         break;
                      }
                   }
                   if(v==1)
                   {
                      System.out.println("no unique Course ID!");

                   }
                   else
                   {
                	   cou[index-1].ID = number;
                      break;
                   }
                }
             }
            break;
         case 2:
            System.out.println("Input Course Name: ");
            cou[index-1].Name = input.next();
            break;
         case 3:
            System.out.println("Input Course Faculty: ");
            cou[index-1].Faculty = input.next();
            break;
         case 4:
            System.out.println("Input Course Level: ");
            cou[index-1].Level = input.next();
            break;
         case 5:
        	 System.out.println("Input Course Professor: ");
             cou[index-1].Professor = input.next();
         }
	     }
	}
	
	public static void SearchCourse()
	{
		System.out.println("1. Search by Course ID");
        System.out.println("2. Search by Course Name");
        System.out.println("3. Search by Course Faculty");
        System.out.println("4. Search by Course Level");
        System.out.println("5. Search by Course Professor");
        System.out.print(">");
        w = input.nextInt();
        switch(w)
        {
        case 1:
           System.out.println("input Course ID");
           int temp = input.nextInt();
           for(int i = 0; i<cnt; i++)
           {
              if(cou[i].ID == temp)
              {
            	  System.out.printf("number: %d\n", i+1);
	               System.out.println("Course ID: " + cou[i].ID);
	               System.out.println("Course Name: " + cou[i].Name);
	               System.out.println("Course faculty: " + cou[i].Faculty);
	               System.out.println("Course Level: " + cou[i].Level);
	               System.out.println("Course Professor: " + cou[i].Professor);
	               System.out.println();
              }
           }
           break;
        case 2:
           System.out.println("input Course Name");
           search = input.next();
           for(int i = 0; i<cnt; i++)
           {
              if(cou[i].Name.equals(search))
              {
            	  System.out.printf("number: %d\n", i+1);
	               System.out.println("Course ID: " + cou[i].ID);
	               System.out.println("Course Name: " + cou[i].Name);
	               System.out.println("Course faculty: " + cou[i].Faculty);
	               System.out.println("Course Level: " + cou[i].Level);
	               System.out.println("Course Professor: " + cou[i].Professor);
	               System.out.println();
              }
           }
           break;
        case 3:
           System.out.println("input Course Faculty");
           search = input.next();
           for(int i = 0; i<cnt; i++)
           {
              if(cou[i].Faculty.equals(search))
              {
            	  System.out.printf("number: %d\n", i+1);
	               System.out.println("Course ID: " + cou[i].ID);
	               System.out.println("Course Name: " + cou[i].Name);
	               System.out.println("Course faculty: " + cou[i].Faculty);
	               System.out.println("Course Level: " + cou[i].Level);
	               System.out.println("Course Professor: " + cou[i].Professor);
	               System.out.println();
              }
           }
           break;
        case 4:
           System.out.println("input Course Level");
           search = input.next();
           for(int i = 0; i<cnt; i++)
           {
              if(search.equals(cou[i].Level))
              {
            	   System.out.printf("number: %d\n", i+1);
	               System.out.println("Course ID: " + cou[i].ID);
	               System.out.println("Course Name: " + cou[i].Name);
	               System.out.println("Course faculty: " + cou[i].Faculty);
	               System.out.println("Course Level: " + cou[i].Level);
	               System.out.println("Course Professor: " + cou[i].Professor);
	               System.out.println();
              }
           }
        break;
        case 5:
        	System.out.println("input Course Professor");
            search = input.next();
            for(int i = 0; i<cnt; i++)
            {
               if(search.equals(cou[i].Professor))
               {
            	   System.out.printf("number: %d\n", i+1);
	               System.out.println("Course ID: " + cou[i].ID);
	               System.out.println("Course Name: " + cou[i].Name);
	               System.out.println("Course faculty: " + cou[i].Faculty);
	               System.out.println("Course Level: " + cou[i].Level);
	               System.out.println("Course Professor: " + cou[i].Professor);
	               System.out.println();
               }
            }
         break;
        }
	}
	
	public static void DeleteCourse()
	{
		DisplayCourse();
		while(true) 
        {
        System.out.print("Enter you want to delete number: ");
        index = input.nextInt();
        	if(index-1 >= cnt || index-1 < 0)
        	{
        		System.out.println("no!");        		
        	}
        	else
        	{
        		for(int k = 0; k < HUFSStudentManager.cnt; k++)
                {
                   if(HUFSStudentManager.std[k].cID == cou[index-1].ID)
                   {
                      System.out.println("number "+ (k+1) +" student's course deleted so register new course");
                      System.out.print("Input Course ID: ");
                        couID = input.nextInt(); 
                        int find = 0;
                        for(int i = 0; i<cnt; i++)
                        {
                           if(cou[i].ID == couID)
                           {
                              find = 1;
                           HUFSStudentManager.std[k].cID = couID;
                              
                           }
                           
                        }
                        if(find == 0)
                       {
                           HUFSStudentManager.std[k].cID = couID;                         
                           AddCourseforCourseDelete();      
                       }
                        
                   }
                   
                }
        
        if(index == cnt)
        {
        	cnt--;
        	break;
        }
        else
        {
        	for(int i = index; i<cnt; i++)
        	{
        		cou[i-1] = cou[i];
        	}
        cnt--;
        break;
        }
	}
	}
	}
	
	
	
	public static void DisplayCourse()
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
	               System.out.println("Course ID: " + cou[i].ID);
	               System.out.println("Course Name: " + cou[i].Name);
	               System.out.println("Course faculty: " + cou[i].Faculty);
	               System.out.println("Course Level: " + cou[i].Level);
	               System.out.println("Course Professor: " + cou[i].Professor);
	               System.out.println();
	         }	
	         }
	   }
	
	
	
	public static void WriteStudentDataToFile() throws IOException 
	{
        PrintWriter pw = new PrintWriter("data2.txt");
        for(int i=0; i<cnt; i++) {
        	String str = "number: "+(i+1)+"\n" + " Course ID: " + cou[i].ID +
    		   		" Course Name: " + cou[i].Name + " Course Faculty: " + cou[i].Faculty +
    		   		" Course Level: " + cou[i].Level + " Course Professor: " + cou[i].Professor+"\n";
            pw.println(str);
        }
        pw.close();
    }
	
}
