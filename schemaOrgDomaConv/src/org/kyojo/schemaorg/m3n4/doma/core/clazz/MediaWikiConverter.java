package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.MEDIA_WIKI;
import org.kyojo.schemaorg.m3n4.core.Clazz.MediaWiki;

@ExternalDomain
public class MediaWikiConverter implements DomainConverter<MediaWiki, String> {

	@Override
	public String fromDomainToValue(MediaWiki domain) {
		return domain.getNativeValue();
	}

	@Override
	public MediaWiki fromValueToDomain(String value) {
		return new MEDIA_WIKI(value);
	}

}