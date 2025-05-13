package com.crud.srpign_crud.exception;

import lombok.Data;
import lombok.EqualsAndHashCode;


@Data
public class ResourceNotFound extends RuntimeException{
    public ResourceNotFound(String message) {
        super(message);
    }
}
