package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.ADULT_ENTERTAINMENT;
import org.kyojo.schemaorg.m3n5.core.Clazz.AdultEntertainment;

@ExternalDomain
public class AdultEntertainmentConverter implements DomainConverter<AdultEntertainment, String> {

	@Override
	public String fromDomainToValue(AdultEntertainment domain) {
		return domain.getNativeValue();
	}

	@Override
	public AdultEntertainment fromValueToDomain(String value) {
		return new ADULT_ENTERTAINMENT(value);
	}

}
