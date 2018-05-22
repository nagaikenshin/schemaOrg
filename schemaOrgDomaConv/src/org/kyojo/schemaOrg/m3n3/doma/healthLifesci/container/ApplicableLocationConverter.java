package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.APPLICABLE_LOCATION;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.ApplicableLocation;

@ExternalDomain
public class ApplicableLocationConverter implements DomainConverter<ApplicableLocation, String> {

	@Override
	public String fromDomainToValue(ApplicableLocation domain) {
		return domain.getNativeValue();
	}

	@Override
	public ApplicableLocation fromValueToDomain(String value) {
		return new APPLICABLE_LOCATION(value);
	}

}
