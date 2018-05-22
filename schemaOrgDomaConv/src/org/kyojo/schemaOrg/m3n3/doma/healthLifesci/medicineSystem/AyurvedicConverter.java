package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.medicineSystem;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.medicineSystem.AYURVEDIC;
import org.kyojo.schemaOrg.m3n3.healthLifesci.MedicineSystem.Ayurvedic;

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
