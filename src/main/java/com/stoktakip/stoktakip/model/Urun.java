package com.stoktakip.stoktakip.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "urun")
public class Urun {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "kod", nullable = false, length = 8)
    private String kod;

    @Column(name = "adi", nullable = false, length = 50)
    private String adi;

    @Column(name = "stokmiktari", nullable = false, length = 3)
    private String stokmiktari;

    @Column(name = "birimfiyat", nullable = false, length = 4)
    private double birimfiyat;

    @OneToMany(mappedBy = "urun", cascade = CascadeType.ALL)
    private Set<Siparis> siparis;

    @ManyToOne
    @JoinColumn(name = "kategori_id", nullable = false)
    private Kategori kategori;

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

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getStokmiktari() {
        return stokmiktari;
    }

    public void setStokmiktari(String stokmiktari) {
        this.stokmiktari = stokmiktari;
    }

    public double getBirimfiyat() {
        return birimfiyat;
    }

    public void setBirimfiyat(double birimfiyat) {
        this.birimfiyat = birimfiyat;
    }

    public Set<Siparis> getSiparis() {
        return siparis;
    }

    public void setSiparis(Set<Siparis> siparis) {
        this.siparis = siparis;
    }

    public Kategori getKategori() {
        return kategori;
    }

    public void setKategori(Kategori kategori) {
        this.kategori = kategori;
    }
}



