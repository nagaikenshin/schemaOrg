package org.kyojo.schemaorg.m3n4.doma.pending.container;

import java.util.Date;
import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.pending.impl.CONTENT_REFERENCE_TIME;
import org.kyojo.schemaorg.m3n4.pending.Container.ContentReferenceTime;

@ExternalDomain
public class ContentReferenceTimeConverter implements DomainConverter<ContentReferenceTime, Date> {

	@Override
	public Date fromDomainToValue(ContentReferenceTime domain) {
		return domain.getNativeValue();
	}

	@Override
	public ContentReferenceTime fromValueToDomain(Date value) {
		return new CONTENT_REFERENCE_TIME(value);
	}

}