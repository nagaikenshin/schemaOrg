package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.NAIL_SALON;
import org.kyojo.schemaorg.m3n4.core.Clazz.NailSalon;

@ExternalDomain
public class NailSalonConverter implements DomainConverter<NailSalon, String> {

	@Override
	public String fromDomainToValue(NailSalon domain) {
		return domain.getNativeValue();
	}

	@Override
	public NailSalon fromValueToDomain(String value) {
		return new NAIL_SALON(value);
	}

}