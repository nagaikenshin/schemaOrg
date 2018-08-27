package org.kyojo.schemaorg.m3n4.doma.pending.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.pending.impl.ADVERTISER_CONTENT_ARTICLE;
import org.kyojo.schemaorg.m3n4.pending.Clazz.AdvertiserContentArticle;

@ExternalDomain
public class AdvertiserContentArticleConverter implements DomainConverter<AdvertiserContentArticle, String> {

	@Override
	public String fromDomainToValue(AdvertiserContentArticle domain) {
		return domain.getNativeValue();
	}

	@Override
	public AdvertiserContentArticle fromValueToDomain(String value) {
		return new ADVERTISER_CONTENT_ARTICLE(value);
	}

}