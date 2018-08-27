package org.kyojo.schemaorg.m3n4.doma.healthLifesci.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.healthLifesci.impl.PHYSICAL_THERAPY;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.PhysicalTherapy;

@ExternalDomain
public class PhysicalTherapyConverter implements DomainConverter<PhysicalTherapy, String> {

	@Override
	public String fromDomainToValue(PhysicalTherapy domain) {
		return domain.getNativeValue();
	}

	@Override
	public PhysicalTherapy fromValueToDomain(String value) {
		return new PHYSICAL_THERAPY(value);
	}

}
