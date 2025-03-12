package com.learnfarooq.learn_api_sbjava.controller;

import com.learnfarooq.learn_api_sbjava.model.CloudVendor;
import com.learnfarooq.learn_api_sbjava.repository.CloudVendorRepository;
import com.learnfarooq.learn_api_sbjava.service.CloudVendorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/apiendpointvendor")
public class CloudVendorController
{
    CloudVendorService cloudVendorService;
    public CloudVendorController(CloudVendorService cloudVendorService) {
        this.cloudVendorService = cloudVendorService;
    }

    @GetMapping("{vendorId}")

    public CloudVendor getCloudVendorDetails(@PathVariable("vendorId") String vendorId)
    {
        return cloudVendorService.getCloudVendorDetails(vendorId);

    }

    @GetMapping()

    public List<CloudVendor> getAllCloudVendorDetails()
    {
        return cloudVendorService.getAllCloudVendorDetails();
    }

    @PostMapping
    public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor)
    {
        cloudVendorService.createCloudVendor(cloudVendor);
        return "CloudVendor created successfully";
    }


    @PutMapping
    public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor)
    {
        cloudVendorService.updateCloudVendor(cloudVendor);
        return "CloudVendor updated successfully";
    }



    @DeleteMapping("{vendorId}")
    public String deleteCloudVendorDetails(@PathVariable String vendorId)
    {
        cloudVendorService.deleteCloudVendor(vendorId);
        return "CloudVendor Deleted successfully";
    }


}
