package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.INTERACTIVITY_TYPE;
import org.kyojo.schemaOrg.m3n3.core.Container.InteractivityType;

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
