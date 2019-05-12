package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.READ_ACTION;
import org.kyojo.schemaorg.m3n5.core.Clazz.ReadAction;

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