package problem71;

public class Problem71 {
    public static void main(String[] args) {
        Student student = new Student();
        Student[] students = new Student[5];
        students[0] = new Student();
        students[0].name = "John";
        students[0].score = 75;

        students[1] = new Student();
        students[1].name = "Alice";
        students[1].score = 58;

        students[2] = new Student();
        students[2].name = "Bob";
        students[2].score = 90;

        students[3] = new Student();
        students[3].name = "Mary";
        students[3].score = 62;

        students[4] = new Student();
        students[4].name = "Tom";
        students[4].score = 45;

        int totalScore = 0;
        int passCount = 0;
        for (Student s : students) {
            System.out.println(s.info());
            totalScore += s.score;
            if (s.passed()) {
                passCount++;
            }
        }
        double average = (double) totalScore / students.length;
        System.out.println("Class average: " + average);
        System.out.println("Number passed: " + passCount);
    }
}