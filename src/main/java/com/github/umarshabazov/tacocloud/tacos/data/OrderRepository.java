package com.github.umarshabazov.tacocloud.tacos.data;

import com.github.umarshabazov.tacocloud.tacos.TacoOrder;
import com.github.umarshabazov.tacocloud.tacos.User;
import org.springframework.data.repository.CrudRepository;

import org.springframework.data.domain.Pageable;
import java.util.List;

public interface OrderRepository extends CrudRepository <TacoOrder, Long> {

    List<TacoOrder> findByUserOrderByPlacedAtDesc(User user, Pageable pageable);
}