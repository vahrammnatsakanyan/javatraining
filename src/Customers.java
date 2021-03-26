public class Customers {
    private String name;
    private String surname;
    private String favCity;
    private String favAdminRegion;
    private int favArea;
    private int minArea;
    private int maxArea;
    private int limitOfPrice;

    public Customers(String name, String surname, String favCity, String favAdminRegion, int favArea, int minArea, int maxArea, int limitOfPrice)
    {
        this.name = name;
        this.surname = surname;
        this.favCity = favCity;
        this.favAdminRegion = favAdminRegion;
        this.favArea = favArea;
        this.maxArea = maxArea;
        this.minArea = minArea;
        this.limitOfPrice = limitOfPrice;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFavCity() {
        return favCity;
    }

    public void setFavCity(String favCity) {
        this.favCity = favCity;
    }

    public String getFavAdminRegion() {
        return favAdminRegion;
    }

    public void setFavAdminRegion(String favAdminRegion) {
        this.favAdminRegion = favAdminRegion;
    }

    public int getFavArea() {
        return favArea;
    }

    public void setFavArea(int favArea) {
        this.favArea = favArea;
    }

    public int getMinArea() {
        return minArea;
    }

    public void setMinArea(int minArea) {
        this.minArea = minArea;
    }

    public int getMaxArea() {
        return maxArea;
    }

    public void setMaxArea(int maxArea) {
        this.maxArea = maxArea;
    }

    public int getLimitOfPrice() {
        return limitOfPrice;
    }

    public void setLimitOfPrice(int limitOfPrice) {
        this.limitOfPrice = limitOfPrice;
    }
}
