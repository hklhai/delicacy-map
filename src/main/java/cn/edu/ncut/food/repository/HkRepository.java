package cn.edu.ncut.food.repository;

import cn.edu.ncut.food.model.Hk;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Ocean lin on 2018/11/13.
 *
 * @author Ocean lin
 */
@Repository
public interface HkRepository extends JpaRepository<Hk, Integer> {
}
