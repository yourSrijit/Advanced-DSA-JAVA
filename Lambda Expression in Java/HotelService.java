package LambdaExpression;

import java.util.ArrayList;
import java.util.List;

public class HotelService {
    List<Hotel> Hotels =new ArrayList<>();
   public HotelService(){
       Hotels.add(new Hotel(2000,2,HotelType.THREE_STAR));
       Hotels.add(new Hotel(7000,5,HotelType.FOUR_STAR));
       Hotels.add(new Hotel(5000,5,HotelType.TWO_STAR));
       Hotels.add(new Hotel(3000,5,HotelType.FIVE_STAR));
       Hotels.add(new Hotel(9000,3,HotelType.TWO_STAR));
       Hotels.add(new Hotel(2900,1,HotelType.THREE_STAR));
    }
    private boolean isHotelLessthan(int price,Hotel hotel){
          if(hotel.getPricePerNight()<=price){
              return true;
          }
          return false;
    }
    public List<Hotel> filterHotelLessThan(int price){
       List<Hotel> filterHotel=new ArrayList<>();
       for(Hotel hotel:Hotels){
           if(isHotelLessthan( price, hotel)){
               filterHotel.add(hotel);
           }
       }
      return filterHotel;
    }
    private boolean isHotelFivestar(Hotel hotel){
       if(hotel.getHotelType()==(HotelType.FIVE_STAR)){
           return true;
        }
        return false;
    }
    public List<Hotel> filterHotelByStar(){
        List<Hotel> filterHotel=new ArrayList<>();
        for(Hotel hotel:Hotels){
            if(isHotelFivestar( hotel)){
                filterHotel.add(hotel);
            }
        }
        return filterHotel;
    }

    public static void main(String[] args) {
       HotelService ob =new HotelService();
       List<Hotel> list=ob.filterHotelLessThan(5000);
        System.out.println(list);
    }
}
