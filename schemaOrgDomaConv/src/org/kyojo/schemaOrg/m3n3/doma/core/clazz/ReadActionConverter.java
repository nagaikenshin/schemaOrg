package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.READ_ACTION;
import org.kyojo.schemaOrg.m3n3.core.Clazz.ReadAction;

@ExternalDomain
public class ReadActionConverter implements DomainConverter<ReadAction, String> {

	@Override
	public String fromDomainToValue(ReadAction domain) {
		return domain.getNativeValue();
	}

	@Override
	public ReadAction fromValueToDomain(String value) {
		return new READ_ACTION(value);
	}

}
