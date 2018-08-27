package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.SUCCESSOR_OF;
import org.kyojo.schemaorg.m3n4.core.Container.SuccessorOf;

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
