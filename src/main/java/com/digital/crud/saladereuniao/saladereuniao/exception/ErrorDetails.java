package com.digital.crud.saladereuniao.saladereuniao.exception;

import java.util.Date;

public class ErrorDetails {

    private Date timestamp;
    private String massage;
    private String details;

    public Date getTimestamp() {
        return timestamp;
    }

    public String getMassage() {
        return massage;
    }

    public String getDetails() {
        return details;
    }

    public ErrorDetails(Date timestamp, String massage, String details) {
        super();
        this.timestamp = timestamp;
        this.massage = massage;
        this.details = details;
    }
}
