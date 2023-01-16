package com.mark.client.service.impl;

import com.mark.client.service.Client1Service;
import com.mark.common.dto.ResponseResult;
import org.springframework.stereotype.Service;

/**
 * @author luofan
 */
@Service
public class ClientServiceImpl implements Client1Service {
    @Override
    public ResponseResult<String> getClient(String input) {
        return ResponseResult.success("getClient ok" + input);
    }
}
