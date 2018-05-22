package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.CAMPGROUND;
import org.kyojo.schemaOrg.m3n3.core.Clazz.Campground;

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
