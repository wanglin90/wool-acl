package com.wool.acl.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.AbstractMessageSource;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

import java.util.Locale;
import java.util.Objects;

/**
 * Created by wanglin on 16-10-8.
 */
public class ErrorCode {

    private static final Logger log = LoggerFactory.getLogger(ErrorCode.class);

    private static final String ERROR_MSG_FORMAT = "error.%d";

    private static AbstractMessageSource messageSource = null;

    // system error code 0 ~ 10
    public static final int SYS_SUCCESS = 0;
    public static final int SYS_ERROR = 1;
    public static final int SYS_REQ_ERROR = 2;

    // other error code manual specified
    public static final int USER_RECORD_NOT_EXIST = 1001;


    public static String getErrorMsg(int errorCode, Objects[] objectses, Locale locale, ReloadableResourceBundleMessageSource messageSource) {

        if (errorCode < 0) {
            log.error("==> getErrorMsg errorCode must can not be less than 0, errorCode = {}",errorCode);
            throw new IllegalArgumentException("errorCode can not be less than 0");
        }

        if (messageSource == null) {
            log.error("==> getErrorMsg can not get message because message bundle source is null.");
            return String.format("errorCode = %d , get message source fail.", errorCode);
        }

        String message = messageSource.getMessage(String.format(ERROR_MSG_FORMAT, errorCode), objectses, locale == null ? Locale.CHINA : locale);

        if (message == null) {
            message = String.format("errorCode = %d , get message source fail . ", errorCode);
        }
        return message;
    }


    public static String getErrorMsg(int errorCode,ReloadableResourceBundleMessageSource messageSource) {
        return getErrorMsg(errorCode,null,null,messageSource);
    }

    public static void setMessageSource(AbstractMessageSource messageSource) {
        ErrorCode.messageSource = messageSource;
    }
}
