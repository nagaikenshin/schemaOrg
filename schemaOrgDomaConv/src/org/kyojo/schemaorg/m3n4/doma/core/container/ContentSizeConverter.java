package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.CONTENT_SIZE;
import org.kyojo.schemaorg.m3n4.core.Container.ContentSize;

@ExternalDomain
public class ContentSizeConverter implements DomainConverter<ContentSize, String> {

	@Override
	public String fromDomainToValue(ContentSize domain) {
		return domain.getNativeValue();
	}

	@Override
	public ContentSize fromValueToDomain(String value) {
		return new CONTENT_SIZE(value);
	}

}
