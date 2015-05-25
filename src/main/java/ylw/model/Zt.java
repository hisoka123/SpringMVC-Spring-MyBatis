package ylw.model;

import java.util.Date;

public class Zt {
    private Integer id;

    private String ztmc;

    private Integer tjr;

    private Date tjsj;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getZtmc() {
        return ztmc;
    }

    public void setZtmc(String ztmc) {
        this.ztmc = ztmc == null ? null : ztmc.trim();
    }

    public Integer getTjr() {
        return tjr;
    }

    public void setTjr(Integer tjr) {
        this.tjr = tjr;
    }

    public Date getTjsj() {
        return tjsj;
    }

    public void setTjsj(Date tjsj) {
        this.tjsj = tjsj;
    }
}