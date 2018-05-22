package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.SERIES;
import org.kyojo.schemaOrg.m3n3.core.Clazz.Series;

@ExternalDomain
public class SeriesConverter implements DomainConverter<Series, String> {

	@Override
	public String fromDomainToValue(Series domain) {
		return domain.getNativeValue();
	}

	@Override
	public Series fromValueToDomain(String value) {
		return new SERIES(value);
	}

}
