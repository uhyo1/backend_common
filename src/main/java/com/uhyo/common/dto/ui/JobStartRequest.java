package com.uhyo.common.dto.ui;

import java.util.List;

public class JobStartRequest {
    private int customerId;
    private List<Integer> itemIds;

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public List<Integer> getItemIds() {
        return itemIds;
    }

    public void setItemIds(List<Integer> itemIds) {
        this.itemIds = itemIds;
    }
}
