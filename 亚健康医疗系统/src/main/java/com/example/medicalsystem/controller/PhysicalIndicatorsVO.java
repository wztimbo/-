package com.example.medicalsystem.controller;

import lombok.Data;

/**
 * 身体常见指标模型
 */
@Data
public class PhysicalIndicatorsVO {
    /**
     * 主键id
     */
    private String id;
    /**
     * 体温
     */
    private String bodyTemperature;
    /**
     * 脉搏
     */
    private String pulse;
    /**
     * 血压（收缩压）
     */
    private String systolicBloodPressure;
    /**
     * 血压（舒张压）
     */
    private String diastolicBloodPressure;
    /**
     * 血氧饱和度
     */
    private String bloodOxygenSaturation;
    /**
     * 血糖
     */
    private String bloodGlucose;
    /**
     * 呼吸频率
     */
    private String respiratoryRate;
    /**
     * BMI指数
     */
    private String bmi;
}
