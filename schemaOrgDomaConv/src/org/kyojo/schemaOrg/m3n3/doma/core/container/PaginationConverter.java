package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.PAGINATION;
import org.kyojo.schemaOrg.m3n3.core.Container.Pagination;

@ExternalDomain
public class PaginationConverter implements DomainConverter<Pagination, String> {

	@Override
	public String fromDomainToValue(Pagination domain) {
		return domain.getNativeValue();
	}

	@Override
	public Pagination fromValueToDomain(String value) {
		return new PAGINATION(value);
	}

}
