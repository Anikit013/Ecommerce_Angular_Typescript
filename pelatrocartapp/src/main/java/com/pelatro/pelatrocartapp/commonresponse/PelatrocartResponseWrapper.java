package com.pelatro.pelatrocartapp.commonresponse;

public class PelatrocartResponseWrapper {
	
	public PelatrocartResponse createResponse(String status, Object content) {
		PelatrocartResponse pelatroResp = new PelatrocartResponse();
		pelatroResp.setStatus(status);
		pelatroResp.setContent(content);
		return pelatroResp;
	}

}
