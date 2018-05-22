package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.DATA_FEED;
import org.kyojo.schemaOrg.m3n3.core.Clazz.DataFeed;

@ExternalDomain
public class DataFeedConverter implements DomainConverter<DataFeed, String> {

	@Override
	public String fromDomainToValue(DataFeed domain) {
		return domain.getNativeValue();
	}

	@Override
	public DataFeed fromValueToDomain(String value) {
		return new DATA_FEED(value);
	}

}
