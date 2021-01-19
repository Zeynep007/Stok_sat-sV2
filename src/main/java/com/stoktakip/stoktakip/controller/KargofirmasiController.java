package com.stoktakip.stoktakip.controller;

import java.util.List;

import com.stoktakip.stoktakip.model.Kargofirmasi;
import com.stoktakip.stoktakip.services.KargofirmasiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.stoktakip.stoktakip.model.Kargofirmasi;
import com.stoktakip.stoktakip.services.KargofirmasiService;

@Controller
@RequestMapping(value="/kargofirmasi")

public class KargofirmasiController {


    @Autowired
    KargofirmasiService kargofirmasiService;


    @RequestMapping(value="/list", method=RequestMethod.GET)
    public ModelAndView list() {

        ModelAndView model = new ModelAndView("kargofirmasi_list"); //.jsp yazılmayacak
        List<Kargofirmasi> kargofirmasiList = kargofirmasiService.getAllKargofirmasi();
        model.addObject("kargofirmasiList", kargofirmasiList);

        return model;
    }



    @RequestMapping(value="/addKargofirmasi/", method=RequestMethod.GET)
    public ModelAndView addKargofirmasi() {

        ModelAndView model = new ModelAndView();
        Kargofirmasi kargofirmasi = new Kargofirmasi();
        model.addObject("kargofirmasiForm", kargofirmasi);
        model.setViewName("kargofirmasi_form");

        return model;
    }



    @RequestMapping(value="/editKargofirmasi/{id}", method=RequestMethod.GET)
    public ModelAndView editKargofirmasi(@PathVariable int id) {
        ModelAndView model = new ModelAndView();

        Kargofirmasi kargofirmasi = kargofirmasiService.getKargofirmasiById(id);
        model.addObject("kargofirmasiForm", kargofirmasi);
        model.setViewName("kargofirmasi_form");

        return model;
    }


    @RequestMapping(value="/addKargofirmasi", method=RequestMethod.POST)
    public ModelAndView add(@ModelAttribute("kargofirmasiForm") Kargofirmasi kargofirmasi) {

        kargofirmasiService.addKargofirmasi(kargofirmasi);
        return new ModelAndView("redirect:/kargofirmasi/list");

    }

    @RequestMapping(value="/deleteKargofirmasi/{id}", method=RequestMethod.GET)
    public ModelAndView delete(@PathVariable("id") int id) {

        kargofirmasiService.deleteKargofirmasi(id);
        return new ModelAndView("redirect:/kargofirmasi/list");

    }



}

