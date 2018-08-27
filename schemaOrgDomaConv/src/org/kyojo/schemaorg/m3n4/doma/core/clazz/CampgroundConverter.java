package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.CAMPGROUND;
import org.kyojo.schemaorg.m3n4.core.Clazz.Campground;

@ExternalDomain
public class CampgroundConverter implements DomainConverter<Campground, String> {

	@Override
	public String fromDomainToValue(Campground domain) {
		return domain.getNativeValue();
	}

	@Override
	public Campground fromValueToDomain(String value) {
		return new CAMPGROUND(value);
	}

}