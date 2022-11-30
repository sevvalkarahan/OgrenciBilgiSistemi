public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Alec", "PHY", "356285448");
        Course physics = new Course("Physics", "156");
        physics.addTeacher(t1);

        Teacher t2 = new Teacher("George", "MATH", "452885221");
        Course mathematics = new Course("Mathematics", "211");
        mathematics.addTeacher(t2);

        Teacher t3 = new Teacher("Trevor", "BIO", "477152369");
        Course biology = new Course("biology", "305");
        biology.addTeacher(t3);

        Student s1 = new Student("Sinan", "551", "5", physics, mathematics, biology);
        s1.addBulkExamNote(40,50, 60,70 ,80,90);

        s1.isPass();



        Student s2 = new Student("Erdem", "287", "4", physics, mathematics, biology);
        s2.addBulkExamNote(74,85, 82,40, 93,60);

        s2.isPass();




    }
}
