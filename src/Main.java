public class Main {
    public static void main(String[] args) {
        // Exercise 1
        Student student = new Student();
        student.setStdId(1);
        student.setStdName("Ngbandaman");
        student.setStdRollNo(4);
        System.out.println("Student's Name : "+student.getStdName());
        System.out.println("Student's Roll no : "+student.getStdRollNo());
        System.out.println("Student's Id : "+student.getStdId());

        System.out.println("");
        // Exercise 2
        Player player = new Player("Sachin",40,"Cricket");
        player.displayPlayer();

    }
}