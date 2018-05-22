package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.INTERACTION_TYPE;
import org.kyojo.schemaOrg.m3n3.core.Container.InteractionType;

@ExternalDomain
public class InteractionTypeConverter implements DomainConverter<InteractionType, String> {

	@Override
	public String fromDomainToValue(InteractionType domain) {
		return domain.getNativeValue();
	}

	@Override
	public InteractionType fromValueToDomain(String value) {
		return new INTERACTION_TYPE(value);
	}

}
