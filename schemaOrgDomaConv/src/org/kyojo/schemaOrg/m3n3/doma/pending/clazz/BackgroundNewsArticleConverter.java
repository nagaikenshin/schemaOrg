package org.kyojo.schemaOrg.m3n3.doma.pending.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.pending.impl.BACKGROUND_NEWS_ARTICLE;
import org.kyojo.schemaOrg.m3n3.pending.Clazz.BackgroundNewsArticle;

@ExternalDomain
public class BackgroundNewsArticleConverter implements DomainConverter<BackgroundNewsArticle, String> {

	@Override
	public String fromDomainToValue(BackgroundNewsArticle domain) {
		return domain.getNativeValue();
	}

	@Override
	public BackgroundNewsArticle fromValueToDomain(String value) {
		return new BACKGROUND_NEWS_ARTICLE(value);
	}

}
