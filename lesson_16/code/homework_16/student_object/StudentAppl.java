package homework_16.student_object;

import homework_16.student_object.model.Student;

public class StudentAppl {

    public static void main(String[] args) {

        Student s1 = new Student(1,"N1","N1",1977,"Engineering",false);
        Student s2 = new Student(1,"N2","N2",1985,"Law",true);
        Student s3 = new Student(1,"N3","N3",1990,"Computer Science",true);
        Student s4 = new Student(1,"N4","N4",1969,"Psychology",false);
        Student s5 = new Student(1,"N5","N5",1972,"Philology",false);
        Student s6 = new Student(1,"N6","N6",1970,"Biology",true);
        Student s7 = new Student(1,"N7","N7",1965,"Chemictry",true);
        Student s8 = new Student(1,"N8","N8",1990,"Physics",true);
        Student s9 = new Student(1,"N9","N9",1999,"Economics",false);
        Student s10 = new Student(1,"N10","N10",2000,"Medicine",false);

        System.out.println(s1.displayStudent());
        System.out.println(s2.displayStudent());
        System.out.println(s3.displayStudent());
        System.out.println(s4.displayStudent());
        System.out.println(s5.displayStudent());
        System.out.println(s6.displayStudent());
        System.out.println(s7.displayStudent());
        System.out.println(s8.displayStudent());
        System.out.println(s9.displayStudent());
        System.out.println(s10.displayStudent());

        System.out.println("_______________________________________________________________________");

        s1.vacation();
        s2.exam();
        s3.exam();
        s4.study();
        s5.vacation();
        s6.dropOut();
        s7.study();
        s8.exam();
        s9.vacation();
        s10.dropOut();

    } // end of main
} // end of class
