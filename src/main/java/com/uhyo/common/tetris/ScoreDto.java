/*
  File: ScoreDto.java
  Role: テトリスのスコア情報を保持する DTO（backend_ui → backend_data_management の通信で使用）
  Created: 2026-07-12
  Author: Seiji
*/

package com.uhyo.common.tetris;

public class ScoreDto {

    private int score;     // スコア
    private int lines;     // 消したライン数
    private int level;     // レベル
    private int duration;  // プレイ時間（秒）

    public ScoreDto() {}

    public ScoreDto(int score, int lines, int level, int duration) {
        this.score = score;
        this.lines = lines;
        this.level = level;
        this.duration = duration;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getLines() {
        return lines;
    }

    public void setLines(int lines) {
        this.lines = lines;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
