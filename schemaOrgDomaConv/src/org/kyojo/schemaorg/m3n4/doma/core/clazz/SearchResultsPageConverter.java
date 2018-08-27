package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.SEARCH_RESULTS_PAGE;
import org.kyojo.schemaorg.m3n4.core.Clazz.SearchResultsPage;

@ExternalDomain
public class SearchResultsPageConverter implements DomainConverter<SearchResultsPage, String> {

	@Override
	public String fromDomainToValue(SearchResultsPage domain) {
		return domain.getNativeValue();
	}

	@Override
	public SearchResultsPage fromValueToDomain(String value) {
		return new SEARCH_RESULTS_PAGE(value);
	}

}
