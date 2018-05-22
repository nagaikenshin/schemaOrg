package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.WRITE_ACTION;
import org.kyojo.schemaOrg.m3n3.core.Clazz.WriteAction;

@ExternalDomain
public class WriteActionConverter implements DomainConverter<WriteAction, String> {

	@Override
	public String fromDomainToValue(WriteAction domain) {
		return domain.getNativeValue();
	}

	@Override
	public WriteAction fromValueToDomain(String value) {
		return new WRITE_ACTION(value);
	}

}
