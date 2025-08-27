package problem43;

public class Problem43 {
    public static void main(String[] args) {
        GradeCard card = new GradeCard("Sergey" , 5);
        card.setMark(0, 95);
        card.setMark(1, 87);
        card.setMark(2, 76);
        card.setMark(3, 88);
        card.setMark(4, 92);
        double avg = card.average();
        char grade = card.letter();
        System.out.println("Average " + avg);
        System.out.println("Letter grade " + grade);
    }
}
