package org.kyojo.schemaOrg.m3n3.doma.pending.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.pending.impl.OPINION_NEWS_ARTICLE;
import org.kyojo.schemaOrg.m3n3.pending.Clazz.OpinionNewsArticle;

@ExternalDomain
public class OpinionNewsArticleConverter implements DomainConverter<OpinionNewsArticle, String> {

	@Override
	public String fromDomainToValue(OpinionNewsArticle domain) {
		return domain.getNativeValue();
	}

	@Override
	public OpinionNewsArticle fromValueToDomain(String value) {
		return new OPINION_NEWS_ARTICLE(value);
	}

}
