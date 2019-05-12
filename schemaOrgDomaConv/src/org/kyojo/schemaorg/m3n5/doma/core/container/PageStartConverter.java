package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.PAGE_START;
import org.kyojo.schemaorg.m3n5.core.Container.PageStart;

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
