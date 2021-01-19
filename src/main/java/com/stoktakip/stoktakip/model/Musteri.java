package com.stoktakip.stoktakip.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "musteri")
public class Musteri {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "musterino", nullable = false, length = 8)
    private String musterino;

    @Column(name = "tckimlikno", nullable = false, length = 11)
    private String tckimlikno;

    @Column(name = "ad", nullable = false, length = 20)
    private String ad;

    @Column(name = "soyad", nullable = false, length = 25)
    private String soyad;

    @Column(name = "sifre", nullable = false, length = 15)
    private String sifre;

    @Column(name = "kullaniciadi", nullable = false, length = 20)
    private String kullaniciadi;

    @Column(name = "adres", nullable = false, length = 100)
    private String adres;

    @OneToMany(mappedBy = "musteri", cascade = CascadeType.ALL)
    private Set<Siparis> siparis;

    @ManyToOne
    @JoinColumn(name = "iller_id", nullable = false)
    private Iller iller;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMusterino() {
        return musterino;
    }

    public void setMusterino(String musterino) {
        this.musterino = musterino;
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

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public Set<Siparis> getSiparis() {
        return siparis;
    }

    public void setSiparis(Set<Siparis> siparis) {
        this.siparis = siparis;
    }

    public Iller getIller() {
        return iller;
    }

    public void setIller(Iller iller) {
        this.iller = iller;
    }

    public String getKullaniciadi() {
        return kullaniciadi;
    }

    public void setKullaniciadi(String kullaniciadi) {
        this.kullaniciadi = kullaniciadi;
    }
}




