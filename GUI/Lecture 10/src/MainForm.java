import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
public class MainForm extends JFrame {
	public static void main(String[] args) {
		JFrame frm = new JFrame("Student Information");
        frm.setSize(1000, 1000);
        frm.setLocationRelativeTo(null);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.getContentPane().setLayout(null);
 
        JButton btn1 = new JButton("Add student information");
        JButton btn2 = new JButton("Update student information");
        JButton btn3 = new JButton("Search student information");
        JButton btn4 = new JButton("Delete student informaton");
        JButton btn5 = new JButton("Display a list of all student");
        JButton btn6 = new JButton("Update Course information");
        JButton btn7 = new JButton("Search Course information");
        JButton btn8 = new JButton("Delete Course information");
        JButton btn9 = new JButton("Display a list of all Course");
        JButton btn10 = new JButton("Display List which student(s) are taking which Course");
        JButton btn11 = new JButton("File Save");

        btn1.setBounds(150, 100, 200, 50);
        btn2.setBounds(400, 100, 200, 50);
        btn3.setBounds(650, 100, 200, 50);
        btn4.setBounds(150, 200, 200, 50);
        btn5.setBounds(400, 200, 200, 50);
        btn6.setBounds(650, 200, 200, 50);
        btn7.setBounds(150, 300, 200, 50);
        btn8.setBounds(400, 300, 200, 50);
        btn9.setBounds(650, 300, 200, 50);
        btn10.setBounds(300, 400, 400, 50);
        btn11.setBounds(400, 900, 200, 50);
        
        frm.getContentPane().add(btn1);
        frm.getContentPane().add(btn2);
        frm.getContentPane().add(btn3);
        frm.getContentPane().add(btn4);
        frm.getContentPane().add(btn5);
        frm.getContentPane().add(btn6);
        frm.getContentPane().add(btn7);
        frm.getContentPane().add(btn8);
        frm.getContentPane().add(btn9);
        frm.getContentPane().add(btn10);
        frm.getContentPane().add(btn11);

        JTextArea display = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(display, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        frm.add(scrollPane);
        display.setEditable(false);
        scrollPane.setBounds(100, 475, 800, 400);
        display.setBounds(100, 475, 800, 400);
        frm.getContentPane().add(display);
        
        ActionListener act1 = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				HUFSStudentManager.AddStudent();
			}
		};
		
		ActionListener act2 = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				HUFSStudentManager.UpdateStudent();
			}
		};
		
		ActionListener act3 = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				display.setText("");
				String str = HUFSStudentManager.SearchStudent();
				display.append(str);
			}
		};
		
		ActionListener act4 = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				HUFSStudentManager.DeleteStudent();
			}
		};
		
		ActionListener act5 = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				display.setText("");
				String[] str = HUFSStudentManager.DisplayStudent();
				for (int i = 0; i < str.length; i++) {
					display.append(str[i]);
				}
			}
		};
		
		ActionListener act6 = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				CourseManager.UpdateCourse();
			}
		};
		
		ActionListener act7 = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				display.setText("");
				String str = CourseManager.SearchCourse();
				display.append(str);
			}
		};
		

		ActionListener act8 = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				CourseManager.DeleteCourse();
			}
		};
		
		ActionListener act9 = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				display.setText("");
				String[] str = CourseManager.DisplayCourse();
				for (int i = 0; i < str.length; i++) {
					display.append(str[i]);
				}
			}
		};
		
		ActionListener act10 = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				display.setText("");
				String[] str = HUFSStudentManager.DisplayStudentBYCourse();
				for (int i = 0; i < str.length; i++) {
					display.append(str[i]);
				}
			}
		};
		
		ActionListener act11 = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					HUFSStudentManager.WriteStudentDataToFile();
					CourseManager.WriteStudentDataToFile();
					JOptionPane.showMessageDialog(null, "Saved successfully");
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		};
		
        btn1.addActionListener(act1);
        btn2.addActionListener(act2);
        btn3.addActionListener(act3);
        btn4.addActionListener(act4);
        btn5.addActionListener(act5);
        btn6.addActionListener(act6);
        btn7.addActionListener(act7);
        btn8.addActionListener(act8);
        btn9.addActionListener(act9);
        btn10.addActionListener(act10);
        btn11.addActionListener(act11);
        
        frm.setVisible(true);
	}
}
