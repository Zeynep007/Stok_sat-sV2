package com.stoktakip.stoktakip.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class AnasayfaController {

    @GetMapping({"/"})

    public String home() {

        return "musteri_login_list";

    }

    @GetMapping({"/satistemsilcisi_login_list"})

    public String home2() {

        return "satistemsilcisi_login_list";

    }






}