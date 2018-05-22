package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.RADIO_SERIES;
import org.kyojo.schemaOrg.m3n3.core.Clazz.RadioSeries;

@ExternalDomain
public class RadioSeriesConverter implements DomainConverter<RadioSeries, String> {

	@Override
	public String fromDomainToValue(RadioSeries domain) {
		return domain.getNativeValue();
	}

	@Override
	public RadioSeries fromValueToDomain(String value) {
		return new RADIO_SERIES(value);
	}

}
