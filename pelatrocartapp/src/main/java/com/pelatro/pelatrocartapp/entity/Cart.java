package com.pelatro.pelatrocartapp.entity;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="cart")
public class Cart {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    
    @Column(name="quantity")
    private int quantity;
    
   //@ManyToOne
    @ManyToOne
    @JoinColumn(nullable = false, name = "userid")
    private Users user;
    
    
     @ManyToOne
   // @ManyToOne(cascade = CascadeType.ALL)
     @JoinColumn(name = "productid", referencedColumnName = "id")
     private Products product;
     
  

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public Products getProduct() {
        return product;
    }

    public void setProduct(Products product) {
        this.product = product;
    }
    

    public Cart() {
        super();
    };
    public Cart(int quantity, Users user, Products product) {
        super();
        this.quantity = quantity;
        this.user = user;
        this.product = product;
    }

	@Override
	public String toString() {
		return "Cart [id=" + id + ", quantity=" + quantity + ", user=" + user + ", product=" + product + ", getId()="
				+ getId() + ", getQuantity()=" + getQuantity() + ", getUser()=" + getUser() + ", getProduct()="
				+ getProduct() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
    
    

}
	
	
	