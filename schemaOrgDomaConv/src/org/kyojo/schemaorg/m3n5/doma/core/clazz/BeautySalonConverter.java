package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.BEAUTY_SALON;
import org.kyojo.schemaorg.m3n5.core.Clazz.BeautySalon;

@ExternalDomain
public class BeautySalonConverter implements DomainConverter<BeautySalon, String> {

	@Override
	public String fromDomainToValue(BeautySalon domain) {
		return domain.getNativeValue();
	}

	@Override
	public BeautySalon fromValueToDomain(String value) {
		return new BEAUTY_SALON(value);
	}

}
