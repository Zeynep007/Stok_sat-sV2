package com.stoktakip.stoktakip.services;


import java.util.List;

import com.stoktakip.stoktakip.model.Satistemsilcisi;


public interface SatistemsilcisiService {

    public List<Satistemsilcisi> getAllSatistemsilcisi();

    public Satistemsilcisi getSatistemsilcisiById(int id);

    public void addSatistemsilcisi(Satistemsilcisi Satistemsilcisi);

    public void deleteSatistemsilcisi(int id);


}
