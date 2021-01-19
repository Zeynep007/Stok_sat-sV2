package com.stoktakip.stoktakip.services;


import java.util.List;

import com.stoktakip.stoktakip.model.Musteri;

public interface MusteriService {

    public List<Musteri> getAllMusteri();

    public Musteri getMusteriById(int id);

    public void addMusteri(Musteri Musteri);

    public void deleteMusteri(int id);


}
