package com.heima.article.service.impl;

import com.heima.article.service.AppArticleService;
import com.heima.model.article.dtos.ArticleHomeDto;
import com.heima.model.common.dtos.ResponseResult;
import org.springframework.stereotype.Service;


/**
 * @author zhang
 */

@Service
public class AppArticleServiceImpl implements AppArticleService {


    @Override
    public ResponseResult load(ArticleHomeDto dto, Short type) {
        return null;
    }
}
