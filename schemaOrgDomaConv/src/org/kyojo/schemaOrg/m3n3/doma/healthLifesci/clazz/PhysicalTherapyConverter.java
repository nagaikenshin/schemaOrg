package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.PHYSICAL_THERAPY;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Clazz.PhysicalTherapy;

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
