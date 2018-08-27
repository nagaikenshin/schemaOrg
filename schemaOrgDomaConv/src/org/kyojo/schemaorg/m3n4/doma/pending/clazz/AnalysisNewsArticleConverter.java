package org.kyojo.schemaorg.m3n4.doma.pending.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.pending.impl.ANALYSIS_NEWS_ARTICLE;
import org.kyojo.schemaorg.m3n4.pending.Clazz.AnalysisNewsArticle;

@ExternalDomain
public class AnalysisNewsArticleConverter implements DomainConverter<AnalysisNewsArticle, String> {

	@Override
	public String fromDomainToValue(AnalysisNewsArticle domain) {
		return domain.getNativeValue();
	}

	@Override
	public AnalysisNewsArticle fromValueToDomain(String value) {
		return new ANALYSIS_NEWS_ARTICLE(value);
	}

}
