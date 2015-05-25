package ylw.model;

import java.util.Date;

public class Photos {
    private Integer id;

    private Date uploadDate;

    private Integer xcId;

    private Integer uid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getUploadDate() {
        return uploadDate;
    }

    public void setUploadDate(Date uploadDate) {
        this.uploadDate = uploadDate;
    }

    public Integer getXcId() {
        return xcId;
    }

    public void setXcId(Integer xcId) {
        this.xcId = xcId;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }
}