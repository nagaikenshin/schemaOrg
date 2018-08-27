package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.DATA_FEED_ELEMENT;
import org.kyojo.schemaorg.m3n4.core.Container.DataFeedElement;

@ExternalDomain
public class DataFeedElementConverter implements DomainConverter<DataFeedElement, String> {

	@Override
	public String fromDomainToValue(DataFeedElement domain) {
		return domain.getNativeValue();
	}

	@Override
	public DataFeedElement fromValueToDomain(String value) {
		return new DATA_FEED_ELEMENT(value);
	}

}
