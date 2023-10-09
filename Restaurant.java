public class Restaurant {
    private String name;
    private int rating;
    private String number;
    private String address;

    public void setName (String restaurantName){
        name = restaurantName;
    }
    public void setRating(int userRating){
        rating = userRating;
    }
    public void setNumber(String restaurantNumber){
        number = restaurantNumber;
    }
    public void setAddress(String restaurantAddress){
        address = restaurantAddress;
    }

    public void print (){
        System.out.println(name + "--" + rating + ", Number: " + number + " & Address: " + address);
    }
    public String getName() {
        return name;
    }
    public int getRating() {
        return rating;
    }
    public String getNumber(){
        return number;
    }
    public String getAddress(){
        return address;
    }
}