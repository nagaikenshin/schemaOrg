package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.ACCOMMODATION;
import org.kyojo.schemaorg.m3n4.core.Clazz.Accommodation;

@ExternalDomain
public class AccommodationConverter implements DomainConverter<Accommodation, String> {

	@Override
	public String fromDomainToValue(Accommodation domain) {
		return domain.getNativeValue();
	}

	@Override
	public Accommodation fromValueToDomain(String value) {
		return new ACCOMMODATION(value);
	}

}
