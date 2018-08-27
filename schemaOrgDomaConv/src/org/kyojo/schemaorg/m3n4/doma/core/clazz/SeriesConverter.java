package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.SERIES;
import org.kyojo.schemaorg.m3n4.core.Clazz.Series;

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
