package org.kyojo.schemaOrg.m3n3.doma.pending.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.pending.impl.REVIEW_NEWS_ARTICLE;
import org.kyojo.schemaOrg.m3n3.pending.Clazz.ReviewNewsArticle;

@ExternalDomain
public class ReviewNewsArticleConverter implements DomainConverter<ReviewNewsArticle, String> {

	@Override
	public String fromDomainToValue(ReviewNewsArticle domain) {
		return domain.getNativeValue();
	}

	@Override
	public ReviewNewsArticle fromValueToDomain(String value) {
		return new REVIEW_NEWS_ARTICLE(value);
	}

}
