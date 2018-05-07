package guru.springfamework.services;

import guru.springfamework.api.v1.model.VendorDTO;
import guru.springfamework.api.v1.model.VendorListDTO;

/**
 * Created by jt on 9/27/17.
 */
public interface VendorService {
    
    VendorListDTO getAllVendors();
    
    VendorDTO getVendorById(Long id);
    
    VendorDTO createNewVendor(VendorDTO vendorDTO);
    
    VendorDTO saveVendorByDTO(Long id, VendorDTO vendorDTO);
    
    VendorDTO patchVendor(Long id, VendorDTO vendorDTO);
    
    void deleteVendorById(Long id);
}
