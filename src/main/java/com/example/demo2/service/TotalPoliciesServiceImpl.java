package com.example.demo2.service;

import java.util.List;

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

    }

    @Override
    public TotalPolicies getTotalPolicies(TotalPolicies totalPolicies) {
        return null;
    }

    @Override
    public void updateTotalPolicies(TotalPolicies totalPolicies) {

    }

    @Override
    public void deleteTotalPolicies(TotalPolicies totalPolicies) {

    }
}
