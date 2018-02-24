package org.webapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;


@SpringBootApplication
@EntityScan("org.model")    // As the 'Topic' entity is defined in a different Maven module, it is necessary to specify the location of the entities to scan so that Spring can inject them.
public class App 
{
    public static void main( String[] args )
    {
        SpringApplication.run(App.class, args);
    }
}

