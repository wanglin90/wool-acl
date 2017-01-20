package com.wool.acl.utils;

import com.wool.acl.model.WoolResponse;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

/**
 * Created by wanglin on 16-10-8.
 */
public class Utils {

    /**
     * return right response , status is 0 , message of specified .
     * @param message
     * @param content
     * @return
     */
    public static WoolResponse getRightResponse(String message, Object content) {
        WoolResponse response = new WoolResponse();
        response.setStatus(0);
        response.setMessage(message);
        response.setContent(content);
        return response;
    }

    /**
     * return error response , status is errorCode specified , message is correspond to errorCode bundled .
     * @param errorCode
     * @param messageSource
     * @return
     */
    public static WoolResponse getErrorResponse(int errorCode, ReloadableResourceBundleMessageSource messageSource) {
        WoolResponse response = new WoolResponse();
        response.setStatus(errorCode);
        response.setMessage(ErrorCode.getErrorMsg(errorCode,messageSource));
        return response;
    }
}
