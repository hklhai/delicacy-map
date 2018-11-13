package cn.edu.ncut.food.repository;

import cn.edu.ncut.food.model.Up;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Ocean lin on 2018/11/13.
 *
 * @author Ocean lin
 */
@Repository
public interface UpRepository extends JpaRepository<Up, Integer> {
}
