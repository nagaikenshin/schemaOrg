package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.INCLUDED_IN_DATA_CATALOG;
import org.kyojo.schemaorg.m3n5.core.Container.IncludedInDataCatalog;

@ExternalDomain
public class IncludedInDataCatalogConverter implements DomainConverter<IncludedInDataCatalog, String> {

	@Override
	public String fromDomainToValue(IncludedInDataCatalog domain) {
		return domain.getNativeValue();
	}

	@Override
	public IncludedInDataCatalog fromValueToDomain(String value) {
		return new INCLUDED_IN_DATA_CATALOG(value);
	}

}
