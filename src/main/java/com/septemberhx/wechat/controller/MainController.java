package com.septemberhx.wechat.controller;

import com.hitices.common.bean.MResponse;
import com.hitices.mclient.annotation.MFuncDescription;
import com.hitices.mclient.annotation.MLogFunction;
import com.hitices.mclient.base.MObject;
import com.septemberhx.wechat.utils.MBaseUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @author SeptemberHX
 * @version 0.1
 * @date 2020/3/31
 */
@Controller
public class MainController extends MObject {

    private Logger logger = LogManager.getLogger(this);

    @PostMapping(path = "/pay")
    @ResponseBody
    @MFuncDescription(value = "pay", level = 4)
    @MLogFunction
    public MResponse pay(@RequestBody MResponse params, HttpServletRequest request) {
        return MBaseUtils.generateResInKBSize(5);
    }
}
