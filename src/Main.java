public class Main {
    public static void main(String[] args) {
        char harf ='j';
        char[] kalın_harfler = {'a', 'A', 'ı', 'I', 'o', 'O', 'u', 'U'};
        char[] ince_harfler = {'e', 'i', 'ö', 'ü', 'E', 'İ', 'Ö', 'Ü'};
   // bu işlemi case ile de yapılabilir.
        for (int i=0;i<8;i++){
            if (harf==kalın_harfler[i]){
                System.out.println("Bu karakter bir kalın ve sesli harftir.");
                break;
            }
            else if (harf==ince_harfler[i]){
                System.out.println("Bu karakter ince ve sesli harftir");
                break;
            }
            else{
                System.out.println("Bu karakter sesli harf değildir.");
                break;
            }
        }


    }
}