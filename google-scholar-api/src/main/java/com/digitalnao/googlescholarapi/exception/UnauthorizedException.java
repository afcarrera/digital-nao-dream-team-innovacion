package com.digitalnao.googlescholarapi.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.client.HttpClientErrorException;

@ResponseStatus(HttpStatus.UNAUTHORIZED)
public class UnauthorizedException extends HttpClientErrorException {
    private static final long serialVersionUID = 1L;
    public UnauthorizedException(HttpStatus httpStatus) {
        super(httpStatus);
    }
}
