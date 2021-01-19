package com.stoktakip.stoktakip.model;
import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "kargofirmasi")

public class Kargofirmasi {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="ad")
    private String ad;

    @Column(name="adres")
    private String adres;

    @Column(name="telefon")
    private String telefon;

    @OneToMany(mappedBy = "kargofirmasi", cascade = CascadeType.ALL)
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

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }
}


