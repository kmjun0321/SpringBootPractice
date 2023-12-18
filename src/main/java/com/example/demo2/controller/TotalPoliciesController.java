package com.example.demo2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo2.domain.TotalPolicies;
import com.example.demo2.service.TotalPoliciesService;

import java.util.*;

@Controller
public class TotalPoliciesController {

    @Autowired
    private TotalPoliciesService totalPoliciesService;

    @RequestMapping("/testTotalPoliciesList")
    public String testTotalPoliciesList(Model model) {

        List<TotalPolicies> tpList = new ArrayList<TotalPolicies>();

        for (int i = 0; i < 9; i++) {
            TotalPolicies tp = new TotalPolicies();
            tp.setSeq(Long.valueOf(i));
            tp.setDomainID(Long.valueOf(i));
            tp.setPolicyID("PolicyID - " + i);
            tp.setPolicyName("PolicyName - " + i);
            tp.setRegDate("RegDate - " + i);
            tp.setLastModifyDate("LastModifyDate - " + i);
            tp.setMemo("Memo - " + i);
            tpList.add(tp);
        }

        model.addAttribute("totalPoliciesList", tpList);

        return "testTotalPoliciesList";
    }

    @RequestMapping("/getTotalPoliciesList")
    public String getTotalPoliciesList(Model model, TotalPolicies totalPolicies) {
        List<TotalPolicies> totalPoliciesList = totalPoliciesService.getTotalPoliciesList(totalPolicies);
        model.addAttribute("totalPoliciesList", totalPoliciesList);
        return "getTotalPoliciesList";
    }

    @RequestMapping("/insertTotalPolicies")
    public String insertTotalPolicies(TotalPolicies totalPolicies) {
        totalPoliciesService.insertTotalPolicies(totalPolicies);
        return "redirect:getTotalPoliciesList";
    }

    @RequestMapping("/deleteTotalPolicies")
    public String deleteTotalPolicies(TotalPolicies totalPolicies) {
        totalPoliciesService.deleteTotalPolicies(totalPolicies);
        return "redirect:getTotalPoliciesList";
    }
}
