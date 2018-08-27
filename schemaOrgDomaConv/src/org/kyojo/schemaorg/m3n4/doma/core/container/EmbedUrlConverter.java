package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.EMBED_URL;
import org.kyojo.schemaorg.m3n4.core.Container.EmbedUrl;

@ExternalDomain
public class EmbedUrlConverter implements DomainConverter<EmbedUrl, String> {

	@Override
	public String fromDomainToValue(EmbedUrl domain) {
		return domain.getNativeValue();
	}

	@Override
	public EmbedUrl fromValueToDomain(String value) {
		return new EMBED_URL(value);
	}

}