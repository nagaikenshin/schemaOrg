package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.INFECTIOUS_AGENT;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.InfectiousAgent;

@ExternalDomain
public class InfectiousAgentConverter implements DomainConverter<InfectiousAgent, String> {

	@Override
	public String fromDomainToValue(InfectiousAgent domain) {
		return domain.getNativeValue();
	}

	@Override
	public InfectiousAgent fromValueToDomain(String value) {
		return new INFECTIOUS_AGENT(value);
	}

}
