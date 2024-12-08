package com.xjtu.wyojbackendjudgeservice.judge.codesandbox.impl;

import com.xjtu.wyojbackendjudgeservice.judge.codesandbox.CodeSandbox;
import com.xjtu.wyojbackendmodel.model.codesandbox.ExecuteCodeRequest;
import com.xjtu.wyojbackendmodel.model.codesandbox.ExecuteCodeResponse;

/**
 * 第三方代码沙箱（调用网上已有的代码沙箱）
 */
public class ThirdPartyCodeSandbox implements CodeSandbox {
    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        System.out.println("第三方代码沙箱");
        return null;
    }
}
