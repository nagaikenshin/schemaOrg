package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.PERFORMING_ARTS_THEATER;
import org.kyojo.schemaOrg.m3n3.core.Clazz.PerformingArtsTheater;

@ExternalDomain
public class PerformingArtsTheaterConverter implements DomainConverter<PerformingArtsTheater, String> {

	@Override
	public String fromDomainToValue(PerformingArtsTheater domain) {
		return domain.getNativeValue();
	}

	@Override
	public PerformingArtsTheater fromValueToDomain(String value) {
		return new PERFORMING_ARTS_THEATER(value);
	}

}
