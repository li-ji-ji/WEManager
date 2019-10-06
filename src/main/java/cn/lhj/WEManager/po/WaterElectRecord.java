package cn.lhj.WEManager.po;

import java.util.Date;

public class WaterElectRecord {
    private Integer id;

    private String houseId;

    private Integer costStatus;

    private Date costTime;

    private Date recordTime;

    private Double lastElectNum;

    private Double thisElectNum;

    private Double electNum;

    private Double electCost;

    private Double lastWaterNum;

    private Double thisWaterNum;

    private Double waterNum;

    private Double waterCost;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHouseId() {
        return houseId;
    }

    public void setHouseId(String houseId) {
        this.houseId = houseId == null ? null : houseId.trim();
    }

    public Integer getCostStatus() {
        return costStatus;
    }

    public void setCostStatus(Integer costStatus) {
        this.costStatus = costStatus;
    }

    public Date getCostTime() {
        return costTime;
    }

    public void setCostTime(Date costTime) {
        this.costTime = costTime;
    }

    public Date getRecordTime() {
        return recordTime;
    }

    public void setRecordTime(Date recordTime) {
        this.recordTime = recordTime;
    }

    public Double getLastElectNum() {
        return lastElectNum;
    }

    public void setLastElectNum(Double lastElectNum) {
        this.lastElectNum = lastElectNum;
    }

    public Double getThisElectNum() {
        return thisElectNum;
    }

    public void setThisElectNum(Double thisElectNum) {
        this.thisElectNum = thisElectNum;
    }

    public Double getElectNum() {
        return electNum;
    }

    public void setElectNum(Double electNum) {
        this.electNum = electNum;
    }

    public Double getElectCost() {
        return electCost;
    }

    public void setElectCost(Double electCost) {
        this.electCost = electCost;
    }

    public Double getLastWaterNum() {
        return lastWaterNum;
    }

    public void setLastWaterNum(Double lastWaterNum) {
        this.lastWaterNum = lastWaterNum;
    }

    public Double getThisWaterNum() {
        return thisWaterNum;
    }

    public void setThisWaterNum(Double thisWaterNum) {
        this.thisWaterNum = thisWaterNum;
    }

    public Double getWaterNum() {
        return waterNum;
    }

    public void setWaterNum(Double waterNum) {
        this.waterNum = waterNum;
    }

    public Double getWaterCost() {
        return waterCost;
    }

    public void setWaterCost(Double waterCost) {
        this.waterCost = waterCost;
    }
}