package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.TELEVISION_STATION;
import org.kyojo.schemaOrg.m3n3.core.Clazz.TelevisionStation;

@ExternalDomain
public class TelevisionStationConverter implements DomainConverter<TelevisionStation, String> {

	@Override
	public String fromDomainToValue(TelevisionStation domain) {
		return domain.getNativeValue();
	}

	@Override
	public TelevisionStation fromValueToDomain(String value) {
		return new TELEVISION_STATION(value);
	}

}
