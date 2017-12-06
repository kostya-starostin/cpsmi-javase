import java.util.Scanner;

public class CorrectFunction {

    private static void checkBracket(String var) {
        int bracketIndex = 0;
        boolean Bracket=false;
        char[] str;
        str = var.toCharArray();
        for (int i = 0; i < str.length; i++) {
            if (bracketIndex < 0) {
                System.out.println("Закрывающая скобка раньше открывающей!");
                break;
            }

            if (str[i] == ')') {
                bracketIndex--;
                Bracket=true;
              } else if (str[i] == '(') {
                bracketIndex++;
                Bracket=true;
            }
        }
        if (bracketIndex != 0) {
            System.out.println("Скобки расставлены неправильно!");
        } else {
            if(Bracket){
                System.out.println("Со скобками все впорядке");}
            else {
                System.out.println("В выражении нет скобок!");
            }
        }


    }



    public static void main(String[] args) {
        String formula;

        System.out.println("Введите произвольную формулу, проверим в ней правильность скобок:");
        System.out.println("//Для выхода введите end");
        Scanner sc=new Scanner(System.in);
        while (true) {
            formula = sc.nextLine();
            if (formula.compareTo("end") == 0) {
                break;
            } else {
              checkBracket(formula);
            }
        }
    }
}
