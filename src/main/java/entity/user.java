package entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "users")
public class user {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer id;
private String userName;
private String password;
private String repeatPassword;
private String mail;


}
