package com.github.umarshabazov.tacocloud.tacos.data;

import java.util.UUID;

import com.github.umarshabazov.tacocloud.tacos.TacoOrder;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository <TacoOrder, UUID> {

}