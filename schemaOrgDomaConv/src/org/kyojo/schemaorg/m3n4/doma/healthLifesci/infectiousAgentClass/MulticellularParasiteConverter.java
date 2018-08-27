package org.kyojo.schemaorg.m3n4.doma.healthLifesci.infectiousAgentClass;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.healthLifesci.infectiousAgentClass.MULTICELLULAR_PARASITE;
import org.kyojo.schemaorg.m3n4.healthLifesci.InfectiousAgentClass.MulticellularParasite;

@ExternalDomain
public class MulticellularParasiteConverter implements DomainConverter<MulticellularParasite, String> {

	@Override
	public String fromDomainToValue(MulticellularParasite domain) {
		return domain.getNativeValue();
	}

	@Override
	public MulticellularParasite fromValueToDomain(String value) {
		return new MULTICELLULAR_PARASITE(value);
	}

}