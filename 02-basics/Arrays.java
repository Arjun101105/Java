class Student{
    String name;
    int marks;
    int rollNo;
}

public class Arrays {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "arjun";
        s1.rollNo = 40;
        s1.marks = 8;

        Student s2 = new Student();
        s2.name = "advay";
        s2.rollNo = 4;
        s2.marks = 9;

        Student s3 = new Student();
        s3.name = "rashmit";
        s3.rollNo = 46;
        s3.marks = 10;

        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for(int i = 0; i<students.length; i++){
            System.out.println(students[i].name + ": " + students[i].marks);
        }
    }
}
