package com.github.umarshabazov.tacocloud.tacos.data;

import java.util.Optional;
import com.github.umarshabazov.tacocloud.tacos.TacoOrder;

public interface OrderRepository {
    TacoOrder save(TacoOrder order);
}