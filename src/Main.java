public class Main {
    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.add("Apple");
        basket.add("Apple");
        basket.add("Banana");
        basket.add("Pineapple");
        basket.add("Plum");
        System.out.println(basket.distinct());
        Bouqet bouqet= new Bouqet();
        bouqet.add("Rose");
        bouqet.add("Rose");
        bouqet.add("Lily");
        bouqet.add("Dandelion");
        bouqet.add("AloeVera");
        bouqet.remove("Lily");
        System.out.println(bouqet.getAll());
    }
}
