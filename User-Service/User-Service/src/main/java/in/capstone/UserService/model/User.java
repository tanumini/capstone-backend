package in.capstone.UserService.model;

import lombok.*;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name="tbl_user")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
private int id;
    private String firstname;
    private String lastname;
    private String username;
    private String password;
    private Long phoneno;
    private String dob;
    private String email;
    private String pancardno;
    private Long accountno;
    private Long balance;
    private int pin;

}