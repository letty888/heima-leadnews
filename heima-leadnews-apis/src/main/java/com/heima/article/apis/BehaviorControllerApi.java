package com.heima.article.apis;

import com.heima.model.behavior.dtos.ShowBehaviorDto;
import com.heima.model.common.dtos.ResponseResult;

/**
 * 行为
 * @author zhang
 *
 */
public interface BehaviorControllerApi {
    ResponseResult saveShowBehavior(ShowBehaviorDto dto);
}
