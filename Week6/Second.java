public class Second {

    private static final int NUM_OF_LETTER = 26;

    private static final int FIRST_LETTER = 'A';

    public static void main(String[] args) {
        char[] letters = new char[NUM_OF_LETTER];
        for (int i = 0; i < NUM_OF_LETTER; ++i) {
            letters[i] = (char) (FIRST_LETTER + i);
        }    //System.out.println((i + 1) + " " + letters[i]);
        for (char number : letters){
            System.out.print(number + " ");
        }
    }
}
