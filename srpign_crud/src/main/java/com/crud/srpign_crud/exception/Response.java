package com.crud.srpign_crud.exception;

import lombok.Data;

@Data
public class Response {
    private Object timeStamps;
    private Object status;
    private Object message;

    public Response(Object timeStamps, Object status, Object message) {
        this.timeStamps = timeStamps;
        this.status = status;
        this.message = message;
    }
}
