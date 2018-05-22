package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.RADIATION_THERAPY;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Clazz.RadiationTherapy;

@ExternalDomain
public class RadiationTherapyConverter implements DomainConverter<RadiationTherapy, String> {

	@Override
	public String fromDomainToValue(RadiationTherapy domain) {
		return domain.getNativeValue();
	}

	@Override
	public RadiationTherapy fromValueToDomain(String value) {
		return new RADIATION_THERAPY(value);
	}

}
