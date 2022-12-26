package com.pelatro.pelatrocartapp.service;

import com.pelatro.pelatrocartapp.commonresponse.PelatrocartResponse;
import com.pelatro.pelatrocartapp.entity.BillingAddress;

public interface BillingAddressService {
	PelatrocartResponse registerUser(BillingAddress billingAddress);

}
