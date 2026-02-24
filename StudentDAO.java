import java.sql.*;
import java.util.*;
public class StudentDAO {
    //CRUD OPERATIONS
    
    public void insert(Student s) {
        try(Connection con=DBConnection.getConnection()){
            String sql="INSERT INTO student(name,age,course) VALUES(?,?,?)";
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setString(1,s.getName());
            ps.setInt(2,s.getAge());
            ps.setString(3,s.getCourse());
            ps.executeUpdate();
            System.out.println("student inserted successfully");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public void view(){
        try(Connection con=DBConnection.getConnection()){
            String sql="SELECT * from student";
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            System.out.println("\nID  NAME  AGE  COURSE");
            System.out.println("-----------------------");
            while(rs.next()){
                System.out.println(
                rs.getInt("id")+"  "+
                rs.getString("name")+"  "+
                rs.getInt("age")+"  "+
                rs.getString("course")+"  "
                );
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public void update(){
        boolean flag=false;
        try(Connection con=DBConnection.getConnection()){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter id of student to update anything: ");
            int id=sc.nextInt();
            sc.nextLine();
            System.out.println("Which field do you want to update?");
            System.out.println("1. Name");
            System.out.println("2. Age");
            System.out.println("3. Course");
            System.out.print("Choose option: ");
            int option=sc.nextInt();
            sc.nextLine();
            String sql="";
            PreparedStatement ps;
            switch(option){
                case 1:
                    System.out.println("Enter new name: ");
                    String newName=sc.nextLine();
                    sql="update student set name=? where id=?";
                    ps=con.prepareStatement(sql);
                    ps.setString(1,newName);
                    ps.setInt(2,id);
                    if(ps.executeUpdate()>0) flag=true;
                    break;
                case 2:
                    System.out.println("Enter new age: ");
                    int newAge=sc.nextInt();
                    sql="update student set age=? where id=?";
                    ps=con.prepareStatement(sql);
                    ps.setInt(1,newAge);
                    ps.setInt(2,id);
                    if(ps.executeUpdate()>0) flag=true;
                    break;
                case 3:
                    System.out.println("Enter new course: ");
                    String newCourse=sc.nextLine();
                    sql="update student set course=? where id=?";
                    ps=con.prepareStatement(sql);
                    ps.setString(1,newCourse);
                    ps.setInt(2,id);
                    if(ps.executeUpdate()>0) flag=true;
                    break;
                default:
                    System.out.println("Invalid choice");
                    return;
            }
            if(flag){
                System.out.println("student updated successfully");
            }else{
                System.out.println("no student found with id: "+id);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public void delete(int id){
        boolean flag=false;
        try(Connection con=DBConnection.getConnection()){
            String sql="delete from student where id=?";
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1,id);
            if(ps.executeUpdate()>0) flag=true;
            if(flag){
            System.out.println("Student deleted successfully");
        } else {
            System.out.println("No student found with id: " + id);
        }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
