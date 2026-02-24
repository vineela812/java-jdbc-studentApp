import java.util.*;
public class Main1{
    public static void main(String[] args) {
        StudentDAO dao=new StudentDAO();
        Scanner sc=new Scanner(System.in);
        int choice;
        do{
            System.out.println("\n--- STUDENT MANAGEMENT ---");
            System.out.println("1. Insert Student");
            System.out.println("2. View Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch(choice){
                case 1:
                    System.out.println("Enter name: ");
                    String name=sc.nextLine();
                    System.out.println("Enter age: ");
                    int age=sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter course: ");
                    String course=sc.nextLine();
                    
                    Student s=new Student(name,age,course);
                    dao.insert(s);
                    break;
                case 2:
                    dao.view();
                    break;
                case 3:
                    dao.update();
                    break;
                case 4:
                    System.out.println("Enter id of student to delete: ");
                    int id=sc.nextInt();
                    dao.delete(id);
                    break;
                case 5:
                    System.out.println("Exiting...");
                default:
                    System.out.println("Invalid choice.Try again!.");
            }
        }while(choice!=5);
        sc.close();
    }
}