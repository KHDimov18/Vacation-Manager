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
public class CustomersController {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    /**
     * Simply selects the home view to render by returning its name.
     */
    @GetMapping("/customers")
    public String index(Model model) {

        String sql = "SELECT * FROM customers";
        List<Customer> customers = jdbcTemplate.query(sql,
                BeanPropertyRowMapper.newInstance(Customer.class));

        model.addAttribute("customers", customers);
        return "customers/index";
    }

    @GetMapping("/customers/get/{id}")
    public String get(@PathVariable int id, Model model) {

        String sql = "SELECT * FROM customers WHERE id = " + id;
        List<Customer> customers = jdbcTemplate.query(sql,
                BeanPropertyRowMapper.newInstance(Customer.class));

        model.addAttribute("item", customers.get(0));
        return "customers/details";
    }


}