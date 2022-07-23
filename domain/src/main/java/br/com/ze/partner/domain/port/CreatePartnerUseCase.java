package br.com.ze.partner.domain.port;

import br.com.ze.partner.domain.domain.dto.CreatePartnerInbound;
import br.com.ze.partner.domain.domain.dto.PartnerOutBound;

public interface CreatePartnerUseCase {

	PartnerOutBound create(CreatePartnerInbound inBound);
}
