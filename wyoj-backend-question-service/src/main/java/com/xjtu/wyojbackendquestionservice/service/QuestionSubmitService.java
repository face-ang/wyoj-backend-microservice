package com.xjtu.wyojbackendquestionservice.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.xjtu.wyojbackendmodel.model.dto.questionsubmit.QuestionSubmitAddRequest;
import com.xjtu.wyojbackendmodel.model.dto.questionsubmit.QuestionSubmitQueryRequest;
import com.xjtu.wyojbackendmodel.model.entity.QuestionSubmit;
import com.xjtu.wyojbackendmodel.model.entity.User;
import com.xjtu.wyojbackendmodel.model.vo.QuestionSubmitVO;

/**
* @author admin
* @description 针对表【question_submit(题目提交)】的数据库操作Service
* @createDate 2024-11-20 22:33:34
*/
public interface QuestionSubmitService extends IService<QuestionSubmit> {
    /**
     * 题目提交
     *
     * @param questionSubmitAddRequest 题目提交信息
     * @param loginUser
     * @return
     */
    long doQuestionSubmit(QuestionSubmitAddRequest questionSubmitAddRequest, User loginUser);
    /**
     * 获取查询条件
     *
     * @param questionSubmitQueryRequest
     * @return
     */
    QueryWrapper<QuestionSubmit> getQueryWrapper(QuestionSubmitQueryRequest questionSubmitQueryRequest);

    /**cc
     * 获取题目封装
     *
     * @param questionSubmit
     * @param loginUser
     * @return
     */
    QuestionSubmitVO getQuestionSubmitVO(QuestionSubmit questionSubmit, User loginUser);

    /**
     * 分页获取题目封装
     *
     * @param questionSubmitPage
     * @param loginUser
     * @return
     */
    Page<QuestionSubmitVO> getQuestionSubmitVOPage(Page<QuestionSubmit> questionSubmitPage, User loginUser);
}
