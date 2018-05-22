package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.REAL_ESTATE_AGENT;
import org.kyojo.schemaOrg.m3n3.core.Clazz.RealEstateAgent;

@ExternalDomain
public class RealEstateAgentConverter implements DomainConverter<RealEstateAgent, String> {

	@Override
	public String fromDomainToValue(RealEstateAgent domain) {
		return domain.getNativeValue();
	}

	@Override
	public RealEstateAgent fromValueToDomain(String value) {
		return new REAL_ESTATE_AGENT(value);
	}

}
