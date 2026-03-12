public class Construct_P1 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Vraj Paladiya";
        s1.rollNO = 567;
        s1.password = "abcd";
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;

        Student s2 = new Student("Vraj Paladiya");
        System.out.println(s2.name);
        s2.password = "xyz";

        for(int i=0; i<3; i++){
            System.out.println(s2.marks[i]);
        }
    }
}

class Student{
    String name;
    int rollNO;
    String password;
    int marks[];

    Student(Student s1){
        marks = new int[3];
        this.name = s1.name;
        this.rollNO = s1.rollNO;
        this.marks = s1.marks;

        // for(int i=0; i<s1.marks.length; i++){
        //     this.marks[i] = s1.marks[i];
        // }
    }

    Student(){
        System.out.println("My name is Vraj Paladiya...");
        marks = new int[3];
    }

    Student(String name){
        this.name = name;
        marks = new int[3];
    }
    Student(int rollNO){
        this.rollNO = rollNO;
        marks = new int[3];
    }

    Student(int marks[]){
        this.marks = marks;
    }
}