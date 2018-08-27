package org.kyojo.schemaorg.m3n4.doma.healthLifesci.medicineSystem;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.healthLifesci.medicineSystem.TRADITIONAL_CHINESE;
import org.kyojo.schemaorg.m3n4.healthLifesci.MedicineSystem.TraditionalChinese;

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