package cn.edu.ncut.food.controller;

import cn.edu.ncut.food.common.IConstants;
import cn.edu.ncut.food.model.Restaurant;
import cn.edu.ncut.food.model.base.Message;
import cn.edu.ncut.food.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Ocean Lin on 2018/11/12.
 *
 * @author Lin
 */
@Controller
public class IndexController {


    @Autowired
    private FoodService foodService;

    /**
     * index
     *
     * @return
     */
    @RequestMapping("/")
    public String index() {
        return "user/index";
    }

    @ResponseBody
    @RequestMapping(value = "/addRestaurant", method = RequestMethod.POST)
    public Message addRestaurant(Restaurant restaurant) {
        Message message;
        try {
            foodService.addRestaurant(restaurant);
            message = new Message(IConstants.SUCCESS, IConstants.ADDSUCCESS);
        } catch (Exception e) {
            message = new Message(IConstants.FAIL, IConstants.ADDFAIL);
            e.printStackTrace();
        }
        return message;
    }


}
