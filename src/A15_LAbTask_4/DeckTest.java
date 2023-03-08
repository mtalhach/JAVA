package A15_LAbTask_4;

public class DeckTest {
    public static void main(String[] args) {
        DeckOfCards obj=new DeckOfCards();

        for (int i=1;i<=52;i++){
            System.out.printf("%-19s",obj.dealCards().display());
            if(i%4==0){
                System.out.println();
            }
        }
    }
}
