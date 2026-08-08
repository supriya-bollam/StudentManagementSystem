import java.util.ArrayList;
import java.util.Scanner;
public class StudentManagement{
     static ArrayList<Student> student=new ArrayList<>();
       static  Scanner sc=new Scanner(System.in);
    public static void main(String[] args){
        while(true){
            System.out.println("==============Student Management System============");
            System.out.println("1.Add Student");
            System.out.println("2.Remove Student");
            System.out.println("3.Update Student");
            System.out.println("4.Search Student");
            System.out.println("5.Display Student");
            System.out.println("6.Exit");
            System.out.println("Enter Your Choice:");
            int choice=sc.nextInt();
            switch(choice){
                case 1:
                    addStudent();
                    break;
                case 2:
                    removeStudent();
                    break;
                case 3:
                    updateStudent();
                    break;
                case 4:
                    searchStudent();
                    break;
                case 5:
                    displayStudent();
                    break;
                case 6:
                    System.out.println("Thank You");
                    return;
                default:
                    System.out.println("Invalid Choice");
                }
             }
            }
             public static void addStudent(){
                System.out.println("Enter Student Id:");
                int id=sc.nextInt();
                System.out.println("Enter Student Name:");
                String name=sc.next();
                student.add(new Student(id,name));
                System.out.println("Successfully Student Added");
             }
             public static void removeStudent(){
                System.out.println("Enter id:");
                int id=sc.nextInt();
                for(Student s:student){
                    if(s.getId()==id){
                        student.remove(s);
                        System.out.println("Student Removed Successfully");
                        return;
                    }
                }
                System.out.println("Student not found");
             }
             public static  void updateStudent(){
                System.out.println("Enter id");
                int id=sc.nextInt();
                for(Student s:student){
                    if(s.getId()==id){
                        System.out.println("Enter new Name");
                        String newName=sc.next();
                        s.setName(newName);
                        System.out.println("Student Updated Successfully");
                        return;
                    }}
                    System.out.println("Student Not found");
                    
                }
                public static void searchStudent(){
                    System.out.println("Enter Id:");
                    int id=sc.nextInt();
                    for(Student s:student){
                        if(s.getId()==id){
                            System.out.println("ID:"+ s.getId());
                            System.out.println("Name:"+ s.getName());
                        }
                    }
                    System.out.println("Student Not Found");
                }
                public static void displayStudent(){
                   if(student.isEmpty()){
                    System.out.println("No students Found");

                   }
                   for(Student s:student){
                    System.out.println("Id:"+s.getId());
                    System.out.println("Name:"+s.getName());
                    
                   }
                }
             }