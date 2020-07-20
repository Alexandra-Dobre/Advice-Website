package com.sda.adviceWebsite.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "Question was not found")
public class QuestionNotFoundException extends RuntimeException{

    @Override
    public String getMessage(){
        return "Not found question";
    }
}
