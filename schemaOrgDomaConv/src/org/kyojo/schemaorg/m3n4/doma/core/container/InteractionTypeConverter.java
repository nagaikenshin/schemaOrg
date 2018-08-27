package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.INTERACTION_TYPE;
import org.kyojo.schemaorg.m3n4.core.Container.InteractionType;

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
