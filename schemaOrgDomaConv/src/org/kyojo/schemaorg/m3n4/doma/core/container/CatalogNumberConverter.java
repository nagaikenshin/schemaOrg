package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.CATALOG_NUMBER;
import org.kyojo.schemaorg.m3n4.core.Container.CatalogNumber;

@ExternalDomain
public class CatalogNumberConverter implements DomainConverter<CatalogNumber, String> {

	@Override
	public String fromDomainToValue(CatalogNumber domain) {
		return domain.getNativeValue();
	}

	@Override
	public CatalogNumber fromValueToDomain(String value) {
		return new CATALOG_NUMBER(value);
	}

}
