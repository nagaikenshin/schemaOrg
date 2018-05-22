package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.PAGE_END;
import org.kyojo.schemaOrg.m3n3.core.Container.PageEnd;

@ExternalDomain
public class PageEndConverter implements DomainConverter<PageEnd, String> {

	@Override
	public String fromDomainToValue(PageEnd domain) {
		return domain.getNativeValue();
	}

	@Override
	public PageEnd fromValueToDomain(String value) {
		return new PAGE_END(value);
	}

}
