package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.medicineSystem;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.medicineSystem.HOMEOPATHIC;
import org.kyojo.schemaOrg.m3n3.healthLifesci.MedicineSystem.Homeopathic;

@ExternalDomain
public class HomeopathicConverter implements DomainConverter<Homeopathic, String> {

	@Override
	public String fromDomainToValue(Homeopathic domain) {
		return domain.getNativeValue();
	}

	@Override
	public Homeopathic fromValueToDomain(String value) {
		return new HOMEOPATHIC(value);
	}

}
