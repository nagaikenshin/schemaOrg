package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.PART_OF_SERIES;
import org.kyojo.schemaorg.m3n5.core.Container.PartOfSeries;

@ExternalDomain
public class PartOfSeriesConverter implements DomainConverter<PartOfSeries, String> {

	@Override
	public String fromDomainToValue(PartOfSeries domain) {
		return domain.getNativeValue();
	}

	@Override
	public PartOfSeries fromValueToDomain(String value) {
		return new PART_OF_SERIES(value);
	}

}
