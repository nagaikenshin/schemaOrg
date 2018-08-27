package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.QUERY;
import org.kyojo.schemaorg.m3n4.core.Container.Query;

@ExternalDomain
public class QueryConverter implements DomainConverter<Query, String> {

	@Override
	public String fromDomainToValue(Query domain) {
		return domain.getNativeValue();
	}

	@Override
	public Query fromValueToDomain(String value) {
		return new QUERY(value);
	}

}
