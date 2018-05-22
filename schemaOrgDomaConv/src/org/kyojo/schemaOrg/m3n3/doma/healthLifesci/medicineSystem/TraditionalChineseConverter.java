package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.medicineSystem;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.medicineSystem.TRADITIONAL_CHINESE;
import org.kyojo.schemaOrg.m3n3.healthLifesci.MedicineSystem.TraditionalChinese;

@ExternalDomain
public class TraditionalChineseConverter implements DomainConverter<TraditionalChinese, String> {

	@Override
	public String fromDomainToValue(TraditionalChinese domain) {
		return domain.getNativeValue();
	}

	@Override
	public TraditionalChinese fromValueToDomain(String value) {
		return new TRADITIONAL_CHINESE(value);
	}

}
