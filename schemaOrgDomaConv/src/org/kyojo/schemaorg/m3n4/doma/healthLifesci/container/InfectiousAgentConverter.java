package org.kyojo.schemaorg.m3n4.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.healthLifesci.impl.INFECTIOUS_AGENT;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.InfectiousAgent;

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
