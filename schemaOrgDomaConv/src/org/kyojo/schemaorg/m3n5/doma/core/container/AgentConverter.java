package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.AGENT;
import org.kyojo.schemaorg.m3n5.core.Container.Agent;

@ExternalDomain
public class AgentConverter implements DomainConverter<Agent, String> {

	@Override
	public String fromDomainToValue(Agent domain) {
		return domain.getNativeValue();
	}

	@Override
	public Agent fromValueToDomain(String value) {
		return new AGENT(value);
	}

}
