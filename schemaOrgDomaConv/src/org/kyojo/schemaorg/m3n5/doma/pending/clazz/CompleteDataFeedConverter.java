package org.kyojo.schemaorg.m3n5.doma.pending.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.pending.impl.COMPLETE_DATA_FEED;
import org.kyojo.schemaorg.m3n5.pending.Clazz.CompleteDataFeed;

@ExternalDomain
public class CompleteDataFeedConverter implements DomainConverter<CompleteDataFeed, String> {

	@Override
	public String fromDomainToValue(CompleteDataFeed domain) {
		return domain.getNativeValue();
	}

	@Override
	public CompleteDataFeed fromValueToDomain(String value) {
		return new COMPLETE_DATA_FEED(value);
	}

}
