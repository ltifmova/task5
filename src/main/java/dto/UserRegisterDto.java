package dto;
import lombok.Data;
@Data
public class UserRegisterDto {
    private String userName;
    private String password;
    private String repeatPassword;
    private String mail;

}
