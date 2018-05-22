package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.PLACE_OF_WORSHIP;
import org.kyojo.schemaOrg.m3n3.core.Clazz.PlaceOfWorship;

@ExternalDomain
public class PlaceOfWorshipConverter implements DomainConverter<PlaceOfWorship, String> {

	@Override
	public String fromDomainToValue(PlaceOfWorship domain) {
		return domain.getNativeValue();
	}

	@Override
	public PlaceOfWorship fromValueToDomain(String value) {
		return new PLACE_OF_WORSHIP(value);
	}

}
