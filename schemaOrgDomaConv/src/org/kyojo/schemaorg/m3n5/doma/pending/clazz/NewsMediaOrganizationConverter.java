package org.kyojo.schemaorg.m3n5.doma.pending.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.pending.impl.NEWS_MEDIA_ORGANIZATION;
import org.kyojo.schemaorg.m3n5.pending.Clazz.NewsMediaOrganization;

@ExternalDomain
public class NewsMediaOrganizationConverter implements DomainConverter<NewsMediaOrganization, String> {

	@Override
	public String fromDomainToValue(NewsMediaOrganization domain) {
		return domain.getNativeValue();
	}

	@Override
	public NewsMediaOrganization fromValueToDomain(String value) {
		return new NEWS_MEDIA_ORGANIZATION(value);
	}

}
