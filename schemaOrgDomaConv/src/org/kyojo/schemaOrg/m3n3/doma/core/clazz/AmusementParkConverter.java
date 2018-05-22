package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.AMUSEMENT_PARK;
import org.kyojo.schemaOrg.m3n3.core.Clazz.AmusementPark;

@ExternalDomain
public class AmusementParkConverter implements DomainConverter<AmusementPark, String> {

	@Override
	public String fromDomainToValue(AmusementPark domain) {
		return domain.getNativeValue();
	}

	@Override
	public AmusementPark fromValueToDomain(String value) {
		return new AMUSEMENT_PARK(value);
	}

}
