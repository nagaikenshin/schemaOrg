package org.kyojo.schemaorg.m3n5.doma.healthLifesci.medicineSystem;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.healthLifesci.medicineSystem.CHIROPRACTIC;
import org.kyojo.schemaorg.m3n5.healthLifesci.MedicineSystem.Chiropractic;

@ExternalDomain
public class ChiropracticConverter implements DomainConverter<Chiropractic, String> {

	@Override
	public String fromDomainToValue(Chiropractic domain) {
		return domain.getNativeValue();
	}

	@Override
	public Chiropractic fromValueToDomain(String value) {
		return new CHIROPRACTIC(value);
	}

}
