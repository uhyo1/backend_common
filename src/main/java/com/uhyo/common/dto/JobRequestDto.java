package com.uhyo.common.dto;

/**
 * ジョブ実行を依頼するための DTO
 * backend_ui → backend_data_management → backend_send などで利用される
 */
public class JobRequestDto {

    /** ジョブの種類（例：SEND_MAIL, EXPORT_DATA など） */
    private String jobType;

    /** ジョブに必要なパラメータ（JSON文字列などでもOK） */
    private String payload;

    public JobRequestDto() {}

    public JobRequestDto(String jobType, String payload) {
        this.jobType = jobType;
        this.payload = payload;
    }

    public String getJobType() {
        return jobType;
    }

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    public String getPayload() {
        return payload;
    }

    public void setPayload(String payload) {
        this.payload = payload;
    }
}
