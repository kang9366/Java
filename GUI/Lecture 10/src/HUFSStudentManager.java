import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.swing.JOptionPane;
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
           tempID = Integer.parseInt(JOptionPane.showInputDialog("Input Student ID: "));
           
           if(tempID < 0)
           {
        	   JOptionPane.showMessageDialog(null, "negative number is nope!");
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
            	  JOptionPane.showMessageDialog(null, "no unique student ID!");
              }
              else
              {
                 std[cnt].ID = tempID;
                 break;
              }
           }
        }
        
        std[cnt].Name = JOptionPane.showInputDialog("Input student Name: ");
        std[cnt].Address = JOptionPane.showInputDialog("Input student Address: ");
        std[cnt].Department = JOptionPane.showInputDialog("Input student Department: ");
        CourseManager.couID = Integer.parseInt(JOptionPane.showInputDialog("Input Course ID: "));
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
        JOptionPane.showMessageDialog(null, "Done.");
	}
	
	public static void UpdateStudent()
	{
		if(cnt<1)
	      {
			JOptionPane.showMessageDialog(null, "You don't have any data!", "ERROR_MESSAGE", JOptionPane.ERROR_MESSAGE);
	      }
	      else
	      {
	    	  DisplayStudent();
         while(true) 
         {
        	index = Integer.parseInt(JOptionPane.showInputDialog("Enter the number"));
         	if(index-1 >= cnt || index-1 <0)
         	{
         		System.out.println("no!");
         	}
         	else
         	break;
         }
         String str1 = "What do you want to update? ";
         String str2 = "1. student ID";
         String str3 = "2. student Name";
         String str4 = "3. student Address";
         String str5 = "4. student Department";
         String str = str1 + "\n" + str2 + "\n" + str3 + "\n" + str4 + "\n" + str5;
         w = Integer.parseInt(JOptionPane.showInputDialog(str));
         switch(w)
         {
         case 1:
         	 std[cnt]= new HUFSStudents();
         	while(true)
             {
                int v=0;
                int number = Integer.parseInt(JOptionPane.showInputDialog("Input Student ID"));
                
                if(number < 0)
                {
                   JOptionPane.showMessageDialog(null, "negative number is nope!");
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
                	   JOptionPane.showMessageDialog(null, "no unique student ID!");

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
            std[index-1].Name = JOptionPane.showInputDialog("Input student Name");
            break;
         case 3:
            std[index-1].Address = JOptionPane.showInputDialog("Input stdent Address");
            break;
         case 4:
            std[index-1].Department = JOptionPane.showInputDialog("Input stdent Department");
            break;
         }
	   }
	}
	
	public static String SearchStudent()
	{
        String str1 = "1. Search by student ID";
        String str2 = "2. Search by student Name";
        String str3 = "3. Search by student Address";
        String str4 = "4. Search by student Department";
        String str = str1 + "\n" + str2 + "\n" + str3 + "\n" + str4;
        w = Integer.parseInt(JOptionPane.showInputDialog(str));
        switch(w)
        {
        case 1:
           int temp = Integer.parseInt(JOptionPane.showInputDialog("input student ID"));
           for(int i = 0; i<cnt; i++)
           {
              if(std[i].ID == temp)
              {
            	  String str5 = "number: " + i+1;
            	  String str6 = "Student ID: " + std[i].ID;
            	  String str7 = "Student Name: " + std[i].Name;
            	  String str8 = "Student Address: " + std[i].Address;
            	  String str9 = "Student Department: " + std[i].Department;
            	  String str10 = "Course ID: " + std[i].cID;
            	  String str11 = str5 + "\n" + str6 + "\n" + str7 + "\n" + str8 + "\n" + str9 + "\n" + str10 + "\n----------------------------------------------------------------------------------------------------";
            	  return str11;
              }
           }
           break;
        case 2:
           search = JOptionPane.showInputDialog("input student Name");
           for(int i = 0; i<cnt; i++)
           {
              if(std[i].Name.equals(search))
              {
            	  String str5 = "number: " + i+1;
            	  String str6 = "Student ID: " + std[i].ID;
            	  String str7 = "Student Name: " + std[i].Name;
            	  String str8 = "Student Address: " + std[i].Address;
            	  String str9 = "Student Department: " + std[i].Department;
            	  String str10 = "Course ID: " + std[i].cID;
            	  String str11 = str5 + "\n" + str6 + "\n" + str7 + "\n" + str8 + "\n" + str9 + "\n" + str10 + "\n----------------------------------------------------------------------------------------------------";
            	  return str11;
              }
           }
           break;
        case 3:
           search = JOptionPane.showInputDialog("input student Address");
           for(int i = 0; i<cnt; i++)
           {
              if(std[i].Address.equals(search))
              {
            	  String str5 = "number: " + i+1;
            	  String str6 = "Student ID: " + std[i].ID;
            	  String str7 = "Student Name: " + std[i].Name;
            	  String str8 = "Student Address: " + std[i].Address;
            	  String str9 = "Student Department: " + std[i].Department;
            	  String str10 = "Course ID: " + std[i].cID;
            	  String str11 = str5 + "\n" + str6 + "\n" + str7 + "\n" + str8 + "\n" + str9 + "\n" + str10 + "\n----------------------------------------------------------------------------------------------------";
            	  return str11;
              }
           }
           break;
        case 4:
           search = JOptionPane.showInputDialog("input student Department");
           for(int i = 0; i<cnt; i++)
           {
              if(search.equals(std[i].Department))
              {
            	  String str5 = "number: " + i+1;
            	  String str6 = "Student ID: " + std[i].ID;
            	  String str7 = "Student Name: " + std[i].Name;
            	  String str8 = "Student Address: " + std[i].Address;
            	  String str9 = "Student Department: " + std[i].Department;
            	  String str10 = "Course ID: " + std[i].cID;
            	  String str11 = str5 + "\n" + str6 + "\n" + str7 + "\n" + str8 + "\n" + str9 + "\n" + str10 + "\n----------------------------------------------------------------------------------------------------";
            	  return str11;
              }
           }
           break;
        }
		return null;
	}
	
	public static void DeleteStudent()
	{
		DisplayStudent();
		while(true) 
        {
        index = Integer.parseInt(JOptionPane.showInputDialog("Enter you want to delete number"));
        	if(index-1 >= cnt || index-1 < 0)
        	{
        		JOptionPane.showMessageDialog(null, "no!");
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
	
	public static String[] DisplayStudent()
	{
		boolean flag = false;
		if(cnt<1)
	      {
	         JOptionPane.showMessageDialog(null, "You don't have any data!");
	         return null;
	      }
	      else
	      {
	    	  String[] str1 = new String[cnt];
	    	  String[] str2 = new String[cnt];
	    	  String[] str3 = new String[cnt];
	    	  String[] str4 = new String[cnt];
	    	  String[] str5 = new String[cnt];
	    	  String[] str6 = new String[cnt];
	    	  String[] str  = new String[cnt];
	         for(int i = 0; i < cnt; i++)
	         {	 
	        	 str1[i] = "number: " + (i+1);
	        	 str2[i] = "Student ID: " + std[i].ID;
	        	 str3[i] = "Student Name: " + std[i].Name;
	        	 str4[i] = "Student Address: " + std[i].Address;
	        	 str5[i] = "Student Department: " + std[i].Department;
	        	 str6[i] = "Course ID: " + std[i].cID;
	        	 str[i] = str1[i] + "\n" + str2[i] + "\n" + str3[i] + "\n" + str4[i] + "\n" + str5[i] + "\n" + str6[i] + 
	        			 "\n----------------------------------------------------------------------------------------------------";
	         }
	         return str;
	      }
	}
	
	public static String[] DisplayStudentBYCourse(){
	   if(cnt<1)
	      {
	         JOptionPane.showMessageDialog(null, "You don't have any data!");
	         return null;
	      }
	      else
	      {
	    	 String[] str1 = new String[cnt];
	    	 String[] str2 = new String[cnt];
	    	 String[] str3 = new String[cnt];
	    	 String[] str = new String[cnt];
	         for(int i = 0; i<cnt; i++)
	         {
	        	str1[i] = "Student ID: " + std[i].ID;
	        	str2[i] = " Student Name: " + std[i].Name;
	        	str3[i] = "takes Course ID :" + std[i].cID;
	        	str[i] = str1[i]+ "\n" + str2[i] + "\n" + str3[i] + "\n----------------------------------------------------------------------------------------------------";
	         }
	         return str;
	      }
	   }
	
	 public static void WriteStudentDataToFile() throws IOException{
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
