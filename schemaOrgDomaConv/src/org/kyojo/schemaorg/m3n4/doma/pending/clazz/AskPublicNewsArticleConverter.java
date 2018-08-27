package org.kyojo.schemaorg.m3n4.doma.pending.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.pending.impl.ASK_PUBLIC_NEWS_ARTICLE;
import org.kyojo.schemaorg.m3n4.pending.Clazz.AskPublicNewsArticle;

@ExternalDomain
public class AskPublicNewsArticleConverter implements DomainConverter<AskPublicNewsArticle, String> {

	@Override
	public String fromDomainToValue(AskPublicNewsArticle domain) {
		return domain.getNativeValue();
	}

	@Override
	public AskPublicNewsArticle fromValueToDomain(String value) {
		return new ASK_PUBLIC_NEWS_ARTICLE(value);
	}

}
