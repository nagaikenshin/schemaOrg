package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.FROM_LOCATION;
import org.kyojo.schemaorg.m3n4.core.Container.FromLocation;

@ExternalDomain
public class FromLocationConverter implements DomainConverter<FromLocation, String> {

	@Override
	public String fromDomainToValue(FromLocation domain) {
		return domain.getNativeValue();
	}

	@Override
	public FromLocation fromValueToDomain(String value) {
		return new FROM_LOCATION(value);
	}

}
