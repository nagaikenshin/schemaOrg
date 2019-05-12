package org.kyojo.schemaorg.m3n5.doma.pending.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.pending.impl.EVENT_SERIES;
import org.kyojo.schemaorg.m3n5.pending.Clazz.EventSeries;

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
