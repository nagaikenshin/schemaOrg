package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.PAGINATION;
import org.kyojo.schemaorg.m3n5.core.Container.Pagination;

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
