package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.TYPICAL_TEST;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.TypicalTest;

@ExternalDomain
public class TypicalTestConverter implements DomainConverter<TypicalTest, String> {

	@Override
	public String fromDomainToValue(TypicalTest domain) {
		return domain.getNativeValue();
	}

	@Override
	public TypicalTest fromValueToDomain(String value) {
		return new TYPICAL_TEST(value);
	}

}
