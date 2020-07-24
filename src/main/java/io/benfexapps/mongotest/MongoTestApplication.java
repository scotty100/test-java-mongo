package io.benfexapps.mongotest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class MongoTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(MongoTestApplication.class, args);
    }

}
