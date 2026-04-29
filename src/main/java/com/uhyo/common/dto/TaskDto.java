package com.uhyo.common.dto;

/**
 * タスク情報をサービス間で受け渡すための DTO（データ転送オブジェクト）
 * UI → data_management → send → receive など、複数サービスで共通利用する
 */
public class TaskDto {

    /** タスクID（DBの主キーなど） */
    private Long id;

    /** タスクのタイトル */
    private String title;

    /** タスクの状態（例：NEW, PROCESSING, DONE） */
    private String status;

    /** デフォルトコンストラクタ（JSON 変換に必要） */
    public TaskDto() {}

    /** 全フィールドを指定するコンストラクタ */
    public TaskDto(Long id, String title, String status) {
        this.id = id;
        this.title = title;
        this.status = status;
    }

    // Getter / Setter（サービス間通信で必要）

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
