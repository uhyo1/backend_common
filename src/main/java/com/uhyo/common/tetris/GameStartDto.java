/*
  File: GameStartDto.java
  Role: テトリスのゲーム開始ログを保持する DTO（backend_ui → backend_data_management の通信で使用）
  Created: 2026-07-12
  Author: Seiji
*/

package com.uhyo.common.tetris;

public class GameStartDto {

    private String userId;     // ユーザーID（必要なら後で拡張）
    private String startTime;  // ゲーム開始時刻（ISO形式）

    public GameStartDto() {}

    public GameStartDto(String userId, String startTime) {
        this.userId = userId;
        this.startTime = startTime;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }
}
