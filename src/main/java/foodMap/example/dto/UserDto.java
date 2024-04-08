package foodMap.example.dto;


public class UserDto {
    private final String user_id;
    private final String password;
    private final String name;

    public UserDto(String userId, String password, String name) {
        user_id = userId;
        this.password = password;
        this.name = name;
    }
}
