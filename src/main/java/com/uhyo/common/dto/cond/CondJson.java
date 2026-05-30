package com.uhyo.common.dto.cond;

import java.util.List;

public class CondJson {
    private int jobId;
    private CustomerDto customer;
    private List<ItemCondDto> items;
    private String requestTime;

    public int getJobId() {
        return jobId;
    }

    public void setJobId(int jobId) {
        this.jobId = jobId;
    }

    public CustomerDto getCustomer() {
        return customer;
    }

    public void setCustomer(CustomerDto customer) {
        this.customer = customer;
    }

    public List<ItemCondDto> getItems() {
        return items;
    }

    public void setItems(List<ItemCondDto> items) {
        this.items = items;
    }

    public String getRequestTime() {
        return requestTime;
    }

    public void setRequestTime(String requestTime) {
        this.requestTime = requestTime;
    }
}
