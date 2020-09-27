package sptvr19.java.searchtostring;
import java.util.Scanner;

public class SPTVR19JavaSearchToString {

    public static void main(String[] args) {
        System.out.println("-- SearchToString --");
        System.out.println("-- by Georg Laabe --");
        
        Scanner scan = new Scanner(System.in);
        
        String text;
        String keyword;
        String replaceword;
        boolean work = true;
        
        System.out.print("\nInput your text: ");
        text = scan.nextLine();
        
        while (work) {
            System.out.print("\n> Choose function (Find[1] / Replace[2] / Text Length[3] / Change Text[4] / Exit[5]): ");
            int main_function = scan.nextInt();
            int replace_function;
            
            switch(main_function) {
                default:
                    System.out.println("Wrong number! Try again!");
                    continue;
                case 1:
                    System.out.print("\nInput the keyword: ");
                    scan.nextLine();
                    keyword = scan.nextLine();
                    System.out.println("\nYour keyword on position: " + (text.indexOf(keyword)+1));
                    break;
                case 2:
                    System.out.print("\nChoose replace function (Replace First[1] / Replace All[2]): ");
                    scan.nextLine();
                    replace_function = scan.nextInt();
                    switch(replace_function) {
                        case 1:
                            System.out.print("\nInput the keyword: ");
                            scan.nextLine();
                            keyword = scan.nextLine();
                            System.out.print("Input the replaceword: ");
                            replaceword = scan.nextLine();                                                       
                            text = text.replaceFirst(keyword, replaceword);
                            System.out.println("\nYour text: " + text);
                            break;
                        case 2:
                            System.out.print("\nInput the keyword: ");
                            scan.nextLine();
                            keyword = scan.nextLine();
                            System.out.print("Input the replaceword: ");
                            replaceword = scan.nextLine();                                                       
                            text = text.replaceAll(keyword, replaceword);
                            System.out.println("\nYour text: " + text);
                            break;         
                    }
                    break;
                case 3:
                    System.out.println("\nThe length of your text (with spaces): " + text.length());
                    break;
                case 4:
                    System.out.print("\nInput your text: ");
                    scan.nextLine();
                    text = scan.nextLine();
                    break;
                case 5:
                    work = false;
                    break;
        }
        }
    }   
}
