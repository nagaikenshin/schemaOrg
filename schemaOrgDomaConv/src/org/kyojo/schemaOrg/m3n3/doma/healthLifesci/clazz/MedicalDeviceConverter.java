package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.MEDICAL_DEVICE;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Clazz.MedicalDevice;

@ExternalDomain
public class MedicalDeviceConverter implements DomainConverter<MedicalDevice, String> {

	@Override
	public String fromDomainToValue(MedicalDevice domain) {
		return domain.getNativeValue();
	}

	@Override
	public MedicalDevice fromValueToDomain(String value) {
		return new MEDICAL_DEVICE(value);
	}

}
