package com.uhyo.common.dto.cond;

public class JobResponse {
    private int jobId;
    private String status;
    private String message;
    private int receivedItems;

    public int getJobId() {
        return jobId;
    }

    public void setJobId(int jobId) {
        this.jobId = jobId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getReceivedItems() {
        return receivedItems;
    }

    public void setReceivedItems(int receivedItems) {
        this.receivedItems = receivedItems;
    }
}
