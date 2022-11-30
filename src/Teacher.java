public class Teacher {
    String name;
    String branch;
    String mobilephone;


    Teacher(String name, String branch, String mobilephone) {
        this.name = name;
        this.branch = branch;
        this.mobilephone = mobilephone;
    }

    void print() {
        System.out.println("Name : " + this.name);
        System.out.println("Branch : " + this.branch);
        System.out.println("Mobile Phone Number : " + this.mobilephone);
    }
}
