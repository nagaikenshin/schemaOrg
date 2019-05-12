package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.DATA_FEED_ITEM;
import org.kyojo.schemaorg.m3n5.core.Clazz.DataFeedItem;

@ExternalDomain
public class DataFeedItemConverter implements DomainConverter<DataFeedItem, String> {

	@Override
	public String fromDomainToValue(DataFeedItem domain) {
		return domain.getNativeValue();
	}

	@Override
	public DataFeedItem fromValueToDomain(String value) {
		return new DATA_FEED_ITEM(value);
	}

}
