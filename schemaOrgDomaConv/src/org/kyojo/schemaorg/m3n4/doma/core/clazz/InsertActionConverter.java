package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.INSERT_ACTION;
import org.kyojo.schemaorg.m3n4.core.Clazz.InsertAction;

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
