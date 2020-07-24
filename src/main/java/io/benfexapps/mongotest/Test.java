package io.benfexapps.mongotest;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Test {

    @Id
    private String id;
}
