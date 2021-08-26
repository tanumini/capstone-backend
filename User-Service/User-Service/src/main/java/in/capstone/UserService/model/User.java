package in.capstone.UserService.model;

import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;


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
    private Date dob;
    private String email;
    private String pancardno;
    private Long accountno;
    private String accounttype;
    private String basecurrency;
     private Map<String, Float> balance = new HashMap<String, Float>();
//    private Long balance;
    private int pin;

}