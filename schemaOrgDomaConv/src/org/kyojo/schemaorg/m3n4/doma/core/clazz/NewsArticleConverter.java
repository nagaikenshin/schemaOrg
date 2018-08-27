package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.NEWS_ARTICLE;
import org.kyojo.schemaorg.m3n4.core.Clazz.NewsArticle;

@ExternalDomain
public class NewsArticleConverter implements DomainConverter<NewsArticle, String> {

	@Override
	public String fromDomainToValue(NewsArticle domain) {
		return domain.getNativeValue();
	}

	@Override
	public NewsArticle fromValueToDomain(String value) {
		return new NEWS_ARTICLE(value);
	}

}
