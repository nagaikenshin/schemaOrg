package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.INFECTIOUS_AGENT_CLASS;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Clazz.InfectiousAgentClass;

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
