package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.MEDICAL_BUSINESS;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Clazz.MedicalBusiness;

@ExternalDomain
public class MedicalBusinessConverter implements DomainConverter<MedicalBusiness, String> {

	@Override
	public String fromDomainToValue(MedicalBusiness domain) {
		return domain.getNativeValue();
	}

	@Override
	public MedicalBusiness fromValueToDomain(String value) {
		return new MEDICAL_BUSINESS(value);
	}

}
