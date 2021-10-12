import org.joda.time.DateTime;

public class Driver {
    public static void main(String args[]){
        Student student1 = new Student("Ivans", 21, "28/02/2000", "18357623");
        student1.setUsername();
        Student student2 = new Student("Oscar", 20,"23/01/2001","11183022");
        student2.setUsername();
        Student student3 = new Student("Blane",21,"13/08/2000", "14586933");
        student3.setUsername();
        //creating courses
        Course course2 = new Course(new DateTime(2021,9,06,0,0),
                new DateTime(2025,05,10,0,0),"ECE");
        Course course1 = new Course(new DateTime(2021,9,06,0,0),
                new DateTime(2025,05,10,0,0),"CS&IT");
        Course course3 = new Course(new DateTime(2021,9,06,0,0),
                new DateTime(2025,05,10,0,0),"AC");


        //creating  modules for csit
        Modules csmodule1 = new Modules("Machine Learning","CT4101");
        Modules csmodule2 = new Modules("Software Engineering","CT417");
        Modules csmodule3 = new Modules("Information Retrieval","CT4100");
        //creating modules for ECE
        Modules ecmodule1 = new Modules("Electronical Engineering","EC456");
        Modules ecmodule2 = new Modules("Hardware Studies","EC421");
        Modules ecmodule3 = new Modules("Maths","MA467");

        //creating modules for ac
        Modules acmodule1 = new Modules("Advanced Livestock Science","AC497");
        Modules acmodule2 = new Modules("Crop Genetics","AC4122");
        Modules acmodule3 = new Modules("Agridevelopment","AC482");

        student1.addCourse(course1);
        student2.addCourse(course2);
        student3.addCourse(course3);

        //adding module to student
        student1.addModule(csmodule1);
        student1.addModule(csmodule2);
        student1.addModule(csmodule3);

        student2.addModule(ecmodule1);
        student2.addModule(ecmodule2);
        student2.addModule(ecmodule3);

        student3.addModule(acmodule1);
        student3.addModule(acmodule2);
        student3.addModule(acmodule3);
        //adding student to course
        course1.addStudent(student1);
        course2.addStudent(student2);
        course3.addStudent(student3);

        //adding module to course
        course1.addModule(csmodule1);
        course1.addModule(csmodule2);
        course1.addModule(csmodule3);

        course2.addModule(ecmodule1);
        course2.addModule(ecmodule2);
        course2.addModule(ecmodule3);

        course3.addModule(acmodule1);
        course3.addModule(acmodule2);
        course3.addModule(acmodule3);

        //adding student to modules
        csmodule1.addStudent(student1);
        csmodule2.addStudent(student1);
        csmodule3.addStudent(student1);

        ecmodule1.addStudent(student2);
        ecmodule2.addStudent(student2);
        ecmodule3.addStudent(student2);

        acmodule1.addStudent(student3);
        acmodule2.addStudent(student3);
        acmodule3.addStudent(student3);

        //adding course to module
        csmodule1.addCourse(course1);
        csmodule2.addCourse(course1);
        csmodule3.addCourse(course1);

        ecmodule1.addCourse(course2);
        ecmodule2.addCourse(course2);
        ecmodule3.addCourse(course2);

        acmodule1.addCourse(course3);
        ecmodule1.addCourse(course3);
        ecmodule1.addCourse(course3);

        //printing courses their students and modules for course 1
        System.out.println("course name: "+course1.getName()+
                " course start time:"+course1.getStartTime()+
                " course end time: "+course1.getEndTime());

        System.out.println("list of students: "+course1.getStudent(0).getName()+
                " students dob: "+course1.getStudent(0).getDob()+" students age: "
                +course1.getStudent(0).getAge()+" students id: "+course1.getStudent(0).getId()+
                " students username: "+ course1.getStudent(0).getUsername());
        System.out.println("students modules for this course");
        for(int i =0; i< course1.getStudent(0).getModules().size();i++){
            System.out.println(course1.getStudent(0).getModules().get(i).getName()+" "+
                    course1.getStudent(0).getModules().get(i).getModuleId());
        }
        System.out.println("\n");

        //printing information for course 2
        System.out.println("course name: "+course2.getName()+
                " course start time:"+course2.getStartTime()+
                " course end time: "+course2.getEndTime());

        System.out.println("list of students: "+course2.getStudent(0).getName()+
                " students dob: "+course2.getStudent(0).getDob()+" students age: "
                +course2.getStudent(0).getAge()+" students id: "+course2.getStudent(0).getId()+
                " students username: "+ course2.getStudent(0).getUsername());
        System.out.println("students modules for this course");
        for(int i =0; i< course2.getStudent(0).getModules().size();i++) {
            System.out.println(course2.getStudent(0).getModules().get(i).getName() + " " +
                    course2.getStudent(0).getModules().get(i).getModuleId() );
        }
        System.out.println("\n");
        //printing results for course 3
        System.out.println("course name: "+course3.getName()+
                " course start time:"+course3.getStartTime()+
                " course end time: "+course3.getEndTime());

        System.out.println("list of students: "+course3.getStudent(0).getName()+
                " students dob: "+course3.getStudent(0).getDob()+" students age: "
                +course3.getStudent(0).getAge()+" students id: "+course3.getStudent(0).getId()+
                " students username: "+ course3.getStudent(0).getUsername());
        System.out.println("students modules for this course");
        for(int i =0; i< course3.getStudent(0).getModules().size();i++) {
            System.out.println(course3.getStudent(0).getModules().get(i).getName() + " " +
                    course3.getStudent(0).getModules().get(i).getModuleId() );
        }

    }
}
