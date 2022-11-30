public class Course {
    Teacher teacher;
    String name;

    String prefix;
    int note;
    int quiz;

    Course(String name, String prefix) {
        this.name = name;

        this.prefix = prefix;
        int note = 0;
        int quiz = 0;
    }

    void addTeacher(Teacher t) {
        if (t.branch.equals(this.prefix)) {
            this.teacher = teacher;

        } else {
            System.out.println("Öğretmen ders ile uyuşmuyor!");
        }


    }

    void printTeacher() {
        this.teacher.print();
    }
}
