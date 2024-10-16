package com.github.umarshabazov.tacocloud.tacos.data;

import com.github.umarshabazov.tacocloud.tacos.Taco;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.repository.CrudRepository;

public interface TacoRepository extends CrudRepository <Taco, Long> {

    Taco findAll (PageRequest pageRequest);

}
