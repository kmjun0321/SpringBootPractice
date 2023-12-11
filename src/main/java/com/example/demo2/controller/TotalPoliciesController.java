package com.example.demo2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo2.domain.TotalPolicies;

import java.util.*;

@Controller
public class TotalPoliciesController {

    @RequestMapping("/testTotalPoliciesList")
    public String testTotalPoliciesList(Model model) {

        List<TotalPolicies> tpList = new ArrayList<TotalPolicies>();

        for (int i = 0; i < 9; i++) {
            TotalPolicies tp = new TotalPolicies();
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
}
