package com.wool.acl.exception;

/**
 * Created by wanglin on 17-1-20.
 */
public class WoolException extends RuntimeException {

    private Integer errorCode;
    private String message;

    public WoolException() {
        super();
    }

    public WoolException(Integer errorCode) {
        this.errorCode = errorCode;
    }

    public WoolException(Integer errorCode, String message) {
        this.errorCode = errorCode;
        this.message = message;
    }

    public Integer getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
