package pe.ineapp.ineapppersonaservice.Person;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Entity(name="Person")
@Table(
        name="tbl_person",
        uniqueConstraints = {
                @UniqueConstraint(name = "person_email_unique", columnNames = "email"),
                @UniqueConstraint(name = "person_dni_unique", columnNames = "dni"),
        }
)
@Data    //esto es por los getters and setters
@Builder
public class Person {

    @SequenceGenerator(
        name="person_sequence",
        sequenceName="person_sequence",
        allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "person_sequence"
    )
    @Id
    Long id;
    String name;
    String lastName;
    String dni;
    String email;
    LocalDate birthDate;


}
