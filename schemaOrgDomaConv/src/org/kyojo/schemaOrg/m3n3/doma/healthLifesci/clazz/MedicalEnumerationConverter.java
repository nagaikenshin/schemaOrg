package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.MEDICAL_ENUMERATION;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Clazz.MedicalEnumeration;

@ExternalDomain
public class MedicalEnumerationConverter implements DomainConverter<MedicalEnumeration, String> {

	@Override
	public String fromDomainToValue(MedicalEnumeration domain) {
		return domain.getNativeValue();
	}

	@Override
	public MedicalEnumeration fromValueToDomain(String value) {
		return new MEDICAL_ENUMERATION(value);
	}

}
