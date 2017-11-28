public class BurgerTools {
    public static void main(String[] args) {
        BurgerTools tools = new BurgerTools();
        tools.averageDaysBeforeExpiration = 10;
        tools.mostPopularTopping = "cheese";
        tools.temperatureWhenCooked = 150;
        tools.grill();


    }
    public String mostPopularTopping;
    public int averageDaysBeforeExpiration;
    public int temperatureWhenCooked;
    public void grill(){
        System.out.println("Grilling burger");
    }
}
