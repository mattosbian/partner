package br.com.ze.partner.domain.port;

import java.util.List;

import br.com.ze.partner.domain.domain.Partner;

public interface LoadPartnerPort {

	List<Partner> findAll();
}
