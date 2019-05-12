package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.DISCUSSION_URL;
import org.kyojo.schemaorg.m3n5.core.Container.DiscussionUrl;

@ExternalDomain
public class DiscussionUrlConverter implements DomainConverter<DiscussionUrl, String> {

	@Override
	public String fromDomainToValue(DiscussionUrl domain) {
		return domain.getNativeValue();
	}

	@Override
	public DiscussionUrl fromValueToDomain(String value) {
		return new DISCUSSION_URL(value);
	}

}
