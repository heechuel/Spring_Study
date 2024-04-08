package foodMap.example.domain.user;


import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Entity
//@Getter
//@AllArgsConstructor
public class User {
    private int user_num;

    private String user_id;

    private String password;

    private String name;



    public User(int user_num, String user_id, String password, String name){
        this.user_num = user_num;
        this.user_id = user_id;
        this.password = password;
        this.name = name;
    }

    public int getUser_num() {
        return user_num;
    }

    public String getUser_id() {
        return user_id;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }
}
