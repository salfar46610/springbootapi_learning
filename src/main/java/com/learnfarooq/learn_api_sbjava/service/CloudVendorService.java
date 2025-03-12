package com.learnfarooq.learn_api_sbjava.service;

import com.learnfarooq.learn_api_sbjava.model.CloudVendor;

import java.util.List;

public interface CloudVendorService {
    public String createCloudVendor(CloudVendor cloudVendor);
    public String updateCloudVendor(CloudVendor cloudVendor);
    public String deleteCloudVendor(String vendorId);
    public CloudVendor getCloudVendorDetails(String vendorId);
    public List<CloudVendor> getAllCloudVendorDetails();

}
