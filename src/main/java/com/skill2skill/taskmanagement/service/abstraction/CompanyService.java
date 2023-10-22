package com.skill2skill.taskmanagement.service.abstraction;

import com.skill2skill.taskmanagement.dto.request.AddUpdateCompanyDetailsRequest;
import com.skill2skill.taskmanagement.dto.response.CompanyDetailsListResponse;
import com.skill2skill.taskmanagement.dto.response.GenericResponse;

public interface CompanyService {

    GenericResponse addUpdateCompanyDetails(AddUpdateCompanyDetailsRequest request);

    CompanyDetailsListResponse companyList();
}
