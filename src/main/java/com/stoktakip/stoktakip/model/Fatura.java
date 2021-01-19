package com.stoktakip.stoktakip.model;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "fatura")
public class Fatura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="faturano", nullable = false, length = 8)
    private String faturano;

    @Column(name="tarih")
    private java.sql.Date tarih;

    @OneToOne(mappedBy = "fatura",cascade=CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private Siparis siparis;

    public Siparis getSiparis() {
        return siparis;
    }

    public void setSiparis(Siparis siparis) {
        this.siparis = siparis;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFaturano() {
        return faturano;
    }

    public void setFaturano(String faturano) {
        this.faturano = faturano;
    }

    public java.sql.Date getTarih() {
        return tarih;
    }

    public void setTarih(java.sql.Date tarih) {
        this.tarih = tarih;
    }
}
