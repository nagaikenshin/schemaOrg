package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.SEARCH_ACTION;
import org.kyojo.schemaorg.m3n4.core.Clazz.SearchAction;

@ExternalDomain
public class SearchActionConverter implements DomainConverter<SearchAction, String> {

	@Override
	public String fromDomainToValue(SearchAction domain) {
		return domain.getNativeValue();
	}

	@Override
	public SearchAction fromValueToDomain(String value) {
		return new SEARCH_ACTION(value);
	}

}
