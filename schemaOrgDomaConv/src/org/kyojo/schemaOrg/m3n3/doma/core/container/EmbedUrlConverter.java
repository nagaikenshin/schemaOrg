package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.EMBED_URL;
import org.kyojo.schemaOrg.m3n3.core.Container.EmbedUrl;

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
