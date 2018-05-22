package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.REPLY_TO_URL;
import org.kyojo.schemaOrg.m3n3.core.Container.ReplyToUrl;

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
