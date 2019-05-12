package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.INTERACTIVITY_TYPE;
import org.kyojo.schemaorg.m3n5.core.Container.InteractivityType;

@ExternalDomain
public class InteractivityTypeConverter implements DomainConverter<InteractivityType, String> {

	@Override
	public String fromDomainToValue(InteractivityType domain) {
		return domain.getNativeValue();
	}

	@Override
	public InteractivityType fromValueToDomain(String value) {
		return new INTERACTIVITY_TYPE(value);
	}

}
