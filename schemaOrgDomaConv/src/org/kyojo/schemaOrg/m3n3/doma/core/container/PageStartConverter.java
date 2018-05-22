package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.PAGE_START;
import org.kyojo.schemaOrg.m3n3.core.Container.PageStart;

@ExternalDomain
public class PageStartConverter implements DomainConverter<PageStart, String> {

	@Override
	public String fromDomainToValue(PageStart domain) {
		return domain.getNativeValue();
	}

	@Override
	public PageStart fromValueToDomain(String value) {
		return new PAGE_START(value);
	}

}
