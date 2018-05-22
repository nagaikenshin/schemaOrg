package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.CATALOG_NUMBER;
import org.kyojo.schemaOrg.m3n3.core.Container.CatalogNumber;

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
