package org.kyojo.schemaorg.m3n3.doma.pending.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n3.pending.impl.REPORTAGE_NEWS_ARTICLE;
import org.kyojo.schemaorg.m3n3.pending.Clazz.ReportageNewsArticle;

@ExternalDomain
public class ReportageNewsArticleConverter implements DomainConverter<ReportageNewsArticle, String> {

	@Override
	public String fromDomainToValue(ReportageNewsArticle domain) {
		return domain.getNativeValue();
	}

	@Override
	public ReportageNewsArticle fromValueToDomain(String value) {
		return new REPORTAGE_NEWS_ARTICLE(value);
	}

}
