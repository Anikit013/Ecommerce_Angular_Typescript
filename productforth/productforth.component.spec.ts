import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ProductforthComponent } from './productforth.component';

describe('ProductforthComponent', () => {
  let component: ProductforthComponent;
  let fixture: ComponentFixture<ProductforthComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ProductforthComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ProductforthComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
