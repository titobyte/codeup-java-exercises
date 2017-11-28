public class RestaurantDish {

    public static void main(String[] args) {
        RestaurantDish dish = new RestaurantDish();
        dish.costInCents = 10;
        dish.nameOfDish = "Miso";
        dish.wouldRecommend = true;
        dish.eat();

    }
        //instance variables
        public int costInCents;
        public String nameOfDish;
        public boolean wouldRecommend;
        //instance method
        public void eat() {
             System.out.println("Nom nom nom!");
        }


}
