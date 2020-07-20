package com.sda.adviceWebsite.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "Question content should not be null")
public class QuestionContentNotFoundException extends RuntimeException {

    @Override
    public String getMessage(){
        return "Question content was null, write something";
    }
}
