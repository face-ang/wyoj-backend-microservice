package com.xjtu.wyojbackendjudgeservice.judge;


import com.xjtu.wyojbackendjudgeservice.judge.strategy.DefaultJudgeStrategy;
import com.xjtu.wyojbackendjudgeservice.judge.strategy.JavaLanguageJudgeStrategy;
import com.xjtu.wyojbackendjudgeservice.judge.strategy.JudgeContext;
import com.xjtu.wyojbackendjudgeservice.judge.strategy.JudgeStrategy;
import com.xjtu.wyojbackendmodel.model.codesandbox.JudgeInfo;
import com.xjtu.wyojbackendmodel.model.entity.QuestionSubmit;
import org.springframework.stereotype.Service;

/**
 * 判题管理（简化调用）
 */
@Service
public class JudgeManager {
    /**
     * 执行判题
     * @param judgeContext
     * @return
     */
    JudgeInfo doJudge(JudgeContext judgeContext){
        QuestionSubmit questionSubmit = judgeContext.getQuestionSubmit();
        String language = questionSubmit.getLanguage();
        JudgeStrategy judgeStrategy = new DefaultJudgeStrategy();
        if("java".equals(language)){
            judgeStrategy = new JavaLanguageJudgeStrategy();
        }
        return judgeStrategy.doJudge(judgeContext);
    }
}
