import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { HeaderComponent } from './header/header.component';
import { FooterComponent } from './footer/footer.component';
import { SlickCarouselModule } from 'ngx-slick-carousel';
import { ProductsingleComponent } from './productsingle/productsingle.component';
import { CartComponent } from './cart/cart.component';
import { CheckoutComponent } from './checkout/checkout.component';
import { ShopComponent } from './shop/shop.component';
import { OrdersComponent } from './orders/orders.component';
import { LoginComponent } from './login/login.component';
import { SignupComponent } from './signup/signup.component';
import { AddressComponent } from './address/address.component';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { SearchComponent } from './search/search.component';
import { ProductsecondComponent } from './productsecond/productsecond.component';
import { ProductthirdComponent } from './productthird/productthird.component';
import { ProductforthComponent } from './productforth/productforth.component';
import { ProductsComponent } from './products/products.component';
import { freeapiservice } from './services/freeapiservices';
import { Header1Component } from './header1/header1.component';
import { Cart1Component } from './cart1/cart1.component';


@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    HeaderComponent,
    FooterComponent,
    ProductsingleComponent,
    CartComponent,
    CheckoutComponent,
    ShopComponent,
    OrdersComponent,
    LoginComponent,
    SignupComponent,
    AddressComponent,
    SearchComponent,
    ProductsecondComponent,
    ProductthirdComponent,
    ProductforthComponent,
    ProductsComponent,
    Header1Component,
    Cart1Component
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    SlickCarouselModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [freeapiservice],
  bootstrap: [AppComponent]
})
export class AppModule { }
