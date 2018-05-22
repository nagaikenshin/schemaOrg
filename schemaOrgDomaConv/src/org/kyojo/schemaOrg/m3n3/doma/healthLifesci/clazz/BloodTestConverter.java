package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.BLOOD_TEST;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Clazz.BloodTest;

@ExternalDomain
public class BloodTestConverter implements DomainConverter<BloodTest, String> {

	@Override
	public String fromDomainToValue(BloodTest domain) {
		return domain.getNativeValue();
	}

	@Override
	public BloodTest fromValueToDomain(String value) {
		return new BLOOD_TEST(value);
	}

}
