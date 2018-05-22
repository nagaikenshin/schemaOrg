package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.MEDICINE_SYSTEM;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.MedicineSystem;

@ExternalDomain
public class MedicineSystemConverter implements DomainConverter<MedicineSystem, String> {

	@Override
	public String fromDomainToValue(MedicineSystem domain) {
		return domain.getNativeValue();
	}

	@Override
	public MedicineSystem fromValueToDomain(String value) {
		return new MEDICINE_SYSTEM(value);
	}

}
