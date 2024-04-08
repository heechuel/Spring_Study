package foodMap.example.domain.place;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Entity
//@Getter
//@AllArgsConstructor
public class Place {
    private int place_num;

    private String name;

    private String address;

    public Place(){
    }

    public Place(int place_num, String name, String address){

        this.place_num = place_num;
        this.name = name;
        this.address = address;
    }

    public int getPlace_num() {
        return place_num;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
}
