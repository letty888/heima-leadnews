package com.heima.article.service;

import com.heima.model.article.dtos.ArticleHomeDto;
import com.heima.model.common.dtos.ResponseResult;

public interface AppArticleService {

    /**
     *文章加载
     * @param dto  文章加载参数
     * @param type 1.加载更多   2.加载最新
     * @return ResponseResult 统一返回对象
     */
    ResponseResult load(ArticleHomeDto dto, Short type);
}
