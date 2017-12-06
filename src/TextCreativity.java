import java.util.Scanner;



public class TextCreativity {

    private static boolean Punct(char var) {
        switch (var) {
            case '.':
            case ',':
            case '!':
            case '?':
            case ' ':
                return true;

            default:
                return false;

        }
    }

public int[] analizer (String s){
    boolean inWord = false;
    int wordNumber = 0;
    int charNumber = 0;
    int punctNumber = 0;
    int letterNumber = 0;
    char[] str = s.toCharArray();

    for (int i = 0; i < str.length; i++) {
        if (!Punct(str[i])) {
            if (!inWord) {
                inWord = true;
                wordNumber++;
            }
            letterNumber++;
            charNumber++;
        }
        else {
            inWord = false;
            punctNumber++;
            charNumber++;
        }
    }

    System.out.println("Words: " + wordNumber);
    System.out.println("Punctuation symbols: " + punctNumber);
    System.out.println("Total letters: " + letterNumber);
    System.out.println("Total chars: " + charNumber);



    return  ;
}




    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text string");
        String s = sc.nextLine();
        analizer(s);

    }





}
