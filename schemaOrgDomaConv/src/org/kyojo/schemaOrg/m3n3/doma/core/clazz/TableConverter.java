package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.TABLE;
import org.kyojo.schemaOrg.m3n3.core.Clazz.Table;

@ExternalDomain
public class TableConverter implements DomainConverter<Table, String> {

	@Override
	public String fromDomainToValue(Table domain) {
		return domain.getNativeValue();
	}

	@Override
	public Table fromValueToDomain(String value) {
		return new TABLE(value);
	}

}
