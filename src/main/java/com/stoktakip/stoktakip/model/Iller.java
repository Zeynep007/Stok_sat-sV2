package com.stoktakip.stoktakip.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "iller")

public class Iller {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="iladi",  nullable = false, length = 20)
    private String iladi;

    @OneToMany(mappedBy = "iller", cascade = CascadeType.ALL)
    private Set<Musteri> musteri;

    public Set<Musteri> getMusteri() {
        return musteri;
    }

    public void setMusteri(Set<Musteri> musteri) {
        this.musteri = musteri;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIladi() {
        return iladi;
    }

    public void setIladi(String iladi) {
        this.iladi = iladi;
    }
}
