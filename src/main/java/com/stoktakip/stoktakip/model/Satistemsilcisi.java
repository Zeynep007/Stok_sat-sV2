package com.stoktakip.stoktakip.model;


    import javax.persistence.*;
    import java.util.Set;

@Entity
@Table(name = "satistemsilcisi")

public class Satistemsilcisi {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;


    @Column(name="tckimlikno")
    private String tckimlikno;

    @Column(name="ad")
    private String ad;


    @Column(name="soyad")
    private String soyad;


    @Column(name="sifre")
    private String sifre;

    @Column(name="kullaniciadi")
    private String kullaniciadi;

    @OneToMany(mappedBy = "satistemsilcisi", cascade = CascadeType.ALL)
    private Set<Siparis> siparis;

    public Set<Siparis> getSiparis() {
        return siparis;
    }

    public void setSiparis(Set<Siparis> siparis) {
        this.siparis = siparis;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTckimlikno() {
        return tckimlikno;
    }

    public void setTckimlikno(String tckimlikno) {
        this.tckimlikno = tckimlikno;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

    public String getKullaniciadi() {
        return kullaniciadi;
    }

    public void setKullaniciadi(String kullaniciadi) {
        this.kullaniciadi = kullaniciadi;
    }
}
