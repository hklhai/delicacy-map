package cn.edu.ncut.food.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Ocean Lin on 2018/11/12.
 *
 * @author Lin
 */
@Controller
public class IndexController {

    /**
     * index
     *
     * @return
     */
    @RequestMapping("/")
    public String index() {
        return "user/index";
    }

}
