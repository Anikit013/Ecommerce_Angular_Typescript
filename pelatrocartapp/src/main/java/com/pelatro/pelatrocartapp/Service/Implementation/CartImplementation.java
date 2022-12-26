package com.pelatro.pelatrocartapp.Service.Implementation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.pelatro.pelatrocartapp.commonresponse.PelatrocartResponse;
import com.pelatro.pelatrocartapp.commonresponse.PelatrocartResponseWrapper;
import com.pelatro.pelatrocartapp.dto.CartItemDto;
import com.pelatro.pelatrocartapp.entity.Cart;
import com.pelatro.pelatrocartapp.entity.Users;
import com.pelatro.pelatrocartapp.repository.CartRepository;
import com.pelatro.pelatrocartapp.service.CartService;
import com.pelatro.pelatrocartapp.service.ProductService;
@Service
public class CartImplementation implements CartService {

	@Autowired
	private CartRepository cartRepo;
	

	
	ProductService proServ;
	
	PelatrocartResponseWrapper pelrespwrp=new PelatrocartResponseWrapper();
	
	@Override
	public PelatrocartResponse addToCart(Cart cart) {
		PelatrocartResponseWrapper plarepwrp = new PelatrocartResponseWrapper();
	
		if(cart!=null) {
			Cart exixtingcart= cartRepo.findByProductIdUserID(cart.getProduct().getProductid(),cart.getUser().getUserid());
			if(exixtingcart!=null){			
				Cart exist=cartRepo.getOne(exixtingcart.getId());
				exist.setQuantity(cart.getQuantity()+exixtingcart.getQuantity());
				return plarepwrp.createResponse("OK",cartRepo.save(exist));

			}
			else
				
			{
			return plarepwrp.createResponse("OK",cartRepo.save(cart));
			}
		}
		else {
		return plarepwrp.createResponse("Select some products", "No Products");
		}
	}
	public CartItemDto listCartItems(int userid) {
        List<Cart> cartList = cartRepo.findAllByUserId(userid);
      
      
        double totalCost = 0;
        for (Cart cartItemDto :cartList){
            totalCost += (cartItemDto.getProduct().getProductprice()* cartItemDto.getQuantity());
            System.out.println(totalCost);
        }
        return new CartItemDto(cartList,totalCost);
    
		}
//	@Override
//	public List<AddtoCart> getCartByUserId(long userId) {
//		return aCartRepo.getCartByuserId(userId);
//	}
	

	
	}

	
//	@Override
//	public PelatrocartResponse addToCart(Cart cart) {
//		PelatrocartResponseWrapper plarepwrp = new PelatrocartResponseWrapper();
//		if (cartRepo.findByProductIdUserID(cart.getProduct().getProductid(),cart.getUser().getUserid())!= null)	{
//			
//			Cart exist = cartRepo.findByProductIdUserID(cart.getProduct().getProductid(),cart.getUser().getUserid());
//			
//			
//			System.out.println();
//			
//			
//		}	
//		return plarepwrp.createResponse("Select Some Products","No Products");
//
//	}
//	
//	@Override
//	public PelatrocartResponse getCartByUserId(int id) {
//		return pelrespwrp.createResponse("OK",cartRepo.findAllById(id));
//
//	}
//}	
//	
//	@Override
//	public void updateQtyByCartId(long cartId, int qty, double price) throws Exception {
//		cartRepo.updateQtyByCartId(cartId,price,qty);
//	}
//	


	
//	@Override
//	public PelatrocartResponse addToCart(int productid, int userid,int quantity) throws Exception {
//		try {
//			if(cartRepo.getCartByUserId(userid, productid).isPresent()){
//				throw new Exception("Product is already exist.");
//			}
//			Cart obj = new Cart();
//			obj.setQuantity(quantity);
//			obj.setId(userid);
//			ProductService pro = proServ.getProductsById(productid);
//			obj.setProduct(pro); 
//		
//			//obj.setProduct(productprice);
//			//cartRepo.save(obj);		
//			return this.getCartByUserId(userid);	
//		}catch(Exception e) {
//			e.printStackTrace();
//			//logger.error(""+e.getMessage());
//			throw new Exception(e.getMessage());
//		}
	
	
	
//	@Override
//	public PelatrocartResponse addToCart(Cart carts) {
//	
//		if(carts!=null) {
//			Cart exixtingcart= cartRepo.findByProductIdUserID(carts.getProducts().getProductid(),carts.getUsers().getEmail());
//			if(exixtingcart!=null){			
//				Cart exist=cartRepo.getReferenceById(exixtingcart.getId());
//				exist.setQuantity(carts.getQuantity()+exixtingcart.getQuantity());
//				return plarepwrp.createResponse(carts.getProduct().getProductname(),cartRepo.save(exist));
//			}
//			return plarepwrp.createResponse(carts.getProducts().getProductname(),cartRepo.save(carts));
//		}
//		return plarepwrp.createResponse("Select some products", "No content");
//	}
	

//	@Override
//	public PelatrocartResponse addToCart(Cart carts) {
//	
//			return plarepwrp.createResponse(carts.getProduct().getProductname(),cartRepo.save(carts));
//
//	}
//	
//	@Override
//	public void add(Long idCart, Long idProduct, Integer quantity) {
//		Cart cart = cartDao.findBy(idCart);
//		Product product = productDao.findBy(idProduct);
//		cart.getLinesItems().add(new LineItem(cart, product, quantity, product.getPrice()));
//		cartDao.update(cart);
//	}
//}
