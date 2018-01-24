package ooplab7;

public class supercar {

    private String brand;
    private String color;
    private String enginesize;
    private String maxspeed;
    private String country;

    public supercar(){}

    public supercar(String b, String cl, String e,String m,String c){
        this.brand = b;
        this.color = cl;
        this.enginesize = e;
        this.maxspeed = m;
        this.country = c;
    }

    @Override
    public String toString() {
        return "supercar{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", enginesize='" + enginesize + '\'' +
                ", maxspeed='" + maxspeed + '\'' +
                ", country='" + country + '\'' +
                '}';
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEnginesize() {
        return enginesize;
    }

    public void setEnginesize(String enginesize) {
        this.enginesize = enginesize;
    }

    public String getMaxspeed() {
        return maxspeed;
    }

    public void setMaxspeed(String maxspeed) {
        this.maxspeed = maxspeed;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
} //class

