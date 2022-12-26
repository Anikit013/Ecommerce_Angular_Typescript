import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ProductthirdComponent } from './productthird.component';

describe('ProductthirdComponent', () => {
  let component: ProductthirdComponent;
  let fixture: ComponentFixture<ProductthirdComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ProductthirdComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ProductthirdComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
