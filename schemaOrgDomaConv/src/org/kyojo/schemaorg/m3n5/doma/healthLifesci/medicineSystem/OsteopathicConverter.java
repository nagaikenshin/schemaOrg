package org.kyojo.schemaorg.m3n5.doma.healthLifesci.medicineSystem;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.healthLifesci.medicineSystem.OSTEOPATHIC;
import org.kyojo.schemaorg.m3n5.healthLifesci.MedicineSystem.Osteopathic;

@ExternalDomain
public class OsteopathicConverter implements DomainConverter<Osteopathic, String> {

	@Override
	public String fromDomainToValue(Osteopathic domain) {
		return domain.getNativeValue();
	}

	@Override
	public Osteopathic fromValueToDomain(String value) {
		return new OSTEOPATHIC(value);
	}

}