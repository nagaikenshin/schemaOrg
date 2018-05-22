package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.MEDICAL_TEST;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Clazz.MedicalTest;

@ExternalDomain
public class MedicalTestConverter implements DomainConverter<MedicalTest, String> {

	@Override
	public String fromDomainToValue(MedicalTest domain) {
		return domain.getNativeValue();
	}

	@Override
	public MedicalTest fromValueToDomain(String value) {
		return new MEDICAL_TEST(value);
	}

}
