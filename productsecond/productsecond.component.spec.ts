import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ProductsecondComponent } from './productsecond.component';

describe('ProductsecondComponent', () => {
  let component: ProductsecondComponent;
  let fixture: ComponentFixture<ProductsecondComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ProductsecondComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ProductsecondComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
