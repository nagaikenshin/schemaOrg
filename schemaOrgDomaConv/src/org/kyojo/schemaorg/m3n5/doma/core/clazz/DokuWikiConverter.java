package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.DOKU_WIKI;
import org.kyojo.schemaorg.m3n5.core.Clazz.DokuWiki;

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
