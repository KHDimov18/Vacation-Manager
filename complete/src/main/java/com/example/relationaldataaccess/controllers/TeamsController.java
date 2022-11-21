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
public class TeamsController {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    /**
     * Simply selects the home view to render by returning its name.
     */
    @GetMapping("/teams")
    public String index(Model model) {

        String sql = "SELECT * FROM teams";
        List<Team> teams = jdbcTemplate.query(sql,
                BeanPropertyRowMapper.newInstance(Team.class));

        model.addAttribute("teams", teams);
        return "teams/index";
    }

    @GetMapping("/teams/get/{teamName}")
    public String get(@PathVariable String teamName, Model model) {

        String sql = "SELECT * FROM teams WHERE teamName = " + teamName;
        List<Team> teams = jdbcTemplate.query(sql,
                BeanPropertyRowMapper.newInstance(Team.class));

        model.addAttribute("item", teams.get(0));
        return "teams/details";
    }


}