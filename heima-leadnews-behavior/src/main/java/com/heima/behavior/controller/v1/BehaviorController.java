package com.heima.behavior.controller.v1;

import com.heima.article.apis.BehaviorControllerApi;
import com.heima.behavior.service.AppShowBehaviorService;
import com.heima.model.behavior.dtos.ShowBehaviorDto;
import com.heima.model.common.dtos.ResponseResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhang
 */
@RestController
@RequestMapping("/api/v1/behavior")
public class BehaviorController implements BehaviorControllerApi {

    private final AppShowBehaviorService appShowBehaviorService;

    public BehaviorController(AppShowBehaviorService appShowBehaviorService) {
        this.appShowBehaviorService = appShowBehaviorService;
    }

    @Override
    @PostMapping("/show_behavior")
    public ResponseResult saveShowBehavior(@RequestBody ShowBehaviorDto dto) {
        return appShowBehaviorService.saveShowBehavior(dto);
    }

}
