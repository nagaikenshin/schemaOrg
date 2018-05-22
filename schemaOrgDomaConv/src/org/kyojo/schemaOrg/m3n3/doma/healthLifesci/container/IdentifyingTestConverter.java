package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.IDENTIFYING_TEST;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.IdentifyingTest;

@ExternalDomain
public class IdentifyingTestConverter implements DomainConverter<IdentifyingTest, String> {

	@Override
	public String fromDomainToValue(IdentifyingTest domain) {
		return domain.getNativeValue();
	}

	@Override
	public IdentifyingTest fromValueToDomain(String value) {
		return new IDENTIFYING_TEST(value);
	}

}
