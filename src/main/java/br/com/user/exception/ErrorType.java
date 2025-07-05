package br.com.user.exception;

import lombok.Getter;

@Getter
public enum ErrorType {
    NOT_FOUND("Not found."),
    INVALID_PARAMETER("Invalid parameter."),
    INTERNAL_SERVER_ERROR("Internal server error.");
    private final String title;

    ErrorType(String title) {
        this.title = title;
    }
}

