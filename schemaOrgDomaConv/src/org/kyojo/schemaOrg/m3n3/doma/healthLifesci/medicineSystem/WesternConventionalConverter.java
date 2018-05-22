package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.medicineSystem;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.medicineSystem.WESTERN_CONVENTIONAL;
import org.kyojo.schemaOrg.m3n3.healthLifesci.MedicineSystem.WesternConventional;

@ExternalDomain
public class WesternConventionalConverter implements DomainConverter<WesternConventional, String> {

	@Override
	public String fromDomainToValue(WesternConventional domain) {
		return domain.getNativeValue();
	}

	@Override
	public WesternConventional fromValueToDomain(String value) {
		return new WESTERN_CONVENTIONAL(value);
	}

}
