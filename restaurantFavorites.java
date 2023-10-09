public class restaurantFavorites {
    public static void main(String[] args){
        Restaurant favLunchPlace = new Restaurant();
        Restaurant favDinnerPlace = new Restaurant();

        favLunchPlace.setName("Central Deli");
        favLunchPlace.setRating(4);
        favLunchPlace.setNumber("619-763-9021");
        favLunchPlace.setAddress("1242 Walabe Way, San Diego");

        favDinnerPlace.setName("Friends Cafe");
        favDinnerPlace.setRating(5);
        favDinnerPlace.setNumber("619-219-046");
        favDinnerPlace.setAddress("2164 El Cajon Blvd, San Diego");
        

        System.out.println("My fav restaurants: ");
        favLunchPlace.print();
        favDinnerPlace.print();
    }
}
