public class Student {
    private int id;
    private String name;
    private int age;
    private String course;
/*used to insert coz while adding new student we dont know id
it comes through auto incrementing in sql code*/
    public Student(String name,int age,String course){ 
        this.name=name;
        this.age=age;
        this.course=course;
    }
/*used to fetch/update/delete
we need id to perform those operations */
    public Student(int id, String name, int age, String course) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.course = course;
    }
    
    public int getId(){
        return id;
    }
    public void setId(int id){ this.id=id;}
    public String getName(){
        return name;
    }
    public void setName(String name){ this.name=name;}
    public int getAge(){
        return age;
    }
    public void setAge(int age){ this.age=age;}
    public String getCourse(){
        return course;
    }
    public void setCourse(String course){this.course=course;}

}
/*having same name and different parameters 
 for more than one constructor is called 
 "constructor overloading"*/