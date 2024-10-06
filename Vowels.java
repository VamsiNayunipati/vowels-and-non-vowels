import java.util.Scanner;

public class Vowels
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a string: ");
        String str = scanner.nextLine();
        int count_a = 0, count_e = 0, count_i = 0, count_o = 0, count_u = 0;
        int nonVowelsCount = 0;
        for (int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            switch (ch)
            {
                case 'a': case 'A':
                {
                    count_a++;
                    break;
                }
                case 'e': case 'E':
                {
                    count_e++;
                    break;
                }
                case 'i': case 'I':
                {
                    count_i++;
                    break;
                }
                case 'o': case 'O':
                {
                    count_o++;
                    break;
                }
                case 'u': case 'U':
                {
                    count_u++;
                    break;
                }
                default:
                    if (Character.isLetter(ch)) {
                        nonVowelsCount++;
                    }
            }
        }

        System.out.println("Vowels count ==> a: " + count_a + ", e: " + count_e + ", i: " + count_i + 
                           ", o: " + count_o + ", u: " + count_u + ", non-vowels count: " + nonVowelsCount);
        
        scanner.close();
    }
}
