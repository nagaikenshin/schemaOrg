package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.AVAILABLE_TEST;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.AvailableTest;

@ExternalDomain
public class AvailableTestConverter implements DomainConverter<AvailableTest, String> {

	@Override
	public String fromDomainToValue(AvailableTest domain) {
		return domain.getNativeValue();
	}

	@Override
	public AvailableTest fromValueToDomain(String value) {
		return new AVAILABLE_TEST(value);
	}

}
