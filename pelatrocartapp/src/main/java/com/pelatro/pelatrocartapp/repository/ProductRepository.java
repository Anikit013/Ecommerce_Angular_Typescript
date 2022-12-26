package com.pelatro.pelatrocartapp.repository;

//import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.pelatro.pelatrocartapp.entity.Products;
//import com.pelatro.pelatrocartapp.entity.Users;

@Repository
public interface ProductRepository extends JpaRepository<Products,Integer> {
	
	//@Query("SELECT p FROM Products p WHERE " + "p.name LIKE CONCAT('%',:query, '%')" +"Or p.description LIKE CONCAT('%',:query,'%')")
	//List<Products> searchProducts(String query);
   // Products findByProductId(int id);
   // Optional<Products> findByProductId(@Param("productid") int productid);
    Optional<Products> findById(int id);
}
