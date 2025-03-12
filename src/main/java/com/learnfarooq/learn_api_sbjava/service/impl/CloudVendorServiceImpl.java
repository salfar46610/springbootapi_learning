package com.learnfarooq.learn_api_sbjava.service.impl;

import com.learnfarooq.learn_api_sbjava.exception.CloudVendorNotFoundException;
import com.learnfarooq.learn_api_sbjava.model.CloudVendor;
import com.learnfarooq.learn_api_sbjava.repository.CloudVendorRepository;
import com.learnfarooq.learn_api_sbjava.service.CloudVendorService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CloudVendorServiceImpl implements CloudVendorService {


    CloudVendorRepository cloudVendorRepository;
    public CloudVendorServiceImpl(CloudVendorRepository cloudVendorRepository) {
        this.cloudVendorRepository = cloudVendorRepository;
    }


    @Override
    public String createCloudVendor(CloudVendor cloudVendor) {
        cloudVendorRepository.save(cloudVendor);
        return "Suceess";
    }

    @Override
    public String updateCloudVendor(CloudVendor cloudVendor) {
        cloudVendorRepository.save(cloudVendor);
        return "Update Success";
    }

    @Override
    public String deleteCloudVendor(String cloudVendorId) {
        cloudVendorRepository.deleteById(cloudVendorId);
        return "Sucess";
    }

    @Override
    public CloudVendor getCloudVendorDetails(String cloudVendorId) {
        
        if(cloudVendorRepository.findById(cloudVendorId).isEmpty())
        {
            throw new CloudVendorNotFoundException("Requested Vendor Id Not Found");
        }
        return cloudVendorRepository.findById(cloudVendorId).get();

    }

    @Override
    public List<CloudVendor> getAllCloudVendorDetails() {
        return cloudVendorRepository.findAll();
    }
}
