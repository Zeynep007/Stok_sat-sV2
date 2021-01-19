package com.stoktakip.stoktakip.controller;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.stoktakip.stoktakip.model.Fatura;
import com.stoktakip.stoktakip.services.FaturaService;

@Controller
@RequestMapping(value="/fatura")
public class FaturaController {

    @Autowired
    FaturaService faturaService;


    @RequestMapping(value="/list", method=RequestMethod.GET)
    public ModelAndView list() {

        ModelAndView model = new ModelAndView("fatura_listt"); //.jsp yazılmayacak
        List<Fatura> faturaList = faturaService.getAllFatura();
        model.addObject("faturaList", faturaList);

        return model;
    }



    @RequestMapping(value="/addFatura/", method=RequestMethod.GET)
    public ModelAndView addFatura() {

        ModelAndView model = new ModelAndView();
        Fatura fatura = new Fatura();
        model.addObject("faturaForm", fatura);
        model.setViewName("fatura_form");

        return model;
    }



    @RequestMapping(value="/editFatura/{id}", method=RequestMethod.GET)
    public ModelAndView editFatura(@PathVariable int id) {
        ModelAndView model = new ModelAndView();

        Fatura fatura = faturaService.getFaturaById(id);
        model.addObject("faturaForm", fatura);
        model.setViewName("fatura_form");

        return model;
    }


    @RequestMapping(value="/addFatura", method=RequestMethod.POST)
    public ModelAndView add(@ModelAttribute("faturaForm") Fatura fatura) {

        faturaService.addFatura(fatura);
        return new ModelAndView("redirect:/fatura/list");

    }

    @RequestMapping(value="/deleteFatura/{id}", method=RequestMethod.GET)
    public ModelAndView delete(@PathVariable("id") int id) {

        faturaService.deleteFatura(id);
        return new ModelAndView("redirect:/fatura/list");

    }



}