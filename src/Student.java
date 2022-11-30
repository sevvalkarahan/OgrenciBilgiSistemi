public class Student {
    Course fizik;
    Course matematik;
    Course biyoloji;
    String name;
    String stuNo;
    String classes;
    double average;
    boolean isPass;

    Student(String name, String stuNo, String classes, Course fizik, Course matematik, Course biyoloji) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.fizik = fizik;
        this.matematik = matematik;
        this.biyoloji = biyoloji;
        this.average = 0.0;
        this.isPass = false;
    }

    void addBulkExamNote(int fizikNote, int fizikNoteQuiz, int matematikNote, int matematikNoteQuiz, int biyolojiNote, int biyolojiNoteQuiz) {
        if (fizikNote >= 0 && fizikNote <= 100) {
            this.fizik.note = fizikNote;
            this.fizik.quiz = fizikNoteQuiz;
        }
        if (matematikNote >= 0 && matematikNote < 100) {
            this.matematik.note = matematikNote;
            this.matematik.quiz = matematikNoteQuiz;
        }
        if (biyolojiNote >= 0 && biyolojiNote <= 100) {
            this.biyoloji.note = biyolojiNote;
            this.biyoloji.quiz = biyolojiNoteQuiz;
        }
    }

    void isPass() {
        double averageFizik = (this.fizik.note * 0.8) + (this.fizik.quiz * 0.2);
        double averageMatematik = (this.matematik.note * 0.8) + (this.matematik.quiz * 0.2);
        double averageBiyoloji= (this.biyoloji.note * 0.8) + (this.biyoloji.quiz * 0.2);
        this.average = ((averageFizik + averageMatematik + averageBiyoloji) / 3.0);

        printNote();

        if (this.average > 55) {
            System.out.println("Geçtiniz.Tebrikler...");
            this.isPass = true;
        } else {
            System.out.println("Kaldınız! ");
            this.isPass = false;
        }
        System.out.println("==================================");

    }


    void printNote() {
        System.out.println("Student : " + this.name);
        System.out.println(this.fizik.name + "Note : " + this.fizik.note);
        System.out.println(this.matematik.name + "Note : " + this.matematik.note);
        System.out.println(this.biyoloji.name + "Note : " + this.biyoloji.note);
        System.out.println("Average : " + this.average);
    }
}
