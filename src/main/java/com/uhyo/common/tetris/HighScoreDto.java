/*
  File: HighScoreDto.java
  Role: テトリスのハイスコア情報を保持する DTO（ハイスコア一覧取得で使用）
  Created: 2026-07-12
  Author: Seiji
*/

package com.uhyo.common.tetris;

public class HighScoreDto {

    private String userId;   // ユーザーID（必要なら後で拡張）
    private int score;       // スコア
    private String date;     // 記録日時（ISO形式）

    public HighScoreDto() {}

    public HighScoreDto(String userId, int score, String date) {
        this.userId = userId;
        this.score = score;
        this.date = date;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
