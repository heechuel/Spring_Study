package foodMap.example.domain.post;

import jakarta.persistence.Entity;
import lombok.Getter;

@Entity
//@Getter
public class Post {
    private int post_num;

    private String title;

    private String detail;

    private String location;

    private int rate;

    public Post(){

    }

    public Post(int post_num, String title, String detail, String location, int rate){
        this.post_num = post_num;
        this.title = title;
        this.detail = detail;
        this.location = location;
        this.rate = rate;
    }

    public int getPost_num() {
        return post_num;
    }

    public String getTitle() {
        return title;
    }

    public String getDetail() {
        return detail;
    }

    public String getLocation() {
        return location;
    }

    public int getRate() {
        return rate;
    }
}
