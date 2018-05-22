package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.HAIR_SALON;
import org.kyojo.schemaOrg.m3n3.core.Clazz.HairSalon;

@ExternalDomain
public class HairSalonConverter implements DomainConverter<HairSalon, String> {

	@Override
	public String fromDomainToValue(HairSalon domain) {
		return domain.getNativeValue();
	}

	@Override
	public HairSalon fromValueToDomain(String value) {
		return new HAIR_SALON(value);
	}

}
