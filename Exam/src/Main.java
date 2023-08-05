//System that allow Student take exam, each question has different Score mark.
// at the end it calculates the total for right answers.
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        String[] an1 = {"2","5","7","6"};
        Question q1 = new Question("1+1","2",1, an1);

        String[] an2 = {"40","30","21","50"};
        Question q2 = new Question("10 * 5","50",3, an2);

        String[] an3 = {"40","30","21","50"};
        Question q3 = new Question("10 % 5","0",5, an3);

        List<Question> questions = new ArrayList<>();

        questions.add(q1);
        questions.add(q2);
        questions.add(q3);

        double total =0;
        for (Question q:questions) {
            q.displayQuestion();
            String userAnswer = read.next();
            if (userAnswer.equals(q.rightAnswer)){
                total += q.degree;
            }
        }

        System.out.println("Your Degree is : "+total);

    }
}
class Question{

    String text;
    String rightAnswer;
    double degree;
    String[] answers;

    Question(String t,String ra,double d,String[] an){
        text =t;
        rightAnswer = ra;
        degree = d;
        answers = an;
    }

    void displayQuestion(){
        System.out.print("Question : "+ text + " ? ");
        for (String a: answers) {
            System.out.print("\n" +a);
        }
        System.out.println();
    }

}