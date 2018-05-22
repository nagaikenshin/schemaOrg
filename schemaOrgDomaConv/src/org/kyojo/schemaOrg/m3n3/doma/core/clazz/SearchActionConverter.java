package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.SEARCH_ACTION;
import org.kyojo.schemaOrg.m3n3.core.Clazz.SearchAction;

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
