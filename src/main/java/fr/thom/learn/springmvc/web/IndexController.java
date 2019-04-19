package fr.thom.learn.springmvc.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    private static final String INDEX_PAGE = "index";

    @GetMapping({"", "/", "/index"})
    public String getIndexPage() {
        return INDEX_PAGE;
    }
}
