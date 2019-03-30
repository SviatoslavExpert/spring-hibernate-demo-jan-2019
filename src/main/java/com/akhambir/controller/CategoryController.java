package com.akhambir.controller;

import com.akhambir.model.Category;
import com.akhambir.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @RequestMapping(value = "/categories", method = RequestMethod.GET)
    public ModelAndView getAll(ModelAndView vm) {
        vm.setViewName("categories");
        vm.addObject("categories", categoryService.getAll());
        return vm;
    }

    @RequestMapping(value = "/category", method = RequestMethod.GET)
    public ModelAndView getById(@RequestParam("c_id") Long id, ModelAndView vm) {
        vm.setViewName("category");
        vm.addObject("category", categoryService.getById(id));
        return vm;
    }


    @RequestMapping(value = "/reduce", method = RequestMethod.GET)
    public ModelAndView increase(@RequestParam("c_id") Long id, ModelAndView vm) {
        Category category = categoryService.getById(id);
        vm.setViewName("category");
        vm.addObject("category", categoryService.reduceCategoryPriceByPercents(category, 10));
        return vm;
    }

}
