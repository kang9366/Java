import java.util.*;

import javax.swing.JOptionPane;

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
              JOptionPane.showMessageDialog(null, "negative number is nope!");
              couID = Integer.parseInt(JOptionPane.showInputDialog("Input Course ID"));
              HUFSStudentManager.std[cnt].cID = couID;
           }
           else
        	   break;
        }
        
        cou[cnt].Name = JOptionPane.showInputDialog("Input Course Name");
        cou[cnt].Faculty = JOptionPane.showInputDialog("Input Course Faculty");
        cou[cnt].Level = JOptionPane.showInputDialog("Input Course Level");
        cou[cnt].Professor = JOptionPane.showInputDialog("Input Course Professor");
        cnt++;
        JOptionPane.showMessageDialog(null, "Done.");
	}
	
	public static void AddCourseforCourseDelete()
	{
		cou[cnt]= new Course();
		cou[index-1].ID = couID;
        while(true)
        {
           if(couID < 0)
           {
              JOptionPane.showMessageDialog(null, "negative number is nope!");
              couID = Integer.parseInt(JOptionPane.showInputDialog("Input Course ID"));
              HUFSStudentManager.std[cnt].cID = couID;
              cou[index-1].ID = couID;
           }
           else
        	   break;
        }
        cou[cnt].Name = JOptionPane.showInputDialog("Input Course Name");
        cou[cnt].Faculty = JOptionPane.showInputDialog("Input Course Faculty");
        cou[cnt].Level = JOptionPane.showInputDialog("Input Course Level");
        cou[cnt].Professor = JOptionPane.showInputDialog("Input Course Professor");
        cnt++;
        JOptionPane.showMessageDialog(null, "Done.");
	}
	
	public static void UpdateCourse()
	{
	      if(cnt<1)
	      {
	         JOptionPane.showMessageDialog(null, "You don't have any data!");
	      }
	      else
	      {
		 DisplayCourse();
		 
         while(true)
         {
         index = Integer.parseInt(JOptionPane.showInputDialog("Enter the number"));
         	if(index-1 >= cnt || index-1 <0)
         	{
         		JOptionPane.showMessageDialog(null, "no!");
         	}
         	else
         	break;
         }
         String str1 = "What do you want to update? ";
         String str2 = "1. Course ID";
         String str3 = "2. Course Name";
         String str4 = "3. Course Faculty";
         String str5 = "4. Course Level";
         String str6 = "5. Course Professor";
         String str = str1 + "\n" + str2 + "\n" + str3 + "\n" + str4 + "\n" + str5 + "\n" + str6;
         w = Integer.parseInt(JOptionPane.showInputDialog(str1));
         switch(w)
         {
         case 1:
        	 cou[cnt]= new Course();
         	while(true)
             {
                int v=0;
                int number = Integer.parseInt(JOptionPane.showInputDialog("Input Course ID"));
                
                if(number < 0)
                {
                   JOptionPane.showMessageDialog(null, "negative number is nope!");
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
                      JOptionPane.showMessageDialog(null, "no unique Course ID!");
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
            cou[index-1].Name = JOptionPane.showInputDialog("Input Course Name");
            break;
         case 3:
            cou[index-1].Faculty = JOptionPane.showInputDialog("Input Course Faculty");
            break;
         case 4:
            cou[index-1].Level = JOptionPane.showInputDialog("Input Course Level");
            break;
         case 5:
             cou[index-1].Professor = JOptionPane.showInputDialog("Input Course Professor");
         }
	   }
	}
	
	public static String SearchCourse()
	{	String str1 = "1. Search by Course ID";
		String str2 = "2. Search by Course Name";
		String str3 = "3. Search by Course Faculty";
		String str4 = "4. Search by Course Level";
		String str5 = "5. Search by Course Professor";
        w = Integer.parseInt(JOptionPane.showInputDialog(str1 + "\n" + str2 + "\n" + str3 + "\n" + str4 + "\n" + str5 + "\n----------------------------------------------------------------------------------------------------"));
        switch(w)
        {
        case 1:
           int temp = Integer.parseInt(JOptionPane.showInputDialog("input Course ID"));
           for(int i = 0; i<cnt; i++)
           {
              if(cou[i].ID == temp)
              {
            	  String str6 = "number: " + (i+1);
            	  String str7 = "Course ID: " + cou[i].ID;
            	  String str8 = "Course Name: " + cou[i].Name;
            	  String str9 = "Course faculty: " + cou[i].Faculty;
            	  String str10 = "Course Level: " + cou[i].Level;
            	  String str11 = "Course Professor: " + cou[i].Professor;
            	  String str = str6 + "\n" + str7 + "\n" + str8 + "\n" + str9 + "\n" + str10 + "\n" + str11 + "\n----------------------------------------------------------------------------------------------------";
            	  return str;
              }
           }
           break;
        case 2:
           search = JOptionPane.showInputDialog("input Course NAME");
           for(int i = 0; i<cnt; i++)
           {
              if(cou[i].Name.equals(search))
              {
            	  String str6 = "number: " + (i+1);
            	  String str7 = "Course ID: " + cou[i].ID;
            	  String str8 = "Course Name: " + cou[i].Name;
            	  String str9 = "Course faculty: " + cou[i].Faculty;
            	  String str10 = "Course Level: " + cou[i].Level;
            	  String str11 = "Course Professor: " + cou[i].Professor;
            	  String str = str6 + "\n" + str7 + "\n" + str8 + "\n" + str9 + "\n" + str10 + "\n" + str11 + "\n----------------------------------------------------------------------------------------------------";
            	  return str;
              }
           }
           break;
        case 3:
           search = JOptionPane.showInputDialog("input Course Faculty");
           for(int i = 0; i<cnt; i++)
           {
              if(cou[i].Faculty.equals(search))
              {
            	  String str6 = "number: " + (i+1);
            	  String str7 = "Course ID: " + cou[i].ID;
            	  String str8 = "Course Name: " + cou[i].Name;
            	  String str9 = "Course faculty: " + cou[i].Faculty;
            	  String str10 = "Course Level: " + cou[i].Level;
            	  String str11 = "Course Professor: " + cou[i].Professor;
            	  String str = str6 + "\n" + str7 + "\n" + str8 + "\n" + str9 + "\n" + str10 + "\n" + str11 + "\n----------------------------------------------------------------------------------------------------";
            	  return str;
              }
           }
           break;
        case 4:
           search = JOptionPane.showInputDialog("input Course Level");
           for(int i = 0; i<cnt; i++)
           {
              if(search.equals(cou[i].Level))
              {
            	  String str6 = "number: " + (i+1);
            	  String str7 = "Course ID: " + cou[i].ID;
            	  String str8 = "Course Name: " + cou[i].Name;
            	  String str9 = "Course faculty: " + cou[i].Faculty;
            	  String str10 = "Course Level: " + cou[i].Level;
            	  String str11 = "Course Professor: " + cou[i].Professor;
            	  String str = str6 + "\n" + str7 + "\n" + str8 + "\n" + str9 + "\n" + str10 + "\n" + str11 + "\n----------------------------------------------------------------------------------------------------";
            	  return str;
              }
           }
        break;
        case 5:
            search = JOptionPane.showInputDialog("input Course Professor");
            for(int i = 0; i<cnt; i++)
            {
               if(search.equals(cou[i].Professor))
               {
            	  String str6 = "number: " + (i+1);
             	  String str7 = "Course ID: " + cou[i].ID;
             	  String str8 = "Course Name: " + cou[i].Name;
             	  String str9 = "Course faculty: " + cou[i].Faculty;
             	  String str10 = "Course Level: " + cou[i].Level;
             	  String str11 = "Course Professor: " + cou[i].Professor;
             	  String str = str6 + "\n" + str7 + "\n" + str8 + "\n" + str9 + "\n" + str10 + "\n" + str11 + "\n----------------------------------------------------------------------------------------------------";
             	  return str;
               }
            }
         break;
        }
        return null;
	}
	
	public static void DeleteCourse()
	{
		DisplayCourse();
		while(true) 
        {
			index = Integer.parseInt(JOptionPane.showInputDialog("Enter you want to delete number"));
        	if(index-1 >= cnt || index-1 < 0)
        	{
        		JOptionPane.showMessageDialog(null, "no!");     		
        	}
        	else
        	{
        		for(int k = 0; k < HUFSStudentManager.cnt; k++)
                {
                   if(HUFSStudentManager.std[k].cID == cou[index-1].ID)
                   {	
                	   	JOptionPane.showMessageDialog(null, "number "+ (k+1) +" student's course deleted so register new course");
                        couID = Integer.parseInt(JOptionPane.showInputDialog("Input Course ID"));
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
	
	
	
	public static String[] DisplayCourse()
	   {
		  String[] str1 = new String[cnt];
		  String[] str2 = new String[cnt];
		  String[] str3 = new String[cnt];
		  String[] str4 = new String[cnt];
		  String[] str5 = new String[cnt];
		  String[] str6 = new String[cnt];
		  String[] str = new String[cnt];
		  
	      if(cnt<1)
	      {
	         JOptionPane.showMessageDialog(null, "You don't have any data!");
	         return null;
	      }
	      else
	      {	
	    	  
	         for(int i = 0; i<cnt; i++)
	         {		
	        	   str1[i] = "number: " +  (i+1);
	        	   str2[i] = "Course ID: " + cou[i].ID;
	        	   str3[i] = "Course Name: " + cou[i].Name;
	        	   str4[i] = "Course faculty: " + cou[i].Faculty;
	        	   str5[i] = "Course Level: " + cou[i].Level;
	        	   str6[i] = "Course Professor: " + cou[i].Professor;
	        	   str[i] = str1[i] + "\n" + str2[i] + "\n" + str3[i] + "\n" + str4[i] + "\n" + str5[i] + "\n" +str6[i] + "\n----------------------------------------------------------------------------------------------------";
	         }
	         return str;
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
