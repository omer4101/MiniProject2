public class Main {
    public static void main(String[] args) {
        char letter ='j';
        char[] bold_letter = {'a', 'A', 'ı', 'I', 'o', 'O', 'u', 'U'};
        char[] thin_letter = {'e', 'i', 'ö', 'ü', 'E', 'İ', 'Ö', 'Ü'};
   // bu işlemi case ile de yapılabilir.
        for (int i=0;i<8;i++){
            if (letter==bold_letter[i]){
                System.out.println("This character is a bold and vowel.");
                break;
            }
            else if (letter==thin_letter[i]){
                System.out.println("This character is thin and vowel.");
                break;
            }
            else{
                System.out.println("This character is not a vowel.");
                break;
            }
        }
    }
}