package cn.lhj.WEManager.po;

import java.util.Date;

public class WaterRecord {
    private Integer id;

    private String houseId;

    private Date recordTime;

    private Double lastNum;

    private Double thisNum;

    private Double useNum;

    private Double costNum;

    private Integer costStatus;

    private Date costTime;

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

    public Date getRecordTime() {
        return recordTime;
    }

    public void setRecordTime(Date recordTime) {
        this.recordTime = recordTime;
    }

    public Double getLastNum() {
        return lastNum;
    }

    public void setLastNum(Double lastNum) {
        this.lastNum = lastNum;
    }

    public Double getThisNum() {
        return thisNum;
    }

    public void setThisNum(Double thisNum) {
        this.thisNum = thisNum;
    }

    public Double getUseNum() {
        return useNum;
    }

    public void setUseNum(Double useNum) {
        this.useNum = useNum;
    }

    public Double getCostNum() {
        return costNum;
    }

    public void setCostNum(Double costNum) {
        this.costNum = costNum;
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
}