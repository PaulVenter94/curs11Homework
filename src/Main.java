public class Main {
    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.add("Apple");
        basket.add("Apple");
        basket.add("Banana");
        basket.add("Pineapple");
        basket.add("Plum");
        System.out.println(basket.distinct());
        Bouqet bouqet = new Bouqet();
        bouqet.add("Rose");
        bouqet.add("Rose");
        bouqet.add("Lily");
        bouqet.add("Dandelion");
        bouqet.add("AloeVera");
        bouqet.remove("Lily");
        System.out.println(bouqet.getAll());
        Person stefan = new Person("Stefan", 30, "manager");
        Person bogdan = new Person("Bogdan", 35, "welder");
        Person paul = new Person("Paul", 25, "plummer");
        Person raul = new Person("Raul", 32, "Manager");
        Person razvan = new Person("Razvan", 25, "carpenter");
        Person rares = new Person("Rares", 23, "welder");
        Person rares2 = new Person("Rares", 33, "plummer");
        Company company = new Company();
        company.employ(stefan);
        company.employ(bogdan);
        company.employ(paul);
        company.employ(rares);
        company.employ(rares2);
        company.employ(raul);
        company.employ(razvan);
        company.employ(raul);
        System.out.println(company.getManager());
        System.out.println(company.getPersonName("Raul"));

    }
}
