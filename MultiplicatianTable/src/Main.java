import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int correctAnswers = 0;
        final int numberOfQuestions = 5;

        for (int i = 0; i < numberOfQuestions; i++) {

            int num1 = random.nextInt(10) + 1;
            int num2 = random.nextInt(10) + 1;

            System.out.printf("Сколько будет %d * %d",num1,num2);
            int userAnswer = scanner.nextInt();
            int correct_answer = num1 * num2;

            if (check_answers(userAnswer,correct_answer)) {
                correctAnswers++;
            }

        }
        User_Result(correctAnswers);
       scanner.close();
    }

    public static boolean check_answers(int userAnswer, int correctAnswer) {
        if (userAnswer==correctAnswer){
            System.out.println("\u001B[32mПравильно!\u001B[0m"); // Вывод зеленым цветом
            return true;

        }
        else {
            System.out.printf("\u001B[31mОшибка! Правильный ответ: %d\u001B[0m\n", correctAnswer); // Вывод красным цветом
            return false;
        }

    }


    public  static void User_Result(int correctAnswers) {

        System.out.println("\nРезультат:");

        if (correctAnswers == 5) {
            System.out.println("\u001B[32mМолодец! Ты ответил(а) на все вопросы правильно.\u001B[0m");
        } else if (correctAnswers >= 3) {
            System.out.println("\u001B[33mНеплохо, но надо бы ещё поучить.\u001B[0m");
        } else {
            System.out.println("\u001B[31mСрочно нужно учить таблицу умножения!\u001B[0m");
        }
    }



}