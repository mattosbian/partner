package br.com.ze.partner.domain.service;

import org.springframework.stereotype.Service;

import br.com.ze.partner.domain.domain.dto.CreatePartnerInbound;
import br.com.ze.partner.domain.domain.dto.PartnerOutBound;
import br.com.ze.partner.domain.port.CreatePartnerUseCase;
import br.com.ze.partner.domain.port.LoadPartnerPort;
import br.com.ze.partner.domain.port.SavePartnerPort;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class PartnerService implements  CreatePartnerUseCase{

	private final SavePartnerPort savePartnerPort;
	private final LoadPartnerPort loadPartnerPort;
	
	@Override
	public PartnerOutBound create(CreatePartnerInbound inBound) {
		return null;
	}

}
