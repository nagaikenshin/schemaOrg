package org.kyojo.schemaorg.m3n5.doma.healthLifesci.medicineSystem;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.healthLifesci.medicineSystem.WESTERN_CONVENTIONAL;
import org.kyojo.schemaorg.m3n5.healthLifesci.MedicineSystem.WesternConventional;

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
