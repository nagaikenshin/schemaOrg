package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.medicineSystem;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.medicineSystem.OSTEOPATHIC;
import org.kyojo.schemaOrg.m3n3.healthLifesci.MedicineSystem.Osteopathic;

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
