package com.uhyo.common.dto;

/**
 * ジョブ実行結果をサービス間で返すための DTO
 * backend_receive → backend_data_management → backend_ui などで利用される
 */
public class JobResultDto {

    /** ジョブID（リクエストと結果を紐づけるため） */
    private Long jobId;

    /** ジョブの実行結果（SUCCESS / FAILED など） */
    private String result;

    /** 結果の詳細メッセージ */
    private String message;

    public JobResultDto() {}

    public JobResultDto(Long jobId, String result, String message) {
        this.jobId = jobId;
        this.result = result;
        this.message = message;
    }

    public Long getJobId() {
        return jobId;
    }

    public void setJobId(Long jobId) {
        this.jobId = jobId;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
