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
public class ProjectsController {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    /**
     * Simply selects the home view to render by returning its name.
     */
    @GetMapping("/projects")
    public String index(Model model) {

        String sql = "SELECT * FROM projects";
        List<Project> teams = jdbcTemplate.query(sql,
                BeanPropertyRowMapper.newInstance(Project.class));

        model.addAttribute("projects", projects);
        return "projects/index";
    }

    @GetMapping("/projects/get/{projectName}")
    public String get(@PathVariable String projectName, Model model) {

        String sql = "SELECT * FROM projects WHERE projectName = " + projectName;
        List<Project> projects = jdbcTemplate.query(sql,
                BeanPropertyRowMapper.newInstance(Project.class));

        model.addAttribute("item", projects.get(0));
        return "projects/details";
    }


}