package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.QUERY;
import org.kyojo.schemaOrg.m3n3.core.Container.Query;

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
