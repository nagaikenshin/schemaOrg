package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.AGENT;
import org.kyojo.schemaOrg.m3n3.core.Container.Agent;

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
