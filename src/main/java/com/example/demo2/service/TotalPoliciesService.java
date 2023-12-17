package com.example.demo2.service;

import java.util.*;

import com.example.demo2.domain.TotalPolicies;

public interface TotalPoliciesService {
    List<TotalPolicies> getTotalPoliciesList(TotalPolicies totalPolicies);

    void insertTotalPolicies(TotalPolicies totalPolicies);

    TotalPolicies getTotalPolicies(TotalPolicies totalPolicies);

    void updateTotalPolicies(TotalPolicies totalPolicies);

    void deleteTotalPolicies(TotalPolicies totalPolicies);
}
