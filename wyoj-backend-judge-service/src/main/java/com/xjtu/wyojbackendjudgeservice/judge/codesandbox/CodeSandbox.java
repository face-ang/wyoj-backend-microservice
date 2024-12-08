package com.xjtu.wyojbackendjudgeservice.judge.codesandbox;

import com.xjtu.wyojbackendmodel.model.codesandbox.ExecuteCodeRequest;
import com.xjtu.wyojbackendmodel.model.codesandbox.ExecuteCodeResponse;

/**
 * 代码沙箱接口定义
 */
public interface CodeSandbox {
    /**
     * 执行代码
     * @param executeCodeRequest
     * @return
     */
    ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest);
}
