package com.heima.behavior.service;

import com.heima.model.behavior.dtos.ShowBehaviorDto;
import com.heima.model.common.dtos.ResponseResult;


public interface AppShowBehaviorService {

    /**
     * 存储行为数据
     * @param dto 行为参数
     * @return ResponseResult
     */
    public ResponseResult saveShowBehavior(ShowBehaviorDto dto);
}
