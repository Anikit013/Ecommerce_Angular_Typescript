package com.pelatro.pelatrocartapp.repository;
import java.util.*;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

//import com.pelatro.pelatrocartapp.Service.Implementation.List;
//import com.pelatro.pelatrocartapp.Service.Implementation.Users;
import com.pelatro.pelatrocartapp.entity.Cart;
import com.pelatro.pelatrocartapp.entity.Users;

@Repository
public interface CartRepository extends JpaRepository<Cart,Integer> {

	//Cart findByProductIdUserID(int productid, int userid);

@Query(value = "from Cart c where c.product.productid =:productid and c.user.userid=:userid" )

<Optional>Cart findByProductIdUserID(@Param("productid") int productid,  @Param("userid") int userid);
//
//@Query("update AddtoCart addCart set addCart.qty=:qty,addCart.price=:price WHERE addCart.id=:cart_id")
//void updateQtyByCartId(@Param("cart_id")Long cart_id,@Param("price")double price,@Param("qty")Integer qty);


//@Query(value="from Cart c where c.user.userid=:userid")
//List<Cart> findAllById(@Param("userid") int userid);

@Query(value="from Cart c where c.user.userid=:userid")
List<Cart> findAllByUserId(@Param("userid") int userid);
//List<Cart> findAllByUserOrderByCreatedDateDesc(Users user);

}

