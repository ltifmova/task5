package dto;

import lombok.Data;

@Data
public class ResetPasswordDto {
    private String mail;

    private String newPassword;
    private String confirmPassword;
}
