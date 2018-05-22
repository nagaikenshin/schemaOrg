package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.DISCUSSION_URL;
import org.kyojo.schemaOrg.m3n3.core.Container.DiscussionUrl;

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
