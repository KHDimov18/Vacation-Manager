package com.example.servingwebcontent.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import com.example.servingwebcontent.models.Customer;
import java.util.List;

@Controller
public class VacationsController {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    /**
     * Simply selects the home view to render by returning its name.
     */
    @GetMapping("/vacations")
    public String index(Model model) {

        String sql = "SELECT * FROM vacations";
        List<Vacation> vacations = jdbcTemplate.query(sql,
                BeanPropertyRowMapper.newInstance(Vacation.class));

        model.addAttribute("vacations", vacations);
        return "vacations/index";
    }

    @GetMapping("/vacations/get/{approved}")
    public String get(@PathVariable String approved, Model model) {

        String sql = "SELECT * FROM vacations WHERE approved = " + approved;
        List<Vacation> vacations = jdbcTemplate.query(sql,
                BeanPropertyRowMapper.newInstance(Vacation.class));

        model.addAttribute("item", vacations.get(0));
        return "vacations/details";
    }


}