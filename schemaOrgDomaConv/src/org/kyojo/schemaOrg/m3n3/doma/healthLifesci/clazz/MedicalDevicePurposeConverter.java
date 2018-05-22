package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.MEDICAL_DEVICE_PURPOSE;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Clazz.MedicalDevicePurpose;

@ExternalDomain
public class MedicalDevicePurposeConverter implements DomainConverter<MedicalDevicePurpose, String> {

	@Override
	public String fromDomainToValue(MedicalDevicePurpose domain) {
		return domain.getNativeValue();
	}

	@Override
	public MedicalDevicePurpose fromValueToDomain(String value) {
		return new MEDICAL_DEVICE_PURPOSE(value);
	}

}
