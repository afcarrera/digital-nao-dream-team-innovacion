package com.digitalnao.googlescholarapi.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.client.HttpClientErrorException;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class FormatException extends HttpClientErrorException {
    private static final long serialVersionUID = 1L;
    public FormatException(HttpStatus httpStatus) {
        super(httpStatus);
    }
}