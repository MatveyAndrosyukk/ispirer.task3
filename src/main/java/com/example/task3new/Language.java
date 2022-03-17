package com.example.task3new;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class Language {
    private String message;

    public Language(String message) {
        this.message = message;
    }

    public Language() {
    }
}
