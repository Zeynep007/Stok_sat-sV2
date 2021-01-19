package com.stoktakip.stoktakip.controller;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.stoktakip.stoktakip.model.Siparis;
import com.stoktakip.stoktakip.services.SiparisService;

@Controller
@RequestMapping(value="/siparis")
public class SiparisController{

    @Autowired
    SiparisService siparisService;


    @RequestMapping(value="/list", method=RequestMethod.GET)
    public ModelAndView list() {

        ModelAndView model = new ModelAndView("siparis_list"); //.jsp yazılmayacak
        List<Siparis> siparisList = siparisService.getAllSiparis();
        model.addObject("siparisList", siparisList);

        return model;
    }



    @RequestMapping(value="/addSiparis/", method=RequestMethod.GET)
    public ModelAndView addSiparis() {

        ModelAndView model = new ModelAndView();
        Siparis siparis = new Siparis();
        model.addObject("siparisForm", siparis);
        model.setViewName("siparis_form");

        return model;
    }



    @RequestMapping(value="/editSiparis/{id}", method=RequestMethod.GET)
    public ModelAndView editSiparis(@PathVariable int id) {
        ModelAndView model = new ModelAndView();

        Siparis siparis = siparisService.getSiparisById(id);
        model.addObject("siparisForm", siparis);
        model.setViewName("siparis_form");

        return model;
    }


    @RequestMapping(value="/addSiparis", method=RequestMethod.POST)
    public ModelAndView add(@ModelAttribute("siparisForm") Siparis siparis) {

        siparisService.addSiparis(siparis);
        return new ModelAndView("redirect:/siparis/list");

    }

    @RequestMapping(value="/deleteSiparis/{id}", method=RequestMethod.GET)
    public ModelAndView delete(@PathVariable("id") int id) {

        siparisService.deleteSiparis(id);
        return new ModelAndView("redirect:/siparis/list");

    }



}