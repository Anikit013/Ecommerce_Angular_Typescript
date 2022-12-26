import { Component, NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ProductsComponent } from './products/products.component';

import { ProductsingleComponent } from './productsingle/productsingle.component';
import { HomeComponent } from './home/home.component';
import { CartComponent } from './cart/cart.component';
import { CheckoutComponent } from './checkout/checkout.component';
import { AddressComponent } from './address/address.component';
import { FooterComponent } from './footer/footer.component';
import { combineLatest } from 'rxjs';
import { HeaderComponent } from './header/header.component';
import { OrdersComponent } from './orders/orders.component';
import { ShopComponent } from './shop/shop.component';
import { SignupComponent } from './signup/signup.component';
import { LoginComponent } from './login/login.component';
import { ProductsecondComponent } from './productsecond/productsecond.component';
import { ProductthirdComponent } from './productthird/productthird.component';
import { ProductforthComponent } from './productforth/productforth.component';




const routes: Routes =[
  {path :"productthird", component:ProductthirdComponent},
  {path :"productforth", component:ProductforthComponent},
  
  { path :"productsecond",component:ProductsecondComponent},
  { path:"", component:HomeComponent },
  { path:"product-single", component:ProductsingleComponent },
  { path:"cart", component:CartComponent },
  { path:"checkout", component:CheckoutComponent},
  { path:"address", component:AddressComponent},
  { path:"footer", component:FooterComponent},
  { path:"header", component:HeaderComponent},
  { path:"home", component:FooterComponent},
  { path:"login", component:LoginComponent},
  { path:"order", component:OrdersComponent},
  { path:"productsingle", component:ProductsingleComponent},
  { path:"shop", component:ShopComponent},
  { path:"signup", component:SignupComponent},
  { path :"products", component:ProductsComponent}
  ];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
}) 
export class AppRoutingModule { }