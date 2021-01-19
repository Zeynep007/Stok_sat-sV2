package com.stoktakip.stoktakip.services;


import java.util.List;

import com.stoktakip.stoktakip.model.Fatura;


public interface FaturaService {

    public List<Fatura> getAllFatura();

    public Fatura getFaturaById(int id);

    public void addFatura(Fatura Fatura);

    public void deleteFatura(int id);

}


