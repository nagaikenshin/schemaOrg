package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.DATA_FEED_ELEMENT;
import org.kyojo.schemaOrg.m3n3.core.Container.DataFeedElement;

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
