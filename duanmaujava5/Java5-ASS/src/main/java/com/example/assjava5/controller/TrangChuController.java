package com.example.assjava5.controller;

import com.example.assjava5.model.ChiTietSP;
import com.example.assjava5.service.CTSPService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class TrangChuController {
    @Autowired
    private CTSPService ctspSV;

    @GetMapping("/")
    public String hienthi(Model model) {
        List<ChiTietSP> ctsp = ctspSV.getAll();
        model.addAttribute("ctsp", ctsp);
        model.addAttribute("view", "trangchu");
        return "layout";
    }
}
