package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.REPLY_TO_URL;
import org.kyojo.schemaorg.m3n4.core.Container.ReplyToUrl;

@ExternalDomain
public class ReplyToUrlConverter implements DomainConverter<ReplyToUrl, String> {

	@Override
	public String fromDomainToValue(ReplyToUrl domain) {
		return domain.getNativeValue();
	}

	@Override
	public ReplyToUrl fromValueToDomain(String value) {
		return new REPLY_TO_URL(value);
	}

}
