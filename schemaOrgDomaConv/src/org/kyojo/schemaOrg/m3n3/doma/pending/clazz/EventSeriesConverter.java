package org.kyojo.schemaOrg.m3n3.doma.pending.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.pending.impl.EVENT_SERIES;
import org.kyojo.schemaOrg.m3n3.pending.Clazz.EventSeries;

@ExternalDomain
public class EventSeriesConverter implements DomainConverter<EventSeries, String> {

	@Override
	public String fromDomainToValue(EventSeries domain) {
		return domain.getNativeValue();
	}

	@Override
	public EventSeries fromValueToDomain(String value) {
		return new EVENT_SERIES(value);
	}

}
