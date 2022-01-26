// Nice work! We'll be covering Lists and ArrayLists next week. You have a headstart ;)

import java.util.ArrayList;

public class HeartsClient {
    public static void main(String[] args) throws Exception {
        createHearts();
    }

    public static void createHearts(){
        //String color, int Size, String Sayings, int Calories, double Cost, boolean available, int stock
        Heart Group1 = new Heart("red", 3, "Hi", 5, 5.00, true, 50);
        Heart Group2 = new Heart("teal", 5, "Love CS-A", 5, 4.50, true, 200);
        Heart Group3 = new Heart("green", 2, "Go Girl!", 5, 3.50, true, 75);
        System.out.println(Group1.getReport());
        ArrayList<Heart> Store = new ArrayList<Heart>();
        Store.add(Group1);
        Store.add(Group2);
        Store.add(Group3);
        System.out.println(buyOut(Store));
        System.out.println(purchase(2, 3, 4));

    }

    public static int buyOut(ArrayList<Heart> arraybuy){
        return arraybuy.size();
    }

    public static float purchase(int valr, int valt, int valg) {
        ArrayList<Heart> cart = new ArrayList<Heart>();
            cartQuickAdd(cart, new Heart("red", 3, "Hi", 5, 5.00, true, valr), valr);
            cartQuickAdd(cart, new Heart("teal", 5, "Love CS-A", 5, 4.50, true, valt), valt);
            cartQuickAdd(cart, new Heart("green", 2, "Go Girl!", 5, 3.50, true, valg), valg);
        float fPrice = 0;
        for (Heart heart : cart) {
            fPrice += heart.getCost();
        }

        return fPrice;
    }

    public static void cartQuickAdd(ArrayList<Heart> tlist, Heart theart, int amm) {
        for (int index = 0; index < amm; index++) {
            tlist.add(theart);
        }
    }



}
