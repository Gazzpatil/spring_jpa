package org.example.customseq_generator;

import org.example.customseq_generator.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AddressRepo extends JpaRepository<Address, Integer> {
}
