package org.kyojo.schemaorg.m3n4.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.healthLifesci.impl.INFECTIOUS_AGENT_CLASS;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.InfectiousAgentClass;

@ExternalDomain
public class InfectiousAgentClassConverter implements DomainConverter<InfectiousAgentClass, String> {

	@Override
	public String fromDomainToValue(InfectiousAgentClass domain) {
		return domain.getNativeValue();
	}

	@Override
	public InfectiousAgentClass fromValueToDomain(String value) {
		return new INFECTIOUS_AGENT_CLASS(value);
	}

}
