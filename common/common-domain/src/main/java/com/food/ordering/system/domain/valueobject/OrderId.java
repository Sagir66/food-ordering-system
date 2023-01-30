package com.food.ordering.system.domain.valueobject;

import java.util.UUID;

/**
 * Created By ->  ismalsagir on 30.01.23
 * Project Name -> food-ordering-system
 */
public class OrderId extends BaseId<UUID> {

    public OrderId(UUID value){
        super(value);
    }
}
