package cn.lhj.WEManager.po;

public class WeNav {
    private Integer id;

    private String navName;

    private String navUrl;

    private Integer navSort;

    private Integer navStatus;

    private String navContent;

    private String navImg;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNavName() {
        return navName;
    }

    public void setNavName(String navName) {
        this.navName = navName == null ? null : navName.trim();
    }

    public String getNavUrl() {
        return navUrl;
    }

    public void setNavUrl(String navUrl) {
        this.navUrl = navUrl == null ? null : navUrl.trim();
    }

    public Integer getNavSort() {
        return navSort;
    }

    public void setNavSort(Integer navSort) {
        this.navSort = navSort;
    }

    public Integer getNavStatus() {
        return navStatus;
    }

    public void setNavStatus(Integer navStatus) {
        this.navStatus = navStatus;
    }

    public String getNavContent() {
        return navContent;
    }

    public void setNavContent(String navContent) {
        this.navContent = navContent == null ? null : navContent.trim();
    }

    public String getNavImg() {
        return navImg;
    }

    public void setNavImg(String navImg) {
        this.navImg = navImg == null ? null : navImg.trim();
    }
}