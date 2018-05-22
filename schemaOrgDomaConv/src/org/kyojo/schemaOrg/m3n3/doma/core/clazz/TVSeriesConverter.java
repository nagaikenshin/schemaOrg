package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.TV_SERIES;
import org.kyojo.schemaOrg.m3n3.core.Clazz.TVSeries;

@ExternalDomain
public class TVSeriesConverter implements DomainConverter<TVSeries, String> {

	@Override
	public String fromDomainToValue(TVSeries domain) {
		return domain.getNativeValue();
	}

	@Override
	public TVSeries fromValueToDomain(String value) {
		return new TV_SERIES(value);
	}

}
