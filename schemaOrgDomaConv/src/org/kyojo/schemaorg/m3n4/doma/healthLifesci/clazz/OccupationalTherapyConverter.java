package org.kyojo.schemaorg.m3n4.doma.healthLifesci.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.healthLifesci.impl.OCCUPATIONAL_THERAPY;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.OccupationalTherapy;

@ExternalDomain
public class OccupationalTherapyConverter implements DomainConverter<OccupationalTherapy, String> {

	@Override
	public String fromDomainToValue(OccupationalTherapy domain) {
		return domain.getNativeValue();
	}

	@Override
	public OccupationalTherapy fromValueToDomain(String value) {
		return new OCCUPATIONAL_THERAPY(value);
	}

}
