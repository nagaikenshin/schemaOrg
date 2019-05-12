package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.HAS_OCCUPATION;
import org.kyojo.schemaorg.m3n5.core.Container.HasOccupation;

@ExternalDomain
public class HasOccupationConverter implements DomainConverter<HasOccupation, String> {

	@Override
	public String fromDomainToValue(HasOccupation domain) {
		return domain.getNativeValue();
	}

	@Override
	public HasOccupation fromValueToDomain(String value) {
		return new HAS_OCCUPATION(value);
	}

}
