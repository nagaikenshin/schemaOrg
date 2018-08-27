package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.WRITE_ACTION;
import org.kyojo.schemaorg.m3n4.core.Clazz.WriteAction;

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
