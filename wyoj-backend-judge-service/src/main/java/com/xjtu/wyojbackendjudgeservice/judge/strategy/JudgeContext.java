package com.xjtu.wyojbackendjudgeservice.judge.strategy;


import com.xjtu.wyojbackendmodel.model.codesandbox.JudgeInfo;
import com.xjtu.wyojbackendmodel.model.dto.question.JudgeCase;
import com.xjtu.wyojbackendmodel.model.entity.Question;
import com.xjtu.wyojbackendmodel.model.entity.QuestionSubmit;
import lombok.Data;

import java.util.List;
/**
 * 上下文（用于定义在策略中传递的参数）
 */
@Data
public class JudgeContext {
    private JudgeInfo judgeInfo;
    private List<String> inputList;
    private List<String> outputList;
    private List<JudgeCase>judgeCaseList;
    private Question question;
    private QuestionSubmit questionSubmit;
}
