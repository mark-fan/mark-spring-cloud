package com.mark.client.service;

import com.mark.common.dto.ResponseResult;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author luofan
 */
public interface Client1Service {

    public ResponseResult<String> getClient(@RequestBody String forecastRequest);

}
