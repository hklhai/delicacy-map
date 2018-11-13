package cn.edu.ncut.food.service;

import cn.edu.ncut.food.model.Restaurant;
import cn.edu.ncut.food.repository.RestaurantRepository;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Ocean lin on 2018/11/12.
 *
 * @author Ocean lin
 */
@Service("foodService")
public class FoodServiceImpl implements FoodService {
    private final static Logger logger = Logger.getLogger(FoodServiceImpl.class);

    @Autowired
    private RestaurantRepository restaurantRepository;

    @Transactional(rollbackFor = Exception.class)
    @Override
    public void addRestaurant(Restaurant restaurant) {
        restaurantRepository.save(restaurant);
    }
}
