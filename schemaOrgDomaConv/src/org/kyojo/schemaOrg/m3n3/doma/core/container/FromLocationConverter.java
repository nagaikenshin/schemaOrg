package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.FROM_LOCATION;
import org.kyojo.schemaOrg.m3n3.core.Container.FromLocation;

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
