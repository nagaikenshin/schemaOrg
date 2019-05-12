package org.kyojo.schemaorg.m3n5.doma.healthLifesci.medicineSystem;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.healthLifesci.medicineSystem.AYURVEDIC;
import org.kyojo.schemaorg.m3n5.healthLifesci.MedicineSystem.Ayurvedic;

@ExternalDomain
public class AyurvedicConverter implements DomainConverter<Ayurvedic, String> {

	@Override
	public String fromDomainToValue(Ayurvedic domain) {
		return domain.getNativeValue();
	}

	@Override
	public Ayurvedic fromValueToDomain(String value) {
		return new AYURVEDIC(value);
	}

}
