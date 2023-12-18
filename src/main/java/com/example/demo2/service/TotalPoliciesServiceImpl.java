package com.example.demo2.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo2.domain.TotalPolicies;
import com.example.demo2.repository.TotalPoliciesRepository;

@Service
public class TotalPoliciesServiceImpl implements TotalPoliciesService {

    @Autowired
    private TotalPoliciesRepository totalPoliciesRepository;

    @Override
    public List<TotalPolicies> getTotalPoliciesList(TotalPolicies totalPolicies) {
        return (List<TotalPolicies>) totalPoliciesRepository.findAll();
    }

    @Override
    public void insertTotalPolicies(TotalPolicies totalPolicies) {
        Date today = new Date();
        Locale currentLocale = new Locale("KOREAN", "KOREA");
        String pattern = "yyyyMMddHHmmss";
        SimpleDateFormat formatter = new SimpleDateFormat(pattern, currentLocale);
        String now = formatter.format(today);

        totalPolicies.setRegDate(now);
        totalPolicies.setLastModifyDate(now);
        totalPoliciesRepository.save(totalPolicies);
    }

    @Override
    public TotalPolicies getTotalPolicies(TotalPolicies totalPolicies) {
        return null;
    }

    @Override
    public void updateTotalPolicies(TotalPolicies totalPolicies) {
        Date today = new Date();
        Locale currentLocale = new Locale("KOREAN", "KOREA");
        String pattern = "yyyyMMddHHmmss";
        SimpleDateFormat formatter = new SimpleDateFormat(pattern, currentLocale);
        String now = formatter.format(today);

        totalPolicies.setLastModifyDate(now);
    }

    @Override
    public void deleteTotalPolicies(TotalPolicies totalPolicies) {

    }
}
