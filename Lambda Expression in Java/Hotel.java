package LambdaExpression;

public class Hotel {
    public int pricePerNight;
    public int rating;
    public HotelType hotelType;
    Hotel(int pricePerNight,int rating,HotelType hotelType){
        this.pricePerNight=pricePerNight;
        this.rating=rating;
        this.hotelType=hotelType;
    }

    public int getPricePerNight() {
        return pricePerNight;
    }

    public void setPricePerNight(int pricePerNight) {
        this.pricePerNight = pricePerNight;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public HotelType getHotelType() {
        return hotelType;
    }

    public void setHotelType(HotelType hotelType) {
        this.hotelType = hotelType;
    }
    @Override
    public String toString() {
        return  "Price: " + pricePerNight + ", Rating: " + rating + ", Type: " + hotelType;
    }
}
