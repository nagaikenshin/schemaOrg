package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.SUCCESSOR_OF;
import org.kyojo.schemaOrg.m3n3.core.Container.SuccessorOf;

@ExternalDomain
public class SuccessorOfConverter implements DomainConverter<SuccessorOf, String> {

	@Override
	public String fromDomainToValue(SuccessorOf domain) {
		return domain.getNativeValue();
	}

	@Override
	public SuccessorOf fromValueToDomain(String value) {
		return new SUCCESSOR_OF(value);
	}

}
