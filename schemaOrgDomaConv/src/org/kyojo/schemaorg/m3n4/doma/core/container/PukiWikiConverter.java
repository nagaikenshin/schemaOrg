package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.PUKI_WIKI;
import org.kyojo.schemaorg.m3n4.core.Container.PukiWiki;

@ExternalDomain
public class PukiWikiConverter implements DomainConverter<PukiWiki, String> {

	@Override
	public String fromDomainToValue(PukiWiki domain) {
		return domain.getNativeValue();
	}

	@Override
	public PukiWiki fromValueToDomain(String value) {
		return new PUKI_WIKI(value);
	}

}
