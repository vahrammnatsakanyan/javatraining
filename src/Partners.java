public class Partners {
    private String companyName;
    private String buidingCity;
    private String buildingAdminRegion;
    private int apartamentArea;
    private int price;

    public Partners(String companyName, String buidingCity, String buildingAdminRegion, int apartamentArea, int price) {
        this.companyName = companyName;
        this.buidingCity = buidingCity;
        this.buildingAdminRegion = buildingAdminRegion;
        this.apartamentArea = apartamentArea;
        this.price = price;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getBuidingCity() {
        return buidingCity;
    }

    public void setBuidingCity(String buidingCity) {
        this.buidingCity = buidingCity;
    }

    public String getBuildingAdminRegion() {
        return buildingAdminRegion;
    }

    public void setBuildingAdminRegion(String buildingAdminRegion) {
        this.buildingAdminRegion = buildingAdminRegion;
    }

    public int getApartamentArea() {
        return apartamentArea;
    }

    public void setApartamentArea(int apartamentArea) {
        this.apartamentArea = apartamentArea;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}


