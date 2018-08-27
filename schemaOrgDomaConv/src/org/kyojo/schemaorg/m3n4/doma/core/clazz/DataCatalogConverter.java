package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.DATA_CATALOG;
import org.kyojo.schemaorg.m3n4.core.Clazz.DataCatalog;

@ExternalDomain
public class DataCatalogConverter implements DomainConverter<DataCatalog, String> {

	@Override
	public String fromDomainToValue(DataCatalog domain) {
		return domain.getNativeValue();
	}

	@Override
	public DataCatalog fromValueToDomain(String value) {
		return new DATA_CATALOG(value);
	}

}
