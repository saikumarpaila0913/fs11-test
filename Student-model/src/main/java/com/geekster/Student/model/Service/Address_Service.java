package com.geekster.Student.model.Service;

import com.geekster.Student.model.Model.Address;
import com.geekster.Student.model.Repo.AddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Address_Service {
     @Autowired
    AddressRepo addressRepository;



    public List<Address> getAllAddresses() {
        return addressRepository.findAll();
    }

    public Address getAddressById(Long id) {
        Optional<Address> optionalAddress = addressRepository.findById(id);
        return optionalAddress.orElse(null);
    }


    public Address createAddress(Address address) {
        return addressRepository.save(address);
    }

    public Address updateAddress(Long id, Address updatedAddress) {
        Optional<Address> optionalAddress = addressRepository.findById(id);
        if (optionalAddress.isPresent()) {
            Address existingAddress = optionalAddress.get();

            existingAddress.setLandmark(updatedAddress.getLandmark());
            existingAddress.setZipcode(updatedAddress.getZipcode());
            existingAddress.setDistrict(updatedAddress.getDistrict());
            existingAddress.setState(updatedAddress.getState());
            existingAddress.setCountry(updatedAddress.getCountry());


            return addressRepository.save(existingAddress);
        } else {
            return null;
        }
    }


    public void deleteAddress(Long id) {
        addressRepository.deleteById(id);
    }
}
