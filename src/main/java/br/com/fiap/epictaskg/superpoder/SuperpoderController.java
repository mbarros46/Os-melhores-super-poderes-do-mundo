package br.com.fiap.epictaskg.superpoder;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SuperpoderController {
    private final SuperpoderService service;

    public SuperpoderController(SuperpoderService service) {
        this.service = service;
    }

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("powers", service.listarPorInutilidade());
        return "index";
    }
}