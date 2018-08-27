package org.kyojo.schemaorg.m3n4.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.healthLifesci.impl.BODY_LOCATION;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.BodyLocation;

@ExternalDomain
public class BodyLocationConverter implements DomainConverter<BodyLocation, String> {

	@Override
	public String fromDomainToValue(BodyLocation domain) {
		return domain.getNativeValue();
	}

	@Override
	public BodyLocation fromValueToDomain(String value) {
		return new BODY_LOCATION(value);
	}

}