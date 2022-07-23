package br.com.ze.partner.application.adapters.web;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ze.partner.application.api.PartnersApi;
import br.com.ze.partner.application.mapper.PartnerMapper;
import br.com.ze.partner.application.provider.presentation.representation.PartnerRequestRepresentation;
import br.com.ze.partner.application.provider.presentation.representation.PartnerResponseRepresentation;
import br.com.ze.partner.domain.domain.dto.PartnerOutBound;
import br.com.ze.partner.domain.port.CreatePartnerUseCase;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "v1")
public class PartnerController implements PartnersApi  {


	private final PartnerMapper mapper;
	
	private final CreatePartnerUseCase createPartnerUseCase;
	
		
	@Override
	public ResponseEntity<PartnerResponseRepresentation> createPartner(PartnerRequestRepresentation requestRepresentation) {
		
		PartnerOutBound outBound = createPartnerUseCase
				                       .create(mapper.toInBound(requestRepresentation));
		
		return new ResponseEntity<>(mapper
				                      .toResponseRepresentation(outBound), HttpStatus.CREATED) ;
	}

}
