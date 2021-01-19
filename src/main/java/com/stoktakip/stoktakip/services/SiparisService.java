package com.stoktakip.stoktakip.services;


import java.util.List;

import com.stoktakip.stoktakip.model.Siparis;
import com.stoktakip.stoktakip.model.Siparis;

public interface SiparisService {

    public List<Siparis> getAllSiparis();

    public Siparis getSiparisById(int id);

    public void addSiparis(Siparis Siparis);

    public void deleteSiparis(int id);


}
