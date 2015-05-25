package ylw.model;

import java.util.Date;

public class Articles {
    private Integer id;

    private String title;

    private String author;

    private Date fbsj;

    private String zy;

    private String fbt;

    private Date updatetime;

    private Date shtgrq;

    private Integer countLike;

    private Integer countShare;

    private String context;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    public Date getFbsj() {
        return fbsj;
    }

    public void setFbsj(Date fbsj) {
        this.fbsj = fbsj;
    }

    public String getZy() {
        return zy;
    }

    public void setZy(String zy) {
        this.zy = zy == null ? null : zy.trim();
    }

    public String getFbt() {
        return fbt;
    }

    public void setFbt(String fbt) {
        this.fbt = fbt == null ? null : fbt.trim();
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public Date getShtgrq() {
        return shtgrq;
    }

    public void setShtgrq(Date shtgrq) {
        this.shtgrq = shtgrq;
    }

    public Integer getCountLike() {
        return countLike;
    }

    public void setCountLike(Integer countLike) {
        this.countLike = countLike;
    }

    public Integer getCountShare() {
        return countShare;
    }

    public void setCountShare(Integer countShare) {
        this.countShare = countShare;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context == null ? null : context.trim();
    }
}