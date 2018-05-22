package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.INSERT_ACTION;
import org.kyojo.schemaOrg.m3n3.core.Clazz.InsertAction;

@ExternalDomain
public class InsertActionConverter implements DomainConverter<InsertAction, String> {

	@Override
	public String fromDomainToValue(InsertAction domain) {
		return domain.getNativeValue();
	}

	@Override
	public InsertAction fromValueToDomain(String value) {
		return new INSERT_ACTION(value);
	}

}
