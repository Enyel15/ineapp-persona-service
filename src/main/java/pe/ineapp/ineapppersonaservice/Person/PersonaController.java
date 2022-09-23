package pe.ineapp.ineapppersonaservice.Person;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonaController {

    @GetMapping
    @RequestMapping("/getAll")
    public List<Person> getAll(){

        LocalDate date = LocalDate.of(2022, Month.MARCH,15);

        Person person = Person.builder()
                .id(1L)
                .name("Angel")
                .lastName("Paredes")
                .dni("23453123")
                .email("abc@gmail.com")
                .birthDate(date).build();

        return List.of(person);
    }

    @GetMapping
    @RequestMapping("/getById")
    public Person getById(){
        LocalDate date = LocalDate.of(2022, Month.MARCH,15);

        Person person = Person.builder()
                .id(1L)
                .name("Angel")
                .lastName("Paredes")
                .dni("23453123")
                .email("abc@gmail.com")
                .birthDate(date).build();

        return person;
    }






}
