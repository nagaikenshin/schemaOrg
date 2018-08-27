package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.TELEVISION_STATION;
import org.kyojo.schemaorg.m3n4.core.Clazz.TelevisionStation;

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
