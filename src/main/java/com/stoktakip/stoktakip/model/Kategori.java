package com.stoktakip.stoktakip.model;
import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "kategori")

public class Kategori {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="kod")
    private String kod;

    @Column(name="ad")
    private String ad;

    @OneToMany(mappedBy = "kategori", cascade = CascadeType.ALL)
    private Set<Urun> urun;

    public Set<Urun> getUrun() {
        return urun;
    }

    public void setUrun(Set<Urun> urun) {
        this.urun = urun;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKod() {
        return kod;
    }

    public void setKod(String kod) {
        this.kod = kod;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }
}
