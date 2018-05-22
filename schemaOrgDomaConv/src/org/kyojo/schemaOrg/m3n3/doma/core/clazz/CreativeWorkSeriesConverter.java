package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.CREATIVE_WORK_SERIES;
import org.kyojo.schemaOrg.m3n3.core.Clazz.CreativeWorkSeries;

@ExternalDomain
public class CreativeWorkSeriesConverter implements DomainConverter<CreativeWorkSeries, String> {

	@Override
	public String fromDomainToValue(CreativeWorkSeries domain) {
		return domain.getNativeValue();
	}

	@Override
	public CreativeWorkSeries fromValueToDomain(String value) {
		return new CREATIVE_WORK_SERIES(value);
	}

}
