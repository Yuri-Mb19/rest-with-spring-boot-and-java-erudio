package br.com.erudio;

import br.com.erudio.model.Person;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

@Service
public class PersonServices {

    private final AtomicLong counter = new AtomicLong();

    private Logger logger = Logger.getLogger(PersonServices.class.getName());

    public Person findById(String id){
        logger.info("Finding One Person!");

        Person person = new Person();
        person.setId(counter.incrementAndGet());

        person.setFirstName("Leandro");
        person.setLastName("Costa");
        person.setAddress("Moçambique - Maputo - Zimpeto");
        person.setGender("Leandro");
        return person;
    }
}
