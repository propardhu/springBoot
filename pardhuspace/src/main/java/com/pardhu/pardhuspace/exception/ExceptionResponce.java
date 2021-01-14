package com.pardhu.pardhuspace.exception;

import java.util.Date;

public class ExceptionResponce {
    private Date timestamp;
    private String message;
    private String detail;

    public ExceptionResponce(Date timestamp, String message, String detail) {
        super();
        this.timestamp = timestamp;
        this.message = message;
        this.detail = detail;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public String getMessage() {
        return message;
    }

    public String getDetail() {
        return detail;
    }
}
