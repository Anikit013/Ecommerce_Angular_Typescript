package com.pelatro.pelatrocartapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pelatro.pelatrocartapp.entity.BillingAddress;

@Repository
public interface BillingAddressRepository extends JpaRepository<BillingAddress,String>{

}
