package org.kyojo.schemaorg.m3n5.doma.healthLifesci.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.healthLifesci.impl.MEDICINE_SYSTEM;
import org.kyojo.schemaorg.m3n5.healthLifesci.Clazz.MedicineSystem;

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
