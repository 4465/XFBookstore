package com.atmae.store.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;


/**
 * @author Mae
 */
@Controller
public class MainController {
    @ApiOperation(value = "跳转到登录界面")
    @GetMapping(value = {"/login", "/"})
    public String loginPage() {
        return "login";
    }

    @ApiOperation(value = "跳转到注册界面")
    @GetMapping("/register")
    public String registerPage() {
        return "register";
    }

    @ApiOperation(value = "跳转到登录后的首页")
    @GetMapping("/index")
    public String indexPage() {
        return "index";
    }

    @ApiOperation(value = "跳转到修改密码界面")
    @GetMapping("/changePassword")
    public String changePasswordPage() {
        return "change-psd";
    }

    @ApiOperation(value = "跳转到用户信息界面")
    @GetMapping("/info")
    public String infoPage() {
        return "info";
    }

    @ApiOperation(value = "转到上传头像页面")
    @GetMapping("/avatar")
    public String avatarPage() {
        return "avatar";
    }

    @ApiOperation(value = "转到收货管理页面")
    @GetMapping("/address")
    public String addressPage() {
        return "address";
    }

    @ApiOperation(value = "转到新增收获地址页面")
    @GetMapping("/addAddress")
    public String addAddressPage() {
        return "addAddress";
    }

    @ApiOperation(value = "转到单个商品具体信息页面")
    @GetMapping("/product")
    public String productPage() {
        return "product";
    }

    @ApiOperation(value = "转到购物车页面")
    @GetMapping("/cart")
    public String cartPage() {
        return "cart";
    }

    @ApiOperation(value = "转到商品页面")
    @GetMapping("/buySell")
    public String buySellPage() {
        return "buy-sell";
    }

    @ApiOperation(value = "转到订单确认页面")
    @GetMapping("/orderConfirm")
    public String orderConfirmPage() {
        return "orderConfirm";
    }

    @ApiOperation(value = "转到支付页面")
    @GetMapping("/payment")
    public String paymentPage() {
        return "payment";
    }

    @ApiOperation(value = "注销后转到登录页面")
    @GetMapping("/signOut")
    public String signOut(HttpSession session) {
        /** 销毁session*/
        session.invalidate();
        return "/login";
    }
}


