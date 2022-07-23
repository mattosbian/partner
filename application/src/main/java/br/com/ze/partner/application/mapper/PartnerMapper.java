package br.com.ze.partner.application.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import br.com.ze.partner.application.provider.presentation.representation.PartnerRequestRepresentation;
import br.com.ze.partner.application.provider.presentation.representation.PartnerResponseRepresentation;
import br.com.ze.partner.domain.domain.dto.CreatePartnerInbound;
import br.com.ze.partner.domain.domain.dto.PartnerOutBound;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Component
public class PartnerMapper {

	private final ModelMapper modelMapper;

	public CreatePartnerInbound toInBound(PartnerRequestRepresentation requestRepresentation) {
		return modelMapper.map(requestRepresentation, CreatePartnerInbound.class);
	}

	public PartnerResponseRepresentation toResponseRepresentation(PartnerOutBound outBound) {
		return modelMapper.map(outBound,PartnerResponseRepresentation.class);
	}
	
	
	
}
