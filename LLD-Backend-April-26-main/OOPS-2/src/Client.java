public class Client {

    public static void main(String[] args) {
       // Student s1 = new Student("Virat",2018);
//        Student s2 = s1;
//
//        s2.setGradYear(2023);
//        System.out.println(s1.getGradYear());

//        Student s2 = new Student(s1.getName(),s1.getGradYear());
//
//        Student s3 = new Student();
//        s3.setGradYear(s1.getGradYear());
//        s3.setName(s1.getName());

//        Student s2 = new Student(s1);
//        Student s3 = s1;
//
//        System.out.println("DEBUG");

        Exam exam = new Exam(1,"Java");
        Student s1 = new Student("ABC",2020,exam);
//
//        Student s2 = new Student(s1);
//
//        System.out.println("DEBUG");

//        int x = 10;
//        fun(x);
//        System.out.println(x);
        fun(s1);
        System.out.println(s1.getGradYear());

    }

    static void fun(Student s) {
         s.setGradYear(2024);
    }
}
