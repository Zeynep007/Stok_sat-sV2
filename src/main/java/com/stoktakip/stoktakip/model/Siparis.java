package com.stoktakip.stoktakip.model;

import javax.persistence.*;

@Entity
@Table(name = "siparis")
public class Siparis {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "siparisno", nullable = false, length = 8)
    private String siparisno;

    @Column(name = "barkodno", nullable = false, length = 10)
    private String barkodno;

    @Column(name = "siparisadedi", nullable = false, length = 2)
    private String siparisadedi;

    @Column(name = "birimfiyat", nullable = false, length = 8)
    private double birimfiyat;

    @OneToOne
    @JoinColumn(name = "fatura_id")
    private Fatura fatura;

    @ManyToOne
    @JoinColumn(name = "urun_id", nullable = false)
    private Urun urun;

    @ManyToOne
    @JoinColumn(name = "musteri_id", nullable = false)
    private Musteri musteri;

    @ManyToOne
    @JoinColumn(name = "satistemsilcisi_id", nullable = false)
    private Satistemsilcisi satistemsilcisi;

    @ManyToOne
    @JoinColumn(name = "kargofirmasi_id", nullable = false)
    private Kargofirmasi kargofirmasi;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSiparisno() {
        return siparisno;
    }

    public void setSiparisno(String siparisno) {
        this.siparisno = siparisno;
    }

    public String getBarkodno() {
        return barkodno;
    }

    public void setBarkodno(String barkodno) {
        this.barkodno = barkodno;
    }

    public String getSiparisadedi() {
        return siparisadedi;
    }

    public void setSiparisadedi(String siparisadedi) {
        this.siparisadedi = siparisadedi;
    }

    public double getBirimfiyat() {
        return birimfiyat;
    }

    public void setBirimfiyat(double birimfiyat) {
        this.birimfiyat = birimfiyat;
    }

    public Fatura getFatura() {
        return fatura;
    }

    public void setFatura(Fatura fatura) {
        this.fatura = fatura;
    }

    public Urun getUrun() {
        return urun;
    }

    public void setUrun(Urun urun) {
        this.urun = urun;
    }

    public Musteri getMusteri() {
        return musteri;
    }

    public void setMusteri(Musteri musteri) {
        this.musteri = musteri;
    }

    public Satistemsilcisi getSatistemsilcisi() {
        return satistemsilcisi;
    }

    public void setSatistemsilcisi(Satistemsilcisi satistemsilcisi) {
        this.satistemsilcisi = satistemsilcisi;
    }

    public Kargofirmasi getKargofirmasi() {
        return kargofirmasi;
    }

    public void setKargofirmasi(Kargofirmasi kargofirmasi) {
        this.kargofirmasi = kargofirmasi;
    }
}