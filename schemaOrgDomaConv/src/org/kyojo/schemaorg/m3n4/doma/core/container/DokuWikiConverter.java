package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.DOKU_WIKI;
import org.kyojo.schemaorg.m3n4.core.Container.DokuWiki;

@ExternalDomain
public class DokuWikiConverter implements DomainConverter<DokuWiki, String> {

	@Override
	public String fromDomainToValue(DokuWiki domain) {
		return domain.getNativeValue();
	}

	@Override
	public DokuWiki fromValueToDomain(String value) {
		return new DOKU_WIKI(value);
	}

}
