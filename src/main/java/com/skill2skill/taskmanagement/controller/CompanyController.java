package com.skill2skill.taskmanagement.controller;

import com.skill2skill.taskmanagement.dto.request.AddUpdateCompanyDetailsRequest;
import com.skill2skill.taskmanagement.dto.response.CompanyDetailsListResponse;
import com.skill2skill.taskmanagement.dto.response.GenericResponse;
import com.skill2skill.taskmanagement.service.abstraction.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

import static com.skill2skill.taskmanagement.utils.EndPoints.*;

@RestController
@RequestMapping(value = COMPANY)
public class CompanyController {

    private final CompanyService companyService;

    @Autowired
    public CompanyController(CompanyService companyService) {
        this.companyService = companyService;
    }

    @PostMapping(value = ADD_UPDATE_COMPANY_DETAILS)
    public GenericResponse addUpdateCompany(@Valid @RequestBody AddUpdateCompanyDetailsRequest request) {
        return companyService.addUpdateCompanyDetails(request);
    }

    @GetMapping(value = COMPANY_LIST)
    public CompanyDetailsListResponse companyList() {
        return companyService.companyList();
    }
}
