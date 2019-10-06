package cn.lhj.WEManager.po;

public class Householder {
    private Integer id;

    private String houseId;

    private String househoulderName;

    private Integer status;

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

    public String getHousehoulderName() {
        return househoulderName;
    }

    public void setHousehoulderName(String househoulderName) {
        this.househoulderName = househoulderName == null ? null : househoulderName.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}